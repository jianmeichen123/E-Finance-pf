package com.dsh.m.function;

import java.util.Date;

import jetbrick.template.JetAnnotations.Functions;
import jodd.datetime.JDateTime;

@Functions
public class CommonFunctions {
	
	public static String dateformat(Date date, String pattern) {
		return new JDateTime(date).toString(pattern);
	}

}
