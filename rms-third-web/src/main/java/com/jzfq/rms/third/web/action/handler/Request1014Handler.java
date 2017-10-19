package com.jzfq.rms.third.web.action.handler;

import com.jzfq.rms.mongo.BrPostData;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.service.IRiskPostDataService;
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
 * 融360 手机在网状态
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/17 16:41.
 **/
@Component("request1014Handler")
public class Request1014Handler extends AbstractRequestHandler {
    private static final Logger log = LoggerFactory.getLogger("Rong360 1014");
    @Autowired
    IRong360Service rong360Service;

    @Autowired
    IRiskPostDataService riskPostDataService;

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
        return true;
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
        String taskId = request.getParam("taskId").toString();
        String fraudId = request.getParam("fraudId").toString();
        String name = request.getParam("name").toString();
        String idNumber = request.getParam("idNumber").toString();
        String phone = request.getParam("phone").toString();
        String custumType = request.getParam("custumType").toString();
        Map<String, String> bizData = new HashMap<>();
        bizData.put("name",name);
        bizData.put("idNumber",idNumber);
        bizData.put("phone",phone);
        String result ="";
        String id = StringUtils.isBlank(taskId)?fraudId:taskId;
        try {
            //手机在网状态
            JSONObject resultJson3 = rong360Service.getPhonestatus(taskId, bizData);
            result = changeBairongPhonestatus(resultJson3);
            BrPostData data = editAndSavePostData(id, "手机在网状态", result, custumType);
            return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS,data);
        }catch (Exception e){
            log.error("手机在网状态"+e.getMessage());
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
     * 在网状态转换
     * @param paramJson
     * @return
     */
    private static String changeBairongPhonestatus(JSONObject paramJson){
        JSONArray jsonObject0 = paramJson.getJSONArray("tianji_api_jiao_phonestatus_response");
        JSONObject jsonObject1 = jsonObject0.getJSONObject(0);
        JSONObject jsonObject2 = jsonObject1.getJSONObject("checkResult");
        JSONObject jsonObject3 = jsonObject2.getJSONObject("ISPNUM");
        JSONArray jsonObject4 = jsonObject2.getJSONArray("RSL");
        JSONObject jsonObject5 = jsonObject4.getJSONObject(0);
        JSONObject jsonObject6 = jsonObject5.getJSONObject("RS");
        String jsonOperation0=jsonObject3.getString("city");
        String jsonRsult0=jsonObject6.getString("desc");

        String jsonOperation=jsonOperation0;
        String jsonRsult=jsonRsult0;
        String result ="{\"swift_number\":\"3100034_20170629114811_9744\",\"code\":600000,\"product\":{\"result\":\"1\",\"operation\":\"3\",\"costTime\":31},\"flag\":{\"flag_telCheck\":1}}";
        JSONObject jsonPhonestatus = JSONObject.fromObject(result);
        JSONObject product = jsonPhonestatus.getJSONObject("product");
        product.put("result",jsonRsult);
        product.put("operation",jsonOperation);
        return jsonPhonestatus.toString();
    }
}
