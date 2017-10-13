package com.jzfq.rms.enums;

/**
 * 批准结果枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017年8月11日 20:04:55
 */
public enum ApproveResultEnum {

    HEZHUN(0, "核准"),
    JUJUE(1, "拒绝"),
    HUITUI(2, "回退");

    private Integer code;
    private String name;

    ApproveResultEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

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
        for(ApproveResultEnum s: ApproveResultEnum.values()){
            if(s.getCode()==code){
                return s.getName();
            }
        }

        return null;
    }
}
