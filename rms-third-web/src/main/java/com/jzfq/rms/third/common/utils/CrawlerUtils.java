/*
 * 文 件 名:  RongConstants.java
 * 修 改 人:  chenchong@rong360.com
 * 修改时间:  2016年2月25日
 * 修改内容:  <修改内容>
 */
package com.jzfq.rms.third.common.utils;


import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * 秘钥验证码生成类
 * @ClassName:  CrawlerUtils
 * @author 大连桔子分期科技有限公司
 * @date:   2015年12月4日 下午12:36:38
 */
public class CrawlerUtils {
    
    
    public static Set<Integer> refreshType = new HashSet<Integer>();
        
    static{
        refreshType.add(8);//图片验证码
        refreshType.add(9);//短信验证码
    }
    
    public static final String getLoginInfo = "getLoginInfo";
    
    public static final String getPicCode = "getPicCode";
    
    public static final String getMessageCode = "getMessageCode";
    
    public static final String login = "login";
    /**
     * 按key进行正序排列，之间以&相连
     * <功能描述>
     * @param params
     * @return
     */
    public static String getSortParams(Map<String, String> params) {
        SortedMap<String, String> map = new TreeMap<String, String>();
        for (String key: params.keySet()) {
            map.put(key, params.get(key));
        }
        
        Set<String> keySet = map.keySet();
        Iterator<String> iter = keySet.iterator();
        String str = "";
        while (iter.hasNext()) {
            String key = iter.next();
            String value = map.get(key);
            str += key + "=" + value + "&";
        }
        if(str.length()>0){
            str = str.substring(0, str.length()-1);
        }
        return str;
    }
    
    /**
     * 通过method获得responseKey
     * <功能描述>
     * @param method
     * @return
     */
    public static String getResponseKeyByMethod(String method){
        String responseKey = "";
        if(StringUtils.isNotBlank(method)){
            String[] splits = method.split("\\.");
            for(String item:splits){
                responseKey += item+"_";
            }
            responseKey += "response";
        }
        return responseKey;
    }
}
