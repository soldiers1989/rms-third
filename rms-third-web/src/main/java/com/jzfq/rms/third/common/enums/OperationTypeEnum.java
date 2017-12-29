package com.jzfq.rms.third.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/12/21 18:23.
 **/
public enum OperationTypeEnum {


    RZ("1","认证"),
    JY("2","交易"),
    TE("3","提额"),
    TX("4","提现");

    private String code;
    private String name;

    OperationTypeEnum(String code, String name){
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
        for(OperationTypeEnum c: OperationTypeEnum.values()){
            if(StringUtils.equals(code,c.getCode())){
                return c.getName();
            }
        }
        return null;
    }
}
