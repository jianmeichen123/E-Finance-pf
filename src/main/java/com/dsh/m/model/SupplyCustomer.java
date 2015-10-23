package com.dsh.m.model;

import java.math.BigDecimal;
import java.util.Date;

public class SupplyCustomer {

	/**
	 */
	private Integer sCid;
	/**
	 * 供应商ID
	 */
	private Integer supplyid;
	/**
	 * 餐饮客户ID
	 */
	private Integer customerid;
	/**
	 */
	private Float exponent;
	/**
	 */
	private String delivertime;
	/**
	 * 合同开始时间
	 */
	private Date agreementStarttime;
	/**
	 * 合同开始时间结束
	 */
	private Date agreementEndtime;
	/**
	 * 配送路线
	 */
	private Integer distributionRoute;
	/**
	 * 合同编号
	 */
	private String agreementnum;
	/**
	 * 对接类型
	 */
	private Integer classify;
	/**
	 * 排序
	 */
	private Short sortno;
	/**
	 * 备注
	 */
	private String commnt;
	/**
	 * 创建人
	 */
	private Integer createUser;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改人
	 */
	private Integer updateUser;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 时间戳
	 */
	private String ts;
	/**
	 * 删除标志
	 */
	private String dr;
	/**
	 * 自定义项1
	 */
	private Integer zyx1;
	/**
	 * 自定义项2
	 */
	private String zyx2;
	/**
	 * 自定义项3
	 */
	private String zyx3;
	/**
	 * 自定义项4
	 */
	private Date zyx4;
	/**
	 * 自定义项5
	 */
	private BigDecimal zyx5;

	/**
	 * supply_customer.
	 */
	public Integer getsCid() {
		return sCid;
	}

	/**
	 * supply_customer.
	 */
	public void setsCid(Integer sCid) {
		this.sCid = sCid;
	}

	/**
	 * supply_customer.供应商ID
	 */
	public Integer getSupplyid() {
		return supplyid;
	}

	/**
	 * supply_customer.供应商ID
	 */
	public void setSupplyid(Integer supplyid) {
		this.supplyid = supplyid;
	}

	/**
	 * supply_customer.餐饮客户ID
	 */
	public Integer getCustomerid() {
		return customerid;
	}

	/**
	 * supply_customer.餐饮客户ID
	 */
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}

	/**
	 * supply_customer.
	 */
	public Float getExponent() {
		return exponent;
	}

	/**
	 * supply_customer.
	 */
	public void setExponent(Float exponent) {
		this.exponent = exponent;
	}

	/**
	 * supply_customer.
	 */
	public String getDelivertime() {
		return delivertime;
	}

	/**
	 * supply_customer.
	 */
	public void setDelivertime(String delivertime) {
		this.delivertime = delivertime;
	}

	/**
	 * supply_customer.合同开始时间
	 */
	public Date getAgreementStarttime() {
		return agreementStarttime;
	}

	/**
	 * supply_customer.合同开始时间
	 */
	public void setAgreementStarttime(Date agreementStarttime) {
		this.agreementStarttime = agreementStarttime;
	}

	/**
	 * supply_customer.合同开始时间结束
	 */
	public Date getAgreementEndtime() {
		return agreementEndtime;
	}

	/**
	 * supply_customer.合同开始时间结束
	 */
	public void setAgreementEndtime(Date agreementEndtime) {
		this.agreementEndtime = agreementEndtime;
	}

	/**
	 * supply_customer.配送路线
	 */
	public Integer getDistributionRoute() {
		return distributionRoute;
	}

	/**
	 * supply_customer.配送路线
	 */
	public void setDistributionRoute(Integer distributionRoute) {
		this.distributionRoute = distributionRoute;
	}

	/**
	 * supply_customer.合同编号
	 */
	public String getAgreementnum() {
		return agreementnum;
	}

	/**
	 * supply_customer.合同编号
	 */
	public void setAgreementnum(String agreementnum) {
		this.agreementnum = agreementnum;
	}

	/**
	 * supply_customer.对接类型
	 */
	public Integer getClassify() {
		return classify;
	}

	/**
	 * supply_customer.对接类型
	 */
	public void setClassify(Integer classify) {
		this.classify = classify;
	}

	/**
	 * supply_customer.排序
	 */
	public Short getSortno() {
		return sortno;
	}

	/**
	 * supply_customer.排序
	 */
	public void setSortno(Short sortno) {
		this.sortno = sortno;
	}

	/**
	 * supply_customer.备注
	 */
	public String getCommnt() {
		return commnt;
	}

	/**
	 * supply_customer.备注
	 */
	public void setCommnt(String commnt) {
		this.commnt = commnt;
	}

	/**
	 * supply_customer.创建人
	 */
	public Integer getCreateUser() {
		return createUser;
	}

	/**
	 * supply_customer.创建人
	 */
	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}

	/**
	 * supply_customer.创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * supply_customer.创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * supply_customer.修改人
	 */
	public Integer getUpdateUser() {
		return updateUser;
	}

	/**
	 * supply_customer.修改人
	 */
	public void setUpdateUser(Integer updateUser) {
		this.updateUser = updateUser;
	}

	/**
	 * supply_customer.修改时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * supply_customer.修改时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * supply_customer.时间戳
	 */
	public String getTs() {
		return ts;
	}

	/**
	 * supply_customer.时间戳
	 */
	public void setTs(String ts) {
		this.ts = ts;
	}

	/**
	 * supply_customer.删除标志
	 */
	public String getDr() {
		return dr;
	}

	/**
	 * supply_customer.删除标志
	 */
	public void setDr(String dr) {
		this.dr = dr;
	}

	/**
	 * supply_customer.自定义项1
	 */
	public Integer getZyx1() {
		return zyx1;
	}

	/**
	 * supply_customer.自定义项1
	 */
	public void setZyx1(Integer zyx1) {
		this.zyx1 = zyx1;
	}

	/**
	 * supply_customer.自定义项2
	 */
	public String getZyx2() {
		return zyx2;
	}

	/**
	 * supply_customer.自定义项2
	 */
	public void setZyx2(String zyx2) {
		this.zyx2 = zyx2;
	}

	/**
	 * supply_customer.自定义项3
	 */
	public String getZyx3() {
		return zyx3;
	}

	/**
	 * supply_customer.自定义项3
	 */
	public void setZyx3(String zyx3) {
		this.zyx3 = zyx3;
	}

	/**
	 * supply_customer.自定义项4
	 */
	public Date getZyx4() {
		return zyx4;
	}

	/**
	 * supply_customer.自定义项4
	 */
	public void setZyx4(Date zyx4) {
		this.zyx4 = zyx4;
	}

	/**
	 * supply_customer.自定义项5
	 */
	public BigDecimal getZyx5() {
		return zyx5;
	}

	/**
	 * supply_customer.自定义项5
	 */
	public void setZyx5(BigDecimal zyx5) {
		this.zyx5 = zyx5;
	}
}