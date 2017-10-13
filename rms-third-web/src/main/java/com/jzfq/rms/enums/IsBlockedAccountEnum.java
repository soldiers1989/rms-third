package com.jzfq.rms.enums;

/**
 * 是否冻结枚举类
 * @author jiyanle.
 * @date 2017/7/25
 */
public enum IsBlockedAccountEnum {

	NORMAL(1,"正常"),
	BLOCK(2,"冻结");


	private Integer code;
	private String name;

	IsBlockedAccountEnum(Integer code, String name){
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
		for(IsBlockedAccountEnum c: IsBlockedAccountEnum.values()){
			if(c.getCode()==code){
				return c.getName();
			}
		}
		
		return null;
	}
}
