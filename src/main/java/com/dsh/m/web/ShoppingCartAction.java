package com.dsh.m.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.dsh.m.service.OrderService;
import com.dsh.m.service.ShoppingCartService;
import com.dsh.m.util.redis.Redis;

@RequestMapping("/cart")
@Controller
public class ShoppingCartAction extends BaseAction {
	
	@Autowired
	private ShoppingCartService shoppingCartService;
	@Autowired
	private OrderService orderService;
	
	@ResponseBody
	@RequestMapping("/add")
	public String add(Integer goodsid, long num, HttpSession session) {
		try {
			Redis.use().hincrBy("shoppingcart:"+getUserId(session), goodsid, num);
			return success("商品已添加到购物车！！");
		} catch (Exception e) {
			e.printStackTrace();
			return fail("失败！！");
		}
	} 
	
	@RequestMapping
	public String index(HttpSession session, ModelMap model) {
		Integer userId = getUserId(session);
		JSONArray array = shoppingCartService.loadUserCart(userId);
		System.err.println(array);
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
	public String submit(HttpSession session) {
		Integer userId = getUserId(session);
		try {
			JSONArray array = shoppingCartService.loadUserCart(userId);
			int orderid = orderService.createOrder(userId, array);
			return success("订单提交成功，等待供应商处理！！", orderid);
		} catch (Exception e) {
			e.printStackTrace();
			return fail("提交失败！！");
		}
	}

}
