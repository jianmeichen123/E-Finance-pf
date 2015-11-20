package com.dsh.m.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsh.m.dao.GoodsBclassMapper;
import com.dsh.m.dao.GoodsMapper;
import com.dsh.m.model.Goods;
import com.dsh.m.model.GoodsBclass;
import com.dsh.m.model.GoodsExample;
import com.dsh.m.model.SettleaccountchildExample;
import com.dsh.m.util.redis.Cache;
import com.dsh.m.util.redis.Redis;

@Service
public class GoodsService {
	
	@Autowired
	private GoodsMapper goodsMapper;
	@Autowired
	private GoodsBclassMapper goodsBclassMapper;
	
	public Goods getCacheGoodsById(Integer id) {
		Cache cache = Redis.use();
		String key = "goods:"+id;
		Goods goods = cache.get(key);
		if(null==goods) {
			goods = goodsMapper.selectByPrimaryKey(id);
			if(null != goods)
				cache.set(key, goods);
		}
		return goods;
	}
	
	public GoodsBclass getCacheBclassById(Integer id) {
		Cache cache = Redis.use();
		String key = "bclass:"+id;
		GoodsBclass bclass = cache.get(key);
		if(null==bclass) {
			bclass = goodsBclassMapper.selectByPrimaryKey(id);
			if(null!=bclass)
				cache.set(key, bclass);
		}
		return bclass;
	}

}
