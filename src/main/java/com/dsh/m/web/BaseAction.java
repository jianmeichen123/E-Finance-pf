package com.dsh.m.web;

import java.text.ParseException;
import java.util.Date;

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
	
	private Integer toInt(String value, Integer defaultValue) {
		if (value == null || "".equals(value.trim()))
			return defaultValue;
		value = value.trim();
		if (value.startsWith("N") || value.startsWith("n"))
			return -Integer.parseInt(value.substring(1));
		return Integer.parseInt(value);
	}
	
	/**
	 * Returns the value of a request parameter and convert to Integer.
	 * @param name a String specifying the name of the parameter
	 * @return a Integer representing the single value of the parameter
	 */
	public Integer getParaToInt(HttpServletRequest request, String name) {
		return toInt(request.getParameter(name), null);
	}
	
	/**
	 * Returns the value of a request parameter and convert to Integer with a default value if it is null.
	 * @param name a String specifying the name of the parameter
	 * @return a Integer representing the single value of the parameter
	 */
	public Integer getParaToInt(HttpServletRequest request, String name, Integer defaultValue) {
		return toInt(request.getParameter(name), defaultValue);
	}
	
	private Long toLong(String value, Long defaultValue) {
		if (value == null || "".equals(value.trim()))
			return defaultValue;
		value = value.trim();
		if (value.startsWith("N") || value.startsWith("n"))
			return -Long.parseLong(value.substring(1));
		return Long.parseLong(value);
	}
	
	/**
	 * Returns the value of a request parameter and convert to Long.
	 * @param name a String specifying the name of the parameter
	 * @return a Integer representing the single value of the parameter
	 */
	public Long getParaToLong(HttpServletRequest request, String name) {
		return toLong(request.getParameter(name), null);
	}
	
	/**
	 * Returns the value of a request parameter and convert to Long with a default value if it is null.
	 * @param name a String specifying the name of the parameter
	 * @return a Integer representing the single value of the parameter
	 */
	public Long getParaToLong(HttpServletRequest request, String name, Long defaultValue) {
		return toLong(request.getParameter(name), defaultValue);
	}
	
	private Boolean toBoolean(String value, Boolean defaultValue) {
		if (value == null || "".equals(value.trim()))
			return defaultValue;
		value = value.trim().toLowerCase();
		if ("1".equals(value) || "true".equals(value))
			return Boolean.TRUE;
		else if ("0".equals(value) || "false".equals(value))
			return Boolean.FALSE;
		return null;
	}
	
	/**
	 * Returns the value of a request parameter and convert to Boolean.
	 * @param name a String specifying the name of the parameter
	 * @return true if the value of the parameter is "true" or "1", false if it is "false" or "0", null if parameter is not exists
	 */
	public Boolean getParaToBoolean(HttpServletRequest request, String name) {
		return toBoolean(request.getParameter(name), null);
	}
	
	/**
	 * Returns the value of a request parameter and convert to Boolean with a default value if it is null.
	 * @param name a String specifying the name of the parameter
	 * @return true if the value of the parameter is "true" or "1", false if it is "false" or "0", default value if it is null
	 */
	public Boolean getParaToBoolean(HttpServletRequest request, String name, Boolean defaultValue) {
		return toBoolean(request.getParameter(name), defaultValue);
	}
	
	private Date toDate(String value, Date defaultValue) {
		if (value == null || "".equals(value.trim()))
			return defaultValue;
		try {
			return new java.text.SimpleDateFormat("yyyy-MM-dd").parse(value.trim());
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Returns the value of a request parameter and convert to Date.
	 * @param name a String specifying the name of the parameter
	 * @return a Date representing the single value of the parameter
	 */
	public Date getParaToDate(HttpServletRequest request, String name) {
		return toDate(request.getParameter(name), null);
	}
	
	/**
	 * Returns the value of a request parameter and convert to Date with a default value if it is null.
	 * @param name a String specifying the name of the parameter
	 * @return a Date representing the single value of the parameter
	 */
	public Date getParaToDate(HttpServletRequest request, String name, Date defaultValue) {
		return toDate(request.getParameter(name), defaultValue);
	}

}
