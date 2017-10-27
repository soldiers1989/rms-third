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
    public ResponseResult send() {
        if(StringUtils.equals(InterfaceIdEnum.THIRD_JIEAN01.getCode(),(String)this.getParams().get("interfaceId"))){
            return getJieanData01();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_JIEAN02.getCode(),(String)this.getParams().get("interfaceId"))){
            return getJieanData02();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_JIEAN03.getCode(),(String)this.getParams().get("interfaceId"))){
            return getJieanData03();
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

    ResponseResult getJieanData01(){
        return null;
    }
    ResponseResult getJieanData02(){
        return null;
    }
    ResponseResult getJieanData03(){
        return null;
    }

    public JSONObject postData(String apiUrl,Map<String,String> params) throws Exception {
        logger.info("捷安请求参数："+params);
        ResponseResult dto = HttpConnectionManager.doUncheckPost(apiUrl,params);
        String respose = dto.getData().toString();
        logger.info("捷安返回报文："+respose);
        Document doc = null;
        try {
            doc = DocumentHelper.parseText(respose);
        } catch (DocumentException e) {
            logger.error("taskId:"+params.get("busiType")+"-捷安 接口调用解析报文出错",e);
            throw new Exception("Request JieAn api "+params.get("transType")+"exception");
        }
        if(doc==null){
            logger.info("taskId:"+params.get("busiType")+"-捷安 接口返回为空");
            throw new Exception("Request JieAn api "+params.get("transType")+"return null");
        }
        JSONObject result = new JSONObject();
        Element root = doc.getRootElement();
        List<Element> list = root.content();
        for(Element ele:list){
            String text = ele.getText();
            if(org.apache.commons.lang.StringUtils.isBlank(text)|| org.apache.commons.lang.StringUtils.equals(text,"null")){
                result.put(ele.getName(), "");
                continue;
            }
            result.put(ele.getName(),text);
        }
        return result;
    }
}
