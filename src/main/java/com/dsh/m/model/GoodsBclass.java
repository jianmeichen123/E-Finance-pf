package com.dsh.m.model;

import java.io.Serializable;

public class GoodsBclass implements Serializable {

	/**
	 */
	private Integer bclassid;
	/**
	 * 商品大类名称
	 */
	private String bclassname;
	/**
	 */
	private Boolean isallow;
	/**
	 */
	private String isSale;
	/**
	 * goods_bclass.
	 */
	public Integer getBclassid() {
		return bclassid;
	}

	/**
	 * goods_bclass.
	 */
	public void setBclassid(Integer bclassid) {
		this.bclassid = bclassid;
	}

	/**
	 * goods_bclass.商品大类名称
	 */
	public String getBclassname() {
		return bclassname;
	}

	/**
	 * goods_bclass.商品大类名称
	 */
	public void setBclassname(String bclassname) {
		this.bclassname = bclassname;
	}

	/**
	 * goods_bclass.
	 */
	public Boolean getIsallow() {
		return isallow;
	}

	/**
	 * goods_bclass.
	 */
	public void setIsallow(Boolean isallow) {
		this.isallow = isallow;
	}

	/**
	 * goods_bclass.
	 */
	public String getIsSale() {
		return isSale;
	}

	/**
	 * goods_bclass.
	 */
	public void setIsSale(String isSale) {
		this.isSale = isSale;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -3069484121243079470L;
}