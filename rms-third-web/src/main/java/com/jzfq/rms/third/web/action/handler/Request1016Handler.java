package com.jzfq.rms.third.web.action.handler;

import com.jzfq.rms.enums.JieAnPhoneStatusEnum;
import com.jzfq.rms.mongo.BrPostData;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.service.IJieAnService;
import com.jzfq.rms.third.service.IRiskPostDataService;
import com.jzfq.rms.third.service.IRmsService;
import com.jzfq.rms.third.web.action.auth.AbstractRequestAuthentication;
import net.sf.json.JSONObject;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 捷安 手机在网状态
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/20 19:31.
 **/
@Component("request1016Handler")
public class Request1016Handler extends AbstractRequestHandler {
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
        String orderNo = (String)params.get("orderNo");
        String name = (String)params.get("name");
        String idNumber = (String)params.get("idNumber");
        String phone = (String)params.get("phone");
        String custumType = (String)params.get("custumType");
        if(StringUtils.isBlank(orderNo)||StringUtils.isBlank(name)
                ||StringUtils.isBlank(idNumber)||StringUtils.isBlank(phone)
                ||StringUtils.isBlank(custumType)){
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
        String traceId = request.getParam("traceId").toString();
        String orderNo = request.getParam("orderNo").toString();
        String taskId = rmsService.queryByOrderNo(traceId, orderNo);
        String name = request.getParam("name").toString();
        String idNumber = request.getParam("idNumber").toString();
        String phone = request.getParam("phone").toString();
        String custumType = request.getParam("custumType").toString();
        Map<String, Object> bizData = new HashMap<>();
        bizData.put("name",name);
        bizData.put("idNumber",idNumber);
        bizData.put("phone",phone);
        bizData.put("custumType",custumType);
        String result ="";
        return jieAnService.getPhonestatus(taskId, bizData);
    }

    /**
     * 在网状态转换
     * @param paramJson
     * @return
     */
    private static String changeBairongPhonestatus(JSONObject paramJson){
        String key=paramJson.getString("jsonStr");
        com.alibaba.fastjson.JSONObject json = com.alibaba.fastjson.JSONObject.parseObject(key);
        String status = json.getString("OUTPUT1");
        String result ="{\"swift_number\":\"3100034_20170629114811_9744\",\"code\":600000,\"product\":{\"result\":\"1\",\"operation\":\"3\",\"costTime\":31},\"flag\":{\"flag_telCheck\":1}}";
        JSONObject jsonPhonestatus = JSONObject.fromObject(result);
        JSONObject product = jsonPhonestatus.getJSONObject("product");
        product.put("result", JieAnPhoneStatusEnum.getName(status));
        product.put("operation","");
        return jsonPhonestatus.toString();
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
