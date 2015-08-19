package com.dsh.m.util;

import jetbrick.util.StringUtils;

public class Lang {
	
	public static int toInt(Object obj) {
		return obj==null||StringUtils.isBlank(obj+"")?0:Integer.parseInt(obj+"");
	}
	
	public static String toString(Object obj) {
		return obj==null?"":obj+"";
	}

}
