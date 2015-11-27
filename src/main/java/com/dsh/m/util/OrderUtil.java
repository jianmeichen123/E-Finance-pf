package com.dsh.m.util;

import java.io.File;
import java.util.Date;
import java.util.Random;

import jodd.datetime.JDateTime;

public class OrderUtil {
	
	public static String generateOrderNo() {
		return "md"+basegenerate();
	}
	
	public static String generateSettleNo() {
		return "js"+basegenerate();
	}
	
	public static String generatePeriodNo() {
		return "zq"+basegenerate();
	}
	
	public static String basegenerate() {
		return new JDateTime().toString("YYYYMMDDhhmmss")+new Random().nextInt(100);
	}
	
	public static void main(String[] args) {
		System.out.println(generateOrderNo());
	}
	public static String changOrderId(String orderid){	
		long oid = Long.parseLong(orderid);
		oid = oid + 1;
		return oid + "";
	}
	/**
	 * 以某个日期为标准，获得这个日期的第一张单号
	 * @param date 格式为2011-06-21 10:10:10
	 * @return
	 */
	public static String getFirstOrderId(String date){
		date = date.split(" ")[0];
		String year = DateUtil.getYearByDate(date);
		String month = DateUtil.getMonthByDate(date);
		String day = DateUtil.getDayByDate(date);
		String id = "00001";
		return year + month + day + id;
	}
	
	 public static String getOrderId(){
			String resultStr;
			SerialNumber serial = new FileEveryDaySerialNumber(5, "EveryDaySerialNumber.dat");
			resultStr=serial.getSerialNumber();
			return resultStr;
		}
	 

}
