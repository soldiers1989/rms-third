package com.jzfq.rms.enums;

/**
 * 信用类型枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017年8月11日 20:04:55
 */
public enum  CreditTypeEnum {

    CUSTOMERTYPE_WALLET(1,"商城白条"),
    CUSTOMERTYPE_CAR(2,"车主"),
    CUSTOMERTYPE_TO_CAR(3,"商城白条转车主"),
    CUSTOMERTYPE_TO_WALLET(4,"车主转商城白条");

    private Integer code;
    private String name;

    CreditTypeEnum(Integer code, String name){
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getName(Integer code){
        for(CreditTypeEnum c: CreditTypeEnum.values()){
            if(c.getCode()==code.intValue()){
                return c.getName();
            }
        }

        return "";
    }
}
