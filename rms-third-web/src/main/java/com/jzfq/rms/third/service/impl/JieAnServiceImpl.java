package com.jzfq.rms.third.service.impl;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.SendMethodEnum;
import com.jzfq.rms.third.common.httpclient.HttpConnectionManager;
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

    /**
     * 获取加密字符串
     * @param input
     * @return
     */
    private String getMacStr(String input){
        log.info("MD5摘要前字符串:"+input+MAC_KEY);
        return MD5Helper.encrypt(input+MAC_KEY);
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
        if(StringUtils.isBlank(input)){
            return "";
        }
        return input;
    }

    public JSONObject postData(Map<String,String> params) throws Exception {
        log.info("捷安请求参数："+params);
        ResponseResult dto = HttpConnectionManager.doUncheckPost(apiUrl,params);
        String respose = dto.getData().toString();
        log.info("捷安返回报文："+respose);
        Document doc = null;
        try {
            doc = DocumentHelper.parseText(respose);
        } catch (DocumentException e) {
            log.error("taskId:"+params.get("busiType")+"-捷安 接口调用解析报文出错",e);
            throw new Exception("Request JieAn api "+params.get("transType")+"exception");
        }
        if(doc==null){
            log.info("taskId:"+params.get("busiType")+"-捷安 接口返回为空");
            throw new Exception("Request JieAn api "+params.get("transType")+"return null");
        }
        JSONObject result = new JSONObject();
        Element root = doc.getRootElement();
        List<Element> list = root.content();
        for(Element ele:list){
            String text = ele.getText();
            if(StringUtils.isBlank(text)||StringUtils.equals(text,"null")){
                result.put(ele.getName(), "");
                continue;
            }
            result.put(ele.getName(),text);
        }
        return result;
    }
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
    public JSONObject getPhoneNetworkLength(String user_id, Map<String, String> bizData) throws Exception {
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
        String input = getInputStr(params);
        params.put("macStr", getMacStr(input));
        JSONObject respone = postData(params);
        String respCode = respone.getString("respCode");
        if (respone == null ||!StringUtils.equals(respCode,"071")) {
            throw new Exception("taskId【"+user_id+"】Request JieAn api MPTIME returns fail" + respCode);
        }
        return respone;
    }

    /**
     * @param user_id
     * @param bizData
     * @return
     * @throws Exception
     */
    @Override
    public JSONObject getMobilecheck3item(String user_id, Map<String, String> bizData) throws Exception {
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
        String input = getInputStr(params);
        params.put("macStr", getMacStr(input));

//        sendMessegeService.sendByThreeChance(SendMethodEnum.GPJ02.getCode(),params,params);
        JSONObject respone = postData(params);
        String respCode = respone.getString("respCode");
        if (respone == null ||(!StringUtils.equals(respCode,"000")&&
                !StringUtils.equals(respCode,"042")&&
                !StringUtils.equals(respCode,"308")&&
                !StringUtils.equals(respCode,"310")&&
                !StringUtils.equals(respCode,"313"))) {
            throw new Exception("taskId【"+user_id+"】Request JieAn api MP3 returns fail code:" + respCode);
        }
        return respone;
    }

    /**
     * 在网状态
     *
     * @param user_id
     * @param bizData
     * @return
     * @throws Exception
     */
    @Override
    public JSONObject getPhonestatus(String user_id, Map<String, String> bizData) throws Exception {
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
        params.put("jsonStr","{\"MP\":\""+bizData.get("phone")+"\",\"PROD_ID\":\"MPSTAT\"}");
        params.put("merPriv","");
        String input = getInputStr(params);
        params.put("macStr", getMacStr(input));
        JSONObject respone = postData(params);
        String respCode = respone.getString("respCode");
        if (respone == null ||!StringUtils.equals(respCode,"071")) {
            throw new Exception("taskId【"+user_id+"】Request JieAn api MPSTAT returns fail" + respCode);
        }
        return respone;
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