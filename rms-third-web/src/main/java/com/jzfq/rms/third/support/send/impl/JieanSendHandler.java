package com.jzfq.rms.third.support.send.impl;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.httpclient.HttpConnectionManager;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            return getJieanData01();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_JIEAN03.getCode(),(String)this.getParams().get("interfaceId"))){
            return getJieanData01();
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

    ResponseResult getJieanData01() throws Exception{
        Map<String ,String> params = (Map<String ,String>)this.getParams().get("params");
        String input = getInputStr(params);
        String url = (String)this.getParams().get("url");
        String MAC_KEY = (String)this.getParams().get("MAC_KEY");
        params.put("macStr", getMacStr(input,MAC_KEY));
        return postData(url,params);
    }

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
class MD5Helper {
    private static final int MD5_LENGTH = 32;

    public static String encrypt(String str) {
        String sRes;
        try {
            MessageDigest alg = MessageDigest.getInstance("MD5");
            alg.update(str.getBytes("UTF-8"));
            byte[] digesta = alg.digest();
            sRes = byteToHex(digesta).toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5散列出错，不支持MD5算法！", e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("MD5散列出错，不支持UTF-8字符集！", e);
        }
        return sRes;
    }

    public static String byteToHex(byte[] bytes) {
        if (bytes == null) {
            return null;
        }
        StringBuilder hex = new StringBuilder(MD5_LENGTH);
        String temp;
        for (int i = 0; i < bytes.length; i++) {
            temp = Integer.toHexString(bytes[i] & 0XFF);
            if (1 == temp.length()) {
                hex.append('0');
            }
            hex.append(temp);
        }
        return hex.toString();
    }
}