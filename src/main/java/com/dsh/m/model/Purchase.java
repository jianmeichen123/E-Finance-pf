package com.dsh.m.model;

import java.util.Date;

public class Purchase {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase.purid
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    private Integer purid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase.orderid
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    private String orderid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase.inputtime
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    private Date inputtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase.customerid
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    private Integer customerid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase.supplyid
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    private Integer supplyid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase.purid
     *
     * @return the value of purchase.purid
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public Integer getPurid() {
        return purid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase.purid
     *
     * @param purid the value for purchase.purid
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public void setPurid(Integer purid) {
        this.purid = purid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase.orderid
     *
     * @return the value of purchase.orderid
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase.orderid
     *
     * @param orderid the value for purchase.orderid
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase.inputtime
     *
     * @return the value of purchase.inputtime
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public Date getInputtime() {
        return inputtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase.inputtime
     *
     * @param inputtime the value for purchase.inputtime
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public void setInputtime(Date inputtime) {
        this.inputtime = inputtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase.customerid
     *
     * @return the value of purchase.customerid
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public Integer getCustomerid() {
        return customerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase.customerid
     *
     * @param customerid the value for purchase.customerid
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase.supplyid
     *
     * @return the value of purchase.supplyid
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public Integer getSupplyid() {
        return supplyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase.supplyid
     *
     * @param supplyid the value for purchase.supplyid
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    public void setSupplyid(Integer supplyid) {
        this.supplyid = supplyid;
    }
}