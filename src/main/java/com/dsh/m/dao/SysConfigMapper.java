package com.dsh.m.dao;

import com.dsh.m.model.SysConfig;
import com.dsh.m.model.SysConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int countByExample(SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int deleteByExample(SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int insert(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int insertSelective(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    List<SysConfig> selectByExample(SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    SysConfig selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int updateByExampleSelective(@Param("record") SysConfig record, @Param("example") SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int updateByExample(@Param("record") SysConfig record, @Param("example") SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int updateByPrimaryKeySelective(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int updateByPrimaryKey(SysConfig record);
}