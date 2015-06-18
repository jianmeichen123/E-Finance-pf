package com.dsh.m.web;

import com.alibaba.fastjson.JSONObject;

public class BaseAction {
	
	public String success(String msg) {
		JSONObject json = new JSONObject();
		json.put("isSuccess", true);
		json.put("msg", msg);
		return json.toString();
	}
	
	public String fail(String msg) {
		JSONObject json = new JSONObject();
		json.put("isSuccess", false);
		json.put("msg", msg);
		return json.toString();
	}

}
