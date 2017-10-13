package com.jzfq.rms.enums;

/**
 * 单位性质枚举
 * @author 大连桔子分期科技有限公司
 * @date  2017/1/13. 下午4:04:55
 */
public enum  UnitsNatureEnum {

    GUOYOU("国有企业",0),
    GUFENZHI("股份制",1),
    GUOYOUKONGGU("国有控股企业",2),
    WAIZI("外资企业",3),
    SANZI("三资",4),
    HEZI("合资企业",5),
    SIYING("私营企业",6),
    SHIYEDANWEI("事业单位",6),
    KEYANSHEJIDANWEI("科研设计单位",8),
    GAODENGYUANXIAO("高等院校",9),
    QITAJIAOXUEDANWEI("其他教学单位",10),
    YILIAOWEISHENGDANWEI("医疗卫生单位",11),
    GUOJIAJIGUANJIXINGZHENGDANWEI("国家机关及行政单位",12),
    BUDUI("部队",13),
    GETI("个体/自由职业者",14),
    ZHENGFU("政府",15);

    private String name;
    private Integer value;

    UnitsNatureEnum(String name,Integer value){
        this.name = name;
        this.value = value;
    }

    public static String getName(Byte value) {
        for (UnitsNatureEnum r : UnitsNatureEnum.values()) {
            if (r.getValue().equals(value.intValue())) {
                return r.name;
            }
        }
        return null;
    }

    public static String getName(String value) {
        for (UnitsNatureEnum r : UnitsNatureEnum.values()) {
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
