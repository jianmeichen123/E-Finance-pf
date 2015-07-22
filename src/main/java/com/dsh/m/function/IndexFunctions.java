package com.dsh.m.function;

import java.math.BigDecimal;

import com.dsh.m.enumtype.IndexLevelEnum;

import jetbrick.template.JetAnnotations.Functions;

@Functions
public class IndexFunctions {
	
	public static String getColorByRate(BigDecimal overRate) {
		BigDecimal value1 = new BigDecimal("0.1");
		BigDecimal value2 = new BigDecimal("0.2");
		BigDecimal value3 = new BigDecimal("0.4");
		if(overRate.compareTo(value1)<1)
			return "blue";
		else if(overRate.compareTo(value1)==1&&overRate.compareTo(value2)<1)
			return "yellow";
		else if(overRate.compareTo(value2)==1&&overRate.compareTo(value3)<1)
			return "orange";
		else if(overRate.compareTo(value3)==1)
			return "red";
		return null;
	}
	
	public static IndexLevelEnum getDescByIndex(Double index) {
		System.err.println(index);
		IndexLevelEnum[] enums = IndexLevelEnum.values();
		for(IndexLevelEnum enumtype:enums) {
			Double min = enumtype.getMin();
			Double max = enumtype.getMax();
			System.err.println("min="+min+",max="+max);
			if(min!=null&&max!=null) {
				if(index>min&&index<=max) {
					return enumtype;
				} else {
					continue;
				}
			} else if(min==null) {
				if(index>max) {
					return enumtype;
				} else {
					continue;
				}
			} else if(max==null) {
				if(index<=min) {
					return enumtype;
				} else {
					continue;
				}
			}
		}
		return null;
	}
	
	public static BigDecimal multiplyIndex(BigDecimal org) {
		return org.multiply(new BigDecimal(100));
	}
	
	public static boolean isPositive(BigDecimal big) {
		return big.compareTo(new BigDecimal(0))==1;
	}
	
	public static void main(String[] args) {
		getColorByRate(new BigDecimal("0.01"));
	}

}
