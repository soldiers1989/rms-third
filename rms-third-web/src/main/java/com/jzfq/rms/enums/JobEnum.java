package com.jzfq.rms.enums;


/**
 * 工作枚举
 * @author 大连桔子分期科技有限公司
 * @date  2017/1/13. 上午10:14:14
 */
public enum  JobEnum {

    NORMAL("一般员工",1),
    LOW_MANAGE("基层管理",2),
    MIDDLE_NAMAGE("中层管理",3),
    HIGH_MANAGE("高层管理、法人",4),
    SKILL("技术人员",5),
    OTHER("其他",6);

    private String name;
    private Integer value;

    JobEnum(String name,Integer value){
        this.name = name;
        this.value = value;
    }

    public static String getName(Byte value) {
        for (JobEnum r : JobEnum.values()) {
            if (r.getValue().equals(value.intValue())) {
                return r.name;
            }
        }
        return null;
    }

    public static String getName(Integer value) {
        for (JobEnum r : JobEnum.values()) {
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
