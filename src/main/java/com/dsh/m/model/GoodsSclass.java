package com.dsh.m.model;

public class GoodsSclass {
	/**
	 */
	private Integer sclassid;
	/**
	 * 商品小类名称
	 */
	private String sclassname;
	/**
	 * 商品大类ID
	 */
	private Integer bclassid;
	/**
	 * 商品大类图片地址
	 */
	private String image;
	/**
	 */
	private String isSale;

	/**
	 * goods_sclass.
	 */
	public Integer getSclassid() {
		return sclassid;
	}

	/**
	 * goods_sclass.
	 */
	public void setSclassid(Integer sclassid) {
		this.sclassid = sclassid;
	}

	/**
	 * goods_sclass.商品小类名称
	 */
	public String getSclassname() {
		return sclassname;
	}

	/**
	 * goods_sclass.商品小类名称
	 */
	public void setSclassname(String sclassname) {
		this.sclassname = sclassname;
	}

	/**
	 * goods_sclass.商品大类ID
	 */
	public Integer getBclassid() {
		return bclassid;
	}

	/**
	 * goods_sclass.商品大类ID
	 */
	public void setBclassid(Integer bclassid) {
		this.bclassid = bclassid;
	}

	/**
	 * goods_sclass.商品大类图片地址
	 */
	public String getImage() {
		return image;
	}

	/**
	 * goods_sclass.商品大类图片地址
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * goods_sclass.
	 */
	public String getIsSale() {
		return isSale;
	}

	/**
	 * goods_sclass.
	 */
	public void setIsSale(String isSale) {
		this.isSale = isSale;
	}
}