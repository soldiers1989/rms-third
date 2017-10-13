package com.jzfq.rms.enums;

/**
 * 资料清单枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017年8月11日 20:04:55
 */
public enum DataListEnum {

    APPLY_PHOTO("P","申请人照片"),
    ID_CARD_POSITIVE("F","身份证正面"),
    ID_CARD_OPPOSITE("R","身份证反面"),
    WITHHOLD_BANK_CARD("W","代扣银行卡"),
    WORK_OR_STUDENT_CERTIFICATE("A","工作证明或非工薪证明"),
    SOCIAL_SECURITY_CARD("S","社保卡"),
    WAGE_CARDS_AND_WATER("C","工资卡及流水"),
    ACCOUNT_BOOK("B","户口本"),
    HOUSE_CERTIFICATE ("H","房产证"),
    INCOME_PROOF("N","收入证明"),
    CUSTOMER_AND_SALES("G","客户与销售合照"),
    PURCHASE_SMALL_TICKET("T","购货小票"),
    FACE_PHOTOS("D","人脸识别照片"),
    OTHER("Z","其他");


    DataListEnum(String code,String name){
        this.code = code;
        this.name = name;
    }

    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getName(String code){
        for(DataListEnum c: DataListEnum.values()){
            if(c.getCode().equals(code)){
                return c.getName();
            }
        }
        return null;
    }
}
