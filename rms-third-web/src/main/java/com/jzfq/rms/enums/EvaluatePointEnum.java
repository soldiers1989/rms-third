package com.jzfq.rms.enums;


/**
 * 评估点枚举
 * @author 大连桔子分期科技有限公司
 * @date  2017/1/11. 上午10:14:14
 */
public enum EvaluatePointEnum {

    XUEXIAOXINGZHI(0,"xueXiaoXingZhi"),
    XUELI(1,"xueLi"),
    RUXUESHICHANG(2,"ruXueShiChang"),
    ZAIWANGSHICHANG(3,"zaiWangShiChang"),
    GONGZUOCHENGSHI(4,"gongZuoChengShi"),
    DANWEIXINGZHI(5,"danWeiXingZhi"),
    GONGZUONIANXIAN(6,"gongZuoNianXian"),
    ZHIWU(7,"zhiWu"),
    GONGZISHOURU1(8,"gongZiShouRu1"),
    GONGZISHOURU2(9,"gongZiShouRu2"),
    GONGZISHOURU3(10,"gongZiShouRu3"),
    TONGDUNFEN(11,"tongDunFen"),
    BAIRONGFEN(12,"baiRongFen");


    private Integer code;
    private String name;

    EvaluatePointEnum(Integer code, String name){
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
        for(EvaluatePointEnum c: EvaluatePointEnum.values()){
            if(c.getCode()==code){
                return c.getName();
            }
        }
        return null;
    }

    public static Integer getCode(String name){
        for(EvaluatePointEnum c: EvaluatePointEnum.values()){
            if(c.getName().equals(name)){
                return c.getCode();
            }
        }
        return null;
    }
}
