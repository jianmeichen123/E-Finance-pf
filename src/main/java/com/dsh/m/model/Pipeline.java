package com.dsh.m.model;

import java.math.BigDecimal;
import java.util.Date;

public class Pipeline {
    /**
     *  主键id
     */
    private Integer id;

    /**
     *  账户类型
     */
    private String accountType;

    /**
     *  用户id
     */
    private Integer userid;

    /**
     *  科目id
     */
    private Integer subid;

    /**
     *  
     */
    private String accountChange;

    /**
     *  流水日期
     */
    private Date pDatetime;

    /**
     *  流水金额
     */
    private BigDecimal pMoney;

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
     *  额外账户余额
     */
    private BigDecimal othermoney;

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
     *  pipeline.主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     *  pipeline.主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *  pipeline.账户类型
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     *  pipeline.账户类型
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     *  pipeline.用户id
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     *  pipeline.用户id
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     *  pipeline.科目id
     */
    public Integer getSubid() {
        return subid;
    }

    /**
     *  pipeline.科目id
     */
    public void setSubid(Integer subid) {
        this.subid = subid;
    }

    /**
     *  pipeline.
     */
    public String getAccountChange() {
        return accountChange;
    }

    /**
     *  pipeline.
     */
    public void setAccountChange(String accountChange) {
        this.accountChange = accountChange;
    }

    /**
     *  pipeline.流水日期
     */
    public Date getpDatetime() {
        return pDatetime;
    }

    /**
     *  pipeline.流水日期
     */
    public void setpDatetime(Date pDatetime) {
        this.pDatetime = pDatetime;
    }

    /**
     *  pipeline.流水金额
     */
    public BigDecimal getpMoney() {
        return pMoney;
    }

    /**
     *  pipeline.流水金额
     */
    public void setpMoney(BigDecimal pMoney) {
        this.pMoney = pMoney;
    }

    /**
     *  pipeline.可用账户余额
     */
    public BigDecimal getAblemoney() {
        return ablemoney;
    }

    /**
     *  pipeline.可用账户余额
     */
    public void setAblemoney(BigDecimal ablemoney) {
        this.ablemoney = ablemoney;
    }

    /**
     *  pipeline.冻结账户余额
     */
    public BigDecimal getUnablemoney() {
        return unablemoney;
    }

    /**
     *  pipeline.冻结账户余额
     */
    public void setUnablemoney(BigDecimal unablemoney) {
        this.unablemoney = unablemoney;
    }

    /**
     *  pipeline.保证金账户余额
     */
    public BigDecimal getBail() {
        return bail;
    }

    /**
     *  pipeline.保证金账户余额
     */
    public void setBail(BigDecimal bail) {
        this.bail = bail;
    }

    /**
     *  pipeline.额外账户余额
     */
    public BigDecimal getOthermoney() {
        return othermoney;
    }

    /**
     *  pipeline.额外账户余额
     */
    public void setOthermoney(BigDecimal othermoney) {
        this.othermoney = othermoney;
    }

    /**
     *  pipeline.备注
     */
    public String getCommnt() {
        return commnt;
    }

    /**
     *  pipeline.备注
     */
    public void setCommnt(String commnt) {
        this.commnt = commnt;
    }

    /**
     *  pipeline.创建人
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     *  pipeline.创建人
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     *  pipeline.创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *  pipeline.创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *  pipeline.修改人
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     *  pipeline.修改人
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    /**
     *  pipeline.修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     *  pipeline.修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     *  pipeline.时间戳
     */
    public String getTs() {
        return ts;
    }

    /**
     *  pipeline.时间戳
     */
    public void setTs(String ts) {
        this.ts = ts;
    }

    /**
     *  pipeline.删除标志
     */
    public String getDr() {
        return dr;
    }

    /**
     *  pipeline.删除标志
     */
    public void setDr(String dr) {
        this.dr = dr;
    }

    /**
     *  pipeline.自定义项1
     */
    public Integer getZyx1() {
        return zyx1;
    }

    /**
     *  pipeline.自定义项1
     */
    public void setZyx1(Integer zyx1) {
        this.zyx1 = zyx1;
    }

    /**
     *  pipeline.自定义项2
     */
    public String getZyx2() {
        return zyx2;
    }

    /**
     *  pipeline.自定义项2
     */
    public void setZyx2(String zyx2) {
        this.zyx2 = zyx2;
    }

    /**
     *  pipeline.自定义项3
     */
    public String getZyx3() {
        return zyx3;
    }

    /**
     *  pipeline.自定义项3
     */
    public void setZyx3(String zyx3) {
        this.zyx3 = zyx3;
    }

    /**
     *  pipeline.自定义项4
     */
    public Date getZyx4() {
        return zyx4;
    }

    /**
     *  pipeline.自定义项4
     */
    public void setZyx4(Date zyx4) {
        this.zyx4 = zyx4;
    }

    /**
     *  pipeline.自定义项5
     */
    public BigDecimal getZyx5() {
        return zyx5;
    }

    /**
     *  pipeline.自定义项5
     */
    public void setZyx5(BigDecimal zyx5) {
        this.zyx5 = zyx5;
    }
}