package com.dsh.m.util;
import com.infosight.open.api.utils.TribleDesEncrypt;

public class CreatePassword {
	

	public static void main(String[] args) {
	        // 字段加密,密钥必须为32位,不足位数右补0
	        String signKey="aff167ff067e4dbe999d37af0bb848f6";
	        String signKey1="";
	int psw_len=signKey.length();
	if(psw_len>=32){
	signKey1=signKey.substring(0,32);
	}else{
	signKey1=signKey;
	for(int i=0;i<32-psw_len;i++){
	signKey1=signKey1+"0";
	              }
	          }
	     //  String cardNo="6217000010051553694";
	       String cardNo="6907558907069999";
	  //   String cardNo="李伟强";
	//    String cardNo="150424198206130030";
	        String cardNoNew = "";                                                                                                                                                                                                                                                                                                                                     
			try {
				cardNoNew = TribleDesEncrypt.encryptMode(signKey1, cardNo);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	          System.out.println("加密后结果:" + cardNoNew);   
	    }
	}
