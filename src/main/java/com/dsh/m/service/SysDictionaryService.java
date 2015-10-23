package com.dsh.m.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsh.m.dao.SysDictionaryMapper;
import com.dsh.m.model.SysDictionary;
import com.dsh.m.model.SysDictionaryExample;
import com.dsh.m.util.redis.Cache;
import com.dsh.m.util.redis.Redis;

@Service
public class SysDictionaryService {
	@Autowired
	private SysDictionaryMapper sysDictionaryMapper;
	
	public SysDictionary getCacheSysDictionary(String dictype, String dicnum) {
		Cache cache = Redis.use();
		String key = "sysDictionary:"+dictype+dicnum;
		SysDictionary sysDictionary = cache.get(key);
		if(null==sysDictionary) {
			SysDictionaryExample example = new SysDictionaryExample();
			example.createCriteria().andDictypeEqualTo(dictype).andDicnumEqualTo(dicnum);
			List<SysDictionary> dictionary = sysDictionaryMapper.selectByExample(example);
			if(dictionary != null){
				sysDictionary = dictionary.get(0);
				cache.set(key, sysDictionary);
			}
		}
		return sysDictionary;
	}
}
