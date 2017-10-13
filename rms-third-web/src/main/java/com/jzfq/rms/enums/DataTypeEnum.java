package com.jzfq.rms.enums;

/**
 * 资料类型枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017年8月11日 20:04:55
 */
public enum DataTypeEnum {

    LOAN_DATA(0,"贷款资料"),
    INTERVIEW_DATA(1,"面签资料");

    DataTypeEnum(Integer code,String name){
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
        for(DataTypeEnum c: DataTypeEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }
        return null;
    }
}
