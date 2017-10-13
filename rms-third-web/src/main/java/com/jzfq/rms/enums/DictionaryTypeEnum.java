package com.jzfq.rms.enums;

/**
 * 字典类型枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017年4月18日 上午10:14:14
 */
public enum DictionaryTypeEnum {
	
	TASK_STATUS("任务名称(状态)","task_status"),
	CERT_TYPE("身份证件类型代码","cert_type"),
	GENDER_CODE("性别代码表","gender_code"),
	HAS_CAR("是否有车","has_car"),
	LOAN_TYPE_BIG("贷款类型(产品线)","loan_type_big"),
	PHONE_TYPE("电话类型","phone_type"),
	EDU_LEVEL("教育程度","edu_level"),
	MARRIAGE_STATUS("姻状况代码","marriage_status"),
	LOAN_AUDIT_PERIOD_ZIYING("贷款审批期限","loan_audit_period_ziying"),
	LOAN_AUDIT_PERIOD_HAIER("贷款审批期限","loan_audit_period_haier"),
	LOAN_AUDIT_PERIOD_BAITIAO("贷款审批期限","loan_audit_period_baitiao"),
	LOAN_AUDIT_PERIOD_ZIYOUJIE("贷款审批期限","loan_audit_period_ziyoujie"),
	LOAN_PRODUCTS("贷款产品","loan_products"),
	CUSTOMER_CONTACT_RELATIONS("客户联系人关系","customer_contact_relations"),
	UNIT_TYPE("单位性质","unit_type"),
	IMAGE_DATA_TYPE("影像资料类型","image_data_type"),
	SALARY_TYPE("工资发放形式","salary_type"),
	CUSTOMER_TYPE("客户类型","customer_type"),
	APPROVE_TYPE("审核类型","approve_type"),
	APPROVE_RESULT("审核结果","approve_result"),
	REJECT_REASON("拒绝原因","reject_reason"),
	MERCHANT_RETURN_REASON("拒绝原因","merchant_return_reason"),
	MAX_BATCH_SIZE("每批派单数","max_batch_size"),
	MAX_RECEIVE_NUM("领单上限","max_receive_num"),
	MAX_HUNGUP_NUM("挂单上限","max_hungup_num"),
	MAX_BATCH_SIZE_CHECK_CREDIT("免审的每批校验数量","max_batch_size_check_credit"),
	MAX_BATCH_SIZE_GRAB("免审的拉取同盾百融数量","max_batch_size_grab"),
	MAX_BATCH_SIZE_MERCHANT_EVALUATE("商户的评级计算每批数量","max_batch_size_merchant_evaluate"),
	BR_CLOSE_WEIGHT_SCORE("百融闭单权重分","br_close_weight_score"),
	BR_CLOSE_SCORE("百融闭单分数","br_close_score"),
	AUTO_ALLOT_METHOD("自动派单方法选择","auto_allot_method"),
	TD_CLOSE_SCORE_F("同盾闭单权重分","td_close_score_F"),
	TD_CLOSE_SCORE_NOF("同盾闭单分数","td_close_score_NOF"),
	TD_LOGIN_SCORE("同盾登录决策分","td_login_score"),
	EVALUATE_CALC_DIC("额度计算限制参数","evaluate_calc_dic"),
	EVALUATE_RATE("已结清额度计算比例","evaluate_rate"),
	CAR_PRICE_DEFAULT_SCORE("鹏远车辆价格默认分","car_price_default_score"),
	WHITE_DEFAULT_BR_SCORE("白名单默认百融分","white_default_br_score"),
	NO_GRAB_DEFAULT_BR_SCORE("百融没拉到默认百融分","no_grab_default_br_score"),
	WHITE_DEFAULT_BR_WEIGHT_SCORE("白名单默认百融权重分","white_default_br_weight_score"),
	VIP_DEFAULT_BR_SCORE("有vipF码的默认百融分","vip_default_br_score"),
	XJD_VIP_DEFAULT_BR_SCORE("有vipF码的默认百融分","xjd_vip_default_br_score"),
	JBB_DEFAULT_BR_SCORE("有金宝贝F码的默认百融分","jbb_default_br_score"),
	STUDENT_CONTRACTS_NUMBER("免审通讯录数量(非工薪)","student_contracts_number"),
	OFFICE_CONTRACTS_NUMBER("免审通讯录数量(工薪)","office_contracts_number"),
	IS_CLOSE_NO_APPROVE_FLAG("关闭免审开关","is_close_no_approve_flag"),
	JZFQ_ORDER_NO_APPROVE_FLAG("桔子分期订单免审开关","jzfq_order_no_approve_flag"),
	JZFQRZ_NO_APPROVE_FLAG("桔子分期认证免审开关","jzfqrz_no_approve_flag"),
	JZFQRZ_VIP_NO_APPROVE_FLAG("vip客户桔子分期认证免审开关","jzfqrz_vip_no_approve_flag"),
	IS_CLOSE_NO_SIGN_FLAG("关闭免签开关","is_close_no_sign_flag"),
	WHITE_DEFAULT_TD_SCORE("摆明单默认同盾分","white_default_td_score"),
	MERCHANT_APPROVE_USER_NUMBER("商家审核人数","merchant_approve_user_number"),
	XJD_CHECKCREDIT_CONSTANT("现金贷免签免审，自动闭单常量","xjd_checkcredit_constant"),
	NO_APPROVE_AMOUNT("A类用户免审金额最高值","no_approve_amount"),
	VIP_TYPE_JINBAOBEI("vip用户金宝贝","vip_type_jinbaobei"),
	VIP_TYPE_QUOTA("极速认证vip额度","vip_type_quota"),
	CZBT_REDUCE_QUOTA_PARAMETER("车主白条-逾期-降额参数","czbt_reduce_quota_parameter"),
	VIP_TYPE_SPECIAL("vip用户，没有拉到百融分，给600","vip_type_special"),
	XJD_TD_CLOSE_RULE("现金贷-同盾闭单规则参数","xjd_td_close_rule"),
	VIP_FENQIORDER_TD_CLOSE_RULE("","vip_fenqiorder_td_close_rule"),
	F_TYPE_SPECIAL("特殊F码，优先派单","f_type_special"),
	JBB_TYPE_SPECIAL("金宝贝用户","jbb_type_special"),
	GRAB_CAR_REPOSITORY("更新车库","grab_car_repository"),
	JZFQRZ_CHECKCREDIT_CONSTANT("桔子分期认证，极速认证自动闭单常量","jzfqrz_checkcredit_constant"),
	JZFQRZ_CHECK_PHONE_PERIOD_DATA("桔子分期认证，极速认证手机在网时长闭单参数","jzfqrz_check_phone_period_data"),
	MAX_BATCH_SIZE_QUOTA_REFUSE("桔子分期提额订单的每批校验数量","max_batch_size_quota_refuse"),
	XJD_MAX_BATCH_SIZE_QUOTA_REFUS("现金贷的每批校验数量","xjd_max_batch_size_quota_refus"),
	JZFQRZ_VIP_CONSTANT("vip客户桔子分期认证，自动闭单规则校验常量","jzfqrz_vip_constant");

	private String key;
	private String value;
	
	DictionaryTypeEnum(String key, String value){
		this.key = key;
		this.value = value;
	}
	
    public static String getName(String value) {
        for (DictionaryTypeEnum d : DictionaryTypeEnum.values()) {
            if (d.getValue().equals(value)) {
                return d.value;
            }
        }
        return null;
    }
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
	
}
