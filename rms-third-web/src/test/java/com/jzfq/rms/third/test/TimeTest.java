package com.jzfq.rms.third.test;

import java.util.Calendar;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/11/9 20:34.
 **/
public class TimeTest {
    public static void main(String[] argc){
        Calendar cal = Calendar.getInstance();//使用默认时区和语言环境获得一个日历。
        cal.add(Calendar.DAY_OF_MONTH, -90);//取当前日期的前一天.
        System.out.println(cal.getTime());
    }
}
