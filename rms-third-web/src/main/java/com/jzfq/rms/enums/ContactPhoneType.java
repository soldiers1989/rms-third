package com.jzfq.rms.enums;

/**
 * 客户联系人关系电话类型枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017年8月11日 20:04:55
 */
public enum ContactPhoneType {

    RMS_CONTACT_PHONE_TYPE_0(Byte.valueOf("0"), "家庭固话"),
    RMS_CONTACT_PHONE_TYPE_1(Byte.valueOf("1"), "单位固话"),
    RMS_CONTACT_PHONE_TYPE_2(Byte.valueOf("2"), "手机");

    private Byte value;

    private String name;

    ContactPhoneType(Byte value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getNameByValue(int key) {
        for (ContactPhoneType contactRelations : ContactPhoneType.values()) {
            if (contactRelations.getValue() == key) {
                return contactRelations.getName();
            }
        }
        return null;
    }

    public static Byte getValueByName(String name) {
        for (ContactPhoneType contactRelations : ContactPhoneType.values()) {
            if (contactRelations.getName().equals(name)) {
                return contactRelations.getValue();
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
