package com.jzfq.rms.enums;

/**
 * 审查标准枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017年8月11日 20:04:55
 */
public enum CheckStandardEnum {

    /**
     * 非工薪
     */
    CHECK_STANDARD_0(0,"校验学校所在区域开通业务"),
    CHECK_STANDARD_1(1,"校验学校开通业务"),
    CHECK_STANDARD_2(2,"校验收货地址所在区域开通业务"),
    CHECK_STANDARD_3(3,"校验寝室所在区域开通业务"),
    CHECK_STANDARD_4(4,"校验收货地址区域与学校所在区域一致"),
    CHECK_STANDARD_5(5,"校验收货地址区域与寝室所在区域一致"),
    /**
     * 工薪
     */
    CHECK_STANDARD_6(6,"校验单位地址所在区域开通业务"),
    CHECK_STANDARD_7(7,"校验居住地址所在区域开通业务"),
    CHECK_STANDARD_8(8,"校验收货地址所在区域开通业务"),
    CHECK_STANDARD_9(9,"校验收货地址区域与居住地址区域一致"),
    CHECK_STANDARD_10(10,"校验收货地址区域与单位地址区域一致");

    CheckStandardEnum(Integer code,String name){
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
        for(CheckStandardEnum c: CheckStandardEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }

        return null;
    }
}
