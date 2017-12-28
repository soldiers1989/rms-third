package com.jzfq.rms.third.common.enums;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/11/23 15:24.
 **/
public enum  JxlDataTypeEnum {
    JXL_DATA_TYPE_REPORT("0", "用户报告数据"),
    JXL_DATA_TYPE_MOBILE("1","移动运营商数据"),
    JXL_DATA_TYPE_EBUSINESS("2","电商数据");

    private String code;
    private String msg;

    private JxlDataTypeEnum(String code, String msg) {
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
