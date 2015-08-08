package com.dsh.m.dao;

import com.dsh.m.model.PurchaseDetail;
import com.dsh.m.model.PurchaseDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_detail
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    int countByExample(PurchaseDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_detail
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    int deleteByExample(PurchaseDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_detail
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    int deleteByPrimaryKey(Integer purDetailid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_detail
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    int insert(PurchaseDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_detail
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    int insertSelective(PurchaseDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_detail
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    List<PurchaseDetail> selectByExample(PurchaseDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_detail
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    PurchaseDetail selectByPrimaryKey(Integer purDetailid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_detail
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    int updateByExampleSelective(@Param("record") PurchaseDetail record, @Param("example") PurchaseDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_detail
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    int updateByExample(@Param("record") PurchaseDetail record, @Param("example") PurchaseDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_detail
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    int updateByPrimaryKeySelective(PurchaseDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_detail
     *
     * @mbggenerated Wed Aug 05 15:48:39 CST 2015
     */
    int updateByPrimaryKey(PurchaseDetail record);
    
    List getPurchaseDetailByUserId(Integer customerid);
}