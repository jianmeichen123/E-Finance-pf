package com.dsh.m.web;

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

import com.alibaba.fastjson.JSONObject;
import com.dsh.m.dao.PurchaseorderChildMapper;
import com.dsh.m.dao.PurchaseorderMapper;
import com.dsh.m.dao.SupplyCustomerMapper;
import com.dsh.m.enumtype.OrderStatusEnum;
import com.dsh.m.model.Purchaseorder;
import com.dsh.m.model.PurchaseorderChild;
import com.dsh.m.model.PurchaseorderChildExample;
import com.dsh.m.model.PurchaseorderExample;
import com.dsh.m.model.SupplyCustomer;
import com.dsh.m.model.SupplyCustomerExample;
import com.dsh.m.service.OrderService;

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
	
	@RequestMapping("/list")
	public String list(HttpSession session, ModelMap modelMap) {
		PurchaseorderExample orderExample = new PurchaseorderExample();
		Integer userid = super.getUserId(session);
		orderExample.createCriteria().andCustomeridEqualTo(userid);
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
		sce.createCriteria().andCustomeridEqualTo(customerid).andSupplyidEqualTo(supplyid);
		List<SupplyCustomer> scs = supplyCustomerMapper.selectByExample(sce);
		model.addAttribute("details", details);
		model.addAttribute("order", order);
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
	
}
