package com.jzfq.rms.third.support.send.impl;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.enums.SystemIdEnum;
import com.jzfq.rms.third.common.httpclient.HttpConnectionManager;
import com.jzfq.rms.third.common.utils.MD5Helper;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.support.send.AbstractSendHandler;
import net.sf.json.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/25 15:47.
 **/
public class JieanSendHandler extends AbstractSendHandler {
    private static final Logger logger = LoggerFactory.getLogger(JieanSendHandler.class);
    /**
     * 发送
     *
     * @return
     */
    @Override
    public ResponseResult send() throws Exception{
        if(StringUtils.equals(InterfaceIdEnum.THIRD_JIEAN01.getCode(),(String)this.getParams().get("interfaceId"))){
            return getJieanData01();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_JIEAN02.getCode(),(String)this.getParams().get("interfaceId"))){
            return getJieanData02();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_JIEAN03.getCode(),(String)this.getParams().get("interfaceId"))){
            return getJieanData03();
        }
        return new ResponseResult(StringUtil.getStringOfObject(this.getParams().get("traceId")),ReturnCode.NOT_EXIST_SEND_HANDLER,null);
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
     * 获取捷安数据方法 MP3
     * @return
     * @throws Exception
     */
    ResponseResult getJieanData03() throws Exception{

        Map<String,String> params = new HashMap<>();
        params.put("versionId","01");
        params.put("chrSet","UTF-8");
        params.put("custId",(String)this.getParams().get("custId"));
        params.put("transType","STD_VERI");
        params.put("busiType", SystemIdEnum.RMS_THIRD.getCode());
        params.put("merPriv","");
        params.put("retUrl","");
        params.put("jsonStr","{\"CERT_ID\":\""+this.getBizParams().get("idNumber")+"\"," +
                "\"CERT_NAME\":\""+this.getBizParams().get("name")+"\"," +
                "\"MP\":\""+this.getBizParams().get("phone")+"\",\"PROD_ID\":\"MP3\"}");
        params.put("merPriv","");
        String ordId = StringUtil.getStringOfObject(this.getBizParams().get("orderId"));
        params.put("ordId",ordId);
        logger.info("捷安三要素 traceId={} orderId={}",this.getParams().get("traceId"),ordId);
        String input = getInputStr(params);
        String url = (String)this.getParams().get("url");
        String MAC_KEY = (String)this.getParams().get("MAC_KEY");
        params.put("macStr", getMacStr(input,MAC_KEY));
        return postData(url,params);
    }

    /**
     * 在网时长
     * @return
     * @throws Exception
     */
    ResponseResult getJieanData01() throws Exception{
        Map<String,String> params = new HashMap<>();
        params.put("versionId","01");
        params.put("chrSet","UTF-8");
        params.put("custId",(String)this.getParams().get("custId"));
        params.put("transType","REPORT");
        params.put("busiType",SystemIdEnum.RMS_THIRD.getCode());
        params.put("merPriv","");
        params.put("retUrl","");
        params.put("jsonStr","{\"MP\":\""+this.getBizParams().get("phone")+"\",\"PROD_ID\":\"MPTIME\"}");
        params.put("merPriv","");
        String ordId = StringUtil.getStringOfObject(this.getBizParams().get("orderId"));
        params.put("ordId",ordId);
        logger.info("捷安在网时长 traceId={} orderId={}",this.getParams().get("traceId"),ordId);
        String input = getInputStr(params);
        String url = (String)this.getParams().get("url");
        String MAC_KEY = (String)this.getParams().get("MAC_KEY");
        params.put("macStr", getMacStr(input,MAC_KEY));
        return postData(url,params);
    }

    /**
     * 在网状态
     * @return
     * @throws Exception
     */
    ResponseResult getJieanData02() throws Exception{
        Map<String,String> params = new HashMap<>();
        params.put("versionId","01");
        params.put("chrSet","UTF-8");
        params.put("custId",(String)this.getParams().get("custId"));
        params.put("transType","REPORT");
        params.put("busiType",SystemIdEnum.RMS_THIRD.getCode());
        params.put("merPriv","");
        params.put("retUrl","");
        params.put("jsonStr","{\"MP\":\""+this.getBizParams().get("phone")+"\",\"PROD_ID\":\"MPSTAT\"}");
        params.put("merPriv","");
        String ordId = StringUtil.getStringOfObject(this.getBizParams().get("orderId"));
        params.put("ordId",ordId);
        logger.info("捷安在网状态 traceId={} orderId={}",this.getParams().get("traceId"),ordId);
        String input = getInputStr(params);
        String url = (String)this.getParams().get("url");
        String MAC_KEY = (String)this.getParams().get("MAC_KEY");
        params.put("macStr", getMacStr(input,MAC_KEY));
        return postData(url,params);
    }
    /**
     * 调用方式
     * @param apiUrl
     * @param params
     * @return
     * @throws Exception
     */
    public ResponseResult postData(String apiUrl,Map<String,String> params) throws Exception {
        logger.info("捷安请求参数："+params);
        return HttpConnectionManager.doUncheckPost(apiUrl,params);
    }

    /**
     * 参数拼串
     * @param params
     * @return
     */
    private  String getInputStr(Map<String,String> params){
        StringBuilder input = new StringBuilder("");
        input.append(getInuptString(params,"versionId"));
        input.append(getInuptString(params,"chrSet"));
        input.append(getInuptString(params,"custId"));
        input.append(getInuptString(params,"ordId"));
        input.append(getInuptString(params,"transType"));
        input.append(getInuptString(params,"busiType"));
        input.append(getInuptString(params,"merPriv"));
        input.append(getInuptString(params,"retUrl"));
        input.append(getInuptString(params,"jsonStr"));
        input.append(getInuptString(params,"merPriv"));
        return input.toString();
    }

    private String getInuptString(Map<String,String> params,String key){
        String input = params.get(key);
        if(org.apache.commons.lang.StringUtils.isBlank(input)){
            return "";
        }
        return input;
    }
    /**
     * 获取加密字符串
     * @param input
     * @return
     */
    private String getMacStr(String input,String MAC_KEY ){
        logger.info("MD5摘要前字符串:"+input+MAC_KEY);
        return MD5Helper.encrypt(input+MAC_KEY);
    }
}