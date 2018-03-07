package com.jzfq.rms.third.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/22 21:44.
 **/
public enum ApiIdEnum {

    ThIRD_GPJ_EVALUCTION("1001","获取车辆估值"),
    ThIRD_PY_CHECK_CAR_INFO("1002","鹏元车辆信息校验"),
    ThIRD_JXL_USER_REPORT("1004","用户报告"),
    ThIRD_JXL_ALLOT("1006","allot-电商数据分析"),
    ThIRD_HXZW_TOKEN("1007","核心账务系统-更新用户token"),
    ThIRD_TD_SCORE("1008","获取同盾分"),
    ThIRD_TD_BODY("1009","同盾保镖"),//暂停实现
    ThIRD_BR_SCORE("1011","获取百融分"),
    ThIRD_RSLL_TREE("1012","手机三要素"),
    ThIRD_RSLL_LENGTH("1013","手机在网时长"),
    ThIRD_RSLL_STATUS("1014","手机在网状态"),
    ThIRD_JA_TREE("1015","手机三要素"),
    ThIRD_JA_STATUS("1016","手机在网状态"),
    ThIRD_JA_LENGTH("1017","手机在网时长"),
    ThIRD_GPJ_UPDATE("1018","公平价车型库更新任务"),
    ThIRD_XJHJ_TD_AND_BR("1019","同盾百融数据"),
    ThIRD_PAGE_REDIS_OPT("P001","REDIS数据维护"),
    ThIRD_SYS_RMS_LOG("S000","记录rms调用第三方日志");

    private String code;
    private String name;

    ApiIdEnum(String code, String name){
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

    public static String getName(String code){
        for(SystemIdEnum c: SystemIdEnum.values()){
            if(StringUtils.equals(code,c.getCode())){
                return c.getName();
            }
        }
        return null;
    }
}
