package com.dsh.m.enumtype;

public enum OrderStatusEnum {
	
	WAIT(1, "待报价"),
	RECEIVED(2, "已报价，待发货"),
	MODIFYED(3, "修改待确认"),
	WAITSENDED(4, "待发货"),
	SENDED(5, "已发货，待收货"),
	FINISHED(6, "已收货，待确认结算"),
	CANCELED(7, "已取消"),
	SETTLE(8, "已结算，待返现"),
	RETURN(9, "已返现，已完成");
	
	private int code;
	private String desc;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	private OrderStatusEnum(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	public static OrderStatusEnum getEnumByCode(int code) {
		for(OrderStatusEnum enumtype:values()) {
			if(enumtype.getCode()==code)
				return enumtype;
		}
		return null;
	}

}
