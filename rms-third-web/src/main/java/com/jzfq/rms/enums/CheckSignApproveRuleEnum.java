package com.jzfq.rms.enums;

/**
 * 审查批准规则枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017年8月11日 20:04:55
 */
public enum CheckSignApproveRuleEnum {

    NOSIGN_NOAPPROVE(1,"免签免审"),
    NOSIGN_APPROVENORMAL(2,"免签不免审"),
    SIGNNORMAL_NOAPPROVE(3,"不免签免审"),
    SIGNNORMAL_APPROVENORMAL(4,"不免签不免审");

    CheckSignApproveRuleEnum(Integer code, String name){
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
        for(CheckSignApproveRuleEnum c: CheckSignApproveRuleEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }
        return null;
    }

}
