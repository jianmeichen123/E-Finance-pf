package com.dsh.m.web;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.dsh.m.dao.OrderLogisticsMapper;
import com.dsh.m.dao.PurchaseorderChildMapper;
import com.dsh.m.dao.PurchaseorderMapper;
import com.dsh.m.dao.SupplyCustomerMapper;
import com.dsh.m.enumtype.OrderStatusEnum;
import com.dsh.m.model.Customer;
import com.dsh.m.model.OrderLogistics;
import com.dsh.m.model.OrderLogisticsExample;
import com.dsh.m.model.Purchaseorder;
import com.dsh.m.model.PurchaseorderChild;
import com.dsh.m.model.PurchaseorderChildExample;
import com.dsh.m.model.PurchaseorderExample;
import com.dsh.m.model.PurchaseorderExample.Criteria;
import com.dsh.m.model.Supply;
import com.dsh.m.model.SupplyCustomer;
import com.dsh.m.model.SupplyCustomerExample;
import com.dsh.m.service.CustomerService;
import com.dsh.m.service.OrderService;
import com.dsh.m.service.SupplyService;
import com.dsh.m.util.Lang;

@RequestMapping("/order")
@Controller
public class OrderAction extends BaseAction {
	
	@Autowired
	private PurchaseorderMapper purchaseorderMapper;
	@Autowired
	private PurchaseorderChildMapper purchaseorderChildMapper;
	@Autowired
	private SupplyCustomerMapper supplyCustomerMapper;
	@Autowired
	private OrderService orderService;
	@Resource(name="orderJmsTemplate")
	private JmsTemplate orderJmsTemplate;
	@Autowired
	private OrderLogisticsMapper orderLogisticsMapper;
	@Autowired
	private CustomerService customerService;
	@Autowired
	private SupplyService supplyService;
	
	@RequestMapping("/list")
	public String list(Integer type, HttpSession session, ModelMap modelMap) {
		PurchaseorderExample orderExample = new PurchaseorderExample();
		Integer userid = super.getUserId(session);
		Criteria criteria = orderExample.createCriteria().andCustomeridEqualTo(userid);
		type = Lang.toInt(type);
		switch(type) {
		case 0:criteria.andOrdertypeNotEqualTo(0);break;
		case 1:criteria.andBalancestateEqualTo(0).andOrdertypeNotEqualTo(0);break;
		case 2:criteria.andOrdertypeEqualTo(5);break;
		case 3:criteria.andOrdertypeGreaterThanOrEqualTo(6).andOrdertypeNotEqualTo(7);break;
		}
			
		orderExample.setOrderByClause("ordertime desc");
		List<Purchaseorder> orders = purchaseorderMapper.selectByExample(orderExample);
//		PurchaseorderChildExample orderChildExample = new PurchaseorderChildExample();
//		orderChildExample.createCriteria().
//		purchaseorderMapper.countByExample(example)
		modelMap.addAttribute("orders", orders);
		return "order/list";
	}
	
	@RequestMapping("/detail")
	public String detail(Integer orderid, ModelMap model) {
		PurchaseorderChildExample orderChildExample = new PurchaseorderChildExample();
		orderChildExample.createCriteria().andOrderidEqualTo(orderid);
		List<PurchaseorderChild> details = purchaseorderChildMapper.selectByExample(orderChildExample);
		Purchaseorder order = purchaseorderMapper.selectByPrimaryKey(orderid);
		SupplyCustomerExample sce = new SupplyCustomerExample();
		Integer customerid = order.getCustomerid();
		Integer supplyid = order.getSupplyid(); 
		sce.createCriteria().andCustomeridEqualTo(customerid).andDrNotEqualTo("1");
		List<SupplyCustomer> scs = supplyCustomerMapper.selectByExample(sce);
		
		OrderLogisticsExample logisticsExample = new OrderLogisticsExample();
		logisticsExample.createCriteria().andOrderidEqualTo(orderid);
		logisticsExample.setOrderByClause("operationtime desc");
		List<OrderLogistics> logs = orderLogisticsMapper.selectByExample(logisticsExample);
		JSONArray array = JSON.parseArray(JSON.toJSONStringWithDateFormat(logs, "yyyy-MM-dd HH:mm:ss"));
		@SuppressWarnings("rawtypes")
		Iterator iter = array.iterator();
		while(iter.hasNext()) {
			JSONObject json = (JSONObject)iter.next();
			Integer userid = json.getInteger("operationuser");
			Integer stateid = json.getBigDecimal("stateid").intValue();
			if(stateid==1||stateid==6) {
				Customer customer = customerService.getCacheCustomerById(userid);
				json.put("name", customer.getUsername());
			} else if(stateid==2||stateid==5) {
				Supply supply = supplyService.getCacheSupplyById(userid);
				json.put("name", supply.getUsername());
			}
		}
		BigDecimal returnprice = new BigDecimal(0);
		if(order.getTotalprice() != null && order.getSettleprice() != null){
			returnprice = order.getTotalprice().subtract(order.getSettleprice());
		}
		if(returnprice.compareTo(BigDecimal.ZERO)<=0){
			returnprice = new BigDecimal(0);
		}
		model.addAttribute("details", details);
		model.addAttribute("order", order);
		model.addAttribute("returnprice", returnprice);
		model.addAttribute("logs", array);
		if(CollectionUtils.isNotEmpty(scs))
			model.addAttribute("deliver", scs.get(0));
		return "order/detail";
	}
	
	@ResponseBody
	@RequestMapping("/cancel")
	public String cancel(Integer orderid) {
		Purchaseorder order = new Purchaseorder();
		order.setId(orderid);
		order.setOrdertype(OrderStatusEnum.CANCELED.getCode());
		try {
			purchaseorderMapper.updateByPrimaryKeySelective(order);
			return success("取消成功！！");
		} catch (Exception e) {
			e.printStackTrace();
			return fail("取消失败！！");
		}
	}
	
	@RequestMapping(value="/confirm", method=RequestMethod.GET)
	public String toconfirm(Integer orderid, ModelMap model) {
		Purchaseorder order = purchaseorderMapper.selectByPrimaryKey(orderid);
		
		PurchaseorderChildExample orderChildExample = new PurchaseorderChildExample();
		orderChildExample.createCriteria().andOrderidEqualTo(orderid);
		List<PurchaseorderChild> details = purchaseorderChildMapper.selectByExample(orderChildExample);
		
		
		model.addAttribute("order", order);
		model.addAttribute("details", details);
		return "order/confirm";
	}
	
	@ResponseBody
	@RequestMapping(value="/confirm", method=RequestMethod.POST)
	public String confirm(Integer orderid, String json) {
		try {
			orderService.confirm(orderid, json);
			Purchaseorder purchaseorder = purchaseorderMapper.selectByPrimaryKey(orderid);
			JSONObject data = new JSONObject();
			data.put("type", 2);
			data.put("data", purchaseorder);
			orderJmsTemplate.convertAndSend(data.toString());
			return success("确认成功！！");
		} catch (Exception e) {
			e.printStackTrace();
			return fail("确认失败！！");
		}
	}
	
	@RequestMapping("/settle")
	public String settle(Integer orderid, ModelMap model) {
		detail(orderid, model);
		return "order/settle";
	}
	
}
