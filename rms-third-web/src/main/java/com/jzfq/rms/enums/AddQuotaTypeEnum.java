package com.jzfq.rms.enums;
/**
 * 添加配额类型枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017年8月11日 20:04:55
 */
public enum AddQuotaTypeEnum {

	PersonalInfo(4,"个人基本信息"),
	ContactInfo(5,"联系人信息"),
	ProfessionalInfo(6,"职业信息"),
	CarInfo(7,"车辆信息");


	private Integer code;
	private String name;

	AddQuotaTypeEnum(Integer code, String name){
		this.code = code;
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getName(Integer code){
		for(AddQuotaTypeEnum c: AddQuotaTypeEnum.values()){
			if(c.getCode()==code){
				return c.getName();
			}
		}
		
		return null;
	}
}
