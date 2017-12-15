package com.jzfq.rms.third.test;

import com.alibaba.fastjson.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/11/9 20:34.
 **/
public class TimeTest {
    public static void main(String[] argc){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, -180);
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sixMonthBefore = df.format(calendar.getTime());
        Integer sum = 0;
        System.out.println(sixMonthBefore);
        System.out.println(sixMonthBefore.compareTo(null));
    }
}
