/**
 * Copyright (c) 2011-2015, James Zhan 詹波 (jfinal@126.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dsh.m.util;

import java.security.MessageDigest;
import java.util.Map;

import net.sf.json.JSONObject;

import com.dsh.m.model.PayAppoint;
import com.dsh.m.model.PayPayment;
import com.dsh.m.model.PayResult;
import com.dsh.m.model.PaySmscode;

public class EncriptUtil {
	
	public static String md5Encrypt(String srcStr){
		return encrypt("MD5", srcStr);
	}
	
	public static String sha1Encrypt(String srcStr){
		return encrypt("SHA-1", srcStr);
	}
	
	public static String sha256Encrypt(String srcStr){
		return encrypt("SHA-256", srcStr);
	}
	
	public static String sha384Encrypt(String srcStr){
		return encrypt("SHA-384", srcStr);
	}
	
	public static String sha512Encrypt(String srcStr){
		return encrypt("SHA-512", srcStr);
	}
	
	public static String encrypt(String algorithm, String srcStr) {
		try {
			StringBuilder result = new StringBuilder();
			MessageDigest md = MessageDigest.getInstance(algorithm);
			byte[] bytes = md.digest(srcStr.getBytes("utf-8"));
			for (byte b :bytes) {
				String hex = Integer.toHexString(b&0xFF);
				if (hex.length() == 1)
					result.append("0");
				result.append(hex);
			}
			return result.toString();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	public static PaySmscode UpdateSmsCode(PaySmscode paySmscodeold,
			PaySmscode paySmscodetnew) {
		paySmscodeold.setReturnCode(paySmscodetnew.getReturnCode());
		paySmscodeold.setMessage(paySmscodetnew.getMessage());
		paySmscodeold.setTradeNo(paySmscodetnew.getTradeNo());
		return paySmscodeold;
	}
	public static PayAppoint UpdateAppiont(PayAppoint payAppointold,
			PayAppoint payAppointnew) {
		payAppointold.setReturnCode(payAppointnew.getReturnCode());
		payAppointold.setMessage(payAppointnew.getMessage());
		payAppointold.setAgrNo(payAppointnew.getAgrNo());;
		return payAppointold;
	}
	public static PayPayment UpdatePayPayment(PayPayment PayPaymentold,
			PayPayment PayPaymentnew) {
		PayPaymentold.setReturnCode(PayPaymentnew.getReturnCode());
		PayPaymentold.setMessage(PayPaymentnew.getMessage());
		PayPaymentold.setOrderId(PayPaymentnew.getOrderId());
		PayPaymentold.setOrderAmt(PayPaymentnew.getOrderAmt());
		return PayPaymentold;
	}
    public static PaySmscode toJsonSmsCode(String post){
    	JSONObject jsStr = JSONObject.fromObject(post);
		PaySmscode paySmscodeReturn = (PaySmscode) JSONObject.toBean(jsStr,
				PaySmscode.class);
		return paySmscodeReturn;
    }
    public static PayAppoint toJsonAppiont(String post){
    	JSONObject jsStr = JSONObject.fromObject(post);
    	PayAppoint payPayAppointReturn = (PayAppoint) JSONObject.toBean(jsStr,
    			PayAppoint.class);
		return payPayAppointReturn;
    }
    public static PayPayment toJsonPayment(String post){
    	JSONObject jsStr = JSONObject.fromObject(post);
    	PayPayment payPayPaymentReturn = (PayPayment) JSONObject.toBean(jsStr,
    			PayPayment.class);
		return payPayPaymentReturn;
    }
    public static PayResult toJsonResult(String post){
    	JSONObject jsStr = JSONObject.fromObject(post);
    	PayResult payPayResultReturn = (PayResult) JSONObject.toBean(jsStr,
    			PayResult.class);
		return payPayResultReturn;
    }
    public static JSONObject toJson(Map map){
    	JSONObject json=JSONObject.fromObject(map);
    	return json;
    }
}




