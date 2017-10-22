package com.jzfq.rms.third.support.send.impl;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.utils.JWTUtils;
import com.jzfq.rms.third.support.send.AbstractSendHandler;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/22 15:54.
 **/
public class GongpingjiaHandler extends AbstractSendHandler  {
    /**
     * 发送
     *
     * @return
     */
    @Override
    public ResponseResult send() {
        String vin = (String)this.getBizParams().get("vin");
        String licensePlatHeader = (String)this.getBizParams().get("licensePlatHeader");

        String key = (String)this.getParams().get("key");
        String secret = (String)this.getParams().get("secret");
        Long timeout = (Long) this.getParams().get("timeout");

        String url = this.getParams().get("url").toString();
        ResponseResult response ;
        try{
            response = JWTUtils.getData(key, secret, timeout,url);
        }catch (Exception e){
            return null;
        }
        return response;
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
