package com.jzfq.rms.enums;

/**
 * 身份权限数据枚举
 * @author 大连桔子分期科技有限公司
 * @date   2016/12/5.. 上午10:14:14
 */
public enum IdentityAuthDataEnum {

    IDENTITY_INF("CA01","身份信息"),
    SCHOOL_INFO("CA02","学籍信息"),
    WORK_INFO("CA03","工作信息"),
    CONTACTS_INFO("CA04","联系人信息"),
    CELL_BEHAVIOR_INFO("CA05","手机运营商"),
    HUOTI_SHIBIE_INFO("CA06","活体识别");

    IdentityAuthDataEnum(String code,String name){
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
        for(IdentityAuthDataEnum c : IdentityAuthDataEnum.values()){
            if(c.getCode().equals(code)){
                return c.getName();
            }
        }
        return null;
    }
}
