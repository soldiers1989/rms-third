package com.jzfq.rms.enums;
/**
 * 产品类别枚举
 * @author 大连桔子分期科技有限公司
 * @date  2017/1/13. 上午10:14:14
 */
public enum ProductCategoryEnum {
	
	WHITE_BAR(0,"白条"),
	FREE_LOAN(1,"随手借"),
	HAIER(2,"海尔"),
	SELF(3,"自营产品"),
	PUBLIC_NET(4,"众网"),
	YUECAI(5,"悦才"),
	FENGDAI(6,"蜂贷"),
	XIAOYUDIAN(7,"小雨点"),
	FUSHIKANG(8,"富士康"),
	DINGSHENG(9,"鼎盛");

	
	private Integer code;
	private String name;
	
	ProductCategoryEnum(Integer code, String name){
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
		for(ProductCategoryEnum c: ProductCategoryEnum.values()){
			if(c.getCode()==code){
				return c.getName();
			}
		}
		
		return null;
	}
	public static Integer getCode(String name){
		for(ProductCategoryEnum c: ProductCategoryEnum.values()){
			if(c.getName().equals(name)){
				return c.getCode();
			}
		}

		return null;
	}
}
