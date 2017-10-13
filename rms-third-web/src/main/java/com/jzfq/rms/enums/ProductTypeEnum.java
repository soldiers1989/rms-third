package com.jzfq.rms.enums;

/**
 * 产品类型枚举
 * @author 大连桔子分期科技有限公司
 * @date  2017/7/25. 上午10:14:14
 */
public enum ProductTypeEnum {
	
	SHOPPING_MALL(0,"商城"),
	COMMERCIAL(1,"商户"),
	CASH_LOAN(2,"现金贷"),
	LOUS_QUOTA(3,"桔子分期认证"),
	FENQI_ORDER(4,"桔子分期订单"),
 	CAR_ORDER(5,"车主白条订单"),
	CAR_QUOTA(6,"车主白条认证"),
	ADD_QUOTA(7,"桔子分期提额订单");

	
	private Integer code;
	private String name;

	ProductTypeEnum(Integer code, String name){
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
		for(ProductTypeEnum c: ProductTypeEnum.values()){
			if(c.getCode()==code){
				return c.getName();
			}
		}
		
		return null;
	}
}
