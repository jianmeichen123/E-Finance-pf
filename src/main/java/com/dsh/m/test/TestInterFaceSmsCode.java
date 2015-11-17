package com.dsh.m.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import com.dsh.m.constant.Consstants;
import com.dsh.m.model.PayAppoint;
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
		map.put("cardNo", "ZU4XaXr2y2ahbc99VL2rfgCI7t94rq0C");
		map.put("cardName", "xt04HL7vE+D7IUN5eLlyZw==");
		map.put("idType", "00");
		map.put("idNo", "RcqAG7ZL0EGhMWUiloy6wsLxntulUNRi");

		String signStr = "UTF-8888000000000168test_request_new9gwSmsCodeOffline1.0MD5152108969851ZU4XaXr2y2ahbc99VL2rfgCI7t94rq0Cxt04HL7vE+D7IUN5eLlyZw==00RcqAG7ZL0EGhMWUiloy6wsLxntulUNRi";
		String signStr_new = MD5.sign(signStr,
				"aff167ff067e4dbe999d37af0bb848f6", "UTF-8");

		map.put("hmac", signStr_new);

		String post = HttpClient.post(Consstants.Test_InterFace_SmsCode, map);
		//String post="{'mercId':'888000000000168','requestId':'test_request_new9','interfaceName':'gwSmsCodeOffline','version':'1.0','signType':'MD5','returnCode':'IPS0000','message':'交易成功','hmac':'e7f2cf169242db66588344d804ad211c','tradeNo':'SMS201511121802266281','rmk':''}";
		//JSONObject jsStr = JSONObject.fromObject(post); 
		//PayAppoint bean = (PayAppoint)JSONObject.toBean(jsStr,
		//		PayAppoint.class);
	//	 List<PayAppoint> persons = (List<PayAppoint>)JSONArray.toCollection(jsStr, PayAppoint.class);
	//    List<PayAppoint> json = JSONObject.parseArray(post1, PayAppoint.class);
	  //  System.out.println(bean);
		//


	}

}
