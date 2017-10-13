package com.jzfq.rms.enums;

/**
 * 商户评估点枚举
 * @author 大连桔子分期科技有限公司
 * @date 17/2/16. 上午10:14:14
 */
public enum MerchantEvaluatePointEnum {

    SHIFOUDUJIAHEZUO(0,"shiFouDuJiaHeZuo"),
    SHANGHUPEIHELIDU(1,"shangHuPeiHeLiDu"),
    PINPAI(2,"pinPai"),
    MEIYUEPINGJUNXIAOSHOUE(3,"meiYuePingJunXiaoShouE"),
    SHANGHUYINGYEMIANJI(4,"shangHuYingYeMianJi"),
    ZHUCEZIBEN(5,"zhuCeZiBen"),
    FENDIANSHULIANG(6,"fenDianShuLiang");


    private Integer code;
    private String name;

    MerchantEvaluatePointEnum(Integer code, String name){
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
        for(MerchantEvaluatePointEnum c: MerchantEvaluatePointEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }
        return null;
    }

    public static Integer getCode(String name){
        for(MerchantEvaluatePointEnum c: MerchantEvaluatePointEnum.values()){
            if(c.getName().equals(name)){
                return c.getCode();
            }
        }
        return null;
    }

}
