package com.jzfq.rms.third.common.enums;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/15 16:55.
 **/
public enum ConfigCode {
    THIRD_URL_PENGYUAN_PYCREDIT("com.jzfq.rms.third.url.pengyuan.pycredit", "鹏元接口");

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
