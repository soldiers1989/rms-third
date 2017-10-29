package com.jzfq.rms.third.web.action.handler;

import com.jzfq.rms.mongo.BrPostData;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.service.IJieAnService;
import com.jzfq.rms.third.service.IRiskPostDataService;
import com.jzfq.rms.third.service.IRmsService;
import com.jzfq.rms.third.web.action.auth.AbstractRequestAuthentication;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 捷安 手机三要素
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/20 19:31.
 **/
@Component("request1015Handler")
public class Request1015Handler extends AbstractRequestHandler {
    @Autowired
    IJieAnService jieAnService;

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
        return true;
    }

    /**
     * 检查业务参数是否合法，交由子类实现。
     *
     * @param params 请求中携带的业务参数
     * @return 合法返回true，否则返回false
     */
    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        String orderNo = (String)params.get("orderNo");
        String name = (String)params.get("name");
        String idNumber = (String)params.get("idNumber");
        String phone = (String)params.get("phone");
        String custumType = (String)params.get("custumType");
        if(org.apache.commons.lang3.StringUtils.isBlank(orderNo)|| org.apache.commons.lang3.StringUtils.isBlank(name)
                || org.apache.commons.lang3.StringUtils.isBlank(idNumber)|| org.apache.commons.lang3.StringUtils.isBlank(phone)
                || org.apache.commons.lang3.StringUtils.isBlank(custumType)){
            return false;
        }
        return true;
    }

    /**
     * 业务处理，交由子类实现。
     *
     * @param request 请求实体
     * @return 响应
     */
    @Override
    protected ResponseResult bizHandle(AbstractRequestAuthentication request) throws Exception {
        String orderNo = request.getParam("orderNo").toString();
        String taskId = rmsService.queryByOrderNo(TraceIDThreadLocal.getTraceID(), orderNo);
        String name = request.getParam("name").toString();
        String idNumber = request.getParam("idNumber").toString();
        String phone = request.getParam("phone").toString();
        String custumType = request.getParam("custumType").toString();
        Map<String, Object> bizData = new HashMap<>();
        bizData.put("name",name);
        bizData.put("idNumber",idNumber);
        bizData.put("phone",phone);
        bizData.put("custumType",custumType);
        ResponseResult result = jieAnService.getMobilecheck3item(taskId, bizData);
        if(result.getCode() == ReturnCode.REQUEST_SUCCESS.code()){
            JSONObject json = (JSONObject) result.getData();
            String status = changeBairongPhone3rdinfo(json);
            editAndSavePostData(taskId, "手机三要素", status, custumType);
        }
        return result;
    }
    /**
     * 三要素转换
     * @param paramJson
     * @return
     */
    private static String changeBairongPhone3rdinfo(JSONObject paramJson){
        String jsonRsult="";
        if(StringUtils.equals(paramJson.getString("respCode"),"000")){
            jsonRsult ="1";
        }else if(StringUtils.equals(paramJson.getString("respCode"),"042")) {
            jsonRsult = "2";
        }else{
            jsonRsult = "0";
        }
        String result ="{\"swift_number\":\"3100034_20170629114811_9744\",\"code\":600000,\"product\":{\"result\":\"1\",\"operation\":\"3\",\"costTime\":31},\"flag\":{\"flag_telCheck\":1}}";
        JSONObject json3rd = JSONObject.fromObject(result);
        JSONObject product = json3rd.getJSONObject("product");
        product.put("result",jsonRsult);
        product.put("operation","4");

        return json3rd.toString();
    }

    private static String changeLengthByValue(String length){
        if(!length.contains(",")){
            return "";
        }
        String[] month = length.split(",");
        String start = "";
        if(month[0].length()>1){
            start = month[0].substring(1,month[0].length()).trim();
        }
        String end = "";
        if(month[1].length()>1){
            end = month[1].substring(0,month[1].length()-1).trim();
        }
        if(NumberUtils.isNumber(end)){
            Integer endMonth = Integer.parseInt(end);
            if(endMonth<=6){
                return "1";
            }
            if(endMonth<=12){
                return "2";
            }
            if(endMonth<=24){
                return "3";
            }
        }
        if(NumberUtils.isNumber(start)){
            Integer startMonth = Integer.parseInt(start);
            if(startMonth>=24){
                return "4";
            }
        }
        return "";
    }
    private BrPostData editAndSavePostData(String taskId, String desc, String data, String type) {
        BrPostData dataBean = new BrPostData.BrDataBuild().createTime(new Date()).taskId(taskId)
                .desc(desc).data(data).interfaceType(type).build();
        riskPostDataService.saveData(dataBean);
        return dataBean;
    }
}
