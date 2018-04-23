package com.jzfq.rms.third.common.enums;

/**
 * 批准结果枚举
 * @author 大连桔子分期科技有限公司
 * @date 2017年8月11日 20:04:55
 */
public enum CarProductiveYearEnum {

    YEAR_01(2001, "1"),
    YEAR_02(2002, "2"),
    YEAR_03(2003, "3"),
    YEAR_04(2004, "4"),
    YEAR_05(2005, "5"),
    YEAR_06(2006, "6"),
    YEAR_07(2007, "7"),
    YEAR_08(2008, "8"),
    YEAR_09(2009, "9"),
    YEAR_10(2010, "A"),
    YEAR_11(2011, "B"),
    YEAR_12(2012, "C"),
    YEAR_13(2013, "D"),
    YEAR_14(2014, "E"),
    YEAR_15(2015, "F"),
    YEAR_16(2016, "G"),
    YEAR_17(2017, "H"),
    YEAR_18(2018, "J"),
    YEAR_19(2019, "K"),
    YEAR_20(2020, "L"),
    YEAR_21(2021, "M"),
    YEAR_22(2022, "N"),
    YEAR_23(2023, "P"),
    YEAR_24(2024, "R"),
    YEAR_25(2025, "S");


    private Integer code;
    private String name;

    CarProductiveYearEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }


    public String getName() {
        return name;
    }


    public static String getName(Integer code){
        for(CarProductiveYearEnum s: CarProductiveYearEnum.values()){
            if(s.getCode()==code){
                return s.getName();
            }
        }

        return null;
    }
    public static Integer getCode(String name){
        for(CarProductiveYearEnum s: CarProductiveYearEnum.values()){
            if(name.equalsIgnoreCase(s.getName())){
                return s.getCode();
            }
        }
        return null;
    }
}
