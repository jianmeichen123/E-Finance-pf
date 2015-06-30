package com.dsh.m.function;

import jetbrick.template.JetAnnotations.Functions;

import com.dsh.m.model.IndexOrder;
import com.dsh.m.service.IndexService;
import com.dsh.m.util.SpringUtil;

@Functions
public class SettleFunctions {
	
	public static IndexOrder getIndexOrderByOrderId(Integer orderid) {
		return SpringUtil.getBean(IndexService.class).getCacheIndexOrderById(orderid);
	}

}
