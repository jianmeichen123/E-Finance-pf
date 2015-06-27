package com.dsh.m.dao;

import com.dsh.m.model.SupplyCustomer;
import com.dsh.m.model.SupplyCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplyCustomerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supply_customer
     *
     * @mbggenerated Sat Jun 27 12:12:14 CST 2015
     */
    int countByExample(SupplyCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supply_customer
     *
     * @mbggenerated Sat Jun 27 12:12:14 CST 2015
     */
    int deleteByExample(SupplyCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supply_customer
     *
     * @mbggenerated Sat Jun 27 12:12:14 CST 2015
     */
    int deleteByPrimaryKey(Integer sCid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supply_customer
     *
     * @mbggenerated Sat Jun 27 12:12:14 CST 2015
     */
    int insert(SupplyCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supply_customer
     *
     * @mbggenerated Sat Jun 27 12:12:14 CST 2015
     */
    int insertSelective(SupplyCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supply_customer
     *
     * @mbggenerated Sat Jun 27 12:12:14 CST 2015
     */
    List<SupplyCustomer> selectByExample(SupplyCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supply_customer
     *
     * @mbggenerated Sat Jun 27 12:12:14 CST 2015
     */
    SupplyCustomer selectByPrimaryKey(Integer sCid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supply_customer
     *
     * @mbggenerated Sat Jun 27 12:12:14 CST 2015
     */
    int updateByExampleSelective(@Param("record") SupplyCustomer record, @Param("example") SupplyCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supply_customer
     *
     * @mbggenerated Sat Jun 27 12:12:14 CST 2015
     */
    int updateByExample(@Param("record") SupplyCustomer record, @Param("example") SupplyCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supply_customer
     *
     * @mbggenerated Sat Jun 27 12:12:14 CST 2015
     */
    int updateByPrimaryKeySelective(SupplyCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supply_customer
     *
     * @mbggenerated Sat Jun 27 12:12:14 CST 2015
     */
    int updateByPrimaryKey(SupplyCustomer record);
}