package com.jzfq.rms.third.common.enums;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Response数据返回码对象
 * @ClassName:  ReturnCode
 * @author 大连桔子分期科技有限公司
 * @date:   2016年2月23日 下午2:16:35
 */
public enum Rong360PhoneThreeCode {
    ERROR_ACTION_AGAIN(10000,"操作失败，请稍后重试"),
    ERROR_PARAMS_FAILE(10001, "参数传入非法"),
    ERROR_NO_USER(10002, "此用户不存在"),
    ERROR_LIULIANG_NULL(10003, "您的流量已经用完"),
    ERROR_NO_PERSIMM_ZIYUANLIULIANG(10008, "您此资源的流量权限还没开通"),
    ERROR_DATA_CALLRONG360(10004, "数据获取异常，请联系融360"),
    ERROR_NO_PERMISSION(10005, "用户没有权限访问"),
    ERROR_NO_RESULT(10006, "没有搜索到结果"),
    ERROR_TOKEN(10007, "token有错误"),
    ERROR_NO_PERMISSION_IP(10009, "您的ip不在服务权限"),
    ERROR_NO_LIULIANG(10010,"您今天的流量已经用完"),
    ERROR_IDCARD_FORMATE(10011,"身份证格式错误"),
    ERROR_BANKID_FORMATE(10012,"银行卡格式错误"),
    ERROR_NET(10013,"网络异常"),
    ERROR_LONG_TIME_OUT(10014,"长时间未操作，登录失效，请重新登录"),
    ERROR_NO_FEED_EDU(10015,"您免费查询额度已达到上限"),
    ERROR_NO_EXIST_BAOGAO(10017,"您的报告不存在"),
    ERROR_DATASOURCE_NO_EXIST(10018,"您的原始数据不存在"),
    ERROR_NO_INTERFACE(10019,"您访问的接口不存在"),
    ERROR_PHONE_FORMATE(10020,"手机号格式错误"),
    ERROR_IDFA_FORMATE(10021,"idfa格式错误"),
    ERROR_IMEI_FORMATE(10022,"imei格式错误"),
    ERROR_DATASOURCE_SERVICE(10023, "数据源服务异常,不要走开,马上就好"),
    ERROR_DATE_FORMATE(10025, "日期格式不正确"),
    ERROR_FANGWEN_QUIT(10026, "访问频率过快，请稍候再试"),
    ERROR_ACCOUNT_CLOSED(10027, "您的账号已被关闭，请联系融360商务开通"),
    ERROR_CONNECT_INTERFACE_TIME_OUT(10028, "访问接口超时，请稍候再试"),
    ERROR_VERSION_BAOGAO(10029, "传入报告版本有误"),
    ERROR_VALITE_CODE(10031, "验证码错误，请重新输入"),
    ERROR_USER_INFORMATION(10032, "您查询的用户信息未授权"),
    ERROR_NO_SHOUQUAN(0033, "您查询的用户信息不能授权"),
    ERROR_DATE_INTERGER(10034, "时间段传入的字段必须为整数"),
    ERROR_IP_FORMATE(10035, "ip地址参数格式不对"),
    ERROR_MACADDRESS_IP(10036, "mac地址参数格式不对");
    private int code;

    private String msg;

    private Rong360PhoneThreeCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }



    public static final Map<Integer, String> map = new HashMap<Integer, String>();
    static{
        for (Rong360PhoneThreeCode item : Rong360PhoneThreeCode.values()) {
            map.put(item.code, item.msg);
        }
    }

    public static String getMsg(String code){
        if (StringUtils.isNotBlank(code)) {
            return map.get(code);
        }
        return "";
    }

    public int code() {
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
