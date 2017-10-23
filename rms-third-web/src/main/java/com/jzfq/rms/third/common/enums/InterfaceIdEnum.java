package com.jzfq.rms.third.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/23 13:46.
 **/
public enum InterfaceIdEnum {

    THIRD_GPJ_EVALATION("2","车辆估值接口"),
    THIRD_GPJ_SYNCHRONIZEDATA("1","更新车型库接口");

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
