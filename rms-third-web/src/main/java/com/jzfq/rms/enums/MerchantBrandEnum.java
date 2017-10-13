package com.jzfq.rms.enums;

/**
 * 商家品牌类型枚举
 * @author 大连桔子分期科技有限公司
 * @date   17/2/16. 上午10:14:14
 */
public enum MerchantBrandEnum {

    ZERO(0,"没有品牌"),
    NO_FAMOUS(1,"非著名品牌"),
    LOCAL_FAMOUS(2,"地方级著名品牌"),
    COUNTRY_FAMOUS(3,"国家级著名品牌"),
    INTERNATIONAL_FAMOUS(4,"国际级著名品牌");


    private Integer code;
    private String name;

    MerchantBrandEnum(Integer code, String name){
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
        for(MerchantBrandEnum c: MerchantBrandEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }
        return null;
    }

    public static Integer getCode(String name){
        for(MerchantBrandEnum c: MerchantBrandEnum.values()){
            if(c.getName().equals(name)){
                return c.getCode();
            }
        }
        return null;
    }

}
