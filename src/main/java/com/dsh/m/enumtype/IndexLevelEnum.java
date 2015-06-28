package com.dsh.m.enumtype;


public enum IndexLevelEnum {
	
	LEVEL1("极优", 85d, null, "价格真的很低了，供应商都哭了~"),
	LEVEL2("优秀", 85d, 92d, "价格比较低了，供应商都心疼了~"),
	LEVEL3("良好", 92d, 97d, "价格一般般吧，供应商还有点赚~"),
	LEVEL4("适中", 97d, 105d, "价格适中，其实还能再少花点~"),
	LEVEL5("略高", 105d, 110d, "价格稍微有点高，该注意控制采购了~"),
	LEVEL6("偏高", 110d, 118d, "价格很高啦，再不控制就疯啦~"),
	LEVEL7("极高", 118d, null, "这是一个悲剧，价格太高了，供应商都乐翻了~");
	
	private String level;
	private Double min;
	private Double max;
	private String desc;
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public Double getMin() {
		return min;
	}
	public void setMin(Double min) {
		this.min = min;
	}
	public Double getMax() {
		return max;
	}
	public void setMax(Double max) {
		this.max = max;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	private IndexLevelEnum(String level, Double min, Double max, String desc) {
		this.level = level;
		this.min = min;
		this.max = max;
		this.desc = desc;
	}
	
}
