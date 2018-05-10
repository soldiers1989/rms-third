package com.jzfq.rms.third.common.utils;



import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 * @author 大连桔子分期科技有限公司
 * @date 2017年9月05日 20:04:55
 */
public abstract class DateUtils {

    public static final String DATE_FORMAT_SHORT = "yyyy-MM-dd";
    public static final String DATE_FORMAT_LONG = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_FORMAT_LONG_NATIVE = "yyyy年MM月dd日HH时mm分ss秒";
    public static final String defaultDayFormat = "yyyy-MM-dd";

    public static final String DATE_FORMAT_SHORT_HH = "yyyy-MM-dd HH";


    public static Date now() {
        return new Date();
    }

    public static Long nowTime() {
        return now().getTime();
    }

    public static Date daysBefore(Date time, int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time.getTime());

        calendar.add(Calendar.DATE, -1 * days);

        return calendar.getTime();
    }

    public static String date2str(Date date, DateFormat dateFormat) {
        if (date == null)
            return null;

        return dateFormat.format(date);
    }

    public static String date2str(Date date, String format) {
        if (date == null)
            return null;

        return new SimpleDateFormat(format).format(date);
    }

    public static Date str2Date(String input, DateFormat format) {
        try {
            return input == null ? null : format.parse(input);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static Date str2Date(String input, String format) {
        try {
            return input == null ? null : new SimpleDateFormat(format).parse(input);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }


    public static Date daysAfter(int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, days);

        return calendar.getTime();
    }

    public static Date daysAfter(Date time, int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time.getTime());

        calendar.add(Calendar.DATE, days);

        return calendar.getTime();
    }

    public static Date today() {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public static Date hourAfter(Date time, int count) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time.getTime());

        calendar.add(Calendar.HOUR, count);

        return calendar.getTime();
    }
    public static Date getMinute(Date time, int count) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time.getTime());

        calendar.add(Calendar.MINUTE, count);

        return calendar.getTime();
    }

    /**
     * 将时间戳转换为时间
     */
    public static String stampToDate(String s){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Long lt = Long.parseLong(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }
    /**
     * 将时间转换为时间戳
     */
    public static String dateToStamp(String s) throws ParseException{
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(s);
        long ts = date.getTime();
        res = String.valueOf(ts);
        return res;
    }

    /**
     * 校验时间格式
     */
    public final static Timestamp stringToTsDate(String time) {
        SimpleDateFormat sf = new SimpleDateFormat(DateUtils.DATE_FORMAT_LONG);
        Timestamp ts = null;
        try {
            ts = new Timestamp(sf.parse(time).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return ts;
    }


    /**
     * 返回上一天的整点信息
     *
     * @param date
     * @return 2018-5-8 00:00:00
     */
    public static Date lastDayWholePointDate(Date date) {

        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(date);
        if ((gc.get(gc.HOUR_OF_DAY) == 0) && (gc.get(gc.MINUTE) == 0)
                && (gc.get(gc.SECOND) == 0)) {
            return new Date(date.getTime() - (24 * 60 * 60 * 1000));
        } else {
            Date date2 = new Date(date.getTime() - gc.get(gc.HOUR_OF_DAY) * 60 * 60
                    * 1000 - gc.get(gc.MINUTE) * 60 * 1000 - gc.get(gc.SECOND)
                    * 1000 - 24 * 60 * 60 * 1000);
            return date2;
        }

    }



    public static void main(String[] args) {
//        System.out.println(date2str(DateUtils.hourAfter(now(),1),DateConstants.REMINDER_YMDTIME_FORMAT));
    }
}
