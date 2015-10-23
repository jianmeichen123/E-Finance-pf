package com.dsh.m.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Supply implements Serializable {
    /**
	 */
	private Integer supplyid;
	/**
	 * 姓名
	 */
	private String username;
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
	 * 店名缩写
	 */
	private String shortname;
	/**
	 * 所在地址
	 */
	private String addr;
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
	 * 注册时间
	 */
	private Date registerTime;
	/**
	 * 成交池数量
	 */
	private BigDecimal dealPool;
	/**
	 * 角色ID
	 */
	private Integer rolesid;
	/**
	 * 小区ID
	 */
	private Integer subareaid;
	/**
	 * 商品大类ID
	 */
	private Integer bclassid;
	/**
	 */
	private String subsell;
	/**
	 */
	private String distributetime;
	/**
	 */
	private String distributearea;
	/**
	 */
	private String speciallgoods;
	/**
	 */
	private String distributedemand;
	/**
	 */
	private String dosaingcomments;
	/**
	 */
	private Integer isrecommend;
	/**
	 * 传真
	 */
	private String telautogram;
	/**
	 * 供应商分类
	 */
	private String classify;
	/**
	 * 供应商分组id
	 */
	private Integer groupId;
	/**
	 * 是否验证
	 */
	private Boolean isTest;
	/**
	 * 备注
	 */
	private String memo;
	/**
	 * 排序
	 */
	private Short sortno;
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
	 * 供应商账余额
	 */
	private BigDecimal accountBalance;

	/**
	 * supply.
	 */
	public Integer getSupplyid() {
		return supplyid;
	}

	/**
	 * supply.
	 */
	public void setSupplyid(Integer supplyid) {
		this.supplyid = supplyid;
	}

	/**
	 * supply.姓名
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * supply.姓名
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * supply.性别
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * supply.性别
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * supply.年龄
	 */
	public String getAge() {
		return age;
	}

	/**
	 * supply.年龄
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * supply.教育程度
	 */
	public String getEdu() {
		return edu;
	}

	/**
	 * supply.教育程度
	 */
	public void setEdu(String edu) {
		this.edu = edu;
	}

	/**
	 * supply.身份证号
	 */
	public String getIdentity() {
		return identity;
	}

	/**
	 * supply.身份证号
	 */
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	/**
	 * supply.固定电话
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * supply.固定电话
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * supply.手机
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * supply.手机
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * supply.
	 */
	public String getQq() {
		return qq;
	}

	/**
	 * supply.
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}

	/**
	 * supply.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * supply.
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * supply.其他联系方式
	 */
	public String getOther() {
		return other;
	}

	/**
	 * supply.其他联系方式
	 */
	public void setOther(String other) {
		this.other = other;
	}

	/**
	 * supply.店名
	 */
	public String getShopname() {
		return shopname;
	}

	/**
	 * supply.店名
	 */
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	/**
	 * supply.店名缩写
	 */
	public String getShortname() {
		return shortname;
	}

	/**
	 * supply.店名缩写
	 */
	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	/**
	 * supply.所在地址
	 */
	public String getAddr() {
		return addr;
	}

	/**
	 * supply.所在地址
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}

	/**
	 * supply.结算能力
	 */
	public String getCapability() {
		return capability;
	}

	/**
	 * supply.结算能力
	 */
	public void setCapability(String capability) {
		this.capability = capability;
	}

	/**
	 * supply.签约开始日期
	 */
	public Date getSignBegin() {
		return signBegin;
	}

	/**
	 * supply.签约开始日期
	 */
	public void setSignBegin(Date signBegin) {
		this.signBegin = signBegin;
	}

	/**
	 * supply.签约结束日期
	 */
	public Date getSignEnd() {
		return signEnd;
	}

	/**
	 * supply.签约结束日期
	 */
	public void setSignEnd(Date signEnd) {
		this.signEnd = signEnd;
	}

	/**
	 * supply.用户名
	 */
	public String getLoginname() {
		return loginname;
	}

	/**
	 * supply.用户名
	 */
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	/**
	 * supply.密码
	 */
	public String getLoginpass() {
		return loginpass;
	}

	/**
	 * supply.密码
	 */
	public void setLoginpass(String loginpass) {
		this.loginpass = loginpass;
	}

	/**
	 * supply.用户状态：1可用账户，2锁定账户
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * supply.用户状态：1可用账户，2锁定账户
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * supply.注册时间
	 */
	public Date getRegisterTime() {
		return registerTime;
	}

	/**
	 * supply.注册时间
	 */
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	/**
	 * supply.成交池数量
	 */
	public BigDecimal getDealPool() {
		return dealPool;
	}

	/**
	 * supply.成交池数量
	 */
	public void setDealPool(BigDecimal dealPool) {
		this.dealPool = dealPool;
	}

	/**
	 * supply.角色ID
	 */
	public Integer getRolesid() {
		return rolesid;
	}

	/**
	 * supply.角色ID
	 */
	public void setRolesid(Integer rolesid) {
		this.rolesid = rolesid;
	}

	/**
	 * supply.小区ID
	 */
	public Integer getSubareaid() {
		return subareaid;
	}

	/**
	 * supply.小区ID
	 */
	public void setSubareaid(Integer subareaid) {
		this.subareaid = subareaid;
	}

	/**
	 * supply.商品大类ID
	 */
	public Integer getBclassid() {
		return bclassid;
	}

	/**
	 * supply.商品大类ID
	 */
	public void setBclassid(Integer bclassid) {
		this.bclassid = bclassid;
	}

	/**
	 * supply.
	 */
	public String getSubsell() {
		return subsell;
	}

	/**
	 * supply.
	 */
	public void setSubsell(String subsell) {
		this.subsell = subsell;
	}

	/**
	 * supply.
	 */
	public String getDistributetime() {
		return distributetime;
	}

	/**
	 * supply.
	 */
	public void setDistributetime(String distributetime) {
		this.distributetime = distributetime;
	}

	/**
	 * supply.
	 */
	public String getDistributearea() {
		return distributearea;
	}

	/**
	 * supply.
	 */
	public void setDistributearea(String distributearea) {
		this.distributearea = distributearea;
	}

	/**
	 * supply.
	 */
	public String getSpeciallgoods() {
		return speciallgoods;
	}

	/**
	 * supply.
	 */
	public void setSpeciallgoods(String speciallgoods) {
		this.speciallgoods = speciallgoods;
	}

	/**
	 * supply.
	 */
	public String getDistributedemand() {
		return distributedemand;
	}

	/**
	 * supply.
	 */
	public void setDistributedemand(String distributedemand) {
		this.distributedemand = distributedemand;
	}

	/**
	 * supply.
	 */
	public String getDosaingcomments() {
		return dosaingcomments;
	}

	/**
	 * supply.
	 */
	public void setDosaingcomments(String dosaingcomments) {
		this.dosaingcomments = dosaingcomments;
	}

	/**
	 * supply.
	 */
	public Integer getIsrecommend() {
		return isrecommend;
	}

	/**
	 * supply.
	 */
	public void setIsrecommend(Integer isrecommend) {
		this.isrecommend = isrecommend;
	}

	/**
	 * supply.传真
	 */
	public String getTelautogram() {
		return telautogram;
	}

	/**
	 * supply.传真
	 */
	public void setTelautogram(String telautogram) {
		this.telautogram = telautogram;
	}

	/**
	 * supply.供应商分类
	 */
	public String getClassify() {
		return classify;
	}

	/**
	 * supply.供应商分类
	 */
	public void setClassify(String classify) {
		this.classify = classify;
	}

	/**
	 * supply.供应商分组id
	 */
	public Integer getGroupId() {
		return groupId;
	}

	/**
	 * supply.供应商分组id
	 */
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	/**
	 * supply.是否验证
	 */
	public Boolean getIsTest() {
		return isTest;
	}

	/**
	 * supply.是否验证
	 */
	public void setIsTest(Boolean isTest) {
		this.isTest = isTest;
	}

	/**
	 * supply.备注
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * supply.备注
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * supply.排序
	 */
	public Short getSortno() {
		return sortno;
	}

	/**
	 * supply.排序
	 */
	public void setSortno(Short sortno) {
		this.sortno = sortno;
	}

	/**
	 * supply.创建人
	 */
	public Integer getCreateUser() {
		return createUser;
	}

	/**
	 * supply.创建人
	 */
	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}

	/**
	 * supply.创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * supply.创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * supply.修改人
	 */
	public Integer getUpdateUser() {
		return updateUser;
	}

	/**
	 * supply.修改人
	 */
	public void setUpdateUser(Integer updateUser) {
		this.updateUser = updateUser;
	}

	/**
	 * supply.修改时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * supply.修改时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * supply.时间戳
	 */
	public String getTs() {
		return ts;
	}

	/**
	 * supply.时间戳
	 */
	public void setTs(String ts) {
		this.ts = ts;
	}

	/**
	 * supply.删除标志
	 */
	public String getDr() {
		return dr;
	}

	/**
	 * supply.删除标志
	 */
	public void setDr(String dr) {
		this.dr = dr;
	}

	/**
	 * supply.自定义项1
	 */
	public Integer getZyx1() {
		return zyx1;
	}

	/**
	 * supply.自定义项1
	 */
	public void setZyx1(Integer zyx1) {
		this.zyx1 = zyx1;
	}

	/**
	 * supply.自定义项2
	 */
	public String getZyx2() {
		return zyx2;
	}

	/**
	 * supply.自定义项2
	 */
	public void setZyx2(String zyx2) {
		this.zyx2 = zyx2;
	}

	/**
	 * supply.自定义项3
	 */
	public String getZyx3() {
		return zyx3;
	}

	/**
	 * supply.自定义项3
	 */
	public void setZyx3(String zyx3) {
		this.zyx3 = zyx3;
	}

	/**
	 * supply.自定义项4
	 */
	public Date getZyx4() {
		return zyx4;
	}

	/**
	 * supply.自定义项4
	 */
	public void setZyx4(Date zyx4) {
		this.zyx4 = zyx4;
	}

	/**
	 * supply.自定义项5
	 */
	public BigDecimal getZyx5() {
		return zyx5;
	}

	/**
	 * supply.自定义项5
	 */
	public void setZyx5(BigDecimal zyx5) {
		this.zyx5 = zyx5;
	}

	/**
	 * supply.供应商账余额
	 */
	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	/**
	 * supply.供应商账余额
	 */
	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -8160280243912991544L;
}