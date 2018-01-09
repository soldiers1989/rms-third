package com.jzfq.rms.third.rpc.service;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/12/26 19:08.
 **/
public interface IXiaoJuHuiJinService {
    /**
     * 获取同盾百融数据
     * @param requestParams
     * @return
     */
    ResponseResult getTdAndBrData(Map<String, Object> requestParams);
    /**
     * 获取同盾百融数据
     * @param requestParams
     * @return
     */
    ResponseResult getTdAndBrData(JSONObject requestParams);
    /**
     * 获取同盾百融数据
     * @param requestParams
     * @return
     */
    ResponseResult getTdAndBrData(String traceId, String systemId,String appId,String apiId,String version,Map<String, Object> requestParams);
}
