package com.jzfq.rms.third.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/12/1 13:35.
 **/
public enum PhoneDataTypeEnum {

    THREE_ITEM("1","手机三要素"),
    NETWORK_LENGTH("2","手机在网时长"),
    NETWORK_STATUS("3","手机在网状态");

    private String code;
    private String name;

    PhoneDataTypeEnum(String code, String name){
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
