package com.dsh.m.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Goods implements Serializable {
    /**
     *  
     */
    private Integer goodsid;

    /**
     *  商品名称
     */
    private String gname;

    /**
     *  单位
     */
    private String unit;

    /**
     *  
     */
    private Boolean iscalculate;

    /**
     *  商品小类ID
     */
    private Integer sclassid;

    /**
     *  
     */
    private String beizhu;

    /**
     *  
     */
    private String image;

    /**
     *  
     */
    private String isSale;

    /**
     *  
     */
    private String gnum;

    /**
     *  商品类型
     */
    private Integer goodsTypeid;

    /**
     *  商品类别
     */
    private Integer goodsCategoryid;

    /**
     *  规格
     */
    private String specificationsid;

    /**
     *  等级
     */
    private String scaleid;

    /**
     *  储存
     */
    private String storageid;

    /**
     *  是否显示
     */
    private Boolean isShow;

    /**
     *  是否参与指数计算
     */
    private Short isIndex;

    /**
     *  是否显示
     */
    private Short sortno;

    /**
     *  商品品牌
     */
    private Integer brandid;

    /**
     *  商品产地
     */
    private String goodsoriginid;

    /**
     *  包装方式
     */
    private String packingid;

    /**
     *  区域
     */
    private String area;

    /**
     *  添加时间
     */
    private Date createtime;

    /**
     *  添加人
     */
    private Integer createuser;

    /**
     *  修改时间
     */
    private Date updatetime;

    /**
     *  修改人
     */
    private Integer updateuser;

    /**
     *  单位id
     */
    private String unitid;

    /**
     *  商品分类ID
     */
    private Integer goostypeid;

    /**
     *  
     */
    private String ts;

    /**
     *  
     */
    private String dr;

    /**
     *  
     */
    private Integer zyx1;

    /**
     *  
     */
    private Integer zyx2;

    /**
     *  
     */
    private String zyx3;

    /**
     *  
     */
    private String zyx4;

    /**
     *  
     */
    private String zyx5;

    /**
     *  
     */
    private String zyx6;

    /**
     *  
     */
    private String zyx7;

    /**
     *  
     */
    private BigDecimal zyx8;

    /**
     *  
     */
    private BigDecimal zyx9;

    /**
     *  
     */
    private BigDecimal zyx10;

    /**
     *  
     */
    private String zyx11;

    /**
     *  
     */
    private Date zyx12;

    /**
     *  
     */
    private Short zyx13;

    /**
     *  
     */
    private Short zyx14;

    /**
     *  
     */
    private String zyx15;

    /**
     *  goods.
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     *  goods.
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    /**
     *  goods.商品名称
     */
    public String getGname() {
        return gname;
    }

    /**
     *  goods.商品名称
     */
    public void setGname(String gname) {
        this.gname = gname;
    }

    /**
     *  goods.单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     *  goods.单位
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     *  goods.
     */
    public Boolean getIscalculate() {
        return iscalculate;
    }

    /**
     *  goods.
     */
    public void setIscalculate(Boolean iscalculate) {
        this.iscalculate = iscalculate;
    }

    /**
     *  goods.商品小类ID
     */
    public Integer getSclassid() {
        return sclassid;
    }

    /**
     *  goods.商品小类ID
     */
    public void setSclassid(Integer sclassid) {
        this.sclassid = sclassid;
    }

    /**
     *  goods.
     */
    public String getBeizhu() {
        return beizhu;
    }

    /**
     *  goods.
     */
    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    /**
     *  goods.
     */
    public String getImage() {
        return image;
    }

    /**
     *  goods.
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     *  goods.
     */
    public String getIsSale() {
        return isSale;
    }

    /**
     *  goods.
     */
    public void setIsSale(String isSale) {
        this.isSale = isSale;
    }

    /**
     *  goods.
     */
    public String getGnum() {
        return gnum;
    }

    /**
     *  goods.
     */
    public void setGnum(String gnum) {
        this.gnum = gnum;
    }

    /**
     *  goods.商品类型
     */
    public Integer getGoodsTypeid() {
        return goodsTypeid;
    }

    /**
     *  goods.商品类型
     */
    public void setGoodsTypeid(Integer goodsTypeid) {
        this.goodsTypeid = goodsTypeid;
    }

    /**
     *  goods.商品类别
     */
    public Integer getGoodsCategoryid() {
        return goodsCategoryid;
    }

    /**
     *  goods.商品类别
     */
    public void setGoodsCategoryid(Integer goodsCategoryid) {
        this.goodsCategoryid = goodsCategoryid;
    }

    /**
     *  goods.规格
     */
    public String getSpecificationsid() {
        return specificationsid;
    }

    /**
     *  goods.规格
     */
    public void setSpecificationsid(String specificationsid) {
        this.specificationsid = specificationsid;
    }

    /**
     *  goods.等级
     */
    public String getScaleid() {
        return scaleid;
    }

    /**
     *  goods.等级
     */
    public void setScaleid(String scaleid) {
        this.scaleid = scaleid;
    }

    /**
     *  goods.储存
     */
    public String getStorageid() {
        return storageid;
    }

    /**
     *  goods.储存
     */
    public void setStorageid(String storageid) {
        this.storageid = storageid;
    }

    /**
     *  goods.是否显示
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     *  goods.是否显示
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    /**
     *  goods.是否参与指数计算
     */
    public Short getIsIndex() {
        return isIndex;
    }

    /**
     *  goods.是否参与指数计算
     */
    public void setIsIndex(Short isIndex) {
        this.isIndex = isIndex;
    }

    /**
     *  goods.是否显示
     */
    public Short getSortno() {
        return sortno;
    }

    /**
     *  goods.是否显示
     */
    public void setSortno(Short sortno) {
        this.sortno = sortno;
    }

    /**
     *  goods.商品品牌
     */
    public Integer getBrandid() {
        return brandid;
    }

    /**
     *  goods.商品品牌
     */
    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    /**
     *  goods.商品产地
     */
    public String getGoodsoriginid() {
        return goodsoriginid;
    }

    /**
     *  goods.商品产地
     */
    public void setGoodsoriginid(String goodsoriginid) {
        this.goodsoriginid = goodsoriginid;
    }

    /**
     *  goods.包装方式
     */
    public String getPackingid() {
        return packingid;
    }

    /**
     *  goods.包装方式
     */
    public void setPackingid(String packingid) {
        this.packingid = packingid;
    }

    /**
     *  goods.区域
     */
    public String getArea() {
        return area;
    }

    /**
     *  goods.区域
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     *  goods.添加时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     *  goods.添加时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     *  goods.添加人
     */
    public Integer getCreateuser() {
        return createuser;
    }

    /**
     *  goods.添加人
     */
    public void setCreateuser(Integer createuser) {
        this.createuser = createuser;
    }

    /**
     *  goods.修改时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     *  goods.修改时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     *  goods.修改人
     */
    public Integer getUpdateuser() {
        return updateuser;
    }

    /**
     *  goods.修改人
     */
    public void setUpdateuser(Integer updateuser) {
        this.updateuser = updateuser;
    }

    /**
     *  goods.单位id
     */
    public String getUnitid() {
        return unitid;
    }

    /**
     *  goods.单位id
     */
    public void setUnitid(String unitid) {
        this.unitid = unitid;
    }

    /**
     *  goods.商品分类ID
     */
    public Integer getGoostypeid() {
        return goostypeid;
    }

    /**
     *  goods.商品分类ID
     */
    public void setGoostypeid(Integer goostypeid) {
        this.goostypeid = goostypeid;
    }

    /**
     *  goods.
     */
    public String getTs() {
        return ts;
    }

    /**
     *  goods.
     */
    public void setTs(String ts) {
        this.ts = ts;
    }

    /**
     *  goods.
     */
    public String getDr() {
        return dr;
    }

    /**
     *  goods.
     */
    public void setDr(String dr) {
        this.dr = dr;
    }

    /**
     *  goods.
     */
    public Integer getZyx1() {
        return zyx1;
    }

    /**
     *  goods.
     */
    public void setZyx1(Integer zyx1) {
        this.zyx1 = zyx1;
    }

    /**
     *  goods.
     */
    public Integer getZyx2() {
        return zyx2;
    }

    /**
     *  goods.
     */
    public void setZyx2(Integer zyx2) {
        this.zyx2 = zyx2;
    }

    /**
     *  goods.
     */
    public String getZyx3() {
        return zyx3;
    }

    /**
     *  goods.
     */
    public void setZyx3(String zyx3) {
        this.zyx3 = zyx3;
    }

    /**
     *  goods.
     */
    public String getZyx4() {
        return zyx4;
    }

    /**
     *  goods.
     */
    public void setZyx4(String zyx4) {
        this.zyx4 = zyx4;
    }

    /**
     *  goods.
     */
    public String getZyx5() {
        return zyx5;
    }

    /**
     *  goods.
     */
    public void setZyx5(String zyx5) {
        this.zyx5 = zyx5;
    }

    /**
     *  goods.
     */
    public String getZyx6() {
        return zyx6;
    }

    /**
     *  goods.
     */
    public void setZyx6(String zyx6) {
        this.zyx6 = zyx6;
    }

    /**
     *  goods.
     */
    public String getZyx7() {
        return zyx7;
    }

    /**
     *  goods.
     */
    public void setZyx7(String zyx7) {
        this.zyx7 = zyx7;
    }

    /**
     *  goods.
     */
    public BigDecimal getZyx8() {
        return zyx8;
    }

    /**
     *  goods.
     */
    public void setZyx8(BigDecimal zyx8) {
        this.zyx8 = zyx8;
    }

    /**
     *  goods.
     */
    public BigDecimal getZyx9() {
        return zyx9;
    }

    /**
     *  goods.
     */
    public void setZyx9(BigDecimal zyx9) {
        this.zyx9 = zyx9;
    }

    /**
     *  goods.
     */
    public BigDecimal getZyx10() {
        return zyx10;
    }

    /**
     *  goods.
     */
    public void setZyx10(BigDecimal zyx10) {
        this.zyx10 = zyx10;
    }

    /**
     *  goods.
     */
    public String getZyx11() {
        return zyx11;
    }

    /**
     *  goods.
     */
    public void setZyx11(String zyx11) {
        this.zyx11 = zyx11;
    }

    /**
     *  goods.
     */
    public Date getZyx12() {
        return zyx12;
    }

    /**
     *  goods.
     */
    public void setZyx12(Date zyx12) {
        this.zyx12 = zyx12;
    }

    /**
     *  goods.
     */
    public Short getZyx13() {
        return zyx13;
    }

    /**
     *  goods.
     */
    public void setZyx13(Short zyx13) {
        this.zyx13 = zyx13;
    }

    /**
     *  goods.
     */
    public Short getZyx14() {
        return zyx14;
    }

    /**
     *  goods.
     */
    public void setZyx14(Short zyx14) {
        this.zyx14 = zyx14;
    }

    /**
     *  goods.
     */
    public String getZyx15() {
        return zyx15;
    }

    /**
     *  goods.
     */
    public void setZyx15(String zyx15) {
        this.zyx15 = zyx15;
    }
}