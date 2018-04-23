package com.jzfq.rms.third.common.enums;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/15 16:58.
 **/
public enum ConfigLevelCode {

    SYSTEM_CONFIG("1", "系统设置"),
    CUSTUM_CONFIG("2","自定义配置");

    private String code;
    private String msg;

    private ConfigLevelCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public String code() {
        return code;
    }


    public String msg() {
        return msg;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("{\"code\":").append(this.code).append(",");
        sb.append("\"msg\":\"").append(this.msg).append("\"}");

        return sb.toString();
    }
}
