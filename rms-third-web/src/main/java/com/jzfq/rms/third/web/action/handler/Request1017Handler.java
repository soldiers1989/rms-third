package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.mongo.BrPostData;
import com.jzfq.rms.third.common.domain.TJieanPhoneData;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.PhoneNetworkLengthEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.service.IJieAnService;
import com.jzfq.rms.third.service.IRiskPostDataService;
import com.jzfq.rms.third.service.IRmsService;
import com.jzfq.rms.third.support.cache.ICountCache;
import com.jzfq.rms.third.web.action.auth.AbstractRequest;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 捷安 手机在网时长
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/20 19:31.
 **/
@Component("request1017Handler")
public class Request1017Handler extends AbstractRequestHandler {
    @Autowired
    IJieAnService jieAnService;

    @Autowired
    IRiskPostDataService riskPostDataService;

    @Autowired
    IRmsService rmsService;

    /**
     * 检查业务参数是否合法，交由子类实现。
     *
     * @param params 请求中携带的业务参数
     * @return 合法返回true，否则返回false
     */
    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        String frontId = (String)params.get("frontId");
        String orderNo = (String)params.get("orderNo");
        String name = (String)params.get("name");
        String idNumber = (String)params.get("idNumber");
        String phone = (String)params.get("phone");
        String custumType = (String)params.get("custumType");
        if(StringUtils.isBlank(frontId)||StringUtils.isBlank(orderNo)||StringUtils.isBlank(name)
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
    protected ResponseResult bizHandle(AbstractRequest request) throws Exception {
        if(StringUtils.equals(request.getApiVersion(),"02")){
            return handler02(request);
        }
        return handler01(request);
    }
    @Autowired
    ICountCache interfaceCountCache;
    /**
     * 超时时间 三天
     */
    private static final Long time = 3*24*60*60L;
    /**
     * 版本01
     * @param request
     * @return
     * @throws Exception
     */
    private ResponseResult handler01(AbstractRequest request) throws Exception{
        String traceId = TraceIDThreadLocal.getTraceID();
        String orderNo = request.getParam("orderNo").toString();
        String taskIdStr = rmsService.queryByOrderNo(traceId, orderNo);
        Long taskId = Long.parseLong(taskIdStr);
        if(taskId==null){
            return new ResponseResult(TraceIDThreadLocal.getTraceID(), ReturnCode.ERROR_TASK_ID_NULL,null);
        }
        // 数据库查询
        String name = request.getParam("name").toString();
        String idNumber = request.getParam("idNumber").toString();
        String phone = request.getParam("phone").toString();
        String custumType = request.getParam("custumType").toString();
        String frontId = request.getParam("frontId").toString();
        //业务参数
        Map<String, Object> bizData = new HashMap<>();
        bizData.put("name",name);
        bizData.put("idNumber",idNumber);
        bizData.put("phone",phone);
        bizData.put("custumType",custumType);
        bizData.put("frontId",frontId);

        List<TJieanPhoneData> list = jieAnService.getJieanData(name,idNumber,phone, InterfaceIdEnum.THIRD_JIEAN01.getCode());
        if(!CollectionUtils.isEmpty(list)){
            // 1.有效数据
            TJieanPhoneData data = list.get(0);
            // 获取老系统数据
            String rmsData = changeBairongPhoneNetworkLength(data.getcResult(),bizData);
            // 保存报mongodb
            editAndSavePostData(taskIdStr, "手机在网时长", rmsData, custumType);
            return new ResponseResult(TraceIDThreadLocal.getTraceID(),ReturnCode.REQUEST_SUCCESS,data.getcValue());
        }

        String isRepeatKey = getRpcControlKey(bizData);
        boolean isRpc = interfaceCountCache.isRequestOutInterface(isRepeatKey,time);
        if(!isRpc){
            return new ResponseResult(TraceIDThreadLocal.getTraceID(),ReturnCode.ACTIVE_THIRD_RPC,null);
        }
        bizData.put("orderId",getOrderId());
        ResponseResult result = jieAnService.getPhoneNetworkLength(taskIdStr, bizData);
        if(result.getCode() == ReturnCode.REQUEST_SUCCESS.code()){
            // 获取捷安 返回时长
            String length = getLength((JSONObject) result.getData());
            String value = changeLengthByValue(length);
            try {
                // 获取老系统数据格式
                String rmsData = changeBairongPhoneNetworkLength(length,bizData);
                // 保存报mongodb
                editAndSavePostData(taskIdStr, "手机在网时长", rmsData, custumType);
                // 缓存到MYSQL
                jieAnService.savePhonesData(InterfaceIdEnum.THIRD_JIEAN01.getCode(),((JSONObject)result.getData()).get("respCode").toString(),length, value,bizData);
            }catch (Exception e){
                log.error("异常",e);
            }
            result.setData(value);
        }else{
            interfaceCountCache.setFailure(isRepeatKey);
        }
        return result;
    }
    /**
     * 远程调用key
     * @param bizData
     * @return
     */
    private String getRpcControlKey(Map<String, Object> bizData){
        StringBuilder sb = new StringBuilder("rms_third_1017_");
        sb.append(StringUtil.getStringOfObject(bizData.get("name")));
        sb.append("_");
        sb.append(StringUtil.getStringOfObject(bizData.get("idNumber")));
        sb.append("_");
        sb.append(StringUtil.getStringOfObject(bizData.get("phone")));
        return sb.toString() ;
    }
    /**
     * 版本02
     * @param request
     * @return
     */
    private ResponseResult handler02(AbstractRequest request){
        return null;
    }


    private String getLength(JSONObject data){
        String key=data.getString("jsonStr");
        JSONObject json = JSONObject.parseObject(key);
        return json.getString("OUTPUT1");
    }
    /**
     * 在网时间转换
     * @param length
     * @param bizParams
     * @return
     */
    private static String changeBairongPhoneNetworkLength(String length,Map<String ,Object> bizParams){
        String result ="{\"swift_number\":\""+bizParams.get("orderId")+"\",\"code\":600000,\"product\":{\"result\":\"1\",\"operation\":\"2\",\"data\":{\"value\":\"3\"},\"costTime\":9},\"flag\":{\"flag_telperiod\":1}}";
        JSONObject jsonNetworkLength = JSONObject.parseObject(result);
        JSONObject product = jsonNetworkLength.getJSONObject("product");
        JSONObject data = product.getJSONObject("data");
        data.put("value", changeRmsLengthByValue(length));
        product.put("operation","4");
        return jsonNetworkLength.toString();
    }

    /**
     * 百融格式转换
     * @param length
     * @return
     */
    private static String changeRmsLengthByValue(String length){
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

    /**
     * 新系统数值转换
     * @param length
     * @return
     */
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
            if(endMonth<=3){
                return PhoneNetworkLengthEnum.THREE_MONTH.getCode();
            }
            if(endMonth<=6){
                return PhoneNetworkLengthEnum.SIX_MONTH.getCode();
            }
            if(endMonth<=12){
                return PhoneNetworkLengthEnum.ONE_YEAR.getCode();
            }
            if(endMonth<=24){
                return PhoneNetworkLengthEnum.TWO_YEAR.getCode();
            }
        }
        if(NumberUtils.isNumber(start)){
            Integer startMonth = Integer.parseInt(start);
            if(startMonth>=24){
                return PhoneNetworkLengthEnum.OVER_TWO_YEAR.getCode();
            }
        }
        return PhoneNetworkLengthEnum.OTHER.getCode();
    }
    private BrPostData editAndSavePostData(String taskId, String desc, String data, String type) {
        BrPostData dataBean = new BrPostData.BrDataBuild().createTime(new Date()).taskId(taskId)
                .desc(desc).data(data).interfaceType(type).build();
        riskPostDataService.saveData(dataBean);
        return dataBean;
    }
    /**
     * 流水号
     * @return
     */
    private String getOrderId(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return "JUZIFENQI"+formatter.format(new Date())+(new Random()).nextInt(1000);
    }
}
