package com.dsh.m.service;

import java.math.BigDecimal;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsh.m.dao.IndexOrderMapper;
import com.dsh.m.model.IndexOrder;
import com.dsh.m.model.IndexOrderExample;
import com.dsh.m.util.redis.Cache;
import com.dsh.m.util.redis.Redis;

@Service
public class IndexService {
	
	@Autowired
	private IndexOrderMapper indexOrderMapper;
	
	public IndexOrder getCacheIndexOrderById(Integer orderid) {
		Cache cache = Redis.use();
		String key = "index:order:"+orderid;
		IndexOrder index = cache.get(key);
		if(null==index) {
			IndexOrderExample example = new IndexOrderExample();
			example.createCriteria().andOrderidEqualTo(orderid);
			List<IndexOrder> indexs = indexOrderMapper.selectByExample(example);
			if(CollectionUtils.isNotEmpty(indexs)) {
				index = indexs.get(0);
				cache.set(key, index);
			}
		}else if(null != index && index.getT1().compareTo(new BigDecimal(0)) == 0){
			cache.del(key);
			IndexOrderExample example = new IndexOrderExample();
			example.createCriteria().andOrderidEqualTo(orderid);
			List<IndexOrder> indexs = indexOrderMapper.selectByExample(example);
			if(CollectionUtils.isNotEmpty(indexs)) {
				index = indexs.get(0);
				cache.set(key, index);
			}
		}
		return index;
	}

}
