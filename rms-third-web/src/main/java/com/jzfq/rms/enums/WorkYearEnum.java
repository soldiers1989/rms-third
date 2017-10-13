package com.jzfq.rms.enums;

/**
 * 工作年限枚举
 * @author 大连桔子分期科技有限公司
 * @date   2017/1/13. 下午4:04:55
 */
public enum  WorkYearEnum {

    ONE("工作时间1年以内",1),
    THREE("工作时间1到3年",2),
    FIVE("工作时间3到5年",3),
    TEN("工作时间5到10年",4),
    MORE("10年以上",5);

    private String name;
    private Integer value;

    WorkYearEnum(String name,Integer value){
        this.name = name;
        this.value = value;
    }

    public static String getName(Byte value) {
        for (WorkYearEnum r : WorkYearEnum.values()) {
            if (r.getValue().equals(value.intValue())) {
                return r.name;
            }
        }
        return null;
    }

    public static String getName(String value) {
        for (WorkYearEnum r : WorkYearEnum.values()) {
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
