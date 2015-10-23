package com.dsh.m.model;

import java.math.BigDecimal;
import java.util.Date;

public class StartAccounts {
    /**
     *  主键
     */
    private Integer id;

    /**
     *  用户id
     */
    private Integer userid;

    /**
     *  账户类型，1为供应商，2为客户
     */
    private Short accountType;

    /**
     *  可用账户余额
     */
    private BigDecimal ablemoney;

    /**
     *  冻结账户余额
     */
    private BigDecimal unablemoney;

    /**
     *  保证金账户余额
     */
    private BigDecimal bail;

    /**
     *  备注
     */
    private String commnt;

    /**
     *  创建人
     */
    private Integer createUser;

    /**
     *  创建时间
     */
    private Date createTime;

    /**
     *  修改人
     */
    private Integer updateUser;

    /**
     *  修改时间
     */
    private Date updateTime;

    /**
     *  时间戳
     */
    private String ts;

    /**
     *  删除标志
     */
    private String dr;

    /**
     *  自定义项1
     */
    private Integer zyx1;

    /**
     *  自定义项2
     */
    private String zyx2;

    /**
     *  自定义项3
     */
    private String zyx3;

    /**
     *  自定义项4
     */
    private Date zyx4;

    /**
     *  自定义项5
     */
    private BigDecimal zyx5;

    /**
     *  start_accounts.主键
     */
    public Integer getId() {
        return id;
    }

    /**
     *  start_accounts.主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *  start_accounts.用户id
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     *  start_accounts.用户id
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     *  start_accounts.账户类型，1为供应商，2为客户
     */
    public Short getAccountType() {
        return accountType;
    }

    /**
     *  start_accounts.账户类型，1为供应商，2为客户
     */
    public void setAccountType(Short accountType) {
        this.accountType = accountType;
    }

    /**
     *  start_accounts.可用账户余额
     */
    public BigDecimal getAblemoney() {
        return ablemoney;
    }

    /**
     *  start_accounts.可用账户余额
     */
    public void setAblemoney(BigDecimal ablemoney) {
        this.ablemoney = ablemoney;
    }

    /**
     *  start_accounts.冻结账户余额
     */
    public BigDecimal getUnablemoney() {
        return unablemoney;
    }

    /**
     *  start_accounts.冻结账户余额
     */
    public void setUnablemoney(BigDecimal unablemoney) {
        this.unablemoney = unablemoney;
    }

    /**
     *  start_accounts.保证金账户余额
     */
    public BigDecimal getBail() {
        return bail;
    }

    /**
     *  start_accounts.保证金账户余额
     */
    public void setBail(BigDecimal bail) {
        this.bail = bail;
    }

    /**
     *  start_accounts.备注
     */
    public String getCommnt() {
        return commnt;
    }

    /**
     *  start_accounts.备注
     */
    public void setCommnt(String commnt) {
        this.commnt = commnt;
    }

    /**
     *  start_accounts.创建人
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     *  start_accounts.创建人
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     *  start_accounts.创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *  start_accounts.创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *  start_accounts.修改人
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     *  start_accounts.修改人
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    /**
     *  start_accounts.修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     *  start_accounts.修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     *  start_accounts.时间戳
     */
    public String getTs() {
        return ts;
    }

    /**
     *  start_accounts.时间戳
     */
    public void setTs(String ts) {
        this.ts = ts;
    }

    /**
     *  start_accounts.删除标志
     */
    public String getDr() {
        return dr;
    }

    /**
     *  start_accounts.删除标志
     */
    public void setDr(String dr) {
        this.dr = dr;
    }

    /**
     *  start_accounts.自定义项1
     */
    public Integer getZyx1() {
        return zyx1;
    }

    /**
     *  start_accounts.自定义项1
     */
    public void setZyx1(Integer zyx1) {
        this.zyx1 = zyx1;
    }

    /**
     *  start_accounts.自定义项2
     */
    public String getZyx2() {
        return zyx2;
    }

    /**
     *  start_accounts.自定义项2
     */
    public void setZyx2(String zyx2) {
        this.zyx2 = zyx2;
    }

    /**
     *  start_accounts.自定义项3
     */
    public String getZyx3() {
        return zyx3;
    }

    /**
     *  start_accounts.自定义项3
     */
    public void setZyx3(String zyx3) {
        this.zyx3 = zyx3;
    }

    /**
     *  start_accounts.自定义项4
     */
    public Date getZyx4() {
        return zyx4;
    }

    /**
     *  start_accounts.自定义项4
     */
    public void setZyx4(Date zyx4) {
        this.zyx4 = zyx4;
    }

    /**
     *  start_accounts.自定义项5
     */
    public BigDecimal getZyx5() {
        return zyx5;
    }

    /**
     *  start_accounts.自定义项5
     */
    public void setZyx5(BigDecimal zyx5) {
        this.zyx5 = zyx5;
    }
}