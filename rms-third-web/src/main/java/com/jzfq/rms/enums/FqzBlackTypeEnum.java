package com.jzfq.rms.enums;

/**
 * 反欺诈黑名单类型枚举
 * @author 大连桔子分期科技有限公司
 * @date  2017/8/15. 上午10:14:14
 */
public enum FqzBlackTypeEnum {

    BLACK_TYPE_1(1,"伪冒申请"),
    BLACK_TYPE_2(2,"代办包装"),
    BLACK_TYPE_3(3,"组团骗贷"),
    BLACK_TYPE_4(4,"恶意套现"),
    BLACK_TYPE_5(5,"离职后申请"),
    BLACK_TYPE_6(6,"职业信息虚假"),
    BLACK_TYPE_7(7,"学籍信息虚假"),
    BLACK_TYPE_8(8,"虚假单位"),
    BLACK_TYPE_9(9,"用途风险"),
    BLACK_TYPE_10(10,"不良嗜好"),
    BLACK_TYPE_11(11,"无还款能力"),
    BLACK_TYPE_12(12,"长期拖欠"),
    BLACK_TYPE_13(13,"其他"),
    BLACK_TYPE_14(14,"内部销售"),
    BLACK_TYPE_15(15,"外部数据"),
    BLACK_TYPE_16(16,"同行号码"),
    BLACK_TYPE_17(17,"资料虚假"),
    BLACK_TYPE_18(18,"同盾规则拒绝"),
    BLACK_TYPE_19(19,"同盾设备拒绝");

    FqzBlackTypeEnum(Integer code, String name){
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
        for(FqzBlackTypeEnum c: FqzBlackTypeEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }
        return null;
    }
}
