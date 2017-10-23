package com.jzfq.rms.third.support.send.impl;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.httpclient.HttpConnectionManager;
import com.jzfq.rms.third.common.utils.JWTUtils;
import com.jzfq.rms.third.service.impl.MonitorServiceImpl;
import com.jzfq.rms.third.support.send.AbstractSendHandler;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/22 15:54.
 **/
public class GongpingjiaHandler extends AbstractSendHandler  {
    private static final Logger logger = LoggerFactory.getLogger(GongpingjiaHandler.class);
    /**
     * 发送
     *
     * @return
     */
    @Override
    public ResponseResult send() {
        if(StringUtils.equals(InterfaceIdEnum.THIRD_GPJ_EVALATION.getCode(),(String)this.getParams().get("interfaceId"))){
            return getEvaluationData();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_GPJ_SYNCHRONIZEDATA.getCode(),(String)this.getParams().get("interfaceId"))){
            return synchronizeData();
        }
        return null;
    }
    private ResponseResult synchronizeData(){
        StringBuilder url = new StringBuilder();
        url.append(this.getParams().get("url").toString())
                .append("?page_size=")
                .append(this.getBizParams().get("size"))
                .append("&page=")
                .append(this.getBizParams().get("page"));
        String beginTime = (String)this.getBizParams().get("beginTime");
        if(StringUtils.isBlank(beginTime)){
            url.append("&start_time=")
                    .append(beginTime);
        }
        String endTime = (String)this.getBizParams().get("endTime");
        if(StringUtils.isBlank(endTime)){
            url.append("&end_time=")
                    .append(endTime);
        }
        logger.info("更新车型库调用url:{}" , url);
        return HttpConnectionManager.doGet(url.toString());
    }
    private ResponseResult getEvaluationData(){
        String vin = (String)this.getBizParams().get("vin");
        String licensePlatHeader = (String)this.getBizParams().get("licensePlatHeader");
        String key = (String)this.getParams().get("key");
        String secret = (String)this.getParams().get("secret");
        Long timeout = (Long) this.getParams().get("timeout");
        String url = this.getParams().get("url").toString();
        ResponseResult response ;
        response = JWTUtils.getData(key, secret, timeout,getEvaluationUrl(url, vin,licensePlatHeader));
        return response;
    }

    private String getEvaluationUrl(String url, String vin, String licensePlatHeader){
        String params = "?vin="+vin+"&license_plat_header="+licensePlatHeader;
        return url + params;
    }
    /**
     * 初始化
     *
     * @param params
     * @param bizParams
     */
    @Override
    public void init(Map<String, Object> params, Map<String, Object> bizParams) {
        this.setParams(params);
        this.setBizParams(bizParams);
    }
}
