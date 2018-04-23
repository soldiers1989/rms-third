package com.jzfq.rms.third.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/11/11 11:19.
 **/
public enum PhoneStatusEnum {
    NORMAL("1","正常"),
    UNNORMAL("2","不正常"),
    OTHER("3","其他");

    private String code;
    private String name;

    PhoneStatusEnum(String code, String name){
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }


    public String getName() {
        return name;
    }


    public static String getName(String code){
        for(PhoneStatusEnum c: PhoneStatusEnum.values()){
            if(StringUtils.equals(code,c.getCode())){
                return c.getName();
            }
        }
        return null;
    }
}
