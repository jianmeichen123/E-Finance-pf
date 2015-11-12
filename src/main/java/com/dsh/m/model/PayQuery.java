package com.dsh.m.model;

import java.math.BigDecimal;
import java.util.Date;

public class PayQuery {
    /**
     *  主键
     */
    private Integer id;

    /**
     *  
     */
    private String requestid;

    /**
     *  
     */
    private String interfacename;

    /**
     *  商户订单号
     */
    private String orderid;

    /**
     *  订金额单
     */
    private String amount;

    /**
     *  手续费
     */
    private String fee;

    /**
     *  支付状态
     */
    private String paysts;

    /**
     *  支付日期
     */
    private String paydt;

    /**
     *  支付时间
     */
    private String paytime;

    /**
     *  签名数据
     */
    private String hmac;

    /**
     *  返回码
     */
    private String returncode;

    /**
     *  返回码描述信息
     */
    private String message;

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
     *  自定义项3
     */
    private String zyx6;

    /**
     *  自定义项4
     */
    private String zyx7;

    /**
     *  自定义项5
     */
    private String zyx8;

    /**
     *  pay_query.主键
     */
    public Integer getId() {
        return id;
    }

    /**
     *  pay_query.主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *  pay_query.
     */
    public String getRequestid() {
        return requestid;
    }

    /**
     *  pay_query.
     */
    public void setRequestid(String requestid) {
        this.requestid = requestid;
    }

    /**
     *  pay_query.
     */
    public String getInterfacename() {
        return interfacename;
    }

    /**
     *  pay_query.
     */
    public void setInterfacename(String interfacename) {
        this.interfacename = interfacename;
    }

    /**
     *  pay_query.商户订单号
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     *  pay_query.商户订单号
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    /**
     *  pay_query.订金额单
     */
    public String getAmount() {
        return amount;
    }

    /**
     *  pay_query.订金额单
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     *  pay_query.手续费
     */
    public String getFee() {
        return fee;
    }

    /**
     *  pay_query.手续费
     */
    public void setFee(String fee) {
        this.fee = fee;
    }

    /**
     *  pay_query.支付状态
     */
    public String getPaysts() {
        return paysts;
    }

    /**
     *  pay_query.支付状态
     */
    public void setPaysts(String paysts) {
        this.paysts = paysts;
    }

    /**
     *  pay_query.支付日期
     */
    public String getPaydt() {
        return paydt;
    }

    /**
     *  pay_query.支付日期
     */
    public void setPaydt(String paydt) {
        this.paydt = paydt;
    }

    /**
     *  pay_query.支付时间
     */
    public String getPaytime() {
        return paytime;
    }

    /**
     *  pay_query.支付时间
     */
    public void setPaytime(String paytime) {
        this.paytime = paytime;
    }

    /**
     *  pay_query.签名数据
     */
    public String getHmac() {
        return hmac;
    }

    /**
     *  pay_query.签名数据
     */
    public void setHmac(String hmac) {
        this.hmac = hmac;
    }

    /**
     *  pay_query.返回码
     */
    public String getReturncode() {
        return returncode;
    }

    /**
     *  pay_query.返回码
     */
    public void setReturncode(String returncode) {
        this.returncode = returncode;
    }

    /**
     *  pay_query.返回码描述信息
     */
    public String getMessage() {
        return message;
    }

    /**
     *  pay_query.返回码描述信息
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *  pay_query.创建人
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     *  pay_query.创建人
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     *  pay_query.创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *  pay_query.创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *  pay_query.修改人
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     *  pay_query.修改人
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    /**
     *  pay_query.修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     *  pay_query.修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     *  pay_query.自定义项1
     */
    public Integer getZyx1() {
        return zyx1;
    }

    /**
     *  pay_query.自定义项1
     */
    public void setZyx1(Integer zyx1) {
        this.zyx1 = zyx1;
    }

    /**
     *  pay_query.自定义项2
     */
    public String getZyx2() {
        return zyx2;
    }

    /**
     *  pay_query.自定义项2
     */
    public void setZyx2(String zyx2) {
        this.zyx2 = zyx2;
    }

    /**
     *  pay_query.自定义项3
     */
    public String getZyx3() {
        return zyx3;
    }

    /**
     *  pay_query.自定义项3
     */
    public void setZyx3(String zyx3) {
        this.zyx3 = zyx3;
    }

    /**
     *  pay_query.自定义项4
     */
    public Date getZyx4() {
        return zyx4;
    }

    /**
     *  pay_query.自定义项4
     */
    public void setZyx4(Date zyx4) {
        this.zyx4 = zyx4;
    }

    /**
     *  pay_query.自定义项5
     */
    public BigDecimal getZyx5() {
        return zyx5;
    }

    /**
     *  pay_query.自定义项5
     */
    public void setZyx5(BigDecimal zyx5) {
        this.zyx5 = zyx5;
    }

    /**
     *  pay_query.自定义项3
     */
    public String getZyx6() {
        return zyx6;
    }

    /**
     *  pay_query.自定义项3
     */
    public void setZyx6(String zyx6) {
        this.zyx6 = zyx6;
    }

    /**
     *  pay_query.自定义项4
     */
    public String getZyx7() {
        return zyx7;
    }

    /**
     *  pay_query.自定义项4
     */
    public void setZyx7(String zyx7) {
        this.zyx7 = zyx7;
    }

    /**
     *  pay_query.自定义项5
     */
    public String getZyx8() {
        return zyx8;
    }

    /**
     *  pay_query.自定义项5
     */
    public void setZyx8(String zyx8) {
        this.zyx8 = zyx8;
    }
}