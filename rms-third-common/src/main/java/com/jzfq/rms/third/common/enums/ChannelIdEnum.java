package com.jzfq.rms.third.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * 客户端产品类型枚举
 * @author 大连桔子分期科技有限公司
 * @date  2017/7/25. 上午10:14:14
 */
public enum ChannelIdEnum {

	JZFQ("1","桔子分期"),
	CZBT("2","车主白条");

	private String code;
	private String name;

	ChannelIdEnum(String code, String name){
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}


	public String getName() {
		return name;
	}


	public static String getName(String code){
		for(ChannelIdEnum c: ChannelIdEnum.values()){
			if(StringUtils.equals(code,c.getCode())){
				return c.getName();
			}
		}
		return null;
	}
}
