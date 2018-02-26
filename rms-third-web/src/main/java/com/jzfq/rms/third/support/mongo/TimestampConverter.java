package com.jzfq.rms.third.support.mongo;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2018/2/25 17:30.
 **/
@ReadingConverter
public class TimestampConverter  implements Converter<Date, Timestamp> {

    @Override
    public Timestamp convert(Date date) {
        if(date != null){
            return new Timestamp(date.getTime());
        }
        return null;
    }

}
