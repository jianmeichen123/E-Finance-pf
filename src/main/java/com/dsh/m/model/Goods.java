package com.dsh.m.model;

import java.io.Serializable;

public class Goods implements Serializable {

	/**
	 */
	private Integer goodsid;
	/**
	 * 商品名称
	 */
	private String gname;
	/**
	 * 单位
	 */
	private String unit;
	/**
	 */
	private Boolean iscalculate;
	/**
	 * 商品小类ID
	 */
	private Integer sclassid;
	/**
	 */
	private String beizhu;
	/**
	 */
	private String image;
	/**
	 */
	private String isSale;

	/**
	 * goods.
	 */
	public Integer getGoodsid() {
		return goodsid;
	}

	/**
	 * goods.
	 */
	public void setGoodsid(Integer goodsid) {
		this.goodsid = goodsid;
	}

	/**
	 * goods.商品名称
	 */
	public String getGname() {
		return gname;
	}

	/**
	 * goods.商品名称
	 */
	public void setGname(String gname) {
		this.gname = gname;
	}

	/**
	 * goods.单位
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * goods.单位
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * goods.
	 */
	public Boolean getIscalculate() {
		return iscalculate;
	}

	/**
	 * goods.
	 */
	public void setIscalculate(Boolean iscalculate) {
		this.iscalculate = iscalculate;
	}

	/**
	 * goods.商品小类ID
	 */
	public Integer getSclassid() {
		return sclassid;
	}

	/**
	 * goods.商品小类ID
	 */
	public void setSclassid(Integer sclassid) {
		this.sclassid = sclassid;
	}

	/**
	 * goods.
	 */
	public String getBeizhu() {
		return beizhu;
	}

	/**
	 * goods.
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	/**
	 * goods.
	 */
	public String getImage() {
		return image;
	}

	/**
	 * goods.
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * goods.
	 */
	public String getIsSale() {
		return isSale;
	}

	/**
	 * goods.
	 */
	public void setIsSale(String isSale) {
		this.isSale = isSale;
	}
}