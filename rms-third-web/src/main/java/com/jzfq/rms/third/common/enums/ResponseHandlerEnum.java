package com.jzfq.rms.third.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/23 21:12.
 **/
public enum  ResponseHandlerEnum {
    GPJ02("1","GpjResponseHandler"),//车型库同步
    GPJ01("2","GpjResponseHandler"),//估值信息

    PY01("3","PyResponseHandler"),//鹏元-车辆信息

    TD01("4","TdResponseHandler"),//同盾-同盾分
    TD02("5","TdResponseHandler"),//同盾-同盾规则

    BR01("6","BrResponseHandler"),//百融-百融评分
    BR02("7","BrResponseHandler"),//百融-银行卡四要素

    JXL01("8","JxlResponseHandler"),//聚信立-用户报告数据执行状态
    JXL02("9","JxlResponseHandler"),//聚信立-用户报告数据
    JXL03("10","JxlResponseHandler"),//聚信立-移动运营商数据
    JXL04("11","JxlResponseHandler"),//聚信立-电商数据
    JXL05("12","JxlResponseHandler"),//聚信立-Token获取

    RSLL01("13","Rong360ResponseHandler"),//融360-手机在网时长
    RSLL02("14","Rong360ResponseHandler"),//融360-手机在网状态
    RSLL03("15","Rong360ResponseHandler"),//融360-手机三要素

    JIEAN01("16","JieanResponseHandler"),//捷安-手机在网时长
    JIEAN02("17","JieanResponseHandler"),//捷安-手机在网状态
    JIEAN03("18","JieanResponseHandler");//捷安-运营商实名

    private String code;
    private String name;

    ResponseHandlerEnum(String code, String name){
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getName(String code){
        for(ResponseHandlerEnum c: ResponseHandlerEnum.values()){
            if(StringUtils.equals(code,c.getCode())){
                return c.getName();
            }
        }
        return null;
    }
}
