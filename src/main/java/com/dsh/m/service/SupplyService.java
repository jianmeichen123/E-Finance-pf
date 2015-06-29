package com.dsh.m.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsh.m.dao.SupplyMapper;
import com.dsh.m.model.Supply;
import com.dsh.m.util.redis.Cache;
import com.dsh.m.util.redis.Redis;

@Service
public class SupplyService {
	
	@Autowired
	private SupplyMapper supplyMapper;
	
	public Supply getCacheSupplyById(Integer id) {
		System.err.println(id);
		Cache cache = Redis.use();
		String key = "supply:"+id;
		Supply supply = cache.get(key);
		if(null==supply) {
			supply = supplyMapper.selectByPrimaryKey(id);
			if(null!=supply)
				cache.set(key, supply);
		}
		return supply;
	}

}
