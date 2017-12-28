package com.jzfq.rms.third.common.enums;

public enum GpjResponseCode {

    GPJ_MSG_SUCCESS("0", "代表请求成功"),
    GPJ_MSG_NO_UPDATE("1","代表最近没有更新数据"),
    GPJ_MSG_ERROR("2","代表请求参数错误");

    private String code;
    private String msg;

    private GpjResponseCode(String code, String msg) {
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
