package com.jzfq.rms.third.common.enums;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Response数据集奥返回码对象
 * @ClassName:  ReturnCode
 * @author 大连桔子分期科技有限公司
 * @date:   2018年4月23日 下午2:16:35
 */
public enum JiguangCodeEnum {
    C2001("2001", "请求成功，但是没有数据"),
    C4000("4000", "参数错误"),
    C4005("4005", "超出API调用频率限制"),
    C4004("4004", "超出API调用次数限制"),
    C4003("4003", "超出API授权日期"),
    C4001("4001", "API未授权"),
    C5000("5000", "服务器内部错误");

    private String code;

    private String msg;

    private JiguangCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }



    protected static final Map<String, String> map = new HashMap<String, String>();
    static{
        for (JiguangCodeEnum item : JiguangCodeEnum.values()) {
            map.put(item.code, item.msg);
        }
    }

    public static String getMsg(String code){
        if (StringUtils.isNotBlank(code)) {
            return map.get(code);
        }
        return "";
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static Map<String, String> getMap() {
        return map;
    }

    public static boolean checkJaoCode(String code){
        boolean flag = true;
        for (String errorcode : map.keySet()) {
            if (code.equals(errorcode)) {
                flag = false;
                break;
            }
        }
        return flag;
    }




}
