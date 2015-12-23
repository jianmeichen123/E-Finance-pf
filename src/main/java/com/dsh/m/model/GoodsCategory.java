package com.dsh.m.model;

import java.math.BigDecimal;
import java.util.Date;

public class GoodsCategory {
    /**
     *  主键
     */
    private Integer id;

    /**
     *  父主键
     */
    private Integer parentId;

    /**
     *  分类编号
     */
    private String typeNum;

    /**
     *  分类名称
     */
    private String typeName;

    /**
     *  分类图片
     */
    private String typePic;

    /**
     *  是否显示
     */
    private Boolean isShow;

    /**
     *  是否参与指数计算
     */
    private Short isIndex;

    /**
     *  是否销售
     */
    private Boolean isSale;

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
     *  排序
     */
    private Short sortno;

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
     *  goods_category.主键
     */
    public Integer getId() {
        return id;
    }

    /**
     *  goods_category.主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *  goods_category.父主键
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     *  goods_category.父主键
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     *  goods_category.分类编号
     */
    public String getTypeNum() {
        return typeNum;
    }

    /**
     *  goods_category.分类编号
     */
    public void setTypeNum(String typeNum) {
        this.typeNum = typeNum;
    }

    /**
     *  goods_category.分类名称
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     *  goods_category.分类名称
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     *  goods_category.分类图片
     */
    public String getTypePic() {
        return typePic;
    }

    /**
     *  goods_category.分类图片
     */
    public void setTypePic(String typePic) {
        this.typePic = typePic;
    }

    /**
     *  goods_category.是否显示
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     *  goods_category.是否显示
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    /**
     *  goods_category.是否参与指数计算
     */
    public Short getIsIndex() {
        return isIndex;
    }

    /**
     *  goods_category.是否参与指数计算
     */
    public void setIsIndex(Short isIndex) {
        this.isIndex = isIndex;
    }

    /**
     *  goods_category.是否销售
     */
    public Boolean getIsSale() {
        return isSale;
    }

    /**
     *  goods_category.是否销售
     */
    public void setIsSale(Boolean isSale) {
        this.isSale = isSale;
    }

    /**
     *  goods_category.创建人
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     *  goods_category.创建人
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     *  goods_category.创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *  goods_category.创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *  goods_category.修改人
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     *  goods_category.修改人
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    /**
     *  goods_category.修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     *  goods_category.修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     *  goods_category.时间戳
     */
    public String getTs() {
        return ts;
    }

    /**
     *  goods_category.时间戳
     */
    public void setTs(String ts) {
        this.ts = ts;
    }

    /**
     *  goods_category.排序
     */
    public Short getSortno() {
        return sortno;
    }

    /**
     *  goods_category.排序
     */
    public void setSortno(Short sortno) {
        this.sortno = sortno;
    }

    /**
     *  goods_category.删除标志
     */
    public String getDr() {
        return dr;
    }

    /**
     *  goods_category.删除标志
     */
    public void setDr(String dr) {
        this.dr = dr;
    }

    /**
     *  goods_category.自定义项1
     */
    public Integer getZyx1() {
        return zyx1;
    }

    /**
     *  goods_category.自定义项1
     */
    public void setZyx1(Integer zyx1) {
        this.zyx1 = zyx1;
    }

    /**
     *  goods_category.自定义项2
     */
    public String getZyx2() {
        return zyx2;
    }

    /**
     *  goods_category.自定义项2
     */
    public void setZyx2(String zyx2) {
        this.zyx2 = zyx2;
    }

    /**
     *  goods_category.自定义项3
     */
    public String getZyx3() {
        return zyx3;
    }

    /**
     *  goods_category.自定义项3
     */
    public void setZyx3(String zyx3) {
        this.zyx3 = zyx3;
    }

    /**
     *  goods_category.自定义项4
     */
    public Date getZyx4() {
        return zyx4;
    }

    /**
     *  goods_category.自定义项4
     */
    public void setZyx4(Date zyx4) {
        this.zyx4 = zyx4;
    }

    /**
     *  goods_category.自定义项5
     */
    public BigDecimal getZyx5() {
        return zyx5;
    }

    /**
     *  goods_category.自定义项5
     */
    public void setZyx5(BigDecimal zyx5) {
        this.zyx5 = zyx5;
    }
}