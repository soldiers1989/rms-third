package com.jzfq.rms.enums;


/**
 * 商户协调力枚举
 * @author 大连桔子分期科技有限公司
 * @date 17/2/16. 上午10:14:14
 */
public enum MerchantCoordinationStrengthEnum {

    ZERO(0,"进件为空"),
    NO_BUTIE_NO_DOUDI(1,"无兜底"),
    WITH_BUTIE_NO_DOUDI(2,"有兜底");

    private Integer code;
    private String name;

    MerchantCoordinationStrengthEnum(Integer code, String name){
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
        for(MerchantCoordinationStrengthEnum c: MerchantCoordinationStrengthEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }
        return null;
    }

    public static Integer getCode(String name){
        for(MerchantCoordinationStrengthEnum c: MerchantCoordinationStrengthEnum.values()){
            if(c.getName().equals(name)){
                return c.getCode();
            }
        }
        return null;
    }
}
