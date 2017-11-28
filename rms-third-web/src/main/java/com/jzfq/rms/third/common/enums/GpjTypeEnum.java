package com.jzfq.rms.third.common.enums;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/11/28 11:16.
 **/
public enum GpjTypeEnum {

    GPJ_EVALUATION("0","估值信息");

    private String code;
    private String msg;

    private GpjTypeEnum(String code, String msg) {
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
