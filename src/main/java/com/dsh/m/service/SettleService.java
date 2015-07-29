package com.dsh.m.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dsh.m.dao.SettleaccountMapper;
import com.dsh.m.dao.SettleaccountchildMapper;
import com.dsh.m.model.Settleaccount;

@Service
public class SettleService {
	
	@Autowired
	private SettleaccountMapper settleaccountMapper;
	@Autowired
	private SettleaccountchildMapper settleaccountchildMapper;
	
	@Transactional
	public void confirm(Integer id) {
		Settleaccount settle = new Settleaccount();
		settle.setId(id);
		settle.setReturnstateid(1);
		settleaccountMapper.updateByPrimaryKeySelective(settle);
		settleaccountchildMapper.batchUpdateReturnState(id);
	}

}
