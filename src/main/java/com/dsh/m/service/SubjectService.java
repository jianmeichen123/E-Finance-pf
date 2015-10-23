package com.dsh.m.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsh.m.dao.SubjectMapper;
import com.dsh.m.model.Subject;
import com.dsh.m.util.redis.Cache;
import com.dsh.m.util.redis.Redis;

@Service
public class SubjectService {

	@Autowired
	private SubjectMapper subjectMapper;
	
	public Subject getCacheSubjectById(Integer id) {
		Cache cache = Redis.use();
		String key = "subject:"+id;
		Subject subject = cache.get(key);
		if(null==subject) {
			subject = subjectMapper.selectByPrimaryKey(id);
			if(null!=subject)
				cache.set(key, subject);
		}
		return subject;
	}
}
