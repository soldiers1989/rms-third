package com.jzfq.rms.third.client;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.httpclient.HttpConnectionManager;
import com.jzfq.rms.third.common.utils.UniformInterfaceUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/28 15:02.
 **/
public class RmsThirdService {

    private static final String STR_APPSECRET = "93dd7a6468807ade";
    private String url ="";

    public RmsThirdService(String url){
        this.url = url;
    }
    public ResponseResult send(String traceId, String systemId,String appId,String apiId,String version,
                        Map<String, Object> map) {
        Map<String,Object> params = new HashMap<>();
        params.put("traceID",traceId);
        params.put("callSystemID",systemId);
        params.put("appId",appId);
        params.put("apiId",apiId);
        params.put("v",version);
        Long timestamp=System.currentTimeMillis();
        if(StringUtils.isBlank(appId)){
            appId=null;
        }
        params.put("token", UniformInterfaceUtils.getToken(appId,apiId,STR_APPSECRET,timestamp));
        params.put("timestamp",timestamp);
        String json = JSONObject.toJSONString(map);
        params.put("params",json);
        return HttpConnectionManager.doPost(url,params);
    }
}
