package com.dsh.m.model;

import java.math.BigDecimal;
import java.util.Date;

public class PayResult {
    /**
     *  ����
     */
    private Integer id;

    /**
     *  �̻�������
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
     *  ֧����Ϣid
     */
    private Integer paymentId;

    /**
     *  ����
     */
    private String orderAmt;

    /**
     *  ������
     */
    private String fee;

    /**
     *  ֧��״̬
     */
    private String paySts;

    /**
     *  ֧������
     */
    private String payDt;

    /**
     *  ֧��ʱ��
     */
    private String payTime;

    /**
     *  ǩ������
     */
    private String hmac;

    /**
     *  ������
     */
    private String returnCode;

    /**
     *  ������������Ϣ
     */
    private String message;

    /**
     *  ����ʱ��
     */
    private Date createTime;

    /**
     *  ������
     */
    private Integer createUser;

    /**
     *  �޸�ʱ��
     */
    private Date updateTime;

    /**
     *  �޸���
     */
    private Integer updateUser;

    /**
     *  �Զ�����1
     */
    private Integer zyx1;

    /**
     *  �Զ�����2
     */
    private String zyx2;

    /**
     *  �Զ�����3
     */
    private String zyx3;

    /**
     *  �Զ�����4
     */
    private Date zyx4;

    /**
     *  �Զ�����5
     */
    private BigDecimal zyx5;

    /**
     *  �̻����
     */
    private String mercId;

    /**
     *  �汾��
     */
    private String version;

    /**
     *  ǩ����ʽ
     */
    private String signType;

    /**
     *  pay_result.����
     */
    public Integer getId() {
        return id;
    }

    /**
     *  pay_result.����
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *  pay_result.�̻�������
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     *  pay_result.�̻�������
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
     *  pay_result.֧����Ϣid
     */
    public Integer getPaymentId() {
        return paymentId;
    }

    /**
     *  pay_result.֧����Ϣid
     */
    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    /**
     *  pay_result.����
     */
    public String getOrderAmt() {
        return orderAmt;
    }

    /**
     *  pay_result.����
     */
    public void setOrderAmt(String orderAmt) {
        this.orderAmt = orderAmt;
    }

    /**
     *  pay_result.������
     */
    public String getFee() {
        return fee;
    }

    /**
     *  pay_result.������
     */
    public void setFee(String fee) {
        this.fee = fee;
    }

    /**
     *  pay_result.֧��״̬
     */
    public String getPaySts() {
        return paySts;
    }

    /**
     *  pay_result.֧��״̬
     */
    public void setPaySts(String paySts) {
        this.paySts = paySts;
    }

    /**
     *  pay_result.֧������
     */
    public String getPayDt() {
        return payDt;
    }

    /**
     *  pay_result.֧������
     */
    public void setPayDt(String payDt) {
        this.payDt = payDt;
    }

    /**
     *  pay_result.֧��ʱ��
     */
    public String getPayTime() {
        return payTime;
    }

    /**
     *  pay_result.֧��ʱ��
     */
    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    /**
     *  pay_result.ǩ������
     */
    public String getHmac() {
        return hmac;
    }

    /**
     *  pay_result.ǩ������
     */
    public void setHmac(String hmac) {
        this.hmac = hmac;
    }

    /**
     *  pay_result.������
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     *  pay_result.������
     */
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    /**
     *  pay_result.������������Ϣ
     */
    public String getMessage() {
        return message;
    }

    /**
     *  pay_result.������������Ϣ
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *  pay_result.����ʱ��
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *  pay_result.����ʱ��
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *  pay_result.������
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     *  pay_result.������
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     *  pay_result.�޸�ʱ��
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     *  pay_result.�޸�ʱ��
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     *  pay_result.�޸���
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     *  pay_result.�޸���
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    /**
     *  pay_result.�Զ�����1
     */
    public Integer getZyx1() {
        return zyx1;
    }

    /**
     *  pay_result.�Զ�����1
     */
    public void setZyx1(Integer zyx1) {
        this.zyx1 = zyx1;
    }

    /**
     *  pay_result.�Զ�����2
     */
    public String getZyx2() {
        return zyx2;
    }

    /**
     *  pay_result.�Զ�����2
     */
    public void setZyx2(String zyx2) {
        this.zyx2 = zyx2;
    }

    /**
     *  pay_result.�Զ�����3
     */
    public String getZyx3() {
        return zyx3;
    }

    /**
     *  pay_result.�Զ�����3
     */
    public void setZyx3(String zyx3) {
        this.zyx3 = zyx3;
    }

    /**
     *  pay_result.�Զ�����4
     */
    public Date getZyx4() {
        return zyx4;
    }

    /**
     *  pay_result.�Զ�����4
     */
    public void setZyx4(Date zyx4) {
        this.zyx4 = zyx4;
    }

    /**
     *  pay_result.�Զ�����5
     */
    public BigDecimal getZyx5() {
        return zyx5;
    }

    /**
     *  pay_result.�Զ�����5
     */
    public void setZyx5(BigDecimal zyx5) {
        this.zyx5 = zyx5;
    }

    /**
     *  pay_result.�̻����
     */
    public String getMercId() {
        return mercId;
    }

    /**
     *  pay_result.�̻����
     */
    public void setMercId(String mercId) {
        this.mercId = mercId;
    }

    /**
     *  pay_result.�汾��
     */
    public String getVersion() {
        return version;
    }

    /**
     *  pay_result.�汾��
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     *  pay_result.ǩ����ʽ
     */
    public String getSignType() {
        return signType;
    }

    /**
     *  pay_result.ǩ����ʽ
     */
    public void setSignType(String signType) {
        this.signType = signType;
    }
}