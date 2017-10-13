package com.jzfq.rms.enums;


/**
 * 拒绝原因枚举
 * @author 大连桔子分期科技有限公司
 * @date  2016/11/23. 上午10:14:14
 */
public enum RejectReasonEnum {

    REJECT_REASON_0(0,"欺诈类"),
    REJECT_REASON_1(1,"虚假类"),
    REJECT_REASON_2(2,"负面信息"),
    REJECT_REASON_3(3,"违反基本政策"),
    REJECT_REASON_4(4,"违反大纲要求"),
    REJECT_REASON_5(5,"非目标客户"),
    REJECT_REASON_6(6,"信息无法核实"),
    REJECT_REASON_7(7,"综合评级不达标"),
    REJECT_REASON_8(8,"本人放弃"),
    REJECT_REASON_9(9,"补件不正规"),
    REJECT_REASON_10(10,"测试单拒绝"),
    REJECT_REASON_11(11,"交易风险");

    private Integer code;
    private String name;

    RejectReasonEnum(Integer code,String name){
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
        for(RejectReasonEnum c : RejectReasonEnum.values()){
            if(c.getCode() == code){
                return c.getName();
            }
        }
        return null;
    }
}
