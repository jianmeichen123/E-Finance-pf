package com.dsh.m.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dsh.m.util.redis.Redis;

@RequestMapping("/cart")
@Controller
public class ShoppingCartAction extends BaseAction {
	
	@ResponseBody
	@RequestMapping("/add")
	public String add(Integer goodsid, Integer num, HttpSession session) {
		Redis.use().hincrBy("shoppingcart:"+getUserId(session), goodsid, num);
		return success("购买成功！！");
	}

}
