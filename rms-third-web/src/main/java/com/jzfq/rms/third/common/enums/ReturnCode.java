package com.jzfq.rms.third.common.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Response数据返回码对象
 * @ClassName:  ReturnCode
 * @author 大连桔子分期科技有限公司
 * @date:   2016年2月23日 下午2:16:35
 */
public enum ReturnCode {
    ERROR_REFUSE_IP(-60,"拒绝IP"),
    NOT_EXIST_SEND_HANDLER(-2, "不存在发送处理模块"),
	ACTIVE_EXCEPTION(-1, "异常"),
    ACTIVE_SUCCESS(01, "操作成功"),
    ACTIVE_FAILURE(02, "操作失败"),
    ERROR_PARAMS_NOT_NULL(03, "参数不能为空"),
    ERROR_HEADER_NOT_NULL(04, "请求头不能为空"),
    ERROR_INVALID_TOKEN(05, "请求token验证不通过"),
    ERROR_UNKNOWN_API(06, "功能接口不存在"),
    ERROR_INVALID_ARGS(07, "请求参数不合法"),
    ERROR_SYSTEM_CONFIG_NULL(8,"系统配置出错"),
    ERROR_RESPONSE_NULL(9,"响应为空"),
    ERROR_THIRD_RESPONSE(10,"第三方接口错误"),
    ERROR_THIRD_RRSPONSE_NULL(11,"第三方返回为空"),
    ERROR_TASK_ID_NULL(11,"根据订单号获取taskId失败"),
    ACTIVE_THIRD_RPC(12,"远程调用接口中"),
    REQUEST_THIRD_GETING(13,"数据抓取中"),
    REQUEST_SAME_EXCUTING(199,"有相同的请求正在执行"),
    REQUEST_SUCCESS(200,"请求成功"),
    ERROR_PARAMS(400, "参数不完整"),
    ERROR_DUPLICATE(401, "重复操作"),
    ERROR_AUTH(402, "无权限"),
    ERROR_PARAMS_DECRYPT(402, "参数解密失败"),
    ERROR_WRONG(403, "用户无法使用此系统"),
    ERROR_RESOURCES(404, "请求资源不存在"),
    ERROR_PARAMS_FORMAT(500, "参数格式错误"),
    ERROR_SERVER(503, "系统异常"),
    ERROR_USER_TYPE_ERROR(1111, "用户类型参数错误"),
    ERROR_UNKOWN_ERROR(9999, "未知错误,响应数据为null");
	private int code;
	
	private String msg;
	
	private ReturnCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ReturnCode codeToEnum(int code) {

        ReturnCode[] values = ReturnCode.values();
        for (ReturnCode returnCode : values) {
            if (returnCode.code == code) {
                return returnCode;
            }
        }
        return ACTIVE_EXCEPTION;
    }

    public int code() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String msg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, ?> Map() {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("code", this.code);
        hashMap.put("msg", this.msg);
        return hashMap;
    }

    public Map<String, ?> Map(int code) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("code", code);
        hashMap.put("msg", this.msg);
        return hashMap;
    }

    public Map<String, ?> Map(Object msg) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("code", this.code);
        hashMap.put("msg", msg);
        return hashMap;
    }

    public Map<String, ?> Map(int code, Object msg) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("code", code);
        hashMap.put("msg", msg);
        return hashMap;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("{\"code\":").append(this.code).append(",");
        sb.append("\"msg\":\"").append(this.msg).append("\"}");

        return sb.toString();
    }
	

}
