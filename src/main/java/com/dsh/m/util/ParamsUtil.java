package com.dsh.m.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.dsh.m.model.PayAppoint;
import com.dsh.m.model.PayBase;
import com.dsh.m.model.PayPayment;
import com.dsh.m.model.PaySmscode;
import com.dsh.m.model.Purchaseorder;
import com.infosight.open.api.utils.MD5;

public class ParamsUtil {
	public static Map<String,String> setSmsCodeMapParams(PayBase payBase,PaySmscode payPppiont){
		Map<String, String> map = new HashMap<String, String>();
		map.put("charset", payBase.getCharset());
		map.put("mercId", payBase.getMercid());
		map.put("requestId", "dsh_smscode"+HttpClient.basegenerate());
		map.put("interfaceName", "gwSmsCodeOffline");
		map.put("version", payBase.getVersion());
		map.put("signType", payBase.getSigntype());
		map.put("mobileNo", payPppiont.getMobileNo());
		map.put("smsType", "1");
		map.put("cardNo",HttpClient.encript(payPppiont.getCardNo()));
		map.put("cardName", HttpClient.encript(payPppiont.getCardName()));
		map.put("idType", "00");
		map.put("idNo", HttpClient.encript(payPppiont.getIdNo()));
		String signStr=setsignStr(map);
		map.put("hmac",signStr );
		return map;
	}
	public static Map<String,String> setSignMapParams(PayBase payBase,PayAppoint payPppiont){
		Map<String, String> map = new HashMap<String, String>();
		map.put("charset", payBase.getCharset());
		map.put("mercId", payBase.getMercid());
		map.put("requestId", "dsh_sign"+HttpClient.basegenerate());
		map.put("interfaceName", "gwSignExpressOffline");
		map.put("version", payBase.getVersion());
		map.put("signType", payBase.getSigntype());
		map.put("mobileNo", payPppiont.getMobileNo());
		//map.put("smsType", "1");
		map.put("cardNo", HttpClient.encript(payPppiont.getCardNo()));
		map.put("cardName", HttpClient.encript(payPppiont.getCardName()));
		map.put("idType", "00");
		map.put("idNo", HttpClient.encript(payPppiont.getIdNo()));
		map.put("tradeNo", payPppiont.getTradeNo());
		map.put("smsCode", payPppiont.getSmsCode());
		String signStr=setsignStr(map);
		map.put("hmac",signStr );
		return map;
	}
	public static Map<String,String> setPayMapParams(PayBase payBase,PayPayment payPayment){
		Map<String, String> map = new HashMap<String, String>();
		map.put("charset", payBase.getCharset());
		map.put("mercId", payBase.getMercid());
		map.put("requestId", "dsh_sign"+HttpClient.basegenerate());
		map.put("interfaceName", "gwPayExpressOffline");
		map.put("version", payBase.getVersion());
		map.put("signType", payBase.getSigntype());
		map.put("mobileNo",payPayment.getMobileNo());
	//	map.put("smsType", "1");
		map.put("cardNo", payPayment.getCardNo());
		map.put("cardName", payPayment.getCardName());
		map.put("idType", "00");
		map.put("idNo", payPayment.getIdNo());
		map.put("orderId",payPayment.getOrderId());
		map.put("amount", payPayment.getOrderAmt());
		map.put("validTime",payPayment.getValidTime());
		map.put("notifyUrl", "111111111");
		String signStr=setsignStr(map);
		map.put("hmac",signStr );
		return map;
	}
	public static Map<String,String> setPayByRgrNoMapParams(PayBase payBase,PayPayment payPayment,PayAppoint payAppoint){
		Map<String, String> map = new HashMap<String, String>();
		map.put("charset", payBase.getCharset());
		map.put("mercId", payBase.getMercid());
		map.put("requestId", "dsh_sign"+HttpClient.basegenerate());
		map.put("interfaceName", "gwPayExpressOffline");
		map.put("version", payBase.getVersion());
		map.put("signType", payBase.getSigntype());
		map.put("mobileNo",payPayment.getMobileNo());
		map.put("agrNo", payAppoint.getAgrNo());
		map.put("orderId",payPayment.getOrderId());
		map.put("amount", payPayment.getOrderAmt());
		map.put("validTime",payPayment.getValidTime());
		map.put("notifyUrl", "111111111");
		String signStr=setsignStr(map);
		map.put("hmac",signStr );
		return map;
	}
	public static Map<String,String> setQueryOrderMapParams(PayBase payBase,PayAppoint payPppiont,Purchaseorder purchaseorder){
		Map<String, String> map = new HashMap<String, String>();
		map.put("charset", payBase.getCharset());
		map.put("mercId", payBase.getMercid());
		map.put("requestId", "test_request_new9");
		map.put("interfaceName", "gwQryOrderExpressOffline");
		map.put("version", "1.0");
		map.put("signType", "MD5");
		map.put("orderId", "md2015080418511527");
    	String signStr=setsignStr(map);
		map.put("hmac",signStr );
		return map;
	}
	public  static String setsignStr(Map<String,String> params){
		Set<String> keySet = params.keySet();
		String signStr="";
		for (String key : keySet) {
			signStr=signStr+params.get(key);
		}
	  String signStr_new = MD5.sign(signStr,
					"aff167ff067e4dbe999d37af0bb848f6", "UTF-8");
		return signStr_new;
	}

}
