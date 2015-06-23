package com.dsh.m.function;

import jetbrick.template.JetAnnotations.Functions;

import com.dsh.m.model.Supply;
import com.dsh.m.service.SupplyService;
import com.dsh.m.util.SpringUtil;

@Functions
public class OrderFuctions {
	
	public static String getSupplyName(Integer supplyid) {
		SupplyService supplyService = SpringUtil.getBean(SupplyService.class);
		Supply supply = supplyService.getCacheSupplyById(supplyid);
		return supply==null?"":supply.getShopname();
	}

}
