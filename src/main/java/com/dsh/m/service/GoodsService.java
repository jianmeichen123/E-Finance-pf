package com.dsh.m.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsh.m.dao.GoodsMapper;
import com.dsh.m.model.Goods;
import com.dsh.m.util.redis.Cache;
import com.dsh.m.util.redis.Redis;

@Service
public class GoodsService {
	
	@Autowired
	private GoodsMapper goodsMapper;
	
	public Goods getCacheGoodsById(Integer id) {
		Cache cache = Redis.use();
		String key = "goods:"+id;
		Goods goods = cache.get(key);
		if(null==goods) {
			goods = goodsMapper.selectByPrimaryKey(id);
			if(null!=goods)
				cache.set(key, goods);
		}
		return goods;
	}

}
