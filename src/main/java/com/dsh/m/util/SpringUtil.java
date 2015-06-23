package com.dsh.m.util;

import org.springframework.context.ApplicationContext;

import com.dsh.m.listener.SpringInit;
import com.dsh.m.service.SupplyService;

public class SpringUtil {
	
	static ApplicationContext context = SpringInit.getApplicationContext();
	
	public static <T> T getBean(Class<T> clazz) {
		System.out.println(1);
		System.out.println(context);
		System.out.println(context.getBean("supplyService"));
		System.out.println(context.getBean(SupplyService.class));
		return context.getBean(clazz);
	}
	
	public static Object getBean(String name) {
		return context.getBean(name);
	}

}
