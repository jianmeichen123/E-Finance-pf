package com.dsh.m.model;

import java.math.BigDecimal;
import java.util.Date;

public class PayPayment {
    /**
     *  主键
     */
    private Integer id;

    /**
     *  客户id
     */
    private Integer customerid;

    /**
     *  
     */
    private String interfaceName;

    /**
     *  
     */
    private String requestId;

    /**
     *  签约信息id
     */
    private Integer appoinId;

    /**
     *  协议号
     */
    private String agrNo;

    /**
     *  手机号
     */
    private String mobileNo;

    /**
     *  验证码类型
     */
    private String smsType;

    /**
     *  银行卡户名
     */
    private String cardName;

    /**
     *  银行卡卡号
     */
    private String cardNo;

    /**
     *  银行卡代码
     */
    private String bandAddr;

    /**
     *  银行卡类型
     */
    private String cardType;

    /**
     *  信用卡CVV2
     */
    private String ardcvv2;

    /**
     *  信用卡有效期
     */
    private String cardexpdate;

    /**
     *  证件类型
     */
    private String idType;

    /**
     *  证件号码
     */
    private String idNo;

    /**
     *  流水号
     */
    private String tradeNo;

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
     *  短信验证码
     */
    private String smsCode;

    /**
     *  商户订单号
     */
    private String orderId;

    /**
     *  订金额单
     */
    private String orderAmt;

    /**
     *  有效时间
     */
    private String validTime;

    /**
     *  后台结果通知地址
     */
    private String notifyUrl;

    /**
     *  删除标志
     */
    private String dr;

    /**
     *  时间戳
     */
    private String ts;

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
     *  pay_payment.主键
     */
    public Integer getId() {
        return id;
    }

    /**
     *  pay_payment.主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *  pay_payment.客户id
     */
    public Integer getCustomerid() {
        return customerid;
    }

    /**
     *  pay_payment.客户id
     */
    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    /**
     *  pay_payment.
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    /**
     *  pay_payment.
     */
    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    /**
     *  pay_payment.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     *  pay_payment.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     *  pay_payment.签约信息id
     */
    public Integer getAppoinId() {
        return appoinId;
    }

    /**
     *  pay_payment.签约信息id
     */
    public void setAppoinId(Integer appoinId) {
        this.appoinId = appoinId;
    }

    /**
     *  pay_payment.协议号
     */
    public String getAgrNo() {
        return agrNo;
    }

    /**
     *  pay_payment.协议号
     */
    public void setAgrNo(String agrNo) {
        this.agrNo = agrNo;
    }

    /**
     *  pay_payment.手机号
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     *  pay_payment.手机号
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     *  pay_payment.验证码类型
     */
    public String getSmsType() {
        return smsType;
    }

    /**
     *  pay_payment.验证码类型
     */
    public void setSmsType(String smsType) {
        this.smsType = smsType;
    }

    /**
     *  pay_payment.银行卡户名
     */
    public String getCardName() {
        return cardName;
    }

    /**
     *  pay_payment.银行卡户名
     */
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    /**
     *  pay_payment.银行卡卡号
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     *  pay_payment.银行卡卡号
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     *  pay_payment.银行卡代码
     */
    public String getBandAddr() {
        return bandAddr;
    }

    /**
     *  pay_payment.银行卡代码
     */
    public void setBandAddr(String bandAddr) {
        this.bandAddr = bandAddr;
    }

    /**
     *  pay_payment.银行卡类型
     */
    public String getCardType() {
        return cardType;
    }

    /**
     *  pay_payment.银行卡类型
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    /**
     *  pay_payment.信用卡CVV2
     */
    public String getArdcvv2() {
        return ardcvv2;
    }

    /**
     *  pay_payment.信用卡CVV2
     */
    public void setArdcvv2(String ardcvv2) {
        this.ardcvv2 = ardcvv2;
    }

    /**
     *  pay_payment.信用卡有效期
     */
    public String getCardexpdate() {
        return cardexpdate;
    }

    /**
     *  pay_payment.信用卡有效期
     */
    public void setCardexpdate(String cardexpdate) {
        this.cardexpdate = cardexpdate;
    }

    /**
     *  pay_payment.证件类型
     */
    public String getIdType() {
        return idType;
    }

    /**
     *  pay_payment.证件类型
     */
    public void setIdType(String idType) {
        this.idType = idType;
    }

    /**
     *  pay_payment.证件号码
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     *  pay_payment.证件号码
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    /**
     *  pay_payment.流水号
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     *  pay_payment.流水号
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    /**
     *  pay_payment.签名数据
     */
    public String getHmac() {
        return hmac;
    }

    /**
     *  pay_payment.签名数据
     */
    public void setHmac(String hmac) {
        this.hmac = hmac;
    }

    /**
     *  pay_payment.返回码
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     *  pay_payment.返回码
     */
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    /**
     *  pay_payment.返回码描述信息
     */
    public String getMessage() {
        return message;
    }

    /**
     *  pay_payment.返回码描述信息
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *  pay_payment.短信验证码
     */
    public String getSmsCode() {
        return smsCode;
    }

    /**
     *  pay_payment.短信验证码
     */
    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

    /**
     *  pay_payment.商户订单号
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     *  pay_payment.商户订单号
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     *  pay_payment.订金额单
     */
    public String getOrderAmt() {
        return orderAmt;
    }

    /**
     *  pay_payment.订金额单
     */
    public void setOrderAmt(String orderAmt) {
        this.orderAmt = orderAmt;
    }

    /**
     *  pay_payment.有效时间
     */
    public String getValidTime() {
        return validTime;
    }

    /**
     *  pay_payment.有效时间
     */
    public void setValidTime(String validTime) {
        this.validTime = validTime;
    }

    /**
     *  pay_payment.后台结果通知地址
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     *  pay_payment.后台结果通知地址
     */
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
     *  pay_payment.删除标志
     */
    public String getDr() {
        return dr;
    }

    /**
     *  pay_payment.删除标志
     */
    public void setDr(String dr) {
        this.dr = dr;
    }

    /**
     *  pay_payment.时间戳
     */
    public String getTs() {
        return ts;
    }

    /**
     *  pay_payment.时间戳
     */
    public void setTs(String ts) {
        this.ts = ts;
    }

    /**
     *  pay_payment.创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *  pay_payment.创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *  pay_payment.创建人
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     *  pay_payment.创建人
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     *  pay_payment.修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     *  pay_payment.修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     *  pay_payment.修改人
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     *  pay_payment.修改人
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    /**
     *  pay_payment.自定义项1
     */
    public Integer getZyx1() {
        return zyx1;
    }

    /**
     *  pay_payment.自定义项1
     */
    public void setZyx1(Integer zyx1) {
        this.zyx1 = zyx1;
    }

    /**
     *  pay_payment.自定义项2
     */
    public String getZyx2() {
        return zyx2;
    }

    /**
     *  pay_payment.自定义项2
     */
    public void setZyx2(String zyx2) {
        this.zyx2 = zyx2;
    }

    /**
     *  pay_payment.自定义项3
     */
    public String getZyx3() {
        return zyx3;
    }

    /**
     *  pay_payment.自定义项3
     */
    public void setZyx3(String zyx3) {
        this.zyx3 = zyx3;
    }

    /**
     *  pay_payment.自定义项4
     */
    public Date getZyx4() {
        return zyx4;
    }

    /**
     *  pay_payment.自定义项4
     */
    public void setZyx4(Date zyx4) {
        this.zyx4 = zyx4;
    }

    /**
     *  pay_payment.自定义项5
     */
    public BigDecimal getZyx5() {
        return zyx5;
    }

    /**
     *  pay_payment.自定义项5
     */
    public void setZyx5(BigDecimal zyx5) {
        this.zyx5 = zyx5;
    }

    /**
     *  pay_payment.自定义项3
     */
    public String getZyx6() {
        return zyx6;
    }

    /**
     *  pay_payment.自定义项3
     */
    public void setZyx6(String zyx6) {
        this.zyx6 = zyx6;
    }

    /**
     *  pay_payment.自定义项4
     */
    public String getZyx7() {
        return zyx7;
    }

    /**
     *  pay_payment.自定义项4
     */
    public void setZyx7(String zyx7) {
        this.zyx7 = zyx7;
    }

    /**
     *  pay_payment.自定义项5
     */
    public String getZyx8() {
        return zyx8;
    }

    /**
     *  pay_payment.自定义项5
     */
    public void setZyx8(String zyx8) {
        this.zyx8 = zyx8;
    }
}