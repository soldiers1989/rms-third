package com.jzfq.rms.enums;

/**
 * 评估处理方式枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017年4月18日 上午10:14:14
 */
public enum  EvaluateHandleMethodEnum {
    SYS_REJECT(1,"系统拒绝"),
    SYS_PASS(2,"系统通过"),
    MANUAL(3,"人工审核");

    EvaluateHandleMethodEnum(Integer code,String name){
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
        for(EvaluateHandleMethodEnum c: EvaluateHandleMethodEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }
        return null;
    }

}
