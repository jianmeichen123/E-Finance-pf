package com.dsh.m.model;

import java.math.BigDecimal;
import java.util.Date;

public class PayResult {
    /**
     *  主键
     */
    private Integer id;

    /**
     *  商户订单号
     */
    private String orderId;

    /**
     *  
     */
    private String interfaceName;

    /**
     *  
     */
    private String requestId;

    /**
     *  支付信息id
     */
    private Integer paymentId;

    /**
     *  订金额单
     */
    private String orderAmt;

    /**
     *  手续费
     */
    private String fee;

    /**
     *  支付状态
     */
    private String paySts;

    /**
     *  支付日期
     */
    private String payDt;

    /**
     *  支付时间
     */
    private String payTime;

    /**
     *  签名数据
     */
    private String hmac;

    /**
     *  返回码
     */
    private String returnCode;

    /**
     *  返回码描述信息
     */
    private String message;

    /**
     *  创建时间
     */
    private Date createTime;

    /**
     *  创建人
     */
    private Integer createUser;

    /**
     *  修改时间
     */
    private Date updateTime;

    /**
     *  修改人
     */
    private Integer updateUser;

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
     *  商户编号
     */
    private String mercId;

    /**
     *  版本号
     */
    private String version;

    /**
     *  签名方式
     */
    private String signType;

    /**
     *  pay_result.主键
     */
    public Integer getId() {
        return id;
    }

    /**
     *  pay_result.主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *  pay_result.商户订单号
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     *  pay_result.商户订单号
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     *  pay_result.
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    /**
     *  pay_result.
     */
    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    /**
     *  pay_result.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     *  pay_result.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     *  pay_result.支付信息id
     */
    public Integer getPaymentId() {
        return paymentId;
    }

    /**
     *  pay_result.支付信息id
     */
    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    /**
     *  pay_result.订金额单
     */
    public String getOrderAmt() {
        return orderAmt;
    }

    /**
     *  pay_result.订金额单
     */
    public void setOrderAmt(String orderAmt) {
        this.orderAmt = orderAmt;
    }

    /**
     *  pay_result.手续费
     */
    public String getFee() {
        return fee;
    }

    /**
     *  pay_result.手续费
     */
    public void setFee(String fee) {
        this.fee = fee;
    }

    /**
     *  pay_result.支付状态
     */
    public String getPaySts() {
        return paySts;
    }

    /**
     *  pay_result.支付状态
     */
    public void setPaySts(String paySts) {
        this.paySts = paySts;
    }

    /**
     *  pay_result.支付日期
     */
    public String getPayDt() {
        return payDt;
    }

    /**
     *  pay_result.支付日期
     */
    public void setPayDt(String payDt) {
        this.payDt = payDt;
    }

    /**
     *  pay_result.支付时间
     */
    public String getPayTime() {
        return payTime;
    }

    /**
     *  pay_result.支付时间
     */
    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    /**
     *  pay_result.签名数据
     */
    public String getHmac() {
        return hmac;
    }

    /**
     *  pay_result.签名数据
     */
    public void setHmac(String hmac) {
        this.hmac = hmac;
    }

    /**
     *  pay_result.返回码
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     *  pay_result.返回码
     */
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    /**
     *  pay_result.返回码描述信息
     */
    public String getMessage() {
        return message;
    }

    /**
     *  pay_result.返回码描述信息
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *  pay_result.创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *  pay_result.创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *  pay_result.创建人
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     *  pay_result.创建人
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     *  pay_result.修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     *  pay_result.修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     *  pay_result.修改人
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     *  pay_result.修改人
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    /**
     *  pay_result.自定义项1
     */
    public Integer getZyx1() {
        return zyx1;
    }

    /**
     *  pay_result.自定义项1
     */
    public void setZyx1(Integer zyx1) {
        this.zyx1 = zyx1;
    }

    /**
     *  pay_result.自定义项2
     */
    public String getZyx2() {
        return zyx2;
    }

    /**
     *  pay_result.自定义项2
     */
    public void setZyx2(String zyx2) {
        this.zyx2 = zyx2;
    }

    /**
     *  pay_result.自定义项3
     */
    public String getZyx3() {
        return zyx3;
    }

    /**
     *  pay_result.自定义项3
     */
    public void setZyx3(String zyx3) {
        this.zyx3 = zyx3;
    }

    /**
     *  pay_result.自定义项4
     */
    public Date getZyx4() {
        return zyx4;
    }

    /**
     *  pay_result.自定义项4
     */
    public void setZyx4(Date zyx4) {
        this.zyx4 = zyx4;
    }

    /**
     *  pay_result.自定义项5
     */
    public BigDecimal getZyx5() {
        return zyx5;
    }

    /**
     *  pay_result.自定义项5
     */
    public void setZyx5(BigDecimal zyx5) {
        this.zyx5 = zyx5;
    }

    /**
     *  pay_result.商户编号
     */
    public String getMercId() {
        return mercId;
    }

    /**
     *  pay_result.商户编号
     */
    public void setMercId(String mercId) {
        this.mercId = mercId;
    }

    /**
     *  pay_result.版本号
     */
    public String getVersion() {
        return version;
    }

    /**
     *  pay_result.版本号
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     *  pay_result.签名方式
     */
    public String getSignType() {
        return signType;
    }

    /**
     *  pay_result.签名方式
     */
    public void setSignType(String signType) {
        this.signType = signType;
    }
}