package com.jzfq.rms.enums;

/**
 * 渠道来源枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017年8月11日 20:04:55
 */

public enum ApplyChannelEnum {
    APP("APP","APP移动端"),
    IOS("IOS","IOS移动端"),
    PC("PC","PC端"),
    H5("手机H5","HTML5页面"),
    ANDROID("安卓","安卓"),
    ANDROID_ENGLISH("Android","Android");

    ApplyChannelEnum(String code,String name){
        this.code = code;
        this.name = name;
    }

    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getName(String code){
        for(ApplyChannelEnum c : ApplyChannelEnum.values()){
            if(c.getCode().equalsIgnoreCase(code)){
                return c.getName();
            }
        }
        return null;
    }
}
