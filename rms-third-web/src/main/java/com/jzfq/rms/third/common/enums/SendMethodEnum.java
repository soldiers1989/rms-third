package com.jzfq.rms.third.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/22 14:29.
 **/
public enum SendMethodEnum {
    GPJ02("1","GpjSendHandler"),//车型库同步
    GPJ01("2","GpjSendHandler"),//估值信息

    PY01("3","PySendHandler"),//鹏元-车辆信息

    TD01("4","TdSendHandler"),//同盾-同盾分
    TD02("5","TdSendHandler"),//同盾-同盾规则

    BR01("6","BrSendHandler"),//百融-百融评分
    BR02("7","BrSendHandler"),//百融-银行卡四要素

    JXL01("8","JxlSendHandler"),//聚信立-用户报告数据执行状态
    JXL02("9","JxlSendHandler"),//聚信立-用户报告数据
    JXL03("10","JxlSendHandler"),//聚信立-移动运营商数据
    JXL04("11","JxlSendHandler"),//聚信立-电商数据
    JXL05("12","JxlSendHandler"),//聚信立-Token获取

    RSLL01("13","Rong360SendHandler"),//融360-手机在网时长
    RSLL02("14","Rong360SendHandler"),//融360-手机在网状态
    RSLL03("15","Rong360SendHandler"),//融360-手机三要素

    JIEAN01("16","JieanSendHandler"),//捷安-手机在网时长
    JIEAN02("17","JieanSendHandler"),//捷安-手机在网状态
    JIEAN03("18","JieanSendHandler");//捷安-运营商实名

    private String code;
    private String name;

    SendMethodEnum(String code, String name){
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
        for(SendMethodEnum c: SendMethodEnum.values()){
            if(StringUtils.equals(code,c.getCode())){
                return c.getName();
            }
        }
        return null;
    }
}
