package com.dsh.m.test;

import com.infosight.open.api.utils.MD5;

public class MD5Test {
   public static void main(String[] args) {
      String signStr="UTF-8888000000000168test_request_0006gwSmsCodeOffline1.0MD5133663432231CCB0v0p3LHPAgMMKX+w5KLdxlm0+0eLbAOsC0Z1PiTMIw6QYLds9rDlPKyQ==00fGwOwY3OSJjzp97gMz1BN/1GTfLCvuRE";
        String signStr_new = MD5.sign(signStr,
				"aff167ff067e4dbe999d37af0bb848f6", "UTF-8");

		System.out.println(signStr_new);
    }


}
