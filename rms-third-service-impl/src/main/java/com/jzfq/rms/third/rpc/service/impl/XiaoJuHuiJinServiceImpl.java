package com.jzfq.rms.third.rpc.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.client.RmsThirdService;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.rpc.service.IXiaoJuHuiJinService;
import com.jzfq.rms.third.support.cache.ICache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/12/26 19:08.
 **/
public class XiaoJuHuiJinServiceImpl implements IXiaoJuHuiJinService{
    private static final Logger logger = LoggerFactory.getLogger(XiaoJuHuiJinServiceImpl.class);

    @Autowired
    ICache prefixCache;
    @Override
    public ResponseResult getTdAndBrData(Map<String, Object> requestParams) {

        try {
            String url = (String)prefixCache.readConfigByGroup("rms-third-interface-url","rms-third-interface");
            logger.info("小桔汇金获取third数据 参数:{} url:{}",requestParams,url);
            RmsThirdService rmsThirdService = new RmsThirdService(url);
            ResponseResult dto = rmsThirdService.sendAndHandleRespose((String)requestParams.get("serialNo"),"36","","1019","01", requestParams);
            return dto;
        }catch (Exception e){
            logger.error("小桔汇金获取third数据异常：{} 参数 {}",e,requestParams);
        }
        return null;
    }

    /**
     * 获取同盾百融数据
     *
     * @param requestParams
     * @return
     */
    @Override
    public ResponseResult getTdAndBrData(JSONObject requestParams) {
        try {
            String url = (String)prefixCache.readConfigByGroup("rms-third-interface-url","rms-third-interface");
            logger.info("小桔汇金获取third数据 参数:{} url:{}",requestParams,url);
            RmsThirdService rmsThirdService = new RmsThirdService(url);
            ResponseResult dto = rmsThirdService.sendAndHandleRespose(requestParams.getString("serialNo"), "36", "", "1019", "01", requestParams);
            return dto;
        } catch (Exception e) {
            logger.error("小桔汇金获取third数据异常：{} 参数 {}", e, requestParams);
        }
        return null;
    }

    /**
     * 获取同盾百融数据
     *
     * @param traceId
     * @param systemId
     * @param appId
     * @param apiId
     * @param version
     * @param requestParams @return
     */
    @Override
    public ResponseResult getTdAndBrData(String traceId, String systemId, String appId, String apiId, String version, Map<String, Object> requestParams) {
        try {
            String url = (String)prefixCache.readConfigByGroup("rms-third-interface-url","rms-third-interface");
            logger.info("小桔汇金获取third数据 参数:{} url:{}",requestParams,url);
            RmsThirdService rmsThirdService = new RmsThirdService(url);
            ResponseResult dto = rmsThirdService.sendAndHandleRespose(traceId,systemId,appId,apiId,version, requestParams);
            return dto;
        }catch (Exception e){
            logger.error("小桔汇金获取third数据异常：{} 参数 {}",e,requestParams);
        }
        return null;
    }
}
