package com.jzfq.rms.third.support.response.impl;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.CarCheckEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.utils.Base64;
import com.jzfq.rms.third.common.utils.CompressStringUtil;
import com.jzfq.rms.third.support.response.AbstractResponseHandler;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/25 15:38.
 **/
public class PyResponseHandler extends AbstractResponseHandler {
    private static final Logger logger = LoggerFactory.getLogger(PyResponseHandler.class);
    /**
     * 发送
     *
     * @return
     */
    @Override
    public ResponseResult getResult() {
        Map<String ,Object> commonParams = (Map<String ,Object> )this.params.get("params");
        String traceId = (String)commonParams.get("traceId");
        ResponseResult response = (ResponseResult)params.get("response");
        if(response == null){
            return new ResponseResult(traceId, ReturnCode.ERROR_RESPONSE_NULL,null);
        }
        Object[] results = (Object[])response.getData();
        if(results == null||results.length==0){
            return new ResponseResult(traceId, ReturnCode.ERROR_THIRD_RRSPONSE_NULL,null);
        }
        JSONObject data = parseXml2Json(results[0].toString());
        logger.info("traceId=["+traceId+"]请求结果【" + Arrays.toString(results) + "】");
        logger.info("traceId=["+traceId+"]解析后的数据：" + data);
        //返回状态为1是正常报文，2为发生异常
        ResponseResult result =  null;
        if (data.getIntValue("status")!= 1) {
            //非1情况返回上游  code为200  data为3 无法核查
            result = new ResponseResult(traceId,ReturnCode.REQUEST_SUCCESS, CarCheckEnum.UNCHECK.getCode());
            result.setMsg(data.getString("errorCode")+data.getString("errorMessage"));
            return result;
        }
        String returnValueStr = data.getString("returnValue");
        Base64 base64 = new Base64();
        byte [] returnValue = base64.decode(returnValueStr);
        String xml = new CompressStringUtil().decompress(returnValue);
        logger.info("traceId=["+traceId+"]响应报文 result ==>" + xml);
        data = parseXml2Json(xml);
        logger.info("鹏元数据 traceId=[" + traceId + "]\r\n data:" + data);
        JSONObject checkInfo = data.getJSONObject("carCheckInfo");
        if (checkInfo.containsKey("errorCode")) {
            result = new ResponseResult(traceId,ReturnCode.ERROR_THIRD_RESPONSE,data);
            result.setMsg(checkInfo.getString("errorCode")
                    + ":" + checkInfo.getString("errorMessage"));
            return result;
        }
        return new ResponseResult(traceId,ReturnCode.REQUEST_SUCCESS,data);

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

    private JSONObject parseXml2Json(String xml) {
        JSONObject data = new JSONObject();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(new ByteArrayInputStream(xml.getBytes("GBK")));
            Node node = document.getFirstChild();
            String nodeName = node.getNodeName();
            if ("cisReports".equals(nodeName)) {
                //1、个人车辆信息核查
                JSONObject carCheckInfo = listNode(document, "carCheckInfo");
                String treatResult = getTreatResult(document);
                if(StringUtils.isNotBlank(treatResult)&&!StringUtils.equals(treatResult, "1")){
                    JSONObject arr = new JSONObject();
                    arr.put("errorCode", treatResult);
                    data.put("carCheckInfo", arr);
                }else if(carCheckInfo.size() == 0){
                    JSONObject arr = new JSONObject();
                    arr.put("errorCode", "100001");
                    data.put("carCheckInfo", arr);
                }else{
                    data.put("carCheckInfo", carCheckInfo);
                }
            } else {
                data = listNode(document,"result");
            }
            logger.info(data.toJSONString());
        } catch (Exception e) {
            logger.error("获取鹏元信息异常：",e);
        }
        return data;
    }

    /**
     * 获取返回结果 代码
     * @param document
     * @return
     */
    private String getTreatResult(Document document) {
        NodeList list = document.getElementsByTagName("cisReport");
        if(list != null && list.getLength() > 0){
            Node temp = list.item(0);
            NodeList cisReport = temp.getChildNodes();
            for(int i=0;i<cisReport.getLength();i++) {
                Node node = cisReport.item(i);
                if(!StringUtils.equals(node.getNodeName(),"carCheckInfo")){
                    continue;
                }
                if (node.getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }
                if (node.hasAttributes()) { //判断该节点是否有属性
                    NamedNodeMap nnmap = node.getAttributes();//获取属性
                    Node treatResult = nnmap.getNamedItem("treatResult");
                    return treatResult.getNodeValue();
                }
            }
        }
        return "";
    }
    private JSONObject listNode(Document document, String node) {
        NodeList list = document.getElementsByTagName(node);
        JSONObject json = new JSONObject();
        if ("carStatusInfo".equals(node) || "result".equals(node)) {
            for(int i=0;i<list.getLength();i++) {
                NodeList items = list.item(i).getChildNodes();
                for(int k=0;k<items.getLength();k++) {
                    short nodeType = items.item(k).getNodeType();
                    if (nodeType == Node.ELEMENT_NODE) {
                        String nodeName = items.item(k).getNodeName();
                        String nodeValue = items.item(k).getTextContent();
                        json.put(nodeName, nodeValue);
                    }
                }
            }
            return json;
        }
        for(int i=0;i<list.getLength();i++) {
            NodeList items = list.item(i).getChildNodes();
            for(int j=0;j<items.getLength();j++) {
                NodeList childs = items.item(j).getChildNodes();
                for(int k=0;k<childs.getLength();k++) {
                    short nodeType = childs.item(k).getNodeType();
                    if (nodeType == Node.ELEMENT_NODE) {
                        String nodeName = childs.item(k).getNodeName();
                        String nodeValue = childs.item(k).getTextContent();
                        json.put(nodeName, nodeValue);
                    }
                }
            }
        }
        return json;
    }
}
