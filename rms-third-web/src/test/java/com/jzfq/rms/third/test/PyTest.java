package com.jzfq.rms.third.test;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.enums.CarCheckEnum;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.util.Set;

public class PyTest {


    public static void main(String[] args) {
//        getValue();
        System.out.println(parseXml());

    }


    public static String parseXml(){
        String xml = "<?xml version=\"1.0\" encoding=\"GBK\" ?>\n" +
                "<cisReports  batNo=\"2018061020000068\" unitName=\"北京车主白条科技有限公司\" subOrgan=\"风控管理中心\" queryUserID=\"czwsquery01\" queryCount=\"1\" receiveTime=\"20180610 20:19:43\">\n" +
                "<cisReport reportID=\"2018061020000068\" buildEndTime=\"2018-06-10 20:19:44\" queryReasonID=\"101\" subReportTypes=\"13812\" treatResult=\"1\" subReportTypesShortCaption=\"1、车辆信息核查(13812) \" hasSystemError=\"false\" isFrozen=\"false\">\n" +
                "\t<queryConditions>\n" +
                "\t\t<item>\n" +
                "\t\t\t<name>name</name>\n" +
                "\t\t\t<caption>姓名</caption>\n" +
                "\t\t\t<value>测试三</value>\n" +
                "\t\t</item>\n" +
                "\t\t<item>\n" +
                "\t\t\t<name>documentNo</name>\n" +
                "\t\t\t<caption>证件号码</caption>\n" +
                "\t\t\t<value>110000199001031113</value>\n" +
                "\t\t</item>\n" +
                "\t\t<item>\n" +
                "\t\t\t<name>licenseNo</name>\n" +
                "\t\t\t<caption>车牌号码</caption>\n" +
                "\t\t\t<value>粤B12347</value>\n" +
                "\t\t</item>\n" +
                "\t\t<item>\n" +
                "\t\t\t<name>carType</name>\n" +
                "\t\t\t<caption>号牌种类</caption>\n" +
                "\t\t\t<value>小型汽车号牌</value>\n" +
                "\t\t</item>\n" +
                "\t\t<item>\n" +
                "\t\t\t<name>isNeedStatus</name>\n" +
                "\t\t\t<caption>是否查询机动车状态，1：查询， 2：不查询</caption>\n" +
                "\t\t\t<value>2</value>\n" +
                "\t\t</item>\n" +
                "\t</queryConditions>\n" +
                "<carCheckInfo subReportType=\"13812\" subReportTypeCost=\"13812\" treatResult=\"1\" errorMessage=\"\">\n" +
                "<item>\n" +
                "<nameCheckResult>一致</nameCheckResult>\n" +
                "<documentNoCheckResult>一致</documentNoCheckResult>\n" +
                "<licenseNoCheckResult>一致</licenseNoCheckResult>\n" +
                "<carTypeCheckResult>一致</carTypeCheckResult>\n" +
                "</item>\n" +
                "</carCheckInfo>\n" +
                "</cisReport>\n" +
                "</cisReports>\n";

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
//            logger.info(data.toJSONString());
        } catch (Exception e) {
//            logger.error("获取鹏元信息异常：",e);
        }
        return data.toJSONString();
    }


    /**
     * 获取返回结果 代码
     * @param document
     * @return
     */
    private static String getTreatResult(Document document) {
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



    private static JSONObject listNode(Document document, String node) {
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


    public static String getValue() {
        JSONObject json = JSONObject.parseObject("{\"carCheckInfo\":{\"documentNoCheckResult\":\"一致\",\"licenseNoCheckResult\":\"一致\",\"nameCheckResult\":\"一致\",\"carTypeCheckResult\":\"一致\"}}\n");
        if (json == null) {
            return CarCheckEnum.OTHER.getCode();
        }
        JSONObject carInfo = json.getJSONObject("carCheckInfo");
        if (carInfo == null) {
            return CarCheckEnum.OTHER.getCode();
        }
        Set<String> set = carInfo.keySet();
        int other = 0;
        int unCheckCount = 0;
        int unAgreeCount = 0;
        for (String key : set) {
            if (StringUtils.equals("不一致", carInfo.getString(key))) {
                unAgreeCount++;
                continue;
            }
            if (StringUtils.equals("无法核查", carInfo.getString(key))) {
                unCheckCount++;
                continue;
            }
            if (!StringUtils.equals("一致", carInfo.getString(key))) {
                other++;
            }
        }
        if (unAgreeCount > 0) {
            return CarCheckEnum.UNAGREE.getCode();
        }
        if (other > 0) {
            return CarCheckEnum.OTHER.getCode();
        }
        if (unCheckCount > 0) {
            return CarCheckEnum.UNCHECK.getCode();
        }
        return CarCheckEnum.AGREE.getCode();
    }


}
