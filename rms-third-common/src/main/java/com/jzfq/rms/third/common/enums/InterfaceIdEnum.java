package com.jzfq.rms.third.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/23 13:46.
 **/
public enum InterfaceIdEnum {
    THIRD_GPJ_SYNCHRONIZEDATA("1","更新车型库接口"),
    THIRD_GPJ_EVALATION("2","车辆估值接口"),

    THIRD_PY01("3","鹏元-车辆信息"),

    THIRD_TD01("4","同盾-同盾分"),
    THIRD_TD02("5","同盾-同盾规则"),
    THIRD_TD03("22","同盾-保镖"),

    THIRD_BR01("6","百融-百融评分"),
    THIRD_BR02("7","百融-银行卡四要素"),

    THIRD_JXL01("8","聚信立-用户报告数据执行状态"),
    THIRD_JXL02("9","聚信立-用户报告数据"),
    THIRD_JXL03("10","聚信立-移动运营商数据"),
    THIRD_JXL04("11","聚信立-电商数据"),
    THIRD_JXL05("12","聚信立-Token获取"),
    THIRD_JXL06("23","聚信立-用户报告-token"),//聚信立-用户报告-token
    THIRD_JXL07("24","聚信立-电商数据-token"),//聚信立-电商数据-token
    THIRD_JXL08("25","聚信立-移动运营商数据-token"),//聚信立-运营商数据-token
    THIRD_JXL09("26","聚信立-用户状态-token"),//聚信立-用户状态-token

    THIRD_RSLL01("13","融360-手机在网时长"),
    THIRD_RSLL02("14","融360-手机在网状态"),
    THIRD_RSLL03("15","融360-手机三要素"),

    THIRD_JIEAN01("16","捷安-手机在网时长"),
    THIRD_JIEAN02("17","捷安-手机在网状态"),
    THIRD_JIEAN03("18","捷安-运营商实名"),


    JAO20("51","集奥-手机三要素"),//集奥-手机三要素
    JAO21("52","集奥-手机在网状态"),//集奥-手机在网状态
    JAO22("53","集奥-手机在网时长"),//集奥-手机在网时长

    JAOLOGIN("27","JaoSendHandler"),//集奥登录事件

    THIRD_BR03("21","百融-登陆事件");

    private String code;
    private String name;

    InterfaceIdEnum(String code, String name){
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
        for(InterfaceIdEnum c: InterfaceIdEnum.values()){
            if(StringUtils.equals(code,c.getCode())){
                return c.getName();
            }
        }
        return null;
    }
}
