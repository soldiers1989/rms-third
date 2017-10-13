package com.jzfq.rms.enums;

/**
 * 风控审核状态
 * @author 大连桔子分期科技有限公司
 * @date   2016年10月8日 下午4:04:55
 */
public enum SourceEnum {
	XS(0, "销售"),
	WHITE(1, "白名单"),
	VIP(2, "VIP"),
	JBB1(3, "金宝贝1"),
	JBB2(4, "金宝贝2"),
	F_(5, "特殊F码"),
	OWN_BUY(6, "内购白名单");

	private Integer code;
	private String name;

	SourceEnum(Integer code, String name) {
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
		for(SourceEnum s: SourceEnum.values()){
			if(s.getCode()==code){
				return s.getName();
			}
		}
		
		return null;
	}
	
}
