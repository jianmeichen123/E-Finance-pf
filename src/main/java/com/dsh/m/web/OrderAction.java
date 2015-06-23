package com.dsh.m.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dsh.m.dao.PurchaseorderChildMapper;
import com.dsh.m.dao.PurchaseorderMapper;
import com.dsh.m.model.Purchaseorder;
import com.dsh.m.model.PurchaseorderChild;
import com.dsh.m.model.PurchaseorderChildExample;
import com.dsh.m.model.PurchaseorderExample;

@RequestMapping("/order")
@Controller
public class OrderAction extends BaseAction {
	
	@Autowired
	private PurchaseorderMapper purchaseorderMapper;
	@Autowired
	private PurchaseorderChildMapper purchaseorderChildMapper;
	
	@RequestMapping("/list")
	public String list(HttpSession session, ModelMap modelMap) {
		PurchaseorderExample orderExample = new PurchaseorderExample();
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
		model.addAttribute("details", details);
		model.addAttribute("order", order);
		return "order/detail";
	}

}
