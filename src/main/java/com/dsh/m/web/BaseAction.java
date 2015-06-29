package com.dsh.m.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jetbrick.util.StringUtils;

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
	
	public String success(String msg, Object obj) {
		JSONObject json = new JSONObject();
		json.put("isSuccess", true);
		json.put("msg", msg);
		json.put("obj", obj);
		return json.toString();
	}
	
	public String fail(String msg, Object obj) {
		JSONObject json = new JSONObject();
		json.put("isSuccess", false);
		json.put("msg", msg);
		json.put("obj", obj);
		return json.toString();
	}
	
	public Integer getUserId(HttpSession session) {
		Object obj = session.getAttribute("login_id");
		if(obj==null) return null;
		else if(StringUtils.isBlank(obj+"")) return null;
		else return Integer.parseInt(obj+"");
	}
	
	public void keepParas(HttpServletRequest req, String...params) {
		for(String param:params) {
			req.setAttribute(param, req.getParameter(param));
		}
	}

}
