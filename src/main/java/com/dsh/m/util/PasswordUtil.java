package com.dsh.m.util;

import java.security.MessageDigest;

import org.springframework.util.StringUtils;

import sun.misc.BASE64Encoder;

public class PasswordUtil {
	
	public static boolean validate(String plainText, String encriptText) {
		if(StringUtils.isEmpty(plainText)) return false;
		return encriptText.equals(encript(plainText));
	}
	
	public static String encript(String text) {
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			BASE64Encoder base64en = new BASE64Encoder();
			return base64en.encode(md5.digest(text.getBytes("utf-8")));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
