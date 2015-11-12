package com.dsh.m.model;

import java.math.BigDecimal;
import java.util.Date;

public class PayAppoint {
    /**
     *  主键
     */
    private Integer id;

    /**
     *  
     */
    private String interfacename;

    /**
     *  
     */
    private String requestid;

    /**
     *  客户id
     */
    private Integer customerid;

    /**
     *  协议号
     */
    private String agrno;

    /**
     *  手机号
     */
    private String mobileno;

    /**
     *  验证码类型
     */
    private String smstype;

    /**
     *  银行卡类型
     */
    private String cardtype;

    /**
     *  银行卡代码
     */
    private String bandaddr;

    /**
     *  银行卡卡号
     */
    private String cardno;

    /**
     *  银行卡户名
     */
    private String cardname;

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
    private String idtype;

    /**
     *  证件号码
     */
    private String idno;

    /**
     *  流水号
     */
    private String tradeno;

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
     *  短信验证码
     */
    private String smscode;

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
     *  pay_appoint.主键
     */
    public Integer getId() {
        return id;
    }

    /**
     *  pay_appoint.主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *  pay_appoint.
     */
    public String getInterfacename() {
        return interfacename;
    }

    /**
     *  pay_appoint.
     */
    public void setInterfacename(String interfacename) {
        this.interfacename = interfacename;
    }

    /**
     *  pay_appoint.
     */
    public String getRequestid() {
        return requestid;
    }

    /**
     *  pay_appoint.
     */
    public void setRequestid(String requestid) {
        this.requestid = requestid;
    }

    /**
     *  pay_appoint.客户id
     */
    public Integer getCustomerid() {
        return customerid;
    }

    /**
     *  pay_appoint.客户id
     */
    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    /**
     *  pay_appoint.协议号
     */
    public String getAgrno() {
        return agrno;
    }

    /**
     *  pay_appoint.协议号
     */
    public void setAgrno(String agrno) {
        this.agrno = agrno;
    }

    /**
     *  pay_appoint.手机号
     */
    public String getMobileno() {
        return mobileno;
    }

    /**
     *  pay_appoint.手机号
     */
    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    /**
     *  pay_appoint.验证码类型
     */
    public String getSmstype() {
        return smstype;
    }

    /**
     *  pay_appoint.验证码类型
     */
    public void setSmstype(String smstype) {
        this.smstype = smstype;
    }

    /**
     *  pay_appoint.银行卡类型
     */
    public String getCardtype() {
        return cardtype;
    }

    /**
     *  pay_appoint.银行卡类型
     */
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    /**
     *  pay_appoint.银行卡代码
     */
    public String getBandaddr() {
        return bandaddr;
    }

    /**
     *  pay_appoint.银行卡代码
     */
    public void setBandaddr(String bandaddr) {
        this.bandaddr = bandaddr;
    }

    /**
     *  pay_appoint.银行卡卡号
     */
    public String getCardno() {
        return cardno;
    }

    /**
     *  pay_appoint.银行卡卡号
     */
    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    /**
     *  pay_appoint.银行卡户名
     */
    public String getCardname() {
        return cardname;
    }

    /**
     *  pay_appoint.银行卡户名
     */
    public void setCardname(String cardname) {
        this.cardname = cardname;
    }

    /**
     *  pay_appoint.信用卡CVV2
     */
    public String getArdcvv2() {
        return ardcvv2;
    }

    /**
     *  pay_appoint.信用卡CVV2
     */
    public void setArdcvv2(String ardcvv2) {
        this.ardcvv2 = ardcvv2;
    }

    /**
     *  pay_appoint.信用卡有效期
     */
    public String getCardexpdate() {
        return cardexpdate;
    }

    /**
     *  pay_appoint.信用卡有效期
     */
    public void setCardexpdate(String cardexpdate) {
        this.cardexpdate = cardexpdate;
    }

    /**
     *  pay_appoint.证件类型
     */
    public String getIdtype() {
        return idtype;
    }

    /**
     *  pay_appoint.证件类型
     */
    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }

    /**
     *  pay_appoint.证件号码
     */
    public String getIdno() {
        return idno;
    }

    /**
     *  pay_appoint.证件号码
     */
    public void setIdno(String idno) {
        this.idno = idno;
    }

    /**
     *  pay_appoint.流水号
     */
    public String getTradeno() {
        return tradeno;
    }

    /**
     *  pay_appoint.流水号
     */
    public void setTradeno(String tradeno) {
        this.tradeno = tradeno;
    }

    /**
     *  pay_appoint.签名数据
     */
    public String getHmac() {
        return hmac;
    }

    /**
     *  pay_appoint.签名数据
     */
    public void setHmac(String hmac) {
        this.hmac = hmac;
    }

    /**
     *  pay_appoint.返回码
     */
    public String getReturncode() {
        return returncode;
    }

    /**
     *  pay_appoint.返回码
     */
    public void setReturncode(String returncode) {
        this.returncode = returncode;
    }

    /**
     *  pay_appoint.返回码描述信息
     */
    public String getMessage() {
        return message;
    }

    /**
     *  pay_appoint.返回码描述信息
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *  pay_appoint.短信验证码
     */
    public String getSmscode() {
        return smscode;
    }

    /**
     *  pay_appoint.短信验证码
     */
    public void setSmscode(String smscode) {
        this.smscode = smscode;
    }

    /**
     *  pay_appoint.创建人
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     *  pay_appoint.创建人
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     *  pay_appoint.创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *  pay_appoint.创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *  pay_appoint.修改人
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     *  pay_appoint.修改人
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    /**
     *  pay_appoint.修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     *  pay_appoint.修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     *  pay_appoint.时间戳
     */
    public String getTs() {
        return ts;
    }

    /**
     *  pay_appoint.时间戳
     */
    public void setTs(String ts) {
        this.ts = ts;
    }

    /**
     *  pay_appoint.删除标志
     */
    public String getDr() {
        return dr;
    }

    /**
     *  pay_appoint.删除标志
     */
    public void setDr(String dr) {
        this.dr = dr;
    }

    /**
     *  pay_appoint.自定义项1
     */
    public Integer getZyx1() {
        return zyx1;
    }

    /**
     *  pay_appoint.自定义项1
     */
    public void setZyx1(Integer zyx1) {
        this.zyx1 = zyx1;
    }

    /**
     *  pay_appoint.自定义项2
     */
    public String getZyx2() {
        return zyx2;
    }

    /**
     *  pay_appoint.自定义项2
     */
    public void setZyx2(String zyx2) {
        this.zyx2 = zyx2;
    }

    /**
     *  pay_appoint.自定义项3
     */
    public String getZyx3() {
        return zyx3;
    }

    /**
     *  pay_appoint.自定义项3
     */
    public void setZyx3(String zyx3) {
        this.zyx3 = zyx3;
    }

    /**
     *  pay_appoint.自定义项4
     */
    public Date getZyx4() {
        return zyx4;
    }

    /**
     *  pay_appoint.自定义项4
     */
    public void setZyx4(Date zyx4) {
        this.zyx4 = zyx4;
    }

    /**
     *  pay_appoint.自定义项5
     */
    public BigDecimal getZyx5() {
        return zyx5;
    }

    /**
     *  pay_appoint.自定义项5
     */
    public void setZyx5(BigDecimal zyx5) {
        this.zyx5 = zyx5;
    }

    /**
     *  pay_appoint.自定义项3
     */
    public String getZyx6() {
        return zyx6;
    }

    /**
     *  pay_appoint.自定义项3
     */
    public void setZyx6(String zyx6) {
        this.zyx6 = zyx6;
    }

    /**
     *  pay_appoint.自定义项4
     */
    public String getZyx7() {
        return zyx7;
    }

    /**
     *  pay_appoint.自定义项4
     */
    public void setZyx7(String zyx7) {
        this.zyx7 = zyx7;
    }

    /**
     *  pay_appoint.自定义项5
     */
    public String getZyx8() {
        return zyx8;
    }

    /**
     *  pay_appoint.自定义项5
     */
    public void setZyx8(String zyx8) {
        this.zyx8 = zyx8;
    }
}