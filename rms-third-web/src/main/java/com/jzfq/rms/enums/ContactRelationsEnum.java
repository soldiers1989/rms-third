package com.jzfq.rms.enums;

/**
 * 客户联系人关系枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017年8月11日 20:04:55
 */
public enum ContactRelationsEnum {

	RMS_CONTACT_RELATION_0(Byte.valueOf("0"), "无"),
    RMS_CONTACT_RELATION_1(Byte.valueOf("1"), "配偶"),
    RMS_CONTACT_RELATION_2(Byte.valueOf("2"), "父亲"),
    RMS_CONTACT_RELATION_3(Byte.valueOf("3"), "母亲"),
    RMS_CONTACT_RELATION_4(Byte.valueOf("4"), "子女"),
    RMS_CONTACT_RELATION_5(Byte.valueOf("5"), "兄弟姐妹"),
    RMS_CONTACT_RELATION_6(Byte.valueOf("6"), "其他亲属"),
    RMS_CONTACT_RELATION_7(Byte.valueOf("7"), "同学"),
    RMS_CONTACT_RELATION_8(Byte.valueOf("8"), "同事"),
    RMS_CONTACT_RELATION_9(Byte.valueOf("9"), "朋友"),
    RMS_CONTACT_RELATION_10(Byte.valueOf("10"), "本人"),
    RMS_CONTACT_RELATION_11(Byte.valueOf("11"), "其他");

    private Byte value;

    private String name;

    ContactRelationsEnum(Byte value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getNameByValue(int key) {
        for (ContactRelationsEnum contactRelationsEnum : ContactRelationsEnum.values()) {
            if (contactRelationsEnum.getValue() == key) {
                return contactRelationsEnum.getName();
            }
        }
        return null;
    }

    public static Byte getValueByName(String name) {
        for (ContactRelationsEnum contactRelationsEnum : ContactRelationsEnum.values()) {
            if (contactRelationsEnum.getName().equals(name)) {
                return contactRelationsEnum.getValue();
            }
        }
        return 0;
    }

    public Byte getValue() {
        return value;
    }

    public void setValue(Byte value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
