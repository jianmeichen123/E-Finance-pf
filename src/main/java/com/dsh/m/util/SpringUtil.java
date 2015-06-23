package com.dsh.m.util;

import org.springframework.context.ApplicationContext;

import com.dsh.m.listener.SpringInit;

public class SpringUtil {
	
	static ApplicationContext context = SpringInit.getApplicationContext();
	
	public static <T> T getBean(Class<T> clazz) {
		return context.getBean(clazz);
	}
	
	public static Object getBean(String name) {
		return context.getBean(name);
	}

}
