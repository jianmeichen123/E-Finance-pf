package com.dsh.m.model;

import java.io.Serializable;

public class SysDictionary implements Serializable{

	/**
	 * 数据字典类型表主键
	 */
	private Integer id;
	/**
	 * 类型主键
	 */
	private Integer typeid;
	/**
	 * 字典类型
	 */
	private String dictype;
	/**
	 * 数据字典编码
	 */
	private String dicnum;
	/**
	 * 数据字典名称
	 */
	private String name;
	/**
	 * 备注
	 */
	private String memo;
	/**
	 * 时间戳
	 */
	private String ts;
	/**
	 * 删除标志
	 */
	private String dr;
	/**
	 * 自定义项1
	 */
	private String zdy1;
	/**
	 * 自定义项2
	 */
	private String zdy2;
	/**
	 * 自定义项3
	 */
	private String zdy3;
	/**
	 * 自定义项4
	 */
	private String zdy4;
	/**
	 * 自定义项5
	 */
	private String zdy5;

	/**
	 * sys_dictionary.数据字典类型表主键
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * sys_dictionary.数据字典类型表主键
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * sys_dictionary.类型主键
	 */
	public Integer getTypeid() {
		return typeid;
	}

	/**
	 * sys_dictionary.类型主键
	 */
	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	/**
	 * sys_dictionary.字典类型
	 */
	public String getDictype() {
		return dictype;
	}

	/**
	 * sys_dictionary.字典类型
	 */
	public void setDictype(String dictype) {
		this.dictype = dictype;
	}

	/**
	 * sys_dictionary.数据字典编码
	 */
	public String getDicnum() {
		return dicnum;
	}

	/**
	 * sys_dictionary.数据字典编码
	 */
	public void setDicnum(String dicnum) {
		this.dicnum = dicnum;
	}

	/**
	 * sys_dictionary.数据字典名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * sys_dictionary.数据字典名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * sys_dictionary.备注
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * sys_dictionary.备注
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * sys_dictionary.时间戳
	 */
	public String getTs() {
		return ts;
	}

	/**
	 * sys_dictionary.时间戳
	 */
	public void setTs(String ts) {
		this.ts = ts;
	}

	/**
	 * sys_dictionary.删除标志
	 */
	public String getDr() {
		return dr;
	}

	/**
	 * sys_dictionary.删除标志
	 */
	public void setDr(String dr) {
		this.dr = dr;
	}

	/**
	 * sys_dictionary.自定义项1
	 */
	public String getZdy1() {
		return zdy1;
	}

	/**
	 * sys_dictionary.自定义项1
	 */
	public void setZdy1(String zdy1) {
		this.zdy1 = zdy1;
	}

	/**
	 * sys_dictionary.自定义项2
	 */
	public String getZdy2() {
		return zdy2;
	}

	/**
	 * sys_dictionary.自定义项2
	 */
	public void setZdy2(String zdy2) {
		this.zdy2 = zdy2;
	}

	/**
	 * sys_dictionary.自定义项3
	 */
	public String getZdy3() {
		return zdy3;
	}

	/**
	 * sys_dictionary.自定义项3
	 */
	public void setZdy3(String zdy3) {
		this.zdy3 = zdy3;
	}

	/**
	 * sys_dictionary.自定义项4
	 */
	public String getZdy4() {
		return zdy4;
	}

	/**
	 * sys_dictionary.自定义项4
	 */
	public void setZdy4(String zdy4) {
		this.zdy4 = zdy4;
	}

	/**
	 * sys_dictionary.自定义项5
	 */
	public String getZdy5() {
		return zdy5;
	}

	/**
	 * sys_dictionary.自定义项5
	 */
	public void setZdy5(String zdy5) {
		this.zdy5 = zdy5;
	}
}