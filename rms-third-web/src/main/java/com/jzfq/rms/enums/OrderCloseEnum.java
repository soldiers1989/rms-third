package com.jzfq.rms.enums;

/**
 *  闭单枚举
 * @author 大连桔子分期科技有限公司
 * @date 2016/12/26. 上午10:14:14
 */
public enum OrderCloseEnum {

    Td(1, "同盾闭单"),
    Fraud(2, "黑名单拒绝"),
    Br(3, "百融闭单"),
    Jz(4, "桔子交易拒绝"),
    Txl(5, "通讯录闭单"),
    Zmxy(6, "芝麻信用分闭单"),
    Fqz(7, "反欺诈闭单"),

    PhoneThree(8, "手机非实名闭单"),
    PhonePeriod(9, "手机在网时长闭单"),
    PhoneStatus(10, "手机在网状态闭单"),
    ThirdData(11, "获取第三方数据失败闭单"),
    Contact(12, "有效联系人闭单"),
    Car(13, "车辆验证拒绝");

    private Integer code;
    private String name;

    OrderCloseEnum(Integer code, String name) {
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
        for(OrderCloseEnum s: OrderCloseEnum.values()){
            if(s.getCode()==code){
                return s.getName();
            }
        }

        return null;
    }
}
