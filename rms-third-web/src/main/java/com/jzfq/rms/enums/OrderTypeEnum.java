package com.jzfq.rms.enums;


/**
 * 订单类型枚举
 * @author 大连桔子分期科技有限公司
 * @date  2016/12/5. 上午10:14:14
 */
public enum OrderTypeEnum {

    QUOTA_ORDER(0,"额度订单"),
    LOAN_ORDER(1,"贷款订单");

    OrderTypeEnum(Integer code,String name){
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
        for(OrderTypeEnum c: OrderTypeEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }
        return null;
    }
}
