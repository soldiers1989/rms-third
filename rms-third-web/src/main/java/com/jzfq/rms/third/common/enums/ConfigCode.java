package com.jzfq.rms.third.common.enums;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/15 16:55.
 **/
public enum ConfigCode {
    THIRD_URL_PENGYUAN_PYCREDIT("com.jzfq.rms.third.url.pengyuan.pycredit", "鹏元接口"),
    THIRD_URL_JXL_ACCESSTOKEN("com.jzfq.rms.third.url.jxl.accesstoken", "获取Token接口"),
    THIRD_URL_JXL_ACCESSREPORTSTATUS("com.jzfq.rms.third.url.jxl.accessreportstatus", "用户报告状态接口"),
    THIRD_URL_JXL_ACCESSREPORTDATA("com.jzfq.rms.third.url.jxl.accessreportdata", "用户报告数据接口"),
    THIRD_URL_JXL_ACCESSRAWDATA("com.jzfq.rms.third.url.jxl.accessrawdata", "移动运营商数据数据接口"),
    THIRD_URL_JXL_ACCESSBUSIRAWDATA("com.jzfq.rms.third.url.jxl.accessbusirawdata", "电商数据接口"),
    THIRD_URL_TD_LOGINTDSCORE("com.jzfq.rms.third.url.td.logintdscore", "同盾登录决策分接口"),
    THIRD_URL_TD_ADDTDFRAUDBLACK("com.jzfq.rms.third.url.td.addtdfraudblack", "添加反欺诈黑明代"),
    THIRD_URL_GPJ_UPDATE_CAR_MODEL("gongpingjia.detail.model.apiUrl", "公平价更新车型库接口"),
    THIRD_URL_GPJ_EVALUATION("gongpingjia.evaluation.apiUrl", "公平价车型估值接口");

    private String code;
    private String msg;

    private ConfigCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public String code() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String msg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("{\"code\":").append(this.code).append(",");
        sb.append("\"msg\":\"").append(this.msg).append("\"}");

        return sb.toString();
    }
}
