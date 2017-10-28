package com.jzfq.rms.third.support.response.impl;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.support.response.AbstractResponseHandler;
import net.sf.json.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.List;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/25 15:43.
 **/
public class JieanResponseHandler extends AbstractResponseHandler {
    /**
     * 发送
     *
     * @return
     */
    @Override
    public ResponseResult getResult() throws Exception {
        Map<String, Object> commonParams = (Map<String, Object>)params.get("params");
        String interfaceId = getString(commonParams,"interfaceId");
        if(StringUtils.equals(InterfaceIdEnum.THIRD_JIEAN01.getCode(),interfaceId)){
            return handle01();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_JIEAN02.getCode(),interfaceId)){
            return handle02();
        }
        if(StringUtils.equals(InterfaceIdEnum.THIRD_JIEAN03.getCode(),interfaceId)){
            return handle03();
        }
        return (ResponseResult)params.get("response");
    }

    /**
     * 初始化
     *
     * @param params
     */
    @Override
    public void init(Map<String, Object> params) {
        this.params = params;
    }

    private ResponseResult handle01() throws Exception{
        ResponseResult response = (ResponseResult)params.get("response");
        ResponseResult result = new ResponseResult(TraceIDThreadLocal.getTraceID(), ReturnCode.REQUEST_SUCCESS,null);
        Map<String, Object> commonParams = (Map<String, Object>)params.get("params");
        String traceId = StringUtil.getString(commonParams,"traceId");
        String data = response.getData().toString();
        logger.info("捷安返回报文："+data);
        Document doc = null;
        try {
            doc = DocumentHelper.parseText(data);
        } catch (DocumentException e) {
            logger.error("taskId:"+params.get("busiType")+"-捷安 接口调用解析报文出错",e);
            throw new Exception("Request JieAn api "+params.get("transType")+"exception");
        }
        if(doc==null){
            logger.info("taskId:"+params.get("busiType")+"-捷安 接口返回为空");
            throw new Exception("Request JieAn api "+params.get("transType")+"return null");
        }
        JSONObject resultJson = new JSONObject();
        Element root = doc.getRootElement();
        List<Element> list = root.content();
        for(Element ele:list){
            String text = ele.getText();
            if(org.apache.commons.lang.StringUtils.isBlank(text)|| org.apache.commons.lang.StringUtils.equals(text,"null")){
                resultJson.put(ele.getName(), "");
                continue;
            }
            resultJson.put(ele.getName(),text);
        }
        String respCode = resultJson.getString("respCode");
        if (respCode == null ||!org.apache.commons.lang.StringUtils.equals(respCode,"071")) {
            throw new Exception("traceId【"+traceId+"】Request JieAn api MPTIME returns fail" + respCode);
        }
        result.setData(respCode);
        return result;
    }
    private ResponseResult handle02() throws Exception{
        ResponseResult response = (ResponseResult)params.get("response");
        ResponseResult result = new ResponseResult(TraceIDThreadLocal.getTraceID(), ReturnCode.REQUEST_SUCCESS,null);
        Map<String, Object> commonParams = (Map<String, Object>)params.get("params");
        String traceId = StringUtil.getString(commonParams,"traceId");
        String data = response.getData().toString();
        logger.info("捷安返回报文："+data);
        Document doc = null;
        try {
            doc = DocumentHelper.parseText(data);
        } catch (DocumentException e) {
            logger.error("taskId:"+params.get("busiType")+"-捷安 接口调用解析报文出错",e);
            throw new Exception("Request JieAn api "+params.get("transType")+"exception");
        }
        if(doc==null){
            logger.info("taskId:"+params.get("busiType")+"-捷安 接口返回为空");
            throw new Exception("Request JieAn api "+params.get("transType")+"return null");
        }
        JSONObject resultJson = new JSONObject();
        Element root = doc.getRootElement();
        List<Element> list = root.content();
        for(Element ele:list){
            String text = ele.getText();
            if(org.apache.commons.lang.StringUtils.isBlank(text)|| org.apache.commons.lang.StringUtils.equals(text,"null")){
                resultJson.put(ele.getName(), "");
                continue;
            }
            resultJson.put(ele.getName(),text);
        }

        String respCode = resultJson.getString("respCode");
        if (resultJson == null ||!org.apache.commons.lang.StringUtils.equals(respCode,"071")) {
            throw new Exception("traceId【"+traceId+"】Request JieAn api MPSTAT returns fail" + respCode);
        }
        result.setData(respCode);
        return result;
    }
    private ResponseResult handle03() throws Exception{
        ResponseResult response = (ResponseResult)params.get("response");
        ResponseResult result = new ResponseResult(TraceIDThreadLocal.getTraceID(), ReturnCode.REQUEST_SUCCESS,null);
        Map<String, Object> commonParams = (Map<String, Object>)params.get("params");
        String traceId = StringUtil.getString(commonParams,"traceId");
        String data = response.getData().toString();
        logger.info("捷安返回报文："+data);
        Document doc = null;
        try {
            doc = DocumentHelper.parseText(data);
        } catch (DocumentException e) {
            logger.error("taskId:"+params.get("busiType")+"-捷安 接口调用解析报文出错",e);
            throw new Exception("Request JieAn api "+params.get("transType")+"exception");
        }
        if(doc==null){
            logger.info("taskId:"+params.get("busiType")+"-捷安 接口返回为空");
            throw new Exception("Request JieAn api "+params.get("transType")+"return null");
        }
        JSONObject resultJson = new JSONObject();
        Element root = doc.getRootElement();
        List<Element> list = root.content();
        for(Element ele:list){
            String text = ele.getText();
            if(org.apache.commons.lang.StringUtils.isBlank(text)|| org.apache.commons.lang.StringUtils.equals(text,"null")){
                resultJson.put(ele.getName(), "");
                continue;
            }
            resultJson.put(ele.getName(),text);
        }
        String respCode = resultJson.getString("respCode");
        if (respCode == null ||(!org.apache.commons.lang.StringUtils.equals(respCode,"000")&&
                !org.apache.commons.lang.StringUtils.equals(respCode,"042")&&
                !org.apache.commons.lang.StringUtils.equals(respCode,"308")&&
                !org.apache.commons.lang.StringUtils.equals(respCode,"310")&&
                !org.apache.commons.lang.StringUtils.equals(respCode,"313"))) {
            throw new Exception("traceId【"+traceId+"】Request JieAn api MP3 returns fail code:" + respCode);
        }
        result.setData(respCode);
        return result;
    }

    private String getString(Map<String,Object> params,String key){
        Object input = params.get(key);
        if(input==null){
            return "N/A";
        }
        return input.toString().trim();
    }
}
