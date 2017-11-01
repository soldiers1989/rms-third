package com.jzfq.rms.third.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.mongo.PengYuan;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.enums.SendMethodEnum;
import com.jzfq.rms.third.common.enums.SystemIdEnum;
import com.jzfq.rms.third.common.utils.Base64;
import com.jzfq.rms.third.common.utils.CompressStringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.exception.BusinessException;
import com.jzfq.rms.third.persistence.dao.IPengYuanDao;
import com.jzfq.rms.third.service.IPengYuanService;
import com.jzfq.rms.third.service.ISendMessageService;
import org.apache.commons.lang3.StringUtils;
import org.codehaus.xfire.client.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 *
 * @description 鹏元服务接口实现
 * @author 大连桔子分期科技有限公司
 *
 */
@Service
public class PengYuanServiceImpl implements IPengYuanService {

    private static final Logger log = LoggerFactory.getLogger("pengYuanLog");

    @Value("${pengyuan.data.username}")
    private String userName;
    @Value("${pengyuan.data.password}")
    private String passWord;

    @Autowired
    private IPengYuanDao pengYuanDao;
    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    ISendMessageService sendMessegeService;
    @Override
    public JSONObject queryPengYuanData(Long taskId,  Map<String,Object> carInfo) {

        List<PengYuan> pyData = mongoTemplate.find(new Query(Criteria.where("taskId").is(taskId).and("idCard").is(carInfo.get("certCardNo"))),PengYuan.class);

        JSONObject data = new JSONObject();
        if (null != pyData && pyData.size() > 0) {
            data = pyData.get(0).getData();
        } else {
            String pyUrl = pengYuanDao.getPyUrl();
            if(StringUtils.isBlank(pyUrl)){
                data.put("errorCode", ReturnCode.ERROR_SYSTEM_CONFIG_NULL.code());
                data.put("errorMessage","获取鹏元接口系统配置地址为空");
                return data;
            }
            long start=System.currentTimeMillis();
            String queryInfo = reqData(carInfo);
            try {
                log.info("taskId=["+taskId+"]开始获取鹏元数据......");
                //调用webservice
                Client client = new Client(new URL(pyUrl));
                //得到子报告结果
                log.info("taskId=["+taskId+"]请求报文【"+queryInfo+"】");
                Object[] results = client.invoke("queryReport",new Object[]{userName,passWord,queryInfo,"xml"});
                log.info("taskId=["+taskId+"]执行结束, 耗时[ "+(System.currentTimeMillis()-start)+" ]ms");

                data = parseXml2Json(results[0].toString());
                log.info("taskId=["+taskId+"]请求结果【" + Arrays.toString(results) + "】");
                log.info("taskId=["+taskId+"]解析后的数据：" + data);
                if (data.getIntValue("status") == 1) { //返回状态为1是正常报文，2为发生异常
                    String returnValue1 = data.getString("returnValue");
                    Base64 base64 = new Base64();
                    byte [] re = base64.decode(returnValue1);
                    String xml = new CompressStringUtil().decompress(re);
                    log.info("taskId=["+taskId+"]响应报文 result ==>" + xml);
                    data = parseXml2Json(xml);

                }else {
                    return data;
                }

                log.info("鹏元数据 taskId=[" + taskId + "]\r\n" + data);

                JSONObject checkInfo = data.getJSONObject("carCheckInfo");
                if (!checkInfo.containsKey("errorCode")) {
                    PengYuan py = new PengYuan(taskId, carInfo.get("certCardNo").toString(), "", data);
                    saveData(py);
                }
            } catch (Exception e) {
                data.put("errorCode", "2004");
                data.put("errorMessage", "获取鹏元信息失败");
                log.error("taskId=["+taskId+"]获取鹏元信息失败",e);
                return data;
            }
        }
        return data;
    }

    private JSONObject parseXml2Json(String xml) {
        JSONObject data = new JSONObject();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(new ByteArrayInputStream(xml.getBytes("UTF-8")));
//            Document document = db.parse(new ByteArrayInputStream(xml.getBytes("GBK)));
            Node node = document.getFirstChild();
            String nodeName = node.getNodeName();
            if ("cisReports".equals(nodeName)) {
                //1、个人车辆信息核查
                JSONObject carCheckInfo = listNode(document, "carCheckInfo");
                if(carCheckInfo.size() == 0){
                    JSONObject arr = new JSONObject();
                    arr.put("errorCode", "100001");
                    arr.put("nameCheckResult","远程返回的结果为空");
                    arr.put("documentNoCheckResult","远程返回的结果为空");
                    arr.put("licenseNoCheckResult","远程返回的结果为空");
                    arr.put("carTypeCheckResult","远程返回的结果为空");
                    data.put("carCheckInfo", arr);
                }else{
                    data.put("carCheckInfo", carCheckInfo);
                }

//                JSONObject carStatusInfo = listNode(document,"carStatusInfo");
//                data.put("carStatusInfo", carStatusInfo);
//                JSONObject carInfo = listNode(document,"carInfo");
//                data.put("carInfo", carInfo);
            } else {
                data = listNode(document,"result");
            }
            log.info(data.toJSONString());
        } catch (Exception e) {
            log.error("获取鹏元信息异常：",e);
        }
        return data;
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
        } else {
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
        }
        return json;
    }


    private String reqData(Map<String,Object> carInfo) {
        String type = carInfo.get("type").toString();
        if (Integer.parseInt(type) <= 9) {
            type = String.format("%02d", Integer.parseInt(type));
        }
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
        sb.append("<conditions>");
        sb.append("<condition queryType=\"25200\">");
        sb.append("<item>");
        sb.append("<name>name</name>");
        sb.append("<value>"+carInfo.get("name")+"</value>");
        sb.append("</item>");
        sb.append("<item>");
        sb.append("<name>documentNo</name>");
        sb.append("<value>"+carInfo.get("certCardNo")+"</value>");
        sb.append("</item>");
        sb.append("<item>");
        sb.append("<name>licenseNo</name>");
        sb.append("<value>"+carInfo.get("plateNo")+"</value>");
        sb.append("</item>");
        sb.append("<item>");
        sb.append("<name>carType</name>");
        sb.append("<value>"+type+"</value>");
        sb.append("</item>");
        sb.append("<item>");
        sb.append("<name>queryReasonID</name>");
        sb.append("<value>101</value>");
        sb.append("</item>");
        sb.append("<item>");
        sb.append("<name>subreportIDs</name>");
        sb.append("<value>13812</value>");//13816：全国个人车辆信息核查 13813：车辆状态查询，根据权限和需要进行提交  13814：机动车信息查询，根据权限和需要进行提交
        sb.append("</item>");
        sb.append("<item>");
        sb.append("<name>refID</name>");
        sb.append("<value></value>");
        sb.append("</item>");
        sb.append("</condition>");
        sb.append("</conditions>");

        return sb.toString();
    }

    private void saveData(PengYuan pengYuan) {
        log.info("鹏元数据开始入库......");
        try {
            mongoTemplate.insert(pengYuan);
        } catch (Exception e) {
            log.error("入库失败......" , e);
        }
        log.info("鹏元数据入库结束......");
    }




    @Override
    public ResponseResult queryPyCarDatas(Map<String,Object> carInfo, Map<String,Object> commonParams) throws Exception{
        boolean isRpc = (boolean)commonParams.get("isRpc");
        Long taskId = (Long)commonParams.get("taskId");
        String traceId = TraceIDThreadLocal.getTraceID();
        if(isRpc){
            return getCarDataByRpc(carInfo,commonParams);
        }
        List<PengYuan> pyData = mongoTemplate.find(new Query(Criteria.where("taskId").is(taskId).and("idCard").is(carInfo.get("certCardNo"))),PengYuan.class);
        Object data = (pyData==null||pyData.size()==0)?null:pyData.get(0).getData();
        return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS,data);
    }

    /**
     * 远程调用鹏元接口
     * @param carInfo
     * @param commonParams
     * @return
     * @throws Exception
     */
    private ResponseResult getCarDataByRpc(Map<String,Object> carInfo, Map<String,Object> commonParams)throws Exception{
        Long taskId = (Long)commonParams.get("taskId");
        String traceId = TraceIDThreadLocal.getTraceID();

        String pyUrl = pengYuanDao.getPyUrl();
        if(StringUtils.isBlank(pyUrl)){
            return new ResponseResult(traceId, ReturnCode.ERROR_SYSTEM_CONFIG_NULL.code(),
                    "获取鹏元接口系统配置地址为空",null);
        }
        commonParams.put("url",pyUrl);
        commonParams.put("targetId", SystemIdEnum.THIRD_PY.getCode());
        commonParams.put("appId", "");
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_PY01.getCode());
        commonParams.put("systemId", SystemIdEnum.RMS_THIRD.getCode());
        commonParams.put("traceId", TraceIDThreadLocal.getTraceID());

        ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.PY01.getCode(),commonParams,carInfo);
        if(response==null){
            log.info("traceId={} 鹏元车辆 响应信息为空", TraceIDThreadLocal.getTraceID());
            throw new BusinessException(ReturnCode.ERROR_RESPONSE_NULL.code(),"鹏元车辆信息接口失败 返回为空",true);
        }
        if(response.getCode()!= ReturnCode.REQUEST_SUCCESS.code()){
            log.info("traceId={} 鹏元车辆 响应信息为空", TraceIDThreadLocal.getTraceID());
            return response;
        }
        JSONObject data = (JSONObject)response.getData();
        PengYuan py = new PengYuan(taskId,(String) carInfo.get("certCardNo"), "", data);
        saveData(py);
        return response;
    }
}

