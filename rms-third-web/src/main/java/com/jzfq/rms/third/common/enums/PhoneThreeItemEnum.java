package com.jzfq.rms.third.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/11/11 11:20.
 **/
public enum PhoneThreeItemEnum {
    AGREE("1","均一致"),
    UNAGREE("2","不一致"),
    OTHER("3","其他");

    private String code;
    private String name;

    PhoneThreeItemEnum(String code, String name){
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
        for(PhoneThreeItemEnum c: PhoneThreeItemEnum.values()){
            if(StringUtils.equals(code,c.getCode())){
                return c.getName();
            }
        }
        return null;
    }
}
