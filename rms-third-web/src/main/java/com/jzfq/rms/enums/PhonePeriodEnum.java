package com.jzfq.rms.enums;

/**
 * 手机使用时间枚举
 * @author 大连桔子分期科技有限公司
 * @date  2017/1/13. 上午10:14:14
 */
public enum  PhonePeriodEnum {

    BANNIAN("不到半年",1),
    YINIAN("半年到一年",2),
    LIANGNIAN("一到两年",3),
    MORE("两年以上",4);

    private String name;
    private Integer value;

    PhonePeriodEnum(String name,Integer value){
        this.name = name;
        this.value = value;
    }

    public static String getName(int value) {
        for (PhonePeriodEnum r : PhonePeriodEnum.values()) {
            if (r.getValue().equals(value)) {
                return r.name;
            }
        }
        return null;
    }

    public static String getName(String value) {
        for (PhonePeriodEnum r : PhonePeriodEnum.values()) {
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
