/*
 * 文 件 名:  RongClient.java
 * 修 改 人:  chenchong@rong360.com
 * 修改时间:  2016年2月25日
 * 修改内容:  <修改内容>
 */
package com.jzfq.rms.third.common.httpclient;

import java.util.Map;

/**
 * 融360客户端类
 * @ClassName:  MySSLSocketFactory
 * @author 大连桔子分期科技有限公司
 * @date  2017年8月3日
 */
public interface RongClient {
    
    public String execute(Map<String, Object> params) throws Exception;
    
}
