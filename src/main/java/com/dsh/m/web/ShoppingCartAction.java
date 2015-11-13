package com.dsh.m.web;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jodd.datetime.JDateTime;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.dsh.m.dao.CustomerMapper;
import com.dsh.m.dao.PurchaseorderMapper;
import com.dsh.m.dao.SupplyCustomerMapper;
import com.dsh.m.dao.SupplyMapper;
import com.dsh.m.dao.SysSmsMapper;
import com.dsh.m.model.Customer;
import com.dsh.m.model.Purchaseorder;
import com.dsh.m.model.Supply;
import com.dsh.m.model.SupplyCustomer;
import com.dsh.m.model.SupplyCustomerExample;
import com.dsh.m.model.SysSms;
import com.dsh.m.service.OrderService;
import com.dsh.m.service.ShoppingCartService;
import com.dsh.m.util.ThreadLocalUtil;
import com.dsh.m.util.redis.Redis;

@RequestMapping("/cart")
@Controller
public class ShoppingCartAction extends BaseAction {
	
	@Autowired
	private ShoppingCartService shoppingCartService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private SupplyCustomerMapper supplyCustomerMapper;
	@Autowired
	private CustomerMapper customerMapper; 
	@Resource(name="orderJmsTemplate")
	private JmsTemplate orderJmsTemplate;
	@Autowired
	private SysSmsMapper sysSmsMapper;
	@Autowired
	private SupplyMapper supplyMapper; 
	
	@ResponseBody
	@RequestMapping("/add")
	public String add(Integer goodsid, long num, HttpSession session) {
		try {
			Integer userid = getUserId(session);
			Redis.use().hincrBy("shoppingcart:"+userid, goodsid, num);
			return success("商品已添加到购物车！！", shoppingCartService.getCartNum(userid));
		} catch (Exception e) {
			e.printStackTrace();
			return fail("失败！！");
		}
	} 
	
	@RequestMapping
	public String index(HttpSession session, ModelMap model) {
		Integer userId = getUserId(session);
		JSONArray array = shoppingCartService.loadUserCart(userId);
		model.addAttribute("goods", array);
		return "shoppingcart/index";
	}
	
	@ResponseBody
	@RequestMapping("/del")
	public String del(Integer goodsid, HttpSession session) {
		try {
			Redis.use().hdel("shoppingcart:"+getUserId(session), goodsid);
			return success("商品已移除！！");
		} catch (Exception e) {
			e.printStackTrace();
			return fail("失败！！");
		}
	}
	
	@RequestMapping("/refresh")
	public String refresh(HttpSession session, ModelMap model) {
		Integer userId = getUserId(session);
		JSONArray array = shoppingCartService.loadUserCart(userId);
		model.addAttribute("goods", array);
		return "shoppingcart/cart";
	}
	
	@ResponseBody
	@RequestMapping("/submit")
	public String submit(HttpServletRequest request) {
		Integer userId = getUserId(request.getSession());
		Integer supplyid = null;
		try {
			Customer customer = customerMapper.selectByPrimaryKey(userId);
			if(customer.getAccountBalance() == null){
				customer.setAccountBalance(new BigDecimal(0));
			}
			if("0".equals(customer.getIsOnline()) && customer.getAccountBalance().compareTo(new BigDecimal(0)) == -1){
				return fail("您的账户余额不足，请及时充值！！");
			}
			Date starttime = new JDateTime(new Date()).setHour(10).setMinute(0).setSecond(0, 0).convertToDate();
			Date endtime = new JDateTime(new Date()).setHour(23).setMinute(00).setSecond(0, 0).convertToDate();
			if(!(new Date().after(starttime)&&new Date().before(endtime))){
				return fail("请在10:00--23:00之间下单！");
			}
			SupplyCustomerExample example = new SupplyCustomerExample();
			example.createCriteria().andCustomeridEqualTo(userId);
			List<SupplyCustomer> list = supplyCustomerMapper.selectByExample(example);
			if(CollectionUtils.isEmpty(list)) {
				return fail("暂无供应商处理！ ！");
			}
			supplyid = list.get(0).getSupplyid();
			Supply supply = supplyMapper.selectByPrimaryKey(supplyid);
			ThreadLocalUtil.put("supplyid", supplyid);
			ThreadLocalUtil.put("remark", request.getParameter("remark"));
			JSONArray array = shoppingCartService.loadUserCart(userId);
			Purchaseorder order = orderService.createOrder(userId, array);
			if(order != null && order.getId() != null){
				JSONObject data = new JSONObject();
				data.put("type", 1);
				data.put("data", order);
				orderJmsTemplate.convertAndSend(data.toString());
				 //订单提交成功发短信提示供应商
				SysSms sendMessage=creatMessage(supply,customer);
				if(sendMessage != null && sendMessage.getTel() != null && sendMessage.getTel().length() == 11){
					sysSmsMapper.insert(sendMessage);
				}
				return success("订单提交成功，等待供应商处理！！", order.getId());
			}else{
				return fail("请选择商品！！");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return fail("提交失败！！");
		}
	}

	@ResponseBody
	@RequestMapping("/addbeizhu")
	public String addbeizhu(Integer goodsid, String beizhu, HttpSession session) {
		try {
			Integer userid = getUserId(session);
			Redis.use().set("shoppingcart:"+userid + goodsid, beizhu);
			return success("备注缓存添加成功！！", shoppingCartService.getCartNum(userid));
		} catch (Exception e) {
			e.printStackTrace();
			return fail("失败！！");
		}
	} 
	public SysSms creatMessage(Supply supply,Customer customer){
		SysSms syssms = null;
		if(supply.getMobile() != null && supply.getMobile().length() == 11){
			syssms = new SysSms();
			syssms.setContent("用户" + customer.getShopname() + "已经下单，请您及时登录处理！有问题请咨询客服电话010-622999432");
			syssms.setTel(supply.getMobile());
			syssms.setSendtime(new Date());
			syssms.setType("0");
			syssms.setDr("0");
			syssms.setCreateuser(customer.getCusid());
			syssms.setCreattime(new Date());
		}
		return syssms;
	}
}
