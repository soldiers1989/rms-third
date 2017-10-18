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
        HashOperations<String, Object, Object> hash = redisTemplate.opsForHash();
        Object ob = hash.get(key,"isExcuting");
        if (ob==null) {
            hash.put(key,"isExcuting", "true");
            return true;
        }
        if(StringUtils.equals(ob.toString(),"true")){
            return false;
        }
        hash.put(key,"isExcuting", "true");
        return true;
	}

    @Override
    public Object getValue(String key) {
        HashOperations<String, Object, Object> hash = redisTemplate.opsForHash();
        return hash.get(key,"isExcuting");
    }
}
