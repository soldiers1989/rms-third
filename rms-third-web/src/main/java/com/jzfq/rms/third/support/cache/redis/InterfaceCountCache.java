package com.jzfq.rms.third.support.cache.redis;

import com.jzfq.rms.third.support.cache.ICountCache;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/17 19:17.
 **/
@Component("interfaceCountCache")
public class InterfaceCountCache implements ICountCache {

    private final Logger LOG = LoggerFactory.getLogger(InterfaceCountCache.class);

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Override
	public synchronized boolean isRequestOutInterface(String key, Long outTime) {

        long count = redisTemplate.opsForValue().increment(key, 1);
        if (count == 1) {
            redisTemplate.expire(key, outTime, TimeUnit.SECONDS);
            return true;
        }
        return false;
	}
    @Override
    public boolean setFailure(String key) {
        return redisTemplate.expire(key, 0, TimeUnit.SECONDS);
    }

    @Override
    public String getValue(String key) {
        HashOperations<String,Object,Object> operateions = redisTemplate.opsForHash();
        if(operateions.get("rms-third",key)==null){
            return "false";
        }
        return operateions.get("rms-third",key).toString();
    }

    @Override
    public void setValue(Object key,Object value) {
        HashOperations<String,Object,Object> operateions = redisTemplate.opsForHash();
        operateions.put("rms-third",key,value);
    }


}
