package com.jzfq.rms.enums;


/**
 * 借款周期枚举
 * @author 大连桔子分期科技有限公司
 * @date  2016/10/31. 上午10:14:14
 */
public enum LoanPeriodEnum {

    LOAN_PERIOD_3MONTH(0,"3月"),
    LOAN_PERIOD_6MONTH(1,"6月"),
    LOAN_PERIOD_9MONTH(2,"9月"),
    LOAN_PERIOD_12MONTH(3,"12月"),
    LOAN_PERIOD_15MONTH(4,"15月"),
    LOAN_PERIOD_18MONTH(5,"18月"),
    LOAN_PERIOD_24MONTH(6,"24月"),

    LOAN_PERIOD_5DAY(10,"5日"),
    LOAN_PERIOD_10DAY(11,"10日"),
    LOAN_PERIOD_15DAY(12,"15日"),
    LOAN_PERIOD_20DAY(13,"20日"),
    LOAN_PERIOD_25DAY(14,"25日"),
    LOAN_PERIOD_30DAY(15,"30日");

    private Integer code;
    private String name;

    LoanPeriodEnum(Integer code,String name){
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
        for(LoanPeriodEnum c: LoanPeriodEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }

        return null;
    }
    public static Integer getCode(String name){
        for(LoanPeriodEnum c: LoanPeriodEnum.values()){
            if(c.getName().equals(name)){
                return c.getCode();
            }
        }

        return null;
    }
}
