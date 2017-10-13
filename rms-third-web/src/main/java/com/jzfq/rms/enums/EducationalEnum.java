package com.jzfq.rms.enums;

/**
 * 学位枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017年4月18日 上午10:14:14
 */
public enum  EducationalEnum {

    YANJIUSHENG("研究生",0),
    BOSHI("博士研究生",1),
    SHUOSHI("硕士研究生",2),
    BENKE("大学本科",3),
    ZHUANKE("大学专科",4),
    ZHONGZHUAN("中专",5),
    JIXIAO("技校",6),
    GAOZHONG("高中",7),
    CHUZHONG("初中",8),
    XIAOXUE("小学",9),
    WENMANG("文盲或半文盲",10);

    private String name;
    private Integer value;

    EducationalEnum(String name,Integer value){
        this.name = name;
        this.value = value;
    }

    public static String getName(Byte value) {
        for (EducationalEnum r : EducationalEnum.values()) {
            if (r.getValue().equals(value.intValue())) {
                return r.name;
            }
        }
        return null;
    }

    public static String getName(String value) {
        for (EducationalEnum r : EducationalEnum.values()) {
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
