package com.jzfq.rms.enums;
/**
 * 回复状态枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017年8月11日 20:04:55
 */
public enum AnswerStatusEnum {

	FREE_NOTE(0,"免照会"),
	ONESELF(1,"本人"),
	NONSELF(2,"非本人"),
	NOT_CONNECTED(3,"未接通"),
	INVALID_CODE_NUMBER(4,"无效号码"),
	OTHER(5,"其他");


	private Integer code;
	private String name;

	AnswerStatusEnum(Integer code, String name){
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
		for(AnswerStatusEnum c: AnswerStatusEnum.values()){
			if(c.getCode()==code){
				return c.getName();
			}
		}
		
		return null;
	}
	
	public static Integer getCode(String name){
		for(AnswerStatusEnum c: AnswerStatusEnum.values()){
			if(c.getName().equals(name)){
				return c.getCode();
			}
		}
		return null;
	}
}
