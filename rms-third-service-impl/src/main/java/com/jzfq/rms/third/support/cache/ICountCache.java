package com.jzfq.rms.third.support.cache;


/**
 * @author 大连桔子分期科技有限公司
 * @date 2017年9月05日 20:04:55
 */
public interface ICountCache {

    boolean isRequestOutInterface(String key, Long time);

    boolean setFailure(String key);

    String getValue(String key);

    void setValue(Object key, Object value);
}