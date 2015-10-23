package com.dsh.m.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Customer implements Serializable {

	/**
	 */
	private Integer cusid;
	/**
	 * 姓名
	 */
	private String username;
	/**
	 * 用户状态：0餐饮一级用户，1餐饮二级用户
	 */
	private Boolean seconduser;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 年龄
	 */
	private String age;
	/**
	 * 教育程度
	 */
	private String edu;
	/**
	 * 身份证号
	 */
	private String identity;
	/**
	 * 固定电话
	 */
	private String telephone;
	/**
	 * 手机
	 */
	private String mobile;
	/**
	 */
	private String qq;
	/**
	 */
	private String email;
	/**
	 * 其他联系方式
	 */
	private String other;
	/**
	 * 店名
	 */
	private String shopname;
	/**
	 * 店名的缩写
	 */
	private String shortname;
	/**
	 * 经营业务
	 */
	private String business;
	/**
	 * 所在地址
	 */
	private String addr;
	/**
	 * 坐位数
	 */
	private Integer seats;
	/**
	 * 结算能力
	 */
	private String capability;
	/**
	 * 签约开始日期
	 */
	private Date signBegin;
	/**
	 * 签约结束日期
	 */
	private Date signEnd;
	/**
	 * 注册时间
	 */
	private Date registerTime;
	/**
	 * 存钱罐金额
	 */
	private BigDecimal saveMoney;
	/**
	 * 用户名
	 */
	private String loginname;
	/**
	 * 密码
	 */
	private String loginpass;
	/**
	 * 用户状态：1可用账户，2锁定账户
	 */
	private Boolean status;
	/**
	 */
	private Boolean orderstatus;
	/**
	 * 角色ID
	 */
	private Integer rolesid;
	/**
	 * 小区ID
	 */
	private Integer subareaid;
	/**
	 * 面积
	 */
	private Integer acreages;
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
	 * 账户余额
	 */
	private BigDecimal accountBalance;
	/**
	 * 是否线上支付
	 */
	private String isOnline;

	/**
	 * customer.
	 */
	public Integer getCusid() {
		return cusid;
	}

	/**
	 * customer.
	 */
	public void setCusid(Integer cusid) {
		this.cusid = cusid;
	}

	/**
	 * customer.姓名
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * customer.姓名
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * customer.用户状态：0餐饮一级用户，1餐饮二级用户
	 */
	public Boolean getSeconduser() {
		return seconduser;
	}

	/**
	 * customer.用户状态：0餐饮一级用户，1餐饮二级用户
	 */
	public void setSeconduser(Boolean seconduser) {
		this.seconduser = seconduser;
	}

	/**
	 * customer.性别
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * customer.性别
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * customer.年龄
	 */
	public String getAge() {
		return age;
	}

	/**
	 * customer.年龄
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * customer.教育程度
	 */
	public String getEdu() {
		return edu;
	}

	/**
	 * customer.教育程度
	 */
	public void setEdu(String edu) {
		this.edu = edu;
	}

	/**
	 * customer.身份证号
	 */
	public String getIdentity() {
		return identity;
	}

	/**
	 * customer.身份证号
	 */
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	/**
	 * customer.固定电话
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * customer.固定电话
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * customer.手机
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * customer.手机
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * customer.
	 */
	public String getQq() {
		return qq;
	}

	/**
	 * customer.
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}

	/**
	 * customer.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * customer.
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * customer.其他联系方式
	 */
	public String getOther() {
		return other;
	}

	/**
	 * customer.其他联系方式
	 */
	public void setOther(String other) {
		this.other = other;
	}

	/**
	 * customer.店名
	 */
	public String getShopname() {
		return shopname;
	}

	/**
	 * customer.店名
	 */
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	/**
	 * customer.店名的缩写
	 */
	public String getShortname() {
		return shortname;
	}

	/**
	 * customer.店名的缩写
	 */
	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	/**
	 * customer.经营业务
	 */
	public String getBusiness() {
		return business;
	}

	/**
	 * customer.经营业务
	 */
	public void setBusiness(String business) {
		this.business = business;
	}

	/**
	 * customer.所在地址
	 */
	public String getAddr() {
		return addr;
	}

	/**
	 * customer.所在地址
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}

	/**
	 * customer.坐位数
	 */
	public Integer getSeats() {
		return seats;
	}

	/**
	 * customer.坐位数
	 */
	public void setSeats(Integer seats) {
		this.seats = seats;
	}

	/**
	 * customer.结算能力
	 */
	public String getCapability() {
		return capability;
	}

	/**
	 * customer.结算能力
	 */
	public void setCapability(String capability) {
		this.capability = capability;
	}

	/**
	 * customer.签约开始日期
	 */
	public Date getSignBegin() {
		return signBegin;
	}

	/**
	 * customer.签约开始日期
	 */
	public void setSignBegin(Date signBegin) {
		this.signBegin = signBegin;
	}

	/**
	 * customer.签约结束日期
	 */
	public Date getSignEnd() {
		return signEnd;
	}

	/**
	 * customer.签约结束日期
	 */
	public void setSignEnd(Date signEnd) {
		this.signEnd = signEnd;
	}

	/**
	 * customer.注册时间
	 */
	public Date getRegisterTime() {
		return registerTime;
	}

	/**
	 * customer.注册时间
	 */
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	/**
	 * customer.存钱罐金额
	 */
	public BigDecimal getSaveMoney() {
		return saveMoney;
	}

	/**
	 * customer.存钱罐金额
	 */
	public void setSaveMoney(BigDecimal saveMoney) {
		this.saveMoney = saveMoney;
	}

	/**
	 * customer.用户名
	 */
	public String getLoginname() {
		return loginname;
	}

	/**
	 * customer.用户名
	 */
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	/**
	 * customer.密码
	 */
	public String getLoginpass() {
		return loginpass;
	}

	/**
	 * customer.密码
	 */
	public void setLoginpass(String loginpass) {
		this.loginpass = loginpass;
	}

	/**
	 * customer.用户状态：1可用账户，2锁定账户
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * customer.用户状态：1可用账户，2锁定账户
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * customer.
	 */
	public Boolean getOrderstatus() {
		return orderstatus;
	}

	/**
	 * customer.
	 */
	public void setOrderstatus(Boolean orderstatus) {
		this.orderstatus = orderstatus;
	}

	/**
	 * customer.角色ID
	 */
	public Integer getRolesid() {
		return rolesid;
	}

	/**
	 * customer.角色ID
	 */
	public void setRolesid(Integer rolesid) {
		this.rolesid = rolesid;
	}

	/**
	 * customer.小区ID
	 */
	public Integer getSubareaid() {
		return subareaid;
	}

	/**
	 * customer.小区ID
	 */
	public void setSubareaid(Integer subareaid) {
		this.subareaid = subareaid;
	}

	/**
	 * customer.面积
	 */
	public Integer getAcreages() {
		return acreages;
	}

	/**
	 * customer.面积
	 */
	public void setAcreages(Integer acreages) {
		this.acreages = acreages;
	}

	/**
	 * customer.排序
	 */
	public Short getSortno() {
		return sortno;
	}

	/**
	 * customer.排序
	 */
	public void setSortno(Short sortno) {
		this.sortno = sortno;
	}

	/**
	 * customer.备注
	 */
	public String getCommnt() {
		return commnt;
	}

	/**
	 * customer.备注
	 */
	public void setCommnt(String commnt) {
		this.commnt = commnt;
	}

	/**
	 * customer.创建人
	 */
	public Integer getCreateUser() {
		return createUser;
	}

	/**
	 * customer.创建人
	 */
	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}

	/**
	 * customer.创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * customer.创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * customer.修改人
	 */
	public Integer getUpdateUser() {
		return updateUser;
	}

	/**
	 * customer.修改人
	 */
	public void setUpdateUser(Integer updateUser) {
		this.updateUser = updateUser;
	}

	/**
	 * customer.修改时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * customer.修改时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * customer.时间戳
	 */
	public String getTs() {
		return ts;
	}

	/**
	 * customer.时间戳
	 */
	public void setTs(String ts) {
		this.ts = ts;
	}

	/**
	 * customer.删除标志
	 */
	public String getDr() {
		return dr;
	}

	/**
	 * customer.删除标志
	 */
	public void setDr(String dr) {
		this.dr = dr;
	}

	/**
	 * customer.自定义项1
	 */
	public Integer getZyx1() {
		return zyx1;
	}

	/**
	 * customer.自定义项1
	 */
	public void setZyx1(Integer zyx1) {
		this.zyx1 = zyx1;
	}

	/**
	 * customer.自定义项2
	 */
	public String getZyx2() {
		return zyx2;
	}

	/**
	 * customer.自定义项2
	 */
	public void setZyx2(String zyx2) {
		this.zyx2 = zyx2;
	}

	/**
	 * customer.自定义项3
	 */
	public String getZyx3() {
		return zyx3;
	}

	/**
	 * customer.自定义项3
	 */
	public void setZyx3(String zyx3) {
		this.zyx3 = zyx3;
	}

	/**
	 * customer.自定义项4
	 */
	public Date getZyx4() {
		return zyx4;
	}

	/**
	 * customer.自定义项4
	 */
	public void setZyx4(Date zyx4) {
		this.zyx4 = zyx4;
	}

	/**
	 * customer.自定义项5
	 */
	public BigDecimal getZyx5() {
		return zyx5;
	}

	/**
	 * customer.自定义项5
	 */
	public void setZyx5(BigDecimal zyx5) {
		this.zyx5 = zyx5;
	}

	/**
	 * customer.账户余额
	 */
	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	/**
	 * customer.账户余额
	 */
	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	/**
	 * customer.是否线上支付
	 */
	public String getIsOnline() {
		return isOnline;
	}

	/**
	 * customer.是否线上支付
	 */
	public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}
}