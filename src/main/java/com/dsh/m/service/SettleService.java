package com.dsh.m.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dsh.m.dao.PurchaseorderMapper;
import com.dsh.m.dao.SettleaccountMapper;
import com.dsh.m.dao.SettleaccountchildMapper;
import com.dsh.m.model.Purchaseorder;
import com.dsh.m.model.Settleaccount;
import com.dsh.m.model.Settleaccountchild;
import com.dsh.m.model.SettleaccountchildExample;

@Service
public class SettleService {
	
	@Autowired
	private SettleaccountMapper settleaccountMapper;
	@Autowired
	private SettleaccountchildMapper settleaccountchildMapper;
	@Autowired
	private PurchaseorderMapper purchaseorderMapper;
	
	@Transactional
	public void confirm(Integer id) {
		SettleaccountchildExample scexample = new SettleaccountchildExample();
		scexample.createCriteria().andSettleidEqualTo(id);
		List<Settleaccountchild> childs = settleaccountchildMapper.selectByExample(scexample);
		for (int i = 0; i < childs.size(); i++) {
			Purchaseorder purchaseorder = purchaseorderMapper.selectByPrimaryKey(childs.get(i).getOrderid());
			purchaseorder.setOrdertype(9);
			purchaseorderMapper.updateByPrimaryKey(purchaseorder);
		}
		Settleaccount settle = new Settleaccount();
		settle.setId(id);
		settle.setReturnstateid(1);
		settle.setUpdatetime(new Date());
		settleaccountMapper.updateByPrimaryKeySelective(settle);
		settleaccountchildMapper.batchUpdateReturnState(id);
	}

}
