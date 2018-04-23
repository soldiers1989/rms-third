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
public enum JaoEclCodeEnum {
    C10000002("10000002","暂不支持此运营商"),
    C10000003("10000003", "数据源异常"),
    C10000004("10000004", "查无此记录"),
    C10000005("10000005", "Type为空或type格式错误"),
    C10000006("10000006", "手机号格式错误或手机号不能为空"),
    C10000007("10000007", "身份证号格式错误或身份证号不能为空"),
    C10000008("10000008", "姓名不能为空"),
    C10000010("10000010", "月份格式错误或月份不能为空"),
    C10000011("10000011", "接口返回错误或不支持此接口"),
    C10000012("10000012", "参数错误"),
    C10000013("10000013", "不支持此接口"),
    CF("F", "查无记录"),
    C10000014("10000014", "休息地址不能为空"),
    C10000015("10000015", "工作地址不能为空"),
    C10000018("10000018", "经度不能为空"),
    C10000019("10000019", "经度格式错误;经度范围[-180,180]"),
    C10000020("10000020", "纬度不能为空"),
    C10000021("10000021", "纬度格式错误;纬度范围[-90,90]"),
    C10000022("10000022", "未命中黑名单"),
    C10000023("10000023", "常驻地址不能为空"),
    C1000131("1000131", "银行卡号格式错误"),
    C1000132("1000132", "银行卡号不能为空");




    private String code;

    private String msg;

    private JaoEclCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }



    protected static final Map<String, String> map = new HashMap<String, String>();
    static{
        for (JaoEclCodeEnum item : JaoEclCodeEnum.values()) {
            map.put(item.code, item.msg);
        }
    }

    public static String getMsg(String code){
        if (StringUtils.isNotBlank(code)) {
            if (code.contains("F")) {
                return CF.msg;
            }
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
}
