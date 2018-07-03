package com.jzfq.rms.third.web.action.util.cleanParse;


import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.domain.TThirdPengyuanData;
import com.jzfq.rms.third.common.enums.CarCheckEnum;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.util.*;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2018/6/22 18:16.
 **/
public class PengYuanParser {


    private static Logger logger = LoggerFactory.getLogger(PengYuanParser.class);

    /*
     * 实时清洗
     * */

    public static TThirdPengyuanData getData(String xml, String orderNo, String traceId) {
        JSONObject json = getJsonString(xml);
        TThirdPengyuanData data = new TThirdPengyuanData();

        data.setcId(UUID.randomUUID().toString().replaceAll("-", ""));

        data.setcOrderNo(orderNo);
        data.setcTraceId(traceId);
        //cisReports 信息
        JSONObject cisReports = json.getJSONObject("cisReports");
        data.setcBatNo(cisReports.getString("batNo"));
        data.setcQueryReasonId(cisReports.getString("queryUserID"));

        //cisReport 信息
        JSONObject cisReport = json.getJSONObject("cisReports");
        data.setcQueryReasonId(cisReport.getString("queryReasonID"));


        //queryConditions 信息
        JSONObject queryConditions = json.getJSONObject("queryConditions");
        data.setcName(queryConditions.getString("name"));
        data.setcIdCard(queryConditions.getString("documentNo"));
        data.setcLicenseNo(queryConditions.getString("licenseNo"));
        data.setcCarType(queryConditions.getString("carType"));

        //carCheckInfo 信息
        JSONObject carCheckInfo = json.getJSONObject("carCheckInfo");
        data.setcSubreportIds(carCheckInfo.getString("subReportType"));
        data.setcTreatEsult(carCheckInfo.getString("treatResult"));
        data.setcErrorMessage(carCheckInfo.getString("errorMessage"));
        data.setcTreatErrorcode(carCheckInfo.getString("errorCode"));


        data.setcDocumentNoCheckResult(carCheckInfo.getString("documentNoCheckResult"));
        data.setcLicenseNoCheckResult(carCheckInfo.getString("licenseNoCheckResult"));
        data.setcNameCheckResult(carCheckInfo.getString("nameCheckResult"));
        data.setcCarTypeCheckResult(carCheckInfo.getString("carTypeCheckResult"));

        data.setcCreattime(new Date());
        return data;
    }


    /*
     * 历史清洗
     * */

    public static TThirdPengyuanData getHistrData(JSONObject json, String idCard, String orderNo, String traceId) {
        TThirdPengyuanData data = new TThirdPengyuanData();
        data.setcId(UUID.randomUUID().toString().replaceAll("-", ""));

        data.setcOrderNo(orderNo);


        //cisReports 信息
        data.setcBatNo("");
        data.setcQueryReasonId("");
        data.setcTraceId(traceId);

        //cisReport 信息
        data.setcQueryReasonId("");


        //queryConditions 信息
        data.setcName("");
        data.setcIdCard(idCard);
        data.setcLicenseNo("");
        data.setcCarType("");

        //carCheckInfo 信息
        data.setcSubreportIds("");
        data.setcTreatEsult("");
        data.setcErrorMessage("");
        data.setcTreatErrorcode("");

        JSONObject carCheckInfo = json.getJSONObject("carCheckInfo");
        data.setcDocumentNoCheckResult(carCheckInfo.getString("documentNoCheckResult"));
        data.setcLicenseNoCheckResult(carCheckInfo.getString("licenseNoCheckResult"));
        data.setcNameCheckResult(carCheckInfo.getString("nameCheckResult"));
        data.setcCarTypeCheckResult(carCheckInfo.getString("carTypeCheckResult"));

        data.setcCreattime(new Date());
        return data;
    }


    /**
     * 获取鹏元json各节点数据 代码
     *
     * @param xml
     * @return
     */

    public static JSONObject getJsonString(String xml) {
        JSONObject data = new JSONObject();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            JSONObject carCheckInfo = new JSONObject();
            DocumentBuilder db = dbf.newDocumentBuilder();
            org.w3c.dom.Document document = db.parse(new ByteArrayInputStream(xml.getBytes("GBK")));
            Node node = document.getFirstChild();
            String nodeName = node.getNodeName();
            if ("cisReports".equals(nodeName)) {
                //1、个人车辆信息核查 信息
                carCheckInfo = listNode(document, "carCheckInfo");
                String treatResult = getTreatResult(document);
                if (StringUtils.isNotBlank(treatResult) && !StringUtils.equals(treatResult, "1")) {
                    JSONObject arr = new JSONObject();
                    arr.put("errorCode", treatResult);
                    data.put("carCheckInfo", arr);
                } else if (carCheckInfo.size() == 0) {
                    JSONObject arr = new JSONObject();
                    arr.put("errorCode", "100001");
                    data.put("carCheckInfo", arr);
                } else {
                    data.put("carCheckInfo", carCheckInfo);
                }
                JSONObject jsonCisReports = listNode(document, "cisReports");//根节点cisReports  只获取属性
                JSONObject jsonQueryConditions = listNode(document, "queryConditions");//二级节点下的一级节点queryConditions
                JSONObject jsonCisReport = listNode(document, "cisReport");
                logger.info("jsonCisReports:" + jsonCisReports.toJSONString() + "\n" + "carCheckInfo :" + carCheckInfo.toJSONString()
                        + "\n" + "jsonQueryConditions:" + jsonQueryConditions.toJSONString() + "\n" + "cisReport：" + jsonCisReport.toJSONString());
                data.put("cisReports", jsonCisReports);//根节点属性信息
                data.put("queryConditions", jsonQueryConditions);// queryConditions 元素信息
                data.put("cisReport", jsonCisReport);//cisReport 信息
            } else {
                data = listNode(document, "result");
            }
        } catch (Exception e) {
            logger.error("获取鹏元信息异常：", e);
        }
        return data;


    }


    /**
     * 获取返回结果 代码
     *
     * @param document
     * @return
     */
    private static String getTreatResult(org.w3c.dom.Document document) {
        NodeList list = document.getElementsByTagName("cisReport");
        if (list != null && list.getLength() > 0) {
            Node temp = list.item(0);
            NodeList cisReport = temp.getChildNodes();
            for (int i = 0; i < cisReport.getLength(); i++) {
                Node node = cisReport.item(i);
                if (!StringUtils.equals(node.getNodeName(), "carCheckInfo")) {
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

    /**
     * 便利返回结果各节点信息  获取数据 代码
     *
     * @param document
     * @return
     */

    private static JSONObject listNode(org.w3c.dom.Document document, String node) {
        NodeList list = document.getElementsByTagName(node);
        JSONObject json = new JSONObject();
        //如果为根节点 cisReports 解析 只获取属性
        if ("cisReports".equals(node)) {
            for (int i = 0; i < list.getLength(); i++) {
                if (list.item(i).hasAttributes()) {
                    //获取  属性
                    NamedNodeMap nnmap = list.item(i).getAttributes();
                    for (int k = 0; k < nnmap.getLength(); k++) {
                        json.put(nnmap.item(k).getNodeName(), nnmap.item(k).getNodeValue());
                    }
                }
            }
            return json;
        }

        //错误数据解析
        if ("carStatusInfo".equals(node) || "result".equals(node)) {
            for (int i = 0; i < list.getLength(); i++) {
                NodeList items = list.item(i).getChildNodes();
                for (int k = 0; k < items.getLength(); k++) {
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

        //cisReport 解析
        if ("cisReport".equals(node)) {
            for (int i = 0; i < list.getLength(); i++) {
                if (list.item(i).hasAttributes()) {
                    //获取  属性
                    NamedNodeMap nnmap = list.item(i).getAttributes();
                    for (int k = 0; k < nnmap.getLength(); k++) {
                        json.put(nnmap.item(k).getNodeName(), nnmap.item(k).getNodeValue());
                    }
                }
            }
            return json;
        }


        //queryConditions 解析
        List<String[]> listQueryConds = new ArrayList<String[]>();
        if ("queryConditions".equals(node)) {
            for (int i = 0; i < list.getLength(); i++) {
                NodeList items = list.item(i).getChildNodes();
                for (int j = 0; j < items.getLength(); j++) {
                    NodeList childs = items.item(j).getChildNodes();
                    String[] arry = new String[childs.getLength()];
                    for (int k = 0; k < childs.getLength(); k++) {
                        short nodeType = childs.item(k).getNodeType();
                        if (nodeType == Node.ELEMENT_NODE) {
                            arry[k] = childs.item(k).getTextContent();
                        }
                    }
                    if (arry.length > 0) {
                        listQueryConds.add(arry);
                    }
                }
            }
            if (null != listQueryConds && listQueryConds.size() > 0) {
                for (String[] strArry : listQueryConds) {
                    json.put(strArry[1].toString(), strArry[5].toString());
                }
            }
            return json;
        }

        //carCheckInfo 解析
        for (int i = 0; i < list.getLength(); i++) {
            if (list.item(i).hasAttributes()) {
                //获取  属性
                NamedNodeMap nnmap = list.item(i).getAttributes();
                for (int k = 0; k < nnmap.getLength(); k++) {
                    json.put(nnmap.item(k).getNodeName(), nnmap.item(k).getNodeValue());
                }
            }
            NodeList items = list.item(i).getChildNodes();
            for (int j = 0; j < items.getLength(); j++) {
                NodeList childs = items.item(j).getChildNodes();
                for (int k = 0; k < childs.getLength(); k++) {
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
