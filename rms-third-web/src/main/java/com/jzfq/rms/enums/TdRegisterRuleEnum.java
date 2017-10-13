package com.jzfq.rms.enums;

/**
 * 同盾注册事件-加黑规则
 * @author 大连桔子分期科技有限公司
 * @date  2017/8/14 下午4:04:55
 */
public enum TdRegisterRuleEnum {

	ANDROID_DEVICE_ONE("3728114","[ANDROID]1天内设备使用过多信息注册"),
	ANDROID_DEVICE_SEVEN("3728116","[ANDROID]7天内设备使用过多信息注册"),
	ANDROID_IP_ONE("3728118","[ANDROID]1天内IP使用过多信息注册"),
	IOS_DEVICE_ONE("3728794","[IOS]1天内设备使用过多信息注册"),
	IOS_DEVICE_SEVEN("3728796","[IOS]7天内设备使用过多信息注册"),
	IOS_IP_ONE("3728798","[IOS]1天内IP使用过多信息注册"),
	H5_DEVICE_ONE("3727234","[H5]1天内设备使用过多信息注册"),
	H5_DEVICE_SEVEN("3727236","[H5]7天内设备使用过多信息注册"),
	H5_IP_ONE("3727238","[H5]1天内IP使用过多信息注册");


	private String code;
	private String name;

	TdRegisterRuleEnum(String code, String name){
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getName(String code) {
		for (TdRegisterRuleEnum d : TdRegisterRuleEnum.values()) {
			if (d.getCode().equals(code)) {
				return d.getName();
			}
		}
		return null;
	}
}
