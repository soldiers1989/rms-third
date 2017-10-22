package com.jzfq.rms.third.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/22 14:29.
 **/
public enum SendMethodEnum {

    GPJ01("gpj01","GongpingjiaHandler");

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
