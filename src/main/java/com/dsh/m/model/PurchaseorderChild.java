package com.dsh.m.model;

import java.math.BigDecimal;
import java.util.Date;

public class PurchaseorderChild {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column purchaseorder_child.id
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column purchaseorder_child.orderid
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private Integer orderid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column purchaseorder_child.goodsid
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private Integer goodsid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column purchaseorder_child.amount
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private BigDecimal amount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column purchaseorder_child.real_amount
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private BigDecimal realAmount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column purchaseorder_child.unit_price
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private BigDecimal unitPrice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column purchaseorder_child.total_price
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private BigDecimal totalPrice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column purchaseorder_child.issettle
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private Boolean issettle;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column purchaseorder_child.remark
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String remark;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column purchaseorder_child.createuser
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private Integer createuser;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column purchaseorder_child.createtime
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private Date createtime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column purchaseorder_child.updateuser
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private Integer updateuser;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column purchaseorder_child.updatetime
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private Date updatetime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column purchaseorder_child.ts
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String ts;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column purchaseorder_child.dr
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String dr;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column purchaseorder_child.zyx1
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String zyx1;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column purchaseorder_child.zyx2
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String zyx2;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column purchaseorder_child.zyx3
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String zyx3;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column purchaseorder_child.zyx4
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String zyx4;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column purchaseorder_child.zyx5
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String zyx5;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column purchaseorder_child.referenceprice
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private BigDecimal referenceprice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column purchaseorder_child.referencesum
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private Long referencesum;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column purchaseorder_child.checkamount
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private BigDecimal checkamount;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column purchaseorder_child.id
	 * @return  the value of purchaseorder_child.id
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column purchaseorder_child.id
	 * @param id  the value for purchaseorder_child.id
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column purchaseorder_child.orderid
	 * @return  the value of purchaseorder_child.orderid
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Integer getOrderid() {
		return orderid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column purchaseorder_child.orderid
	 * @param orderid  the value for purchaseorder_child.orderid
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column purchaseorder_child.goodsid
	 * @return  the value of purchaseorder_child.goodsid
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Integer getGoodsid() {
		return goodsid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column purchaseorder_child.goodsid
	 * @param goodsid  the value for purchaseorder_child.goodsid
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setGoodsid(Integer goodsid) {
		this.goodsid = goodsid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column purchaseorder_child.amount
	 * @return  the value of purchaseorder_child.amount
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column purchaseorder_child.amount
	 * @param amount  the value for purchaseorder_child.amount
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column purchaseorder_child.real_amount
	 * @return  the value of purchaseorder_child.real_amount
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public BigDecimal getRealAmount() {
		return realAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column purchaseorder_child.real_amount
	 * @param realAmount  the value for purchaseorder_child.real_amount
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setRealAmount(BigDecimal realAmount) {
		this.realAmount = realAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column purchaseorder_child.unit_price
	 * @return  the value of purchaseorder_child.unit_price
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column purchaseorder_child.unit_price
	 * @param unitPrice  the value for purchaseorder_child.unit_price
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column purchaseorder_child.total_price
	 * @return  the value of purchaseorder_child.total_price
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column purchaseorder_child.total_price
	 * @param totalPrice  the value for purchaseorder_child.total_price
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column purchaseorder_child.issettle
	 * @return  the value of purchaseorder_child.issettle
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Boolean getIssettle() {
		return issettle;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column purchaseorder_child.issettle
	 * @param issettle  the value for purchaseorder_child.issettle
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setIssettle(Boolean issettle) {
		this.issettle = issettle;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column purchaseorder_child.remark
	 * @return  the value of purchaseorder_child.remark
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column purchaseorder_child.remark
	 * @param remark  the value for purchaseorder_child.remark
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column purchaseorder_child.createuser
	 * @return  the value of purchaseorder_child.createuser
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Integer getCreateuser() {
		return createuser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column purchaseorder_child.createuser
	 * @param createuser  the value for purchaseorder_child.createuser
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setCreateuser(Integer createuser) {
		this.createuser = createuser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column purchaseorder_child.createtime
	 * @return  the value of purchaseorder_child.createtime
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Date getCreatetime() {
		return createtime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column purchaseorder_child.createtime
	 * @param createtime  the value for purchaseorder_child.createtime
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column purchaseorder_child.updateuser
	 * @return  the value of purchaseorder_child.updateuser
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Integer getUpdateuser() {
		return updateuser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column purchaseorder_child.updateuser
	 * @param updateuser  the value for purchaseorder_child.updateuser
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setUpdateuser(Integer updateuser) {
		this.updateuser = updateuser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column purchaseorder_child.updatetime
	 * @return  the value of purchaseorder_child.updatetime
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Date getUpdatetime() {
		return updatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column purchaseorder_child.updatetime
	 * @param updatetime  the value for purchaseorder_child.updatetime
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column purchaseorder_child.ts
	 * @return  the value of purchaseorder_child.ts
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getTs() {
		return ts;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column purchaseorder_child.ts
	 * @param ts  the value for purchaseorder_child.ts
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setTs(String ts) {
		this.ts = ts;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column purchaseorder_child.dr
	 * @return  the value of purchaseorder_child.dr
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getDr() {
		return dr;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column purchaseorder_child.dr
	 * @param dr  the value for purchaseorder_child.dr
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setDr(String dr) {
		this.dr = dr;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column purchaseorder_child.zyx1
	 * @return  the value of purchaseorder_child.zyx1
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getZyx1() {
		return zyx1;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column purchaseorder_child.zyx1
	 * @param zyx1  the value for purchaseorder_child.zyx1
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setZyx1(String zyx1) {
		this.zyx1 = zyx1;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column purchaseorder_child.zyx2
	 * @return  the value of purchaseorder_child.zyx2
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getZyx2() {
		return zyx2;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column purchaseorder_child.zyx2
	 * @param zyx2  the value for purchaseorder_child.zyx2
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setZyx2(String zyx2) {
		this.zyx2 = zyx2;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column purchaseorder_child.zyx3
	 * @return  the value of purchaseorder_child.zyx3
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getZyx3() {
		return zyx3;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column purchaseorder_child.zyx3
	 * @param zyx3  the value for purchaseorder_child.zyx3
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setZyx3(String zyx3) {
		this.zyx3 = zyx3;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column purchaseorder_child.zyx4
	 * @return  the value of purchaseorder_child.zyx4
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getZyx4() {
		return zyx4;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column purchaseorder_child.zyx4
	 * @param zyx4  the value for purchaseorder_child.zyx4
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setZyx4(String zyx4) {
		this.zyx4 = zyx4;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column purchaseorder_child.zyx5
	 * @return  the value of purchaseorder_child.zyx5
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getZyx5() {
		return zyx5;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column purchaseorder_child.zyx5
	 * @param zyx5  the value for purchaseorder_child.zyx5
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setZyx5(String zyx5) {
		this.zyx5 = zyx5;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column purchaseorder_child.referenceprice
	 * @return  the value of purchaseorder_child.referenceprice
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public BigDecimal getReferenceprice() {
		return referenceprice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column purchaseorder_child.referenceprice
	 * @param referenceprice  the value for purchaseorder_child.referenceprice
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setReferenceprice(BigDecimal referenceprice) {
		this.referenceprice = referenceprice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column purchaseorder_child.referencesum
	 * @return  the value of purchaseorder_child.referencesum
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Long getReferencesum() {
		return referencesum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column purchaseorder_child.referencesum
	 * @param referencesum  the value for purchaseorder_child.referencesum
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setReferencesum(Long referencesum) {
		this.referencesum = referencesum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column purchaseorder_child.checkamount
	 * @return  the value of purchaseorder_child.checkamount
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public BigDecimal getCheckamount() {
		return checkamount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column purchaseorder_child.checkamount
	 * @param checkamount  the value for purchaseorder_child.checkamount
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setCheckamount(BigDecimal checkamount) {
		this.checkamount = checkamount;
	}
	
	private BigDecimal checktotalprice;

	public BigDecimal getChecktotalprice() {
		return checktotalprice;
	}

	public void setChecktotalprice(BigDecimal checktotalprice) {
		this.checktotalprice = checktotalprice;
	}
}