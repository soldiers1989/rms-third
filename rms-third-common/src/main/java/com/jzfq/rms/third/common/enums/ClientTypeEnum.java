package com.jzfq.rms.third.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/12/12 17:21.
 **/
public enum ClientTypeEnum {


    IOS("1","IOS"),
    AND("2","安卓"),
    H5("3","H5"),
    PC("4","PC"),
    WX("5","微信"),
    WXCODE("6","微信小程序");

    private String code;
    private String name;

    ClientTypeEnum(String code, String name){
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
        for(ClientTypeEnum c: ClientTypeEnum.values()){
            if(StringUtils.equals(code,c.getCode())){
                return c.getName();
            }
        }
        return null;
    }
}
