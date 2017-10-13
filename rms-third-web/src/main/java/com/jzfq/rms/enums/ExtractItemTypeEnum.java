package com.jzfq.rms.enums;


/**
 * 提取条款类型枚举
 * @author 大连桔子分期科技有限公司
 * @date  2017/4/5. 上午10:14:14
 */
public enum ExtractItemTypeEnum {

    EXTRACT_ITEM_NO_1(1,"聚信立手机运营商"),
    EXTRACT_ITEM_NO_2(2,"聚信立电商信息"),
    EXTRACT_ITEM_NO_3(3,"芝麻信用"),
    EXTRACT_ITEM_NO_4(4,"补充资料认证"),
    EXTRACT_ITEM_NO_5(5,"淘宝认证"),
    EXTRACT_ITEM_NO_6(6,"京东认证"),
    EXTRACT_ITEM_NO_7(7,"支付宝认证"),
    EXTRACT_ITEM_NO_8(8,"公积金认证"),
    EXTRACT_ITEM_NO_9(9,"社保认证");

    private Integer code;
    private String name;

    ExtractItemTypeEnum(Integer code, String name) {
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
        for(ExtractItemTypeEnum c: ExtractItemTypeEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }
        return null;
    }
}
