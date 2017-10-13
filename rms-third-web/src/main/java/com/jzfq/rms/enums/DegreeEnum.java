package com.jzfq.rms.enums;

/**
 * 学历枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017年4月18日 上午10:14:14
 */
public enum DegreeEnum {

    OTHER(0, "其它"),
    MINGYUBOSHI(1, "名誉博士"),
    BOSHI(2, "博士"),
    SHUOSHI(3, "硕士"),
    XUESHI(4, "学士");

    DegreeEnum(Integer code,String name){
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
        for(DegreeEnum c: DegreeEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }
        return null;
    }
}
