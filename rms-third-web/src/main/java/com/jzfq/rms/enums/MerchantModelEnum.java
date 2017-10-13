package com.jzfq.rms.enums;

/**
 *  营业模式枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017/2/9. 上午10:14:14
 */
public enum MerchantModelEnum {

    SELF_SUPPORT(1,"自营"),
    LEAGUE(2,"加盟"),
    OTHER(0,"其它");

    private Integer code;
    private String name;

    MerchantModelEnum(Integer code, String name) {
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
        for(MerchantModelEnum c: MerchantModelEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }
        return null;
    }
}
