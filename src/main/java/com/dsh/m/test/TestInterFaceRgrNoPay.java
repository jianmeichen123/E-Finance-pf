package com.dsh.m.test;

import java.util.HashMap;
import java.util.Map;

import com.dsh.m.constant.Consstants;
import com.dsh.m.util.HttpClient;
import com.infosight.open.api.utils.MD5;

public class TestInterFaceRgrNoPay {
	public static void main(String[] args) {
		// HttpSender.sendPOST("http://119.254.111.198:8050/ips/mercExp/gwExpress/smsCode");
		// String url =
		// "http://119.254.111.198:8050/ips/mercExp/gwExpress/smsCode";

		Map<String, String> map = new HashMap<String, String>();

		map.put("charset", "UTF-8");
		map.put("mercId", "888000000000168");
		map.put("requestId", "test_request_new9");
		map.put("interfaceName", "gwPayExpressOffline");
		map.put("version", "1.0");
		map.put("signType", "MD5");
		map.put("mobileNo", "13366343223");
	 	map.put("agrNo", "b2cc639dcb44482fa7221209c57dcfe9");	
		map.put("orderId", "md2015080418511540");
		map.put("amount", "1");
		map.put("validTime", "2h");
		map.put("notifyUrl", "http://123.56.170.164:8097/payment/payPaymentresult");
		
	//	map.put("agrNo", "bfc6ef862363426e89ee6eaedbd392dd");
		
		String signStr = "UTF-8888000000000168test_request_new9gwPayExpressOffline1.0MD513366343223b2cc639dcb44482fa7221209c57dcfe9md201508041851154012hhttp://123.56.170.164:8097/payment/payPaymentresult";
		String signStr_new = MD5.sign(signStr,
				"aff167ff067e4dbe999d37af0bb848f6", "UTF-8");

		map.put("hmac", signStr_new);
		TestInterFaceSign ss=new TestInterFaceSign();
		HttpClient.post(Consstants.Test_InterFace_Pay, map);

	}
	
}
