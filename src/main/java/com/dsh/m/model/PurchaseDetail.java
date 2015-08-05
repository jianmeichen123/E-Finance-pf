package com.dsh.m.model;

import java.math.BigDecimal;
import java.util.Date;

public class PurchaseDetail {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_detail.pur_detailid
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    private Integer purDetailid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_detail.orderid
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    private String orderid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_detail.amount
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_detail.beizhu
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    private String beizhu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_detail.unit_price
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    private BigDecimal unitPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_detail.total_price
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    private BigDecimal totalPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_detail.issettle
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    private Boolean issettle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_detail.status
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    private Boolean status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_detail.isdeal
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    private Boolean isdeal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_detail.deal_time
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    private Date dealTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_detail.detailMoney
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    private BigDecimal detailmoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_detail.goodsid
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    private Integer goodsid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_detail.purchaseid
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    private Integer purchaseid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_detail.dr
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    private String dr;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_detail.pur_detailid
     *
     * @return the value of purchase_detail.pur_detailid
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public Integer getPurDetailid() {
        return purDetailid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_detail.pur_detailid
     *
     * @param purDetailid the value for purchase_detail.pur_detailid
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public void setPurDetailid(Integer purDetailid) {
        this.purDetailid = purDetailid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_detail.orderid
     *
     * @return the value of purchase_detail.orderid
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_detail.orderid
     *
     * @param orderid the value for purchase_detail.orderid
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_detail.amount
     *
     * @return the value of purchase_detail.amount
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_detail.amount
     *
     * @param amount the value for purchase_detail.amount
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_detail.beizhu
     *
     * @return the value of purchase_detail.beizhu
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public String getBeizhu() {
        return beizhu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_detail.beizhu
     *
     * @param beizhu the value for purchase_detail.beizhu
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_detail.unit_price
     *
     * @return the value of purchase_detail.unit_price
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_detail.unit_price
     *
     * @param unitPrice the value for purchase_detail.unit_price
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_detail.total_price
     *
     * @return the value of purchase_detail.total_price
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_detail.total_price
     *
     * @param totalPrice the value for purchase_detail.total_price
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_detail.issettle
     *
     * @return the value of purchase_detail.issettle
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public Boolean getIssettle() {
        return issettle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_detail.issettle
     *
     * @param issettle the value for purchase_detail.issettle
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public void setIssettle(Boolean issettle) {
        this.issettle = issettle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_detail.status
     *
     * @return the value of purchase_detail.status
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_detail.status
     *
     * @param status the value for purchase_detail.status
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_detail.isdeal
     *
     * @return the value of purchase_detail.isdeal
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public Boolean getIsdeal() {
        return isdeal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_detail.isdeal
     *
     * @param isdeal the value for purchase_detail.isdeal
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public void setIsdeal(Boolean isdeal) {
        this.isdeal = isdeal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_detail.deal_time
     *
     * @return the value of purchase_detail.deal_time
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public Date getDealTime() {
        return dealTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_detail.deal_time
     *
     * @param dealTime the value for purchase_detail.deal_time
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_detail.detailMoney
     *
     * @return the value of purchase_detail.detailMoney
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public BigDecimal getDetailmoney() {
        return detailmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_detail.detailMoney
     *
     * @param detailmoney the value for purchase_detail.detailMoney
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public void setDetailmoney(BigDecimal detailmoney) {
        this.detailmoney = detailmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_detail.goodsid
     *
     * @return the value of purchase_detail.goodsid
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_detail.goodsid
     *
     * @param goodsid the value for purchase_detail.goodsid
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_detail.purchaseid
     *
     * @return the value of purchase_detail.purchaseid
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public Integer getPurchaseid() {
        return purchaseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_detail.purchaseid
     *
     * @param purchaseid the value for purchase_detail.purchaseid
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public void setPurchaseid(Integer purchaseid) {
        this.purchaseid = purchaseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_detail.dr
     *
     * @return the value of purchase_detail.dr
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public String getDr() {
        return dr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_detail.dr
     *
     * @param dr the value for purchase_detail.dr
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public void setDr(String dr) {
        this.dr = dr;
    }
}