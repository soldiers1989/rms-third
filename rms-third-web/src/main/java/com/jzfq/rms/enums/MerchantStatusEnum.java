package com.jzfq.rms.enums;

/**
 *  商户审核状态枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017/2/9. 上午10:14:14
 */
public enum MerchantStatusEnum {

    MERCHANT_STATUS_0(0,"待初审"),
    MERCHANT_STATUS_1(1,"初审中"),
    MERCHANT_STATUS_2(2,"待终审"),
    MERCHANT_STATUS_3(3,"终审中"),
    MERCHANT_STATUS_4(4,"已退回"),
    MERCHANT_STATUS_5(5,"审批通过"),
    MERCHANT_STATUS_6(6,"审批拒绝");

    private Integer code;
    private String name;

    MerchantStatusEnum(Integer code, String name) {
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
        for(MerchantStatusEnum c: MerchantStatusEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }
        return null;
    }
}
