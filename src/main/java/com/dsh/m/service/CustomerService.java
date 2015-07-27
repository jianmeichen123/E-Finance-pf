package com.dsh.m.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsh.m.dao.CustomerMapper;
import com.dsh.m.model.Customer;
import com.dsh.m.util.redis.Cache;
import com.dsh.m.util.redis.Redis;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerMapper customerMapper;
	
	public Customer getCacheCustomerById(Integer id) {
		Cache cache = Redis.use();
		String key = "customer:"+id;
		Customer customer = cache.get(key);
		if(null==customer) {
			customer = customerMapper.selectByPrimaryKey(id);
			if(null!=customer)
				cache.set(key, customer);
		}
		return customer;
	}

}
