package com.jzfq.rms.enums;


/**
 * 反欺诈数据来源枚举
 * @author 大连桔子分期科技有限公司
 * @date  2017/8/15. 上午10:14:14
 */
public enum FqzDataSourceEnum {

    DATA_SOURCE_1(1,"内部"),
    DATA_SOURCE_2(2,"六行不良"),
    DATA_SOURCE_3(3,"平安M6+"),
    DATA_SOURCE_4(4,"平安欺诈"),
    DATA_SOURCE_5(5,"宜信黑名单"),
    DATA_SOURCE_6(6,"宜信灰名单"),
    DATA_SOURCE_7(7,"普惠金融"),
    DATA_SOURCE_8(8,"网抓"),
    DATA_SOURCE_9(9,"机构B"),
    DATA_SOURCE_10(10,"机构G"),
    DATA_SOURCE_11(11,"百度征信"),
    DATA_SOURCE_12(12,"亿美");

    FqzDataSourceEnum(Integer code, String name){
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
        for(FqzDataSourceEnum c: FqzDataSourceEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }
        return null;
    }
}
