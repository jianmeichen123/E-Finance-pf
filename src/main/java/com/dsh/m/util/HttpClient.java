package com.dsh.m.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import jodd.datetime.JDateTime;

import org.apache.activemq.protobuf.compiler.TextFormat.ParseException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.apache.http.NameValuePair;
import org.apache.log4j.Logger;

import com.dsh.m.constant.Consstants;
import com.infosight.open.api.utils.MD5;
import com.infosight.open.api.utils.TribleDesEncrypt;

/**
 * httpclient工具类
 * 
 * @author liwq 2015-11-06
 * */
public class HttpClient {

	private static Logger log = Logger.getLogger("com.dsh.m.util.HttpClient");

	/**
	 * post方式提交
	 * 
	 * @author liwq 2015-11-06
	 * */
	public static String post(String url, Map<String, String> params) {
		DefaultHttpClient httpclient = new DefaultHttpClient();
		String body = null;

		log.info("create httppost:" + url);
		HttpPost post = postForm(url, params);

		body = invoke(httpclient, post);

		httpclient.getConnectionManager().shutdown();

		return body;
	}

	/**
	 * get方式提交
	 * 
	 * @author liwq 2015-11-06
	 * */
	public static String get(String url) {
		DefaultHttpClient httpclient = new DefaultHttpClient();
		String body = null;

		log.info("create httppost:" + url);
		HttpGet get = new HttpGet(url);
		body = invoke(httpclient, get);

		httpclient.getConnectionManager().shutdown();

		return body;
	}

	private static String invoke(DefaultHttpClient httpclient,
			HttpUriRequest httpost) {

		HttpResponse response = sendRequest(httpclient, httpost);
		String body = paseResponse(response);

		return body;
	}

	/**
	 * @author 陈建梅 2015-11-11 最终结果返回方法
	 * @param response
	 * @return
	 */
	private static String paseResponse(HttpResponse response) {
		log.info("get response from http server..");
		HttpEntity entity = response.getEntity();

		log.info("response status: " + response.getStatusLine());
		String charset = EntityUtils.getContentCharSet(entity);
		log.info(charset);

		String body = null;
		try {
			body = EntityUtils.toString(entity);
			log.info(body);
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return body;
	}

	/**
	 * 响应请求
	 * 
	 * @author liwq 2015-11-06
	 * 
	 * */
	private static HttpResponse sendRequest(DefaultHttpClient httpclient,
			HttpUriRequest httpost) {
		log.info("execute post...");
		HttpResponse response = null;

		try {
			response = httpclient.execute(httpost);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;
	}

	/**
	 * 生成post表单1
	 * 
	 * @author liwq 2015-11-06 params 请求地址，请求参数
	 * */
	private static HttpPost postForm(String url, Map<String, String> params) {

		HttpPost httpost = new HttpPost(url);
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();

		Set<String> keySet = params.keySet();
		for (String key : keySet) {
			nvps.add(new BasicNameValuePair(key, params.get(key)));
		}

		try {
			log.info("set utf-8 form entity to httppost");
			httpost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return httpost;
	}

	/**
	 * 加密字段加密处理
	 * 
	 * @author 陈建梅 2015-11-12
	 * @return
	 */
	public static String encript(String cardNo) {
		// 字段加密,密钥必须为32位,不足位数右补0
		String signKey = "aff167ff067e4dbe999d37af0bb848f6";
		String signKey1 = "";
		int psw_len = signKey.length();
		if (psw_len >= 32) {
			signKey1 = signKey.substring(0, 32);
		} else {
			signKey1 = signKey;
			for (int i = 0; i < 32 - psw_len; i++) {
				signKey1 = signKey1 + "0";
			}
		}
		String cardNoNew = "";
		try {
			cardNoNew = TribleDesEncrypt.encryptMode(signKey1, cardNo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cardNoNew;
	}
	public static String basegenerate() {
		return new JDateTime().toString("YYYYMMDDhhmmss")+new Random().nextInt(100);
	}
}
