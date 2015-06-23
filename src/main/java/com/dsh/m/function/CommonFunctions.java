package com.dsh.m.function;

import java.math.BigDecimal;
import java.util.Date;

import jetbrick.template.JetAnnotations.Functions;
import jodd.datetime.JDateTime;

@Functions
public class CommonFunctions {
	
	public static String dateformat(Date date, String pattern) {
		return new JDateTime(date).toString(pattern);
	}
	
	public static String cutZero(BigDecimal figure) {
		String text = figure.toString();
		StringBuilder sb = new StringBuilder(text);
		for(int i=text.length()-1;i>=0;i--) {
			String curr = text.charAt(i)+"";
			if(!"0".equals(curr)&&!".".equals(curr)) break;
			else sb.deleteCharAt(i);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(cutZero(new BigDecimal("25.6000")));
	}

}
