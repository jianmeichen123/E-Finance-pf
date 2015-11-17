package com.dsh.m.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.dsh.m.constant.Consstants;
import com.dsh.m.model.PayAppoint;
import com.dsh.m.model.PayBase;
import com.dsh.m.model.PayPayment;
import com.dsh.m.model.PaySmscode;
import com.dsh.m.model.Purchaseorder;
import com.infosight.open.api.utils.MD5;

public class ParamsUtil {
	public static Map<String, String> setSmsCodeMapParams(PayBase payBase,
			PaySmscode payPppiont) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("charset", payBase.getCharset());
		map.put("mercId", payBase.getMercId());
		String requestId = "dsh_smscode" + HttpClient.basegenerate();
		map.put("requestId", requestId);
		map.put("interfaceName", "gwSmsCodeOffline");
		map.put("version", payBase.getVersion());
		map.put("signType", payBase.getSignType());
		map.put("mobileNo", payPppiont.getMobileNo());
		map.put("smsType", "1");
		map.put("cardNo", HttpClient.encript(payPppiont.getCardNo()));
		map.put("cardName", HttpClient.encript(payPppiont.getCardName()));
		map.put("idType", "00");
		map.put("idNo", HttpClient.encript(payPppiont.getIdNo()));
		String str = payBase.getCharset() + payBase.getMercId() + requestId
				+ "gwSmsCodeOffline" + payBase.getVersion()
				+ payBase.getSignType() + payPppiont.getMobileNo() + "1"
				+ HttpClient.encript(payPppiont.getCardNo())
				+ HttpClient.encript(payPppiont.getCardName())
				+ payPppiont.getIdType()
				+ HttpClient.encript(payPppiont.getIdNo());
		String signStr = setsignStr(str);
		map.put("hmac", signStr);
		return map;
	}

	public static Map<String, String> setSignMapParams(PayBase payBase,
			PayAppoint payPppiont) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("charset", payBase.getCharset());
		map.put("mercId", payBase.getMercId());
		String requestId = "dsh_sign" + HttpClient.basegenerate();
		map.put("requestId", requestId);
		map.put("interfaceName", "gwSignExpressOffline");
		map.put("version", payBase.getVersion());
		map.put("signType", payBase.getSignType());
		map.put("mobileNo", payPppiont.getMobileNo());
		map.put("cardNo", HttpClient.encript(payPppiont.getCardNo()));
		map.put("cardName", HttpClient.encript(payPppiont.getCardName()));
		map.put("idType", payPppiont.getIdType());
		map.put("idNo", HttpClient.encript(payPppiont.getIdNo()));
		map.put("tradeNo", payPppiont.getTradeNo());
		map.put("smsCode", payPppiont.getSmsCode());
		String str = payBase.getCharset() + payBase.getMercId() + requestId
				+ "gwSignExpressOffline" + payBase.getVersion()
				+ payBase.getSignType() + payPppiont.getMobileNo()
				+ HttpClient.encript(payPppiont.getCardNo())
				+ HttpClient.encript(payPppiont.getCardName())
				+ payPppiont.getIdType()
				+ HttpClient.encript(payPppiont.getIdNo())
				+payPppiont.getTradeNo()
				+ payPppiont.getSmsCode();
		String signStr = setsignStr(str);
		map.put("hmac", signStr);
		return map;
	}

	public static Map<String, String> setPayMapParams(PayBase payBase,
			PayPayment payPayment) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("charset", payBase.getCharset());
		map.put("mercId", payBase.getMercId());
		String requestid = "dsh_sign" + HttpClient.basegenerate();
		map.put("requestId", requestid);
		map.put("interfaceName", "gwPayExpressOffline");
		map.put("version", payBase.getVersion());
		map.put("signType", payBase.getSignType());
		map.put("mobileNo", payPayment.getMobileNo());
		// map.put("smsType", "1");
		map.put("cardNo", HttpClient.encript(payPayment.getCardNo()));
		map.put("cardName", HttpClient.encript(payPayment.getCardName()));
		map.put("idType", "00");
		map.put("idNo", HttpClient.encript(payPayment.getIdNo()));
		map.put("orderId", payPayment.getOrderId());
		map.put("amount", payPayment.getOrderAmt());
		map.put("validTime", payPayment.getValidTime());
		map.put("notifyUrl", Consstants.Test_InterFace_ResultNotice);
		String str = payBase.getCharset() + payBase.getMercId() + requestid
				+ "gwPayExpressOffline" + payBase.getVersion()
				+ payBase.getSignType() + payPayment.getMobileNo()
				+ HttpClient.encript(payPayment.getCardNo())
				+ HttpClient.encript(payPayment.getCardName()) + "00"
				+ HttpClient.encript(payPayment.getIdNo())
				+ payPayment.getOrderId() + payPayment.getOrderAmt()
				+ payPayment.getValidTime()
				+ Consstants.Test_InterFace_ResultNotice;
		String signStr = setsignStr(str);
		map.put("hmac", signStr);
		return map;
	}

	public static Map<String, String> setPayByRgrNoMapParams(PayBase payBase,
			PayPayment payPayment, PayAppoint payAppoint) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("charset", payBase.getCharset());
		map.put("mercId", payBase.getMercId());
		String requestid = "dsh_sign" + HttpClient.basegenerate();
		map.put("requestId", requestid);
		map.put("interfaceName", "gwPayExpressOffline");
		map.put("version", payBase.getVersion());
		map.put("signType", payBase.getSignType());
		map.put("mobileNo", payPayment.getMobileNo());
		map.put("agrNo", payAppoint.getAgrNo());
		map.put("orderId", payPayment.getOrderId());
		map.put("amount", payPayment.getOrderAmt());
		map.put("validTime", payPayment.getValidTime());
		map.put("notifyUrl", Consstants.Test_InterFace_ResultNotice);
		String str = payBase.getCharset() + payBase.getMercId() + requestid
				+ "gwPayExpressOffline" + payBase.getVersion()
				+ payBase.getSignType() + payPayment.getMobileNo()
				+ payAppoint.getAgrNo() + payPayment.getOrderId()
				+ payPayment.getOrderAmt() + payPayment.getValidTime()
				+ Consstants.Test_InterFace_ResultNotice;
		String signStr = setsignStr(str);
		map.put("hmac", signStr);
		return map;
	}

	public static Map<String, String> setQueryOrderMapParams(PayBase payBase,
			PayAppoint payPppiont, Purchaseorder purchaseorder) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("charset", payBase.getCharset());
		map.put("mercId", payBase.getMercId());
		String requestid = "dsh_sign" + HttpClient.basegenerate();
		map.put("requestId", requestid);
		map.put("interfaceName", "gwQryOrderExpressOffline");
		map.put("version", payBase.getVersion());
		map.put("signType", payBase.getSignType());
		map.put("orderId", purchaseorder.getOrdernum());
		String str = payBase.getCharset() + payBase.getMercId() + requestid
				+ "gwQryOrderExpressOffline" + payBase.getVersion()
				+ payBase.getSignType() + purchaseorder.getOrdernum();
		String signStr = setsignStr(str);
		map.put("hmac", signStr);
		return map;
	}

	public static String setsignStr(String params) {

		String signStr_new = MD5.sign(params,
				"aff167ff067e4dbe999d37af0bb848f6", "UTF-8");
		return signStr_new;
	}

}
