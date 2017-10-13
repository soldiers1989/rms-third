package com.jzfq.rms.enums;


/**
 * 风控审核状态
 * @author 大连桔子分期科技有限公司
 * @date   2016年10月8日 下午4:04:55
 */
public enum StatusEnum {
	STATUS_0(0, "初审待分配"),
	STATUS_1(1, "初审中"),
	STATUS_2(2, "初审挂起"),
	STATUS_3(3, "终审待分配"),
	STATUS_4(4, "终审中"),
	STATUS_5(5, "终审挂起"),
	STATUS_6(6, "终审通过"),
	STATUS_7(7, "终审未通过"),
	STATUS_8(8, "资审中"),
	STATUS_9(9, "资料审核通过"),
	STATUS_10(10, "资料审核未通过"),
	STATUS_11(11, "资料审核退回"),
	STATUS_12(12, "面签状态待上传"),
	STATUS_13(13, "资审待分配"),
	STATUS_14(14, "资审挂起"),
	STATUS_15(15, "本人放弃");

	private Integer code;
	private String name;
	
	StatusEnum(Integer code, String name) {
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
		for(StatusEnum s: StatusEnum.values()){
			if(s.getCode()==code){
				return s.getName();
			}
		}
		
		return null;
	}
	
}
