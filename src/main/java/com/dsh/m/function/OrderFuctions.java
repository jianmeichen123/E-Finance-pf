package com.dsh.m.function;

import jetbrick.template.JetAnnotations.Functions;

import com.alibaba.fastjson.JSONObject;
import com.dsh.m.enumtype.OrderStatusEnum;
import com.dsh.m.model.Goods;
import com.dsh.m.model.GoodsBclass;
import com.dsh.m.model.Supply;
import com.dsh.m.service.GoodsService;
import com.dsh.m.service.SupplyService;
import com.dsh.m.util.SpringUtil;

@Functions
public class OrderFuctions {
	
	public static String getSupplyName(Integer supplyid) {
		SupplyService supplyService = SpringUtil.getBean(SupplyService.class);
		Supply supply = supplyService.getCacheSupplyById(supplyid);
		return supply==null?"":supply.getShopname();
	}
	
	public static Supply getSupplyById(Integer supplyid) {
		return SpringUtil.getBean(SupplyService.class).getCacheSupplyById(supplyid);
	}
	
	public static GoodsBclass getBclassById(Integer classid) {
		return SpringUtil.getBean(GoodsService.class).getCacheBclassById(classid);
	}
	
	public static Goods getProductById(Integer goodsid) {
		GoodsService goodsService = SpringUtil.getBean(GoodsService.class);
		Goods goods = goodsService.getCacheGoodsById(goodsid);
		return goods;
	}
	
	public static JSONObject getOrderTypeDesc(Integer ordertype) {
		String desc = OrderStatusEnum.getEnumByCode(ordertype).getDesc();
		JSONObject json = new JSONObject();
		json.put("desc", desc);
		if(ordertype==OrderStatusEnum.WAIT.getCode())
			json.put("css", "state1");
		else if(ordertype==OrderStatusEnum.SENDED.getCode())
			json.put("css", "state2");
		else if(ordertype==OrderStatusEnum.FINISHED.getCode())
			json.put("css", "state3");
		return json;
	}

}
