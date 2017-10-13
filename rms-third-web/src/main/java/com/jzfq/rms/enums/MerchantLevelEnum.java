package com.jzfq.rms.enums;

/**
 * 商户评级枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017/2/9. 上午10:14:14
 */
public enum MerchantLevelEnum {

    LEVEL_A_PLUS(1,"A+级"),
    LEVEL_A(2,"A级"),
    LEVEL_B(3,"B级"),
    LEVEL_C(4,"C级"),
    LEVEL_D(5,"D级");

    private Integer code;
    private String name;

    MerchantLevelEnum(Integer code,String name){
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
        for(MerchantLevelEnum c: MerchantLevelEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }
        return null;
    }
}
