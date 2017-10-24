package com.jzfq.rms.third.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/23 21:12.
 **/
public enum  ResponseHandlerEnum {
    GPJ01("2","GongpingjiaHandler"),//估值信息
    GPJ02("1","GongpingjiaHandler");//车型库同步

    private String code;
    private String name;

    ResponseHandlerEnum(String code, String name){
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
        for(ResponseHandlerEnum c: ResponseHandlerEnum.values()){
            if(StringUtils.equals(code,c.getCode())){
                return c.getName();
            }
        }
        return null;
    }
}
