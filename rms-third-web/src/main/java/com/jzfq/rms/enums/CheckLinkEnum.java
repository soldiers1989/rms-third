package com.jzfq.rms.enums;

/**
 * 审查环节枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017年8月11日 20:04:55
 */
public enum CheckLinkEnum {

    CHECK_LINK_0(0,"下单"),
    CHECK_LINK_1(1,"认证");

    CheckLinkEnum(Integer code,String name){
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
        for(CheckLinkEnum c: CheckLinkEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }

        return null;
    }
}
