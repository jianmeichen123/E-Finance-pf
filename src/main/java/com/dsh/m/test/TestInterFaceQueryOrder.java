package com.dsh.m.test;

import java.util.HashMap;
import java.util.Map;

import com.dsh.m.constant.Consstants;
import com.dsh.m.util.HttpClient;
import com.infosight.open.api.utils.MD5;

public class TestInterFaceQueryOrder {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
    	map.put("charset", "UTF-8");
		map.put("mercId", "888000000000168");
		map.put("requestId", "test_request_new9");
		map.put("interfaceName", "gwQryOrderExpressOffline");
		map.put("version", "1.0");
		map.put("signType", "MD5");
	//	map.put("mobileNo", "15210896985");
	//	map.put("smsType", "1");
	//map.put("cardNo", "ZU4XaXr2y2YMtAohm4ZXpACI7t94rq0C");
	//	map.put("cardName", "Z1PiTMIw6QYLds9rDlPKyQ==");
	//	map.put("idType", "00");
	//	map.put("idNo", "fGwOwY3OSJjzp97gMz1BN/1GTfLCvuRE");
		map.put("orderId", "md2015080418511527");
      //map.put("amount", "1");
      //map.put("validTime", "2h");
      //map.put("notifyUrl", "111111111");
	//	map.put("agrNo", "bfc6ef862363426e89ee6eaedbd392dd");
		
		String signStr = "UTF-8888000000000168test_request_new9gwQryOrderExpressOffline1.0MD5md2015080418511527";
		String signStr_new = MD5.sign(signStr,
				"aff167ff067e4dbe999d37af0bb848f6", "UTF-8");

		map.put("hmac", signStr_new);
		TestInterFaceSign ss=new TestInterFaceSign();
		HttpClient.post(Consstants.Test_InterFace_QueryOrder, map);
	//	com.dsh.m.util.HttpClient - {"mercId":"888000000000168","requestId":"test_request_new9","interfaceName":"gwQryOrderExpressOffline","version":"1.0","signType":"MD5","returnCode":"IPS0000","message":"交易成功","hmac":"29173ef511d6527f2f0084b0fc2817db","orderId":"md2015080418511527","orderAmt":"1","paySts":"F","payDt":"20151112","payTime":"113841","rmk":""}
	//	2015-11-12 11:49:39,152 [main] DEBUG org.apache.http.impl.conn.DefaultClientConnection - Connection 0.0.0.0:65280<->119.254.111.198:8050 closed
	}

}
