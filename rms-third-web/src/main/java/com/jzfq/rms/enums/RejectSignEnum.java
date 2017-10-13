package com.jzfq.rms.enums;

/**
 * 拒绝标识枚举
 * @author 大连桔子分期科技有限公司
 * @date  2017/8/26. 上午10:14:14
 */
public enum RejectSignEnum {
    ProfessionalInfo(1,"车辆验证拒绝"),
    CarInfo(2,"提额反欺诈拒绝");

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

    RejectSignEnum(Integer code, String name){
        this.code = code;
        this.name = name;
    }
    public static String getName(Integer code){
        for(AddQuotaTypeEnum c: AddQuotaTypeEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }

        return null;
    }
}
