package com.dsh.m.dao;

import com.dsh.m.model.SysOrdernum;
import com.dsh.m.model.SysOrdernumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOrdernumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_ordernum
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int countByExample(SysOrdernumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_ordernum
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int deleteByExample(SysOrdernumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_ordernum
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_ordernum
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int insert(SysOrdernum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_ordernum
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int insertSelective(SysOrdernum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_ordernum
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    List<SysOrdernum> selectByExample(SysOrdernumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_ordernum
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    SysOrdernum selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_ordernum
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int updateByExampleSelective(@Param("record") SysOrdernum record, @Param("example") SysOrdernumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_ordernum
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int updateByExample(@Param("record") SysOrdernum record, @Param("example") SysOrdernumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_ordernum
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int updateByPrimaryKeySelective(SysOrdernum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_ordernum
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int updateByPrimaryKey(SysOrdernum record);
}