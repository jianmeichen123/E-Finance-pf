package com.dsh.m.web;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
import com.dsh.m.dao.SupplyCustomerMapper;
import com.dsh.m.model.Customer;
import com.dsh.m.model.Purchaseorder;
import com.dsh.m.model.SupplyCustomer;
import com.dsh.m.model.SupplyCustomerExample;
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
			SupplyCustomerExample example = new SupplyCustomerExample();
			example.createCriteria().andCustomeridEqualTo(userId);
			List<SupplyCustomer> list = supplyCustomerMapper.selectByExample(example);
			if(CollectionUtils.isEmpty(list)) {
				return fail("暂无供应商处理！！");
			}
			supplyid = list.get(0).getSupplyid();
			ThreadLocalUtil.put("supplyid", supplyid);
			ThreadLocalUtil.put("remark", request.getParameter("remark"));
			JSONArray array = shoppingCartService.loadUserCart(userId);
			Purchaseorder order = orderService.createOrder(userId, array);
			if(order != null && order.getId() != null){
				JSONObject data = new JSONObject();
				data.put("type", 1);
				data.put("data", order);
				orderJmsTemplate.convertAndSend(data.toString());
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
}
