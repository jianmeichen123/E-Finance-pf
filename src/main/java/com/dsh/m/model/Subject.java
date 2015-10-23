package com.dsh.m.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Subject implements Serializable {
    /**
     *  主键id
     */
    private Integer id;

    /**
     *  父id
     */
    private Integer parentid;

    /**
     *  编号
     */
    private Integer subnum;

    /**
     *  名称
     */
    private String subname;

    /**
     *  显示名称
     */
    private String showname;

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
     *  备注
     */
    private String comment;

    /**
     *  subject.主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     *  subject.主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *  subject.父id
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     *  subject.父id
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     *  subject.编号
     */
    public Integer getSubnum() {
        return subnum;
    }

    /**
     *  subject.编号
     */
    public void setSubnum(Integer subnum) {
        this.subnum = subnum;
    }

    /**
     *  subject.名称
     */
    public String getSubname() {
        return subname;
    }

    /**
     *  subject.名称
     */
    public void setSubname(String subname) {
        this.subname = subname;
    }

    /**
     *  subject.显示名称
     */
    public String getShowname() {
        return showname;
    }

    /**
     *  subject.显示名称
     */
    public void setShowname(String showname) {
        this.showname = showname;
    }

    /**
     *  subject.创建人
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     *  subject.创建人
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     *  subject.创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *  subject.创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *  subject.修改人
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     *  subject.修改人
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    /**
     *  subject.修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     *  subject.修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     *  subject.时间戳
     */
    public String getTs() {
        return ts;
    }

    /**
     *  subject.时间戳
     */
    public void setTs(String ts) {
        this.ts = ts;
    }

    /**
     *  subject.删除标志
     */
    public String getDr() {
        return dr;
    }

    /**
     *  subject.删除标志
     */
    public void setDr(String dr) {
        this.dr = dr;
    }

    /**
     *  subject.自定义项1
     */
    public Integer getZyx1() {
        return zyx1;
    }

    /**
     *  subject.自定义项1
     */
    public void setZyx1(Integer zyx1) {
        this.zyx1 = zyx1;
    }

    /**
     *  subject.自定义项2
     */
    public String getZyx2() {
        return zyx2;
    }

    /**
     *  subject.自定义项2
     */
    public void setZyx2(String zyx2) {
        this.zyx2 = zyx2;
    }

    /**
     *  subject.自定义项3
     */
    public String getZyx3() {
        return zyx3;
    }

    /**
     *  subject.自定义项3
     */
    public void setZyx3(String zyx3) {
        this.zyx3 = zyx3;
    }

    /**
     *  subject.自定义项4
     */
    public Date getZyx4() {
        return zyx4;
    }

    /**
     *  subject.自定义项4
     */
    public void setZyx4(Date zyx4) {
        this.zyx4 = zyx4;
    }

    /**
     *  subject.自定义项5
     */
    public BigDecimal getZyx5() {
        return zyx5;
    }

    /**
     *  subject.自定义项5
     */
    public void setZyx5(BigDecimal zyx5) {
        this.zyx5 = zyx5;
    }

    /**
     *  subject.备注
     */
    public String getComment() {
        return comment;
    }

    /**
     *  subject.备注
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}