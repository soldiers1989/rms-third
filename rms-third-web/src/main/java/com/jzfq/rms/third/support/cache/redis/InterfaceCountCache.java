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

    private final Logger LOG = LoggerFactory.getLogger(CacheWithRedis.class);

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Override
	public synchronized boolean isRequestOutInterface(String key) {

        long count = redisTemplate.opsForValue().increment(key, 1);
        if (count == 1) {
            redisTemplate.expire(key, getTimout(key), TimeUnit.SECONDS);
            return true;
        }
        return false;
	}
	private Long getTimout(String key){
        return 60l;
    }
    @Override
    public boolean setFailure(String key) {
        return redisTemplate.expire(key, 0, TimeUnit.SECONDS);
    }


}
