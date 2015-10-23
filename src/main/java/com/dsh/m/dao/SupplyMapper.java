package com.dsh.m.dao;

import com.dsh.m.model.Supply;
import com.dsh.m.model.SupplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplyMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table supply
	 * @mbggenerated  Wed Oct 21 11:07:26 CST 2015
	 */
	int countByExample(SupplyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table supply
	 * @mbggenerated  Wed Oct 21 11:07:26 CST 2015
	 */
	int deleteByExample(SupplyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table supply
	 * @mbggenerated  Wed Oct 21 11:07:26 CST 2015
	 */
	int deleteByPrimaryKey(Integer supplyid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table supply
	 * @mbggenerated  Wed Oct 21 11:07:26 CST 2015
	 */
	int insert(Supply record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table supply
	 * @mbggenerated  Wed Oct 21 11:07:26 CST 2015
	 */
	int insertSelective(Supply record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table supply
	 * @mbggenerated  Wed Oct 21 11:07:26 CST 2015
	 */
	List<Supply> selectByExample(SupplyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table supply
	 * @mbggenerated  Wed Oct 21 11:07:26 CST 2015
	 */
	Supply selectByPrimaryKey(Integer supplyid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table supply
	 * @mbggenerated  Wed Oct 21 11:07:26 CST 2015
	 */
	int updateByExampleSelective(@Param("record") Supply record,
			@Param("example") SupplyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table supply
	 * @mbggenerated  Wed Oct 21 11:07:26 CST 2015
	 */
	int updateByExample(@Param("record") Supply record,
			@Param("example") SupplyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table supply
	 * @mbggenerated  Wed Oct 21 11:07:26 CST 2015
	 */
	int updateByPrimaryKeySelective(Supply record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table supply
	 * @mbggenerated  Wed Oct 21 11:07:26 CST 2015
	 */
	int updateByPrimaryKey(Supply record);
}