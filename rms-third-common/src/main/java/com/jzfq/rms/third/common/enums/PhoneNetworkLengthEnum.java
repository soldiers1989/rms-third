package com.jzfq.rms.third.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/11/11 11:22.
 **/
public enum PhoneNetworkLengthEnum {
    THREE_MONTH("1","0-3月"),
    SIX_MONTH("2","3-6月"),
    ONE_YEAR("3","6-12月"),
    TWO_YEAR("4","12-24月"),
    OVER_TWO_YEAR("5","24+月"),
    OTHER("0","其他");

    private String code;
    private String name;

    PhoneNetworkLengthEnum(String code, String name){
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
        for(PhoneNetworkLengthEnum c: PhoneNetworkLengthEnum.values()){
            if(StringUtils.equals(code,c.getCode())){
                return c.getName();
            }
        }
        return null;
    }
}
