package com.jzfq.rms.enums;

/**
 * 城市级别枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017年8月11日 20:04:55
 */
public enum CityLevelEnum {
    ONE("一线城市",1),
    TWO("二线城市",2),
    THREE("三线城市及以下",3);

    private String name;
    private Integer value;

    CityLevelEnum(String name,Integer value){
        this.name = name;
        this.value = value;
    }

    public static String getName(int value) {
        for (CityLevelEnum r : CityLevelEnum.values()) {
            if (r.getValue().equals(value)) {
                return r.name;
            }
        }
        return null;
    }

    public static String getName(String value) {
        for (CityLevelEnum r : CityLevelEnum.values()) {
            if (r.getValue().equals(value)) {
                return r.name;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getValue() {
        return value;
    }
    public void setValue(Integer value) {
        this.value = value;
    }

}
