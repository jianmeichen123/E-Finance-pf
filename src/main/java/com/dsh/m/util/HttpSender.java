package com.dsh.m.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.infosight.open.api.utils.MD5;

public class HttpSender {

    public static String sendPOST(String url) {

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("charset", "UTF-8"));
        params.add(new BasicNameValuePair("mercId", "888000000000168"));
        params.add(new BasicNameValuePair("requestId", "test_request_new7"));
        params.add(new BasicNameValuePair("interfaceName", "gwSmsCodeOffline"));
        params.add(new BasicNameValuePair("version", "1.0"));
        params.add(new BasicNameValuePair("signType", "MD5"));
        params.add(new BasicNameValuePair("mobileNo", "13366343223"));
        params.add(new BasicNameValuePair("smsType", "1"));
      //  params.add(new BasicNameValuePair("bankAbbr", "CCB"));
      //  params.add(new BasicNameValuePair("cardType", "0"));
        params.add(new BasicNameValuePair("cardNo", "v0p3LHPAgMMKX+w5KLdxlm0+0eLbAOsC"));
        params.add(new BasicNameValuePair("cardName", "Z1PiTMIw6QYLds9rDlPKyQ=="));
        params.add(new BasicNameValuePair("idType", "00"));
        params.add(new BasicNameValuePair("idNo", "fGwOwY3OSJjzp97gMz1BN/1GTfLCvuRE"));

        // 设置签名数据
        String signStr = "UTF-8888000000000168test_request_new7gwSmsCodeOffline1.0MD5133663432231v0p3LHPAgMMKX+w5KLdxlm0+0eLbAOsCZ1PiTMIw6QYLds9rDlPKyQ==00fGwOwY3OSJjzp97gMz1BN/1GTfLCvuRE"; 
   //   String signStr = "UTF-8888000000000168test_request_0005gwSmsCodeOffline1.0MD5185112908861CMB0aPQGBWT8Tb%2B9S3MCzjklUgCI7t94rq0CHCj1OtLbcZo%3D00Coscp2%2B88E9wKKJ%2FyQyhr8LxntulUNRi";
        
         String signStr_new = MD5.sign(signStr, "aff167ff067e4dbe999d37af0bb848f6", "UTF-8");
        params.add(new BasicNameValuePair("hmac", signStr_new));

        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost(url);
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
            HttpResponse response = httpClient.execute(httpPost);
            if (response.getStatusLine().getStatusCode() == 200) {// 如果状态码为200,就是正常返回
                String result = EntityUtils.toString(response.getEntity());
                System.out.println(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void main(String[] args) {
        HttpSender.sendPOST("http://119.254.111.198:8050/ips/mercExp/gwExpress/smsCode");
    }
   
}
