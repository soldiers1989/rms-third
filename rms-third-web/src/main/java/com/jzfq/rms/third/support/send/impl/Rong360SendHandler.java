package com.jzfq.rms.third.support.send.impl;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.utils.RequestUtil;
import com.jzfq.rms.third.common.utils.StringUtil;
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
public class Rong360SendHandler extends AbstractSendHandler {
    /**
     * 发送
     *
     * @return
     */
    @Override
    public ResponseResult send() throws Exception{
        if(StringUtils.equals(InterfaceIdEnum.THIRD_RSLL01.getCode(),(String)this.getParams().get("interfaceId"))){
            return getRongData01();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_RSLL02.getCode(),(String)this.getParams().get("interfaceId"))){
            return getRongData02();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_RSLL03.getCode(),(String)this.getParams().get("interfaceId"))){
            return getRongData03();
        }
        return new ResponseResult(StringUtil.getStringOfObject(this.getParams().get("traceId")), ReturnCode.NOT_EXIST_SEND_HANDLER,null);
    }

    /**
     * 获取数据方法
     * @return
     * @throws Exception
     */
    ResponseResult getRongData01() throws Exception{
        String traceId = (String)this.getParams().get("traceId");
        String method = (String)this.getParams().get("method");
        String appId = (String)this.getParams().get("appRongId");
        Map<String, Object> sysParams = getSysParams(appId);
        String ret = doOpenApiRequest(method, appId, sysParams, this.getBizParams());
        return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS, ret);
    }
    /**
     * 获取数据方法
     * @return
     * @throws Exception
     */
    ResponseResult getRongData02() throws Exception{
        String traceId = (String)this.getParams().get("traceId");
        String method = (String)this.getParams().get("method");
        String appId = (String)this.getParams().get("appRongId");
        Map<String, Object> sysParams = getSysParams(appId);
        String ret = doOpenApiRequest(method, appId, sysParams, this.getBizParams());
        return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS, ret);
    }
    /**
     * 获取数据方法
     * @return
     * @throws Exception
     */
    ResponseResult getRongData03() throws Exception{
        String traceId = (String)this.getParams().get("traceId");
        String method = (String)this.getParams().get("method");
        String appId = (String)this.getParams().get("appRongId");
        Map<String, Object> sysParams = getSysParams(appId);
        String ret = doOpenApiRequest(method, appId, sysParams, this.getBizParams());
        return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS, ret);
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

    /**
     * 请求OPENAPI接口
     * @param method 必传参数，表示请求的真实接口，示例如tianji.api.tianjireport.detail等
     * @param params 系统参数，请求tianji接口不必传
     * @param bizData 业务参数
     * @return 请求接口返回的json对象
     * @throws Exception
     */
    public String doOpenApiRequest(String method,String appId, Map<String, Object> params, Map<String, Object> bizData) throws Exception {
        Boolean isTestEnv = (Boolean)this.getParams().get("isTestEnv");
        String url = (String)this.getParams().get("url");
        String privateKey = (String)this.getParams().get("privateKey");
        String result = RequestUtil.request(method, params, bizData, appId, privateKey, isTestEnv, url);
        return result;
    }

    private Map<String, Object> getSysParams(String appId, String callbackAddress) throws IOException {
        Map<String, Object> sysParams = new HashMap<>();
        // sysParams.put("key", "value"); 天机接口可以不传系统参数
        sysParams.put("merchant_id", appId); //设置merchant_id与appid一致
        sysParams.put("app_name", "test_app"); //APP名称
        sysParams.put("app_version", "1.0"); // APP版本
        sysParams.put("platform", "iOS"); //APP平台
        sysParams.put("user_id", TraceIDThreadLocal.getTraceID()); //重要，用户ID，本次抓取的唯一标识
        sysParams.put("notice_url", callbackAddress); // 后台回调地址
        return sysParams;
    }

    private Map<String, Object> getSysParams(String appId) throws IOException {
        Map<String, Object> sysParams = new HashMap<>();
        sysParams.put("merchant_id", appId); //设置merchant_id与appid一致
        sysParams.put("app_name", "test_app"); //APP名称
        sysParams.put("app_version", "1.0"); // APP版本
        sysParams.put("platform", "iOS"); //APP平台
        sysParams.put("user_id", TraceIDThreadLocal.getTraceID()); //重要，用户ID，本次抓取的唯一标识
        return sysParams;
    }
}
