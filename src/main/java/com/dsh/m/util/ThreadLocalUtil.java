package com.dsh.m.util;

import java.util.HashMap;
import java.util.Map;

public class ThreadLocalUtil {
	
	static ThreadLocal<Map<String, Object>> local = new ThreadLocal<Map<String, Object>>() {
		protected Map<String, Object> initialValue() {
			return new HashMap<String, Object>();
		};
	}; 
	
	public static void put(String key, Object val) {
		local.get().put(key, val);
	}
	
	public static Object get(String key) {
		return local.get().get(key);
	}
	
	public static void remove(String key) {
		local.get().remove(key);
	}

}
