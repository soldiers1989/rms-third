package com.jzfq.rms.third.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/22 14:29.
 **/
public enum SystemIdEnum {
    RMS_PULL("33","rms-pull"),
    THIRD_GPJ("17","公平价"),
    THIRD_JIEAN("18","捷安"),
    THIRD_TD("13","同盾"),
    THIRD_JXL("15","聚信立"),
    THIRD_PY("35","鹏元"),
    THIRD_BR("14","百融"),
    THIRD_RSLL("16","融360"),
    RMS_THIRD("15","rms-third");

    private String code;
    private String name;

    SystemIdEnum(String code, String name){
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
        for(SystemIdEnum c: SystemIdEnum.values()){
            if(StringUtils.equals(code,c.getCode())){
                return c.getName();
            }
        }
        return null;
    }
}
