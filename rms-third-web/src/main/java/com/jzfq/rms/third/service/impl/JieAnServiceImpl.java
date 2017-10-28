package com.jzfq.rms.third.service.impl;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.SendMethodEnum;
import com.jzfq.rms.third.common.enums.SystemIdEnum;
import com.jzfq.rms.third.common.httpclient.HttpConnectionManager;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.service.IJieAnService;
import com.jzfq.rms.third.service.ISendMessegeService;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 捷安
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/18 16:48.
 **/
@Service
public class JieAnServiceImpl implements IJieAnService {

    private static final Logger log = LoggerFactory.getLogger("JieAnService");
    @Value("${jiean.request.mac.key}")
    private String MAC_KEY;
    @Value("${jiean.request.api.url}")
    private String apiUrl;
    @Value("${jiean.request.custId}")
    private String custId;

    @Autowired
    ISendMessegeService sendMessegeService;

    private String getOrderId(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        System.out.println(formatter.format(new Date()));
        return "JUZITEST"+formatter.format(new Date())+(new Random()).nextInt(1000);
    }
    /**
     * 在网时长
     *
     * @param user_id
     * @param bizData
     * @return
     * @throws Exception
     */
    @Override
    public ResponseResult getPhoneNetworkLength(String user_id, Map<String, Object> bizData) throws Exception {
        Map<String,String> params = new HashMap<>();
        params.put("versionId","01");
        params.put("chrSet","UTF-8");
        params.put("custId",custId);
        String orderId = getOrderId();
        log.info("taskId="+user_id+" orderId="+orderId);
        params.put("ordId",orderId);
        params.put("transType","REPORT");
        params.put("busiType",user_id);
        params.put("merPriv","");
        params.put("retUrl","");
        params.put("jsonStr","{\"MP\":\""+bizData.get("phone")+"\",\"PROD_ID\":\"MPTIME\"}");
        params.put("merPriv","");

        Map<String,Object> commonParams = new HashMap<>();
        commonParams.put("params",params);

        commonParams.put("url",apiUrl);
        commonParams.put("targetId", SystemIdEnum.THIRD_JIEAN.getCode());
        commonParams.put("appId", "");
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_JIEAN01.getCode());
        commonParams.put("systemId", SystemIdEnum.RMS_THIRD.getCode());
        commonParams.put("traceId", TraceIDThreadLocal.getTraceID());
        return sendMessegeService.sendByThreeChance(SendMethodEnum.JIEAN01.getCode(),commonParams,bizData);
    }

    /**
     * 运营商实名
     * @param user_id
     * @param bizData
     * @return
     * @throws Exception
     */
    @Override
    public ResponseResult getMobilecheck3item(String user_id, Map<String, Object> bizData) throws Exception {
        Map<String,String> params = new HashMap<>();
        params.put("versionId","01");
        params.put("chrSet","UTF-8");
        params.put("custId",custId);
        String orderId = getOrderId();
        log.info("taskId="+user_id+" orderId="+orderId);
        params.put("ordId",orderId);
        params.put("transType","STD_VERI");
        params.put("busiType",user_id);
        params.put("merPriv","");
        params.put("retUrl","");
        params.put("jsonStr","{\"CERT_ID\":\""+bizData.get("idNumber")+"\"," +
                "\"CERT_NAME\":\""+bizData.get("name")+"\"," +
                "\"MP\":\""+bizData.get("phone")+"\",\"PROD_ID\":\"MP3\"}");
        params.put("merPriv","");

        Map<String,Object> commonParams = new HashMap<>();
        commonParams.put("params",params);

        commonParams.put("url",apiUrl);
        commonParams.put("targetId", SystemIdEnum.THIRD_JIEAN.getCode());
        commonParams.put("appId", "");
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_JIEAN03.getCode());
        commonParams.put("systemId", SystemIdEnum.RMS_THIRD.getCode());
        commonParams.put("traceId", TraceIDThreadLocal.getTraceID());
        return sendMessegeService.sendByThreeChance(SendMethodEnum.JIEAN03.getCode(),commonParams,bizData);
    }

    /**
     * 在网状态
     *
     * @param taskId
     * @param bizData
     * @return
     * @throws Exception
     */
    @Override
    public ResponseResult getPhonestatus(String taskId, Map<String, Object> bizData) throws Exception {
        Map<String,String> params = new HashMap<>();
        params.put("versionId","01");
        params.put("chrSet","UTF-8");
        params.put("custId",custId);
        String orderId = getOrderId();
        log.info("taskId="+taskId+" orderId="+orderId);
        params.put("ordId",orderId);
        params.put("transType","REPORT");
        params.put("busiType",taskId);
        params.put("merPriv","");
        params.put("retUrl","");
        params.put("jsonStr","{\"MP\":\""+bizData.get("phone")+"\",\"PROD_ID\":\"MPSTAT\"}");
        params.put("merPriv","");

        Map<String,Object> commonParams = new HashMap<>();
        commonParams.put("params",params);

        commonParams.put("url",apiUrl);
        commonParams.put("targetId", SystemIdEnum.THIRD_JIEAN.getCode());
        commonParams.put("appId", "");
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_JIEAN02.getCode());
        commonParams.put("systemId", SystemIdEnum.RMS_THIRD.getCode());
        commonParams.put("traceId", TraceIDThreadLocal.getTraceID());
        return sendMessegeService.sendByThreeChance(SendMethodEnum.JIEAN02.getCode(),commonParams,bizData);
    }
}

