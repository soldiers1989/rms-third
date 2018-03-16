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
public enum Rong360PhoneTimeCode {
    ERROR_NONSUPPORT_CARRIEROPERATOR(10000002,"暂不支持此运营商"),
    ERROR_DATA_SOURCE(10000003, "数据源异常"),
    ERROR_NO_RECORD(10000004, "查无此记录"),
    ERROR_TYPE_NULL_OR_FORMATE(10000005, "Type为空或type格式错误"),
    ERROR_PHONE_OR_NULL(10000006, "手机号格式错误或手机号不能为空"),
    ERROR_IDCARD_OR_NULL(10000007, "身份证号格式错误或身份证号不能为空"),
    ERROR_NAME_NULL(10000008, "姓名不能为空"),
    ERROR_MONTH_OR_NULL(10000010, "月份格式错误或月份不能为空"),
    ERROR_INTERFACE_BACK(10000011, "接口返回错误或不支持此接口"),
    ERROR_PARAMS(10000012, "参数错误"),
    ERROR_INTERFACE(10000013,"不支持此接口"),
    ERROR_NO_THIS_RECORD(0,"查无记录"),
    ERROR_ADDRESS_NULL(10000014,"休息地址不能为空"),
    ERROR_WORK_ADDRESS_NULL(10000015,"工作地址不能为空"),
    ERROR_NAME_PHONE_NOT(10000016,"姓名与手机号不匹配，不能查询"),
    ERROR_DIANXIN_PHONE(10000017,"该接口只支持电信号码"),
    ERROR_JINGDU_NULL(10000018,"经度不能为空"),
    ERROR_JINGDU_FORMATE(10000019,"经度格式错误；经度范围[-180,180]"),
    ERROR_WEIDU_NULL(10000020,"纬度不能为空"),
    ERROR_WEIDU_FORMATE(10000021,"纬度格式错误；纬度范围[-90,90]"),
    ERROR_HIT_BACKLIST(10000022,"未命中黑名单"),
    ERROR_NORMAL_ADDRESS_NULL(10000023,"常住地址不能为空"),
    ERROR_BANKNUM(1000131, "银行卡号格式错误"),
    ERROR_BANKNUM_NULL(1000132, "银行卡号不能为空");
    private int code;

    private String msg;

    private Rong360PhoneTimeCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }



    public static final Map<Integer, String> map = new HashMap<Integer, String>();
    static{
        for (Rong360PhoneTimeCode item : Rong360PhoneTimeCode.values()) {
            map.put(item.code, item.msg);
        }
    }

    public static String getMsg(String code){
        if (StringUtils.isNotBlank(code)) {
            if (code.contains("F")) {
                return ERROR_NO_THIS_RECORD.msg;
            }
            return map.get(code);
        }
        return "";
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



    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("{\"code\":").append(this.code).append(",");
        sb.append("\"msg\":\"").append(this.msg).append("\"}");

        return sb.toString();
    }


}
