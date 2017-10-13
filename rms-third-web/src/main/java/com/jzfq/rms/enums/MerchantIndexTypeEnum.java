package com.jzfq.rms.enums;

/**
 * 指标类型枚举
 * @author 大连桔子分期科技有限公司
 * @date 17/2/16. 上午10:14:14
 */
public enum MerchantIndexTypeEnum {

    BUSINESS_INFORMATION(1,"经营信息"),
    FINANCIAL_INFORMATION(2,"财务信息");

    MerchantIndexTypeEnum(Integer code, String name) {
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
        for(MerchantIndexTypeEnum c: MerchantIndexTypeEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }
        return null;
    }
}
