package com.jzfq.rms.enums;

/**
 * 批准类型枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017年8月11日 20:04:55
 */
public enum ApproveTypeEnum {

    CHUSHEN(0, "初审"),
    ZHONGSHEN(1, "终审"),
    ZISHEN(2, "资审"),
    FEEDBACK(3, "资方反馈");

    private Integer code;
    private String name;

    ApproveTypeEnum(Integer code, String name) {
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
        for(ApproveTypeEnum s: ApproveTypeEnum.values()){
            if(s.getCode()==code){
                return s.getName();
            }
        }

        return null;
    }

}
