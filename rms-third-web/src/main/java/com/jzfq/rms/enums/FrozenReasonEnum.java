package com.jzfq.rms.enums;

/**
 * Created by wangjinbo on 2017/7/4.
 */
public enum FrozenReasonEnum {
    FROZEN_REASON_ZERO(0,"涉嫌群体套现"),
    FROZEN_REASON_ONE(1,"商户协助套现"),
    FROZEN_REASON_TWO(2,"欺诈率过高"),
    FROZEN_REASON_THREE(3,"逾期率过高"),
    FROZEN_REASON_FOUR(4,"虚假率过高"),
    FROZEN_REASON_FIVE(5,"出单量低"),
    FROZEN_REASON_SIX(6,"商品虚假"),
    FROZEN_REASON_SEVEN(7,"降级未整改"),
    FROZEN_REASON_EIGHT(8,"综合风险高"),
    FROZEN_REASON_NINE(9,"合同到期未续签"),
    FROZEN_REASON_TEN(10,"业务要求下架"),
    FROZEN_REASON_ELEVEN(11,"其他非合规行为");

    private Integer code;
    private String name;

    FrozenReasonEnum(Integer code, String name) {
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
        for(MerchantBusinessEnum c: MerchantBusinessEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }
        return null;
    }
}
