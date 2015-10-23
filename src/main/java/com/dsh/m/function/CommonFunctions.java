package com.dsh.m.function;

import java.math.BigDecimal;
import java.util.Date;

import jetbrick.template.JetAnnotations.Functions;
import jodd.datetime.JDateTime;

import com.dsh.m.model.Subject;
import com.dsh.m.model.SysDictionary;
import com.dsh.m.service.SubjectService;
import com.dsh.m.service.SysDictionaryService;
import com.dsh.m.util.SpringUtil;

@Functions
public class CommonFunctions {
	
	public static String dateformat(Date date, String pattern) {
		return new JDateTime(date).toString(pattern);
	}
	
	public static String cutZero(BigDecimal figure) {
		String text = figure.toString();
		StringBuilder sb = new StringBuilder(text);
		for(int i=text.length()-1;i>=0;i--) {
			String curr = text.charAt(i)+"";
			if(!"0".equals(curr)&&!".".equals(curr)) break;
			else sb.deleteCharAt(i);
		}
		return sb.toString();
	}
	
	public static BigDecimal sub(BigDecimal b1, BigDecimal b2) {
		return b1.subtract(b2);
	}
	
	public static String getSubjectNameById(Integer id){
		SubjectService subjectService = SpringUtil.getBean(SubjectService.class);
		Subject subject = subjectService.getCacheSubjectById(id);
		return subject==null?"":subject.getSubname();
	}
	
	public static String getDicName(String dictype, String dicnum){
		SysDictionaryService sysDictionaryService = SpringUtil.getBean(SysDictionaryService.class);
		SysDictionary sysDictionary = sysDictionaryService.getCacheSysDictionary(dictype, dicnum);
		return sysDictionary==null?"":sysDictionary.getName();
	}
	
	public static void main(String[] args) {
		System.out.println(cutZero(new BigDecimal("25.6000")));
	}

}
