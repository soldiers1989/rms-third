package com.jzfq.rms.third.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/12/21 18:24.
 **/
public enum FinancialProductIdEnum {

    XYQB("1","信用钱包"),
    XJD("2","现金贷"),
    DBSH("3","单笔商户"),
    XEXJD_SLP("4","小额现金（十露盘）");

    private String code;
    private String name;

    FinancialProductIdEnum(String code, String name){
        this.code = code;
        this.name = name;
    }

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
        for(FinancialProductIdEnum c: FinancialProductIdEnum.values()){
            if(StringUtils.equals(code,c.getCode())){
                return c.getName();
            }
        }
        return null;
    }
}
