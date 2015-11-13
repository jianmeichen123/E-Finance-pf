package com.dsh.m.model;

import java.math.BigDecimal;
import java.util.Date;

public class PaySmscode {
    /**
     *  主键
     */
    private Integer id;

    /**
     *  
     */
    private String interfaceName;

    /**
     *  
     */
    private String requestId;

    /**
     *  客户id
     */
    private Integer customerid;

    /**
     *  手机号
     */
    private String mobileNo;

    /**
     *  协议号
     */
    private String agrNo;

    /**
     *  验证码类型
     */
    private String smsType;

    /**
     *  银行卡类型
     */
    private String cardType;

    /**
     *  银行卡代码
     */
    private String bandAddr;

    /**
     *  银行卡卡号
     */
    private String cardNo;

    /**
     *  银行卡户名
     */
    private String cardName;

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
     *  pay_smscode.主键
     */
    public Integer getId() {
        return id;
    }

    /**
     *  pay_smsCode.主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *  pay_smscode.
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    /**
     *  pay_smsCode.
     */
    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    /**
     *  pay_smscode.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     *  pay_smsCode.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     *  pay_smscode.客户id
     */
    public Integer getCustomerid() {
        return customerid;
    }

    /**
     *  pay_smsCode.客户id
     */
    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    /**
     *  pay_smscode.手机号
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     *  pay_smsCode.手机号
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     *  pay_smscode.协议号
     */
    public String getAgrNo() {
        return agrNo;
    }

    /**
     *  pay_smsCode.协议号
     */
    public void setAgrNo(String agrNo) {
        this.agrNo = agrNo;
    }

    /**
     *  pay_smscode.验证码类型
     */
    public String getSmsType() {
        return smsType;
    }

    /**
     *  pay_smsCode.验证码类型
     */
    public void setSmsType(String smsType) {
        this.smsType = smsType;
    }

    /**
     *  pay_smscode.银行卡类型
     */
    public String getCardType() {
        return cardType;
    }

    /**
     *  pay_smsCode.银行卡类型
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    /**
     *  pay_smscode.银行卡代码
     */
    public String getBandAddr() {
        return bandAddr;
    }

    /**
     *  pay_smsCode.银行卡代码
     */
    public void setBandAddr(String bandAddr) {
        this.bandAddr = bandAddr;
    }

    /**
     *  pay_smscode.银行卡卡号
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     *  pay_smsCode.银行卡卡号
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     *  pay_smscode.银行卡户名
     */
    public String getCardName() {
        return cardName;
    }

    /**
     *  pay_smsCode.银行卡户名
     */
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    /**
     *  pay_smscode.信用卡CVV2
     */
    public String getArdcvv2() {
        return ardcvv2;
    }

    /**
     *  pay_smsCode.信用卡CVV2
     */
    public void setArdcvv2(String ardcvv2) {
        this.ardcvv2 = ardcvv2;
    }

    /**
     *  pay_smscode.信用卡有效期
     */
    public String getCardexpdate() {
        return cardexpdate;
    }

    /**
     *  pay_smsCode.信用卡有效期
     */
    public void setCardexpdate(String cardexpdate) {
        this.cardexpdate = cardexpdate;
    }

    /**
     *  pay_smscode.证件类型
     */
    public String getIdType() {
        return idType;
    }

    /**
     *  pay_smsCode.证件类型
     */
    public void setIdType(String idType) {
        this.idType = idType;
    }

    /**
     *  pay_smscode.证件号码
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     *  pay_smsCode.证件号码
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    /**
     *  pay_smscode.流水号
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     *  pay_smsCode.流水号
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    /**
     *  pay_smscode.签名数据
     */
    public String getHmac() {
        return hmac;
    }

    /**
     *  pay_smsCode.签名数据
     */
    public void setHmac(String hmac) {
        this.hmac = hmac;
    }

    /**
     *  pay_smscode.返回码
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     *  pay_smsCode.返回码
     */
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    /**
     *  pay_smscode.返回码描述信息
     */
    public String getMessage() {
        return message;
    }

    /**
     *  pay_smsCode.返回码描述信息
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *  pay_smscode.创建人
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     *  pay_smsCode.创建人
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     *  pay_smscode.创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *  pay_smsCode.创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *  pay_smscode.修改人
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     *  pay_smsCode.修改人
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    /**
     *  pay_smscode.修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     *  pay_smsCode.修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     *  pay_smscode.时间戳
     */
    public String getTs() {
        return ts;
    }

    /**
     *  pay_smsCode.时间戳
     */
    public void setTs(String ts) {
        this.ts = ts;
    }

    /**
     *  pay_smscode.删除标志
     */
    public String getDr() {
        return dr;
    }

    /**
     *  pay_smsCode.删除标志
     */
    public void setDr(String dr) {
        this.dr = dr;
    }

    /**
     *  pay_smscode.自定义项1
     */
    public Integer getZyx1() {
        return zyx1;
    }

    /**
     *  pay_smsCode.自定义项1
     */
    public void setZyx1(Integer zyx1) {
        this.zyx1 = zyx1;
    }

    /**
     *  pay_smscode.自定义项2
     */
    public String getZyx2() {
        return zyx2;
    }

    /**
     *  pay_smsCode.自定义项2
     */
    public void setZyx2(String zyx2) {
        this.zyx2 = zyx2;
    }

    /**
     *  pay_smscode.自定义项3
     */
    public String getZyx3() {
        return zyx3;
    }

    /**
     *  pay_smsCode.自定义项3
     */
    public void setZyx3(String zyx3) {
        this.zyx3 = zyx3;
    }

    /**
     *  pay_smscode.自定义项4
     */
    public Date getZyx4() {
        return zyx4;
    }

    /**
     *  pay_smsCode.自定义项4
     */
    public void setZyx4(Date zyx4) {
        this.zyx4 = zyx4;
    }

    /**
     *  pay_smscode.自定义项5
     */
    public BigDecimal getZyx5() {
        return zyx5;
    }

    /**
     *  pay_smsCode.自定义项5
     */
    public void setZyx5(BigDecimal zyx5) {
        this.zyx5 = zyx5;
    }

    /**
     *  pay_smscode.自定义项3
     */
    public String getZyx6() {
        return zyx6;
    }

    /**
     *  pay_smsCode.自定义项3
     */
    public void setZyx6(String zyx6) {
        this.zyx6 = zyx6;
    }

    /**
     *  pay_smscode.自定义项4
     */
    public String getZyx7() {
        return zyx7;
    }

    /**
     *  pay_smsCode.自定义项4
     */
    public void setZyx7(String zyx7) {
        this.zyx7 = zyx7;
    }

    /**
     *  pay_smscode.自定义项5
     */
    public String getZyx8() {
        return zyx8;
    }

    /**
     *  pay_smsCode.自定义项5
     */
    public void setZyx8(String zyx8) {
        this.zyx8 = zyx8;
    }
}