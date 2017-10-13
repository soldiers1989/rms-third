package com.jzfq.rms.enums;

/**
 * 客户端产品类型枚举
 * @author 大连桔子分期科技有限公司
 * @date  2017/7/25. 上午10:14:14
 */
public enum ProductClientTypeEnum {

	JUZI(0,"桔子分期"),
	CAR(1,"车主白条");


	private Integer code;
	private String name;

	ProductClientTypeEnum(Integer code, String name){
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
		for(ProductClientTypeEnum c: ProductClientTypeEnum.values()){
			if(c.getCode()==code){
				return c.getName();
			}
		}
		
		return null;
	}
}
