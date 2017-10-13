package com.jzfq.rms.enums;
/**
 * 客户类型枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017年8月11日 20:04:55
 */
public enum CustomerTypeEnum {

	CUSTOMERTYPE_WHITE_COLLAR(0,"白领"),
	CUSTOMERTYPE_STUDENT(1,"非工薪"),
	CUSTOMERTYPE_CAR(2,"车主");

	
	private Integer code;
	private String name;
	
	CustomerTypeEnum(Integer code, String name){
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
		for(CustomerTypeEnum c: CustomerTypeEnum.values()){
			if(c.getCode()==code){
				return c.getName();
			}
		}
		
		return null;
	}
}
