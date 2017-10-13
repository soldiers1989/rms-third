package com.jzfq.rms.enums;

import com.jzfq.rms.constants.RmsConstants;

/**
 * 百荣岗位枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017年8月11日 20:04:55
 */
public enum BrPostUrl {
    //白领分数
    OFFICE_SCORE("scoreconsoffv2", "查询白领分数"),
    //银行四要素
    BANK_FOUR("BankFour", "查询银行卡四要素"),
    //法院被执行人
    EXCEPTION("Execution", "查询法院被执行人"),
    //信用风险规则
    RULE_ACCOUNT_CHANGE("RuleAccountChange", "查询信用卡风险规则-收支等级"),
    //非工薪分数
    STU_SCORE("scorepettycashv1", "查询非工薪分数"),
    //学历
    STU_EDU("EduLevel", "查询学历信息"),

    RULE_SPECIALLIST("RuleSpecialList", "查询特殊名单"),
    
    RULE_APPLYLOAN("RuleApplyLoan", "多次申请"),
    
    SPECIAL_LIST("SpecialList_c", "特殊名单核查"),

    RULE_EXECUTION("RuleExecution", "法院执行人"),

    //手机三要素
    PHONE_THREE("TelCheck","手机三要素"),
    //手机在网时长
    PHONE_PERIOD("TelPeriod","手机在网时长"),
    // 手机在网状态
    PHONE_STATUS("TelStatus","手机再往状态"),
    // 现金贷评分
    DATA_CUST("DataCust","现金贷评分");

    //非工薪需要查询的所有url
    public static String STU_LIST = "";

    public static String STU_LIST_XJD = "";

    public static String OFFICE_LIST = "";

    public static String OFFICE_LIST_XJD = "";

    static {
        StringBuffer buffer = new StringBuffer();
        //白领需要请求的接口
        OFFICE_LIST = buffer.append(OFFICE_SCORE.getUrl()).append(RmsConstants.COMMA)
                .append(EXCEPTION.getUrl()).append(RmsConstants.COMMA)
                .append(RULE_ACCOUNT_CHANGE.getUrl()).append(RmsConstants.COMMA)
                .append(RULE_SPECIALLIST.getUrl()).append(RmsConstants.COMMA)
                .append(RULE_APPLYLOAN.getUrl()).append(RmsConstants.COMMA)
                .append(SPECIAL_LIST.getUrl()).append(RmsConstants.COMMA)
                .append(PHONE_THREE.getUrl()).append(RmsConstants.COMMA)
                // .append(PHONE_STATUS.getUrl()).append(RmsConstants.COMMA)
                .append(PHONE_PERIOD.getUrl()).append(RmsConstants.COMMA)
                .toString();

        buffer = new StringBuffer();
        //白领需要请求的接口(现金贷)
        OFFICE_LIST_XJD = buffer.append(DATA_CUST.getUrl()).append(RmsConstants.COMMA)
                .append(EXCEPTION.getUrl()).append(RmsConstants.COMMA)
                .append(RULE_ACCOUNT_CHANGE.getUrl()).append(RmsConstants.COMMA)
                .append(RULE_SPECIALLIST.getUrl()).append(RmsConstants.COMMA)
                .append(RULE_APPLYLOAN.getUrl()).append(RmsConstants.COMMA)
                .append(SPECIAL_LIST.getUrl()).append(RmsConstants.COMMA)
                .append(PHONE_THREE.getUrl()).append(RmsConstants.COMMA)
                // .append(PHONE_STATUS.getUrl()).append(RmsConstants.COMMA)
                .append(PHONE_PERIOD.getUrl()).append(RmsConstants.COMMA)
                .toString();

        buffer = new StringBuffer();
        //非工薪需求请求的接口
        STU_LIST= buffer.append(STU_SCORE.getUrl()).append(RmsConstants.COMMA)
                .append(RULE_APPLYLOAN.getUrl()).append(RmsConstants.COMMA)
                .append(RULE_EXECUTION.getUrl()).append(RmsConstants.COMMA)
                .append(EXCEPTION.getUrl()).append(RmsConstants.COMMA)
                .append(SPECIAL_LIST.getUrl()).append(RmsConstants.COMMA)
                .append(RULE_ACCOUNT_CHANGE.getUrl()).append(RmsConstants.COMMA)
                .append(PHONE_THREE.getUrl()).append(RmsConstants.COMMA)
                // .append(PHONE_STATUS.getUrl()).append(RmsConstants.COMMA)
                .append(PHONE_PERIOD.getUrl()).append(RmsConstants.COMMA)
                .append(RULE_SPECIALLIST.getUrl()).append(RmsConstants.COMMA)
                .toString();

        buffer = new StringBuffer();
        //非工薪需求请求的接口
        STU_LIST_XJD= buffer.append(DATA_CUST.getUrl()).append(RmsConstants.COMMA)
                .append(RULE_APPLYLOAN.getUrl()).append(RmsConstants.COMMA)
                .append(RULE_EXECUTION.getUrl()).append(RmsConstants.COMMA)
                .append(EXCEPTION.getUrl()).append(RmsConstants.COMMA)
                .append(SPECIAL_LIST.getUrl()).append(RmsConstants.COMMA)
                .append(RULE_ACCOUNT_CHANGE.getUrl()).append(RmsConstants.COMMA)
                .append(PHONE_THREE.getUrl()).append(RmsConstants.COMMA)
                // .append(PHONE_STATUS.getUrl()).append(RmsConstants.COMMA)
                .append(PHONE_PERIOD.getUrl()).append(RmsConstants.COMMA)
                .append(RULE_SPECIALLIST.getUrl()).append(RmsConstants.COMMA)
                .toString();
    }

    private String url;

    private String desc;

    BrPostUrl(String url, String desc) {
        this.url = url;
        this.desc = desc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
