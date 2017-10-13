package com.jzfq.rms.enums;


/**
 * 评估方式枚举
 * @author 大连桔子分期科技有限公司
 * @date  2017/1/12. 上午10:14:14
 */
public enum EvaluateMethodEnum {

    NEW_CUSTOMER(1,"枚举：1，新客户 给予 100%新授额额度"),
    SETTLE_BAD(2,"枚举：2，结清_较差 给予 50%新授额额度"),
    SETTLE_BETTER_1(3,"枚举：3，结清_较好 给予    历史最高下单金额"),
    SETTLE_BETTER_2(4,"枚举：4，结清_较好 给予    新授额额度"),
    SETTLE_BETTER_3(5,"枚举：5，结清_较好 给予    额度上限"),
    NO_SETTLE_WORST(6,"枚举：6，未结清_最差不予开通"),

    // 未结清-较好
    NO_SETTLE_BETTER_NEWLOAN_SURPLUSPLUSNEWLOAN(7,"枚举：7，给予  新授额额度    剩余贷款本金+新授额额度"),
    NO_SETTLE_BETTER_MAXLOANSUBSURPLUS_MAXLOAN(8,"枚举：8，给予   额度上限-剩余贷款本金    额度上限"),
    NO_SETTLE_BETTER_ALREADYREPAID_SURPLUSPLUSALREADYREPAID(9,"枚举：9，给予  已还贷款本金    剩余贷款本金+已还贷款本金"),
    NO_SETTLE_BETTER_MAXLOANSUBSURPLUS_MAXLOAN2(10,"枚举：10，给予  额度上限-剩余贷款本金     额度上限"),

    // 未结清较差
    NO_SETTLE_BAD_NEWLOAN_SURPLUSPLUSNEWLOAN(11,"枚举：11，给予  新授额额度    剩余贷款本金+新授额额度"),
    NO_SETTLE_BAD_MAXLOANSUBSURPLUS_MAXLOAN(12,"枚举：12，给予   额度上限-剩余贷款本金    额度上限"),
    NO_SETTLE_BAD_ALREADYREPAID_SURPLUSPLUSALREADYREPAID(13,"枚举：13，给予  已还贷款本金    剩余贷款本金+已还贷款本金"),
    NO_SETTLE_BAD_MAXLOANSUBSURPLUS_MAXLOAN2(14,"枚举：14，给予  额度上限-剩余贷款本金     额度上限"),

    NO_SETTLE_BETTER_1(15,"枚举：15，给予     新授额额度-剩余贷款本金    新授额额度"),
    NO_SETTLE_BETTER_2(16,"枚举：16，给予     0   剩余贷款本金"),
    NO_SETTLE_BAD_3(17,"枚举：17，给予    0   剩余贷款本金");

    EvaluateMethodEnum(Integer code,String name){
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
        for(EvaluateMethodEnum c: EvaluateMethodEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }
        return null;
    }
}
