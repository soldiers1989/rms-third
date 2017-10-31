package com.jzfq.rms.third.support.send.impl;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.httpclient.HttpConnectionManager;
import com.jzfq.rms.third.support.send.AbstractSendHandler;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/25 15:47.
 **/
public class JxlSendHandler extends AbstractSendHandler {
    private static final Logger logger = LoggerFactory.getLogger(JxlSendHandler.class);
    /**
     * 发送
     *
     * @return
     */
    @Override
    public ResponseResult send() {
        if(StringUtils.equals(InterfaceIdEnum.THIRD_JXL01.getCode(),(String)this.getParams().get("interfaceId"))){
            return getJXLData01();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_JXL02.getCode(),(String)this.getParams().get("interfaceId"))){
            return getJXLData02();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_JXL03.getCode(),(String)this.getParams().get("interfaceId"))){
            return getJXLData03();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_JXL04.getCode(),(String)this.getParams().get("interfaceId"))){
            return getJXLData04();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_JXL05.getCode(),(String)this.getParams().get("interfaceId"))){
            return getJXLData05();
        }

        return null;
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


    private ResponseResult getJXLData01(){
        String apiUrl = this.getParams().get("url").toString();
        long start=System.currentTimeMillis();
        ResponseResult response= HttpConnectionManager.doGet(apiUrl, getBizParams());
        logger.info("jxl 状态获取 执行结束, 耗时[ "+(System.currentTimeMillis()-start)+" ]ms");
        return response;
    }

    private ResponseResult getJXLData02(){
        long start=System.currentTimeMillis();
        String apiUrl = this.getParams().get("url").toString();
        ResponseResult response=HttpConnectionManager.doGet(apiUrl, getBizParams());
        logger.info("jxl 用户报告 执行结束, 耗时[ "+(System.currentTimeMillis()-start)+" ]ms");
        return response;
    }

    private ResponseResult getJXLData03(){
        long start=System.currentTimeMillis();
        String apiUrl = this.getParams().get("url").toString();
        ResponseResult response=HttpConnectionManager.doGet(apiUrl, getBizParams());
        logger.info("jxl 移动运营商数据 执行结束, 耗时[ "+(System.currentTimeMillis()-start)+" ]ms");
        return response;
    }

    private ResponseResult getJXLData04(){
        long start=System.currentTimeMillis();
        String apiUrl = this.getParams().get("url").toString();
        ResponseResult response=HttpConnectionManager.doGet(apiUrl, getBizParams());
        logger.info("jxl 电商数据 执行结束, 耗时[ "+(System.currentTimeMillis()-start)+" ]ms");
        return response;
    }

    private ResponseResult getJXLData05(){
        long start=System.currentTimeMillis();
        String apiUrl = this.getParams().get("url").toString();
        logger.info("开始获取Token...");
        ResponseResult response=HttpConnectionManager.doGet(apiUrl, getBizParams());
        logger.info("执行结束 获取Token 返回[ "+response+" ], 耗时[ "+(System.currentTimeMillis()-start)+" ]ms");
        return  response;
    }
}
