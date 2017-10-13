package com.jzfq.rms.enums;

/**
 * 同盾借款事件-加黑规则
 * @author 大连桔子分期科技有限公司
 * @date   2017/8/14 下午4:04:55
 */
public enum TdLoanRuleEnum {

	ANDROID_ID_COURT_BREAK("3727576","[ANDROID]身份证命中法院失信名单"),
	ANDROID_ID_CRIME("3727578","[ANDROID]身份证命中犯罪通缉名单"),
	ANDROID_ID_COURT_CARRY("3727580","[ANDROID]身份证命中法院执行名单"),
	ANDROID_ID_LOAN_LIMIT("3727584","[ANDROID]身份证命中信贷逾期名单"),
	ANDROID_ID_RENT_BREAK("3727588","[ANDROID]身份证命中车辆租赁违约名单"),
	ANDROID_ID_COMPANY_LEGAL_PERSON("3727604","[ANDROID]身份证命中欠款公司法人代表名单"),
	ANDROID_ID_OWING_LIST("3727608","[ANDROID]身份证命中欠税名单"),
	ANDROID_PHONE_LOAN_LIMIT("3727634","[ANDROID]手机号命中信贷逾期名单"),
	ANDROID_PHONE_COMPANY_LEGAL_PERSON("3727640","[ANDROID]手机号命中欠款公司法人代表名单"),
	IOS_ID_COURT_BREAK("3728256","[IOS]身份证命中法院失信名单"),
	IOS_ID_CRIME("3728258","[IOS]身份证命中犯罪通缉名单"),
	IOS_ID_COURT_CARRY("3728260","[IOS]身份证命中法院执行名单"),
	IOS_ID_LOAN_LIMIT("3728264","[IOS]身份证命中信贷逾期名单"),
	IOS_ID_RENT_BREAK("3728268","[IOS]身份证命中车辆租赁违约名单"),
	IOS_ID_COMPANY_LEGAL_PERSON("3728284","[IOS]身份证命中欠款公司法人代表名单"),
	IOS_ID_OWING_LIST("3728288","[IOS]身份证命中欠税名单"),
	IOS_PHONE_LOAN_LIMIT("3728314","[IOS]手机号命中信贷逾期名单"),
	IOS_PHONE_COMPANY_LEGAL_PERSON("3728320","[IOS]手机号命中欠款公司法人代表名单");



	private String code;
	private String name;

	TdLoanRuleEnum(String code, String name){
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
		for (TdLoanRuleEnum d : TdLoanRuleEnum.values()) {
			if (d.getCode().equals(code)) {
				return d.getName();
			}
		}
		return null;
	}
}
