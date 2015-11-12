package com.dsh.m.test;

import java.util.HashMap;
import java.util.Map;

import com.dsh.m.constant.Consstants;
import com.dsh.m.util.HttpClient;
import com.infosight.open.api.utils.MD5;

public class TestInterFaceSmsCode {
	public static void main(String[] args) {
		// HttpSender.sendPOST("http://119.254.111.198:8050/ips/mercExp/gwExpress/smsCode");
		// String url =
		// "http://119.254.111.198:8050/ips/mercExp/gwExpress/smsCode";

		Map<String, String> map = new HashMap<String, String>();

		/*map.put("charset", "UTF-8");
		map.put("mercId", "888000000000168");
		map.put("requestId", "test_request_new7");
		map.put("interfaceName", "gwSmsCodeOffline");
		map.put("version", "1.0");
		map.put("signType", "MD5");
		map.put("mobileNo", "13366343223");
		map.put("smsType", "1");
		map.put("cardNo", "v0p3LHPAgMMKX+w5KLdxlm0+0eLbAOsC");
		map.put("cardName", "Z1PiTMIw6QYLds9rDlPKyQ==");
		map.put("idType", "00");
		map.put("idNo", "fGwOwY3OSJjzp97gMz1BN/1GTfLCvuRE");

		String signStr = "UTF-8888000000000168test_request_new7gwSmsCodeOffline1.0MD5133663432231v0p3LHPAgMMKX+w5KLdxlm0+0eLbAOsCZ1PiTMIw6QYLds9rDlPKyQ==00fGwOwY3OSJjzp97gMz1BN/1GTfLCvuRE";
		String signStr_new = MD5.sign(signStr,
				"aff167ff067e4dbe999d37af0bb848f6", "UTF-8");*/
		map.put("charset", "UTF-8");
		map.put("mercId", "888000000000168");
		map.put("requestId", "test_request_new9");
		map.put("interfaceName", "gwSmsCodeOffline");
		map.put("version", "1.0");
		map.put("signType", "MD5");
		map.put("mobileNo", "15210896985");
		map.put("smsType", "1");
		map.put("cardNo", "ZU4XaXr2y2YMtAohm4ZXpACI7t94rq0C");
		map.put("cardName", "xt04HL7vE+D7IUN5eLlyZw==");
		map.put("idType", "00");
		map.put("idNo", "RcqAG7ZL0EGhMWUiloy6wsLxntulUNRi");

		String signStr = "UTF-8888000000000168test_request_new9gwSmsCodeOffline1.0MD5152108969851ZU4XaXr2y2YMtAohm4ZXpACI7t94rq0Cxt04HL7vE+D7IUN5eLlyZw==00RcqAG7ZL0EGhMWUiloy6wsLxntulUNRi";
		String signStr_new = MD5.sign(signStr,
				"aff167ff067e4dbe999d37af0bb848f6", "UTF-8");

		map.put("hmac", signStr_new);

		HttpClient.post(Consstants.Test_InterFace_SmsCode, map);

	}

}
