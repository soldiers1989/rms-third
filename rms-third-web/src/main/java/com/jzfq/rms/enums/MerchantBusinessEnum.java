package com.jzfq.rms.enums;

/**
 * 商户主营业务枚举
 * @author 大连桔子分期科技有限公司
 * @date  2017/2/9. 上午10:14:14
 */
public enum MerchantBusinessEnum {

    AUTOMOTIVE_AFTER_MARKET(1,"汽车后市场"),
    BODY_BUILDING(2,"健身"),
    BEAUTY_SALON(3,"美容美发"),
    ELECTRIC_CAR(4,"电动车行"),
    EDUCATION(5,"教育"),
    HOUSEHOLD_ELECTRIC(6,"家用电器"),
    DIGITAL_COMPUTER(7,"数码电脑"),
    MARRIAGE_LOVE(8,"婚恋"),
    LEATHER_FUR(9,"皮草"),
    ORAL_CAVITY(10,"口腔"),
    OPTICIAN(11,"配镜"),
    RENTING_HOUSE(12,"租房"),
    OTHER(0,"其它");

    private Integer code;
    private String name;

    MerchantBusinessEnum(Integer code, String name) {
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
        for(MerchantBusinessEnum c: MerchantBusinessEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }
        return null;
    }
}
