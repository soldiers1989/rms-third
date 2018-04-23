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
public enum JaoCodeEnum {
    C888("-888","登录失败,用户不存在"),
    C999("-999", "用户名不能为空"),
    C747("-747", "该用户已经删除"),
    C700("-700", "登陆出现异常"),
    C666("-666", "登陆失败,记录登陆信息失败"),
    C555("-555", "登录失败,用户名密码错误"),
    C556("-556", "图形验证码输入错误"),
    C444("-444", "登录失败,账户被锁定"),
    C100("-100", "token为空（需要重新获tokenID）"),
    C200("-200", "用户被新登录挤掉（需要重新获tokenID）"),
    C300("-300", "用户未登录（需要重新获tokenID）"),
    C400("-400", "用户未具备访问权限"),
    C500("500", "服务器错误"),
    C41054("-41054", "注册失败"),
    C50001("50001", "剩余使用量不足"),
    C50002("50002", "接口查询接口类型参数配置错误"),
    C50003("50003", "文件拷贝错误"),
    C50004("50004", "业务类型为空"),
    C1100000("1100000", "授权码格式错误"),
    C1000000("1000000", "暂不支持此运营商"),
    C1000005("1000005", "type为空或type格式错误(正确示例：A1,A5,B1)"),
    C1000006("1000006", "手机号码错误(没有匹配的运营商)"),
    C1000020("1000020", "手机号不能为空"),
    C1000009("1000009", "手机号格式错误"),
    C1000021("1000021", "身份证号不能为空"),
    C1000007("1000007", "身份证号格式错误"),
    C1000008("1000008", "姓名不能为空"),
    C49999("49999", "余额不足"),
    C100000801("100000801", "姓名不能为乱码"),
    C100000802("100000802", "姓名格式错误"),
    C501("501", "参数错误"),
    C10009("10009", "系统异常"),
    C10010("10010", "对象异常"),
    C10011("10011", "其他异常"),
    C10012("10012", "签名验证失败"),
    C10013("10013", "数据查询超时"),
    C100000001("100000001", "不支持虚拟运营商"),
    C49998("49998", "T、Y、Z、E系列接口不能和其他接口同时调用"),
    C50020("50020", "回调接口和实时接口不能同时调用");

    private String code;

    private String msg;

    private JaoCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }



    public static final Map<String, String> map = new HashMap<String, String>();
    static{
        for (JaoCodeEnum item : JaoCodeEnum.values()) {
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
}
