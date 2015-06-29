package com.dsh.m.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.dsh.m.model.Goods;
import com.dsh.m.util.redis.Cache;
import com.dsh.m.util.redis.Redis;

@Service
public class ShoppingCartService {
	
	@Autowired
	private GoodsService goodsService;
	
	public JSONArray loadUserCart(Integer userid) {
		Cache cache = Redis.use();
		String hkey = "shoppingcart:"+userid;
		Set<String> keys = cache.hkeys(hkey);
		JSONArray array = new JSONArray();
		for(String key:keys) {
			Integer goodsid = Integer.parseInt(key);
			Goods goods = goodsService.getCacheGoodsById(goodsid);
			Integer num = Integer.parseInt(cache.hget(hkey, goodsid+""));
			JSONObject json = new JSONObject();
			json.put("goods", goods);
			json.put("num", num);
			array.add(json);
		}
		return array;
	}
	
	public void clearUserCart(Integer userid) {
		Cache cache = Redis.use();
		String hkey = "shoppingcart:"+userid;
		cache.del(hkey);
	}

}
