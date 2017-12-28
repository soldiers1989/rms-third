package com.jzfq.rms.third.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/11/13 16:55.
 **/
public enum CarCheckEnum {

    AGREE("1","均一致"),
    UNAGREE("2","不一致"),
    UNCHECK("3","无法核查"),
    OTHER("4","其他");

    private String code;
    private String name;

    CarCheckEnum(String code, String name){
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
        for(CarCheckEnum c: CarCheckEnum.values()){
            if(StringUtils.equals(code,c.getCode())){
                return c.getName();
            }
        }
        return null;
    }
}
