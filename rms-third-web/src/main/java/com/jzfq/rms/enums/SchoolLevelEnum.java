package com.jzfq.rms.enums;

/**
 * 学校级别枚举
 * @author 大连桔子分期科技有限公司
 * @date   2017/1/13. 上午10:14:14
 */
public enum  SchoolLevelEnum {

    JIUBAWU("985院校",1),
    ERYIYI("211院校",2),
    BENKE("普通本科院校",3),
    ZHUANKE("专科院校",4);

    private String name;
    private Integer value;

    SchoolLevelEnum(String name,Integer value){
        this.name = name;
        this.value = value;
    }

    public static String getName(Byte value) {
        for (SchoolLevelEnum r : SchoolLevelEnum.values()) {
            if (r.getValue().equals(value.intValue())) {
                return r.name;
            }
        }
        return null;
    }

    public static String getName(Integer value) {
        for (SchoolLevelEnum r : SchoolLevelEnum.values()) {
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
