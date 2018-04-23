package com.jzfq.rms.third.common.enums;

public enum TaskCode {

    EXCUTE_SUCCESS("1", "执行成功"),
    EXCUTE_FAILURE("2","执行失败");

    private String code;
    private String msg;

    private TaskCode(String code, String msg) {
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
