package com.jzfq.rms.enums;

/**
 *  指标属性枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017/2/17. 上午10:14:14
 */
public enum MerchantModelIndexPropertyEnum {
    qualitative(1,"定性指标"),
    ration(2,"定量指标");

    MerchantModelIndexPropertyEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
    
    private Integer code;
    private String name;

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
        for(MerchantModelIndexPropertyEnum c: MerchantModelIndexPropertyEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }
        return null;
    }
}
