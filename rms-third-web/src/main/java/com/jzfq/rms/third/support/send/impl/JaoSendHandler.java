package com.jzfq.rms.third.support.send.impl;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.httpclient.HttpConnectionManager;
import com.jzfq.rms.third.common.utils.RequestUtil;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.common.utils.jao.Client;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.support.send.AbstractSendHandler;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/25 15:47.
 **/
public class JaoSendHandler extends AbstractSendHandler {
    /**
     * 发送
     *
     * @return
     */
    @Override
    public ResponseResult send() throws Exception{
        return getJaoData();
    }

    /**
     * 获取数据方法
     * @return
     * @throws Exception
     */
    ResponseResult getJaoData() throws Exception{
        String url = (String)this.getBizParams().get("url");
        String traceId = (String)this.getBizParams().get("traceId");
        String sys = (String)this.getBizParams().get("sys");
        String result = Client.getInstance().getData(url,this.getParams(),this.getBizParams(),sys);
        return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS, result);
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
