package com.jzfq.rms.third.support.cache.redis;


import com.jzfq.rms.third.support.cache.ICountCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017年9月05日 20:04:55
 */
public class CacheWithRedis {

	private final Logger LOG = LoggerFactory.getLogger(CacheWithRedis.class);

	private static final String DICTIONARY_PREFIX = "dictionary_prefix";

	private RedisTemplate<String, String> redisTemplate;

	public RedisTemplate<String, String> getRedisTemplate() {
		return redisTemplate;
	}

	public void setRedisTemplate(RedisTemplate<String, String> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

//	@Override
//	public Map getDictionaryByCondition(Map conditionMap) throws BusinessException {
//		String key = DICTIONARY_PREFIX+"_"+conditionMap.get("productConfigID")
//                +"_"+conditionMap.get("sourceID")
//                +"_"+conditionMap.get("targetID")
//                +"_"+conditionMap.get("SendType");
//
//		Map dictionary = redisTemplate.opsForHash().entries(key);
//		return dictionary;
//
//	}
//
//	@Override
//	public void addDictionary(Dictionary record) {
//
//		String key = DICTIONARY_PREFIX+"_"+record.getProductconfigID()
//                +"_"+record.getSourceID()
//                +"_"+record.getTargetID()
//                +"_"+record.getSendtype();
//        HashOperations<String, Object, Object> hash = redisTemplate.opsForHash();
//        Map<String,Object> map = new HashMap<String,Object>();
//        map.put("warnThreshold", record.getWarnthreshold());
//        map.put("unit", record.getUnit());
//        map.put("description", record.getDescription());
//        map.put("receiverGroupID", record.getReceivergroupID());
//        hash.putAll(key, map);
//	}

}
