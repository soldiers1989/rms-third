package com.jzfq.rms.third.web.action.handler;

import com.jzfq.rms.mongo.BrPostData;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.service.IRiskPostDataService;
import com.jzfq.rms.third.service.IRmsService;
import com.jzfq.rms.third.service.IRong360Service;
import com.jzfq.rms.third.web.action.auth.AbstractRequestAuthentication;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 融360
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/17 16:41.
 **/
@Component("request1013Handler")
public class Request1013Handler extends AbstractRequestHandler {
    private static final Logger log = LoggerFactory.getLogger("Rong360 1013");

    @Autowired
    IRong360Service rong360Service;

    @Autowired
    IRiskPostDataService riskPostDataService;

    @Autowired
    IRmsService rmsService;
    /**
     * 是否控制重复调用
     *
     * @return 合法返回true，否则返回false
     */
    @Override
    protected boolean isCheckRepeat() {
        return false;
    }

    /**
     * 检查业务参数是否合法，交由子类实现。
     *
     * @param params 请求中携带的业务参数
     * @return 合法返回true，否则返回false
     */
    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        return false;
    }

    /**
     * 业务处理，交由子类实现。
     *
     * @param request 请求实体
     * @return 响应
     */
    @Override
    protected ResponseResult bizHandle(AbstractRequestAuthentication request) throws RuntimeException {

        String traceId = request.getParam("traceId").toString();
        String orderNo = request.getParam("orderNo").toString();
        String taskId = rmsService.queryByOrderNo(traceId, orderNo);
        String name = request.getParam("name").toString();
        String idNumber = request.getParam("idNumber").toString();
        String phone = request.getParam("phone").toString();
        String custumType = request.getParam("custumType").toString();
        Map<String, String> bizData = new HashMap<>();
        bizData.put("name",name);
        bizData.put("idNumber",idNumber);
        bizData.put("phone",phone);
        String result ="";
        try {
            //手机在网时长
            JSONObject resultJson2 = rong360Service.getPhoneNetworkLength(taskId, bizData);
            result = changeBairongPhoneNetworkLength(resultJson2);
            BrPostData data = editAndSavePostData(taskId, "手机在网时长", result, custumType);
            return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS,data);
        }catch (Exception e){
            log.error("手机在网时长"+e.getMessage());
        }
        return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS,null);
    }
    private BrPostData editAndSavePostData(String taskId, String desc, String data, String type) {
        BrPostData dataBean = new BrPostData.BrDataBuild().createTime(new Date()).taskId(taskId)
                .desc(desc).data(data).interfaceType(type).build();
        riskPostDataService.saveData(dataBean);
        return dataBean;
    }

    /**
     * 在网时间转换
     * @param paramJson
     * @return
     */
    private static String changeBairongPhoneNetworkLength(JSONObject paramJson){
        JSONObject jsonObject0 = paramJson.getJSONObject("tianji_api_jiao_phonenetworklength_response");
        JSONObject jsonObject3 = jsonObject0.getJSONObject("ISPNUM");
        JSONArray jsonObject4 = jsonObject0.getJSONArray("RSL");
        JSONObject jsonObject5 = jsonObject4.getJSONObject(0);
        JSONObject jsonObject6 = jsonObject5.getJSONObject("RS");
        String jsonOperation0=jsonObject3.getString("isp");
        String jsonRsult0=jsonObject6.getString("code");
        String jsonOperation="";
        if("电信".equals(jsonOperation0)){
            jsonOperation="1";
        }else if("联通".equals(jsonOperation0)){
            jsonOperation="2";
        }else if("移动".equals(jsonOperation0)) {
            jsonOperation = "3";
        }else{
            jsonOperation = "4";
        }
        String jsonRsult="";
        if("03".equals(jsonRsult0)|| "04".equals(jsonRsult0)){
            jsonRsult ="1";
        }else if("1".equals(jsonRsult0)){
            jsonRsult ="2";
        }else if("2".equals(jsonRsult0)){
            jsonRsult ="3";
        }else if("3".equals(jsonRsult0)){
            jsonRsult ="4";
        }
        String result ="{\"swift_number\":\"3100034_20170712173700_9237\",\"code\":600000,\"product\":{\"result\":\"1\",\"operation\":\"2\",\"data\":{\"value\":\"3\"},\"costTime\":9},\"flag\":{\"flag_telperiod\":1}}";
        JSONObject jsonNetworkLength = JSONObject.fromObject(result);
        JSONObject product = jsonNetworkLength.getJSONObject("product");
        JSONObject data = product.getJSONObject("data");
        data.put("value",jsonRsult);
        product.put("operation",jsonOperation);

        return jsonNetworkLength.toString();
    }
}
