package com.jzfq.rms.enums;


/**
 * 反欺诈设备类型枚举
 * @author 大连桔子分期科技有限公司
 * @date  2017/8/28
 */
public enum FqzDeviceEnum {

    DEVICE_TYPE_36(36,"注册设备历史注册不同"),
    DEVICE_TYPE_37(37,"注册设备历史登录不同"),
    DEVICE_TYPE_38(38,"登录设备历史注册不同"),
    DEVICE_TYPE_39(39,"登录设备历史登录不同");

    FqzDeviceEnum(Integer code, String name){
        this.code = code;
        this.name = name;
    }

    private Integer code;
    private String name;

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
        for(FqzDeviceEnum c: FqzDeviceEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }
        return null;
    }
}
