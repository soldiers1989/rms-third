package com.jzfq.rms.enums;

/**
 * 汽车类型枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017年8月11日 20:04:55
 */
public enum CarTypeEnum {

    CAR_TYPE_01(1,"大型汽车"),
    CAR_TYPE_02(2,"小型汽车"),
    CAR_TYPE_03(3,"使馆汽车"),
    CAR_TYPE_05(5,"境外汽车"),
    CAR_TYPE_16(16,"教练车");

    private Integer code;
    private String name;

    CarTypeEnum(Integer code,String name){
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
        for(CarTypeEnum c: CarTypeEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }
        return null;
    }
}
