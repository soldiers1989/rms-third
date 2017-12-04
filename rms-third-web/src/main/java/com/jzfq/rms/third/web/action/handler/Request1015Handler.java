package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.mongo.BrPostData;
import com.jzfq.rms.third.common.domain.TJieanPhoneData;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.PhoneThreeItemEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.service.IJieAnService;
import com.jzfq.rms.third.service.IRiskPostDataService;
import com.jzfq.rms.third.service.IRmsService;
import com.jzfq.rms.third.support.cache.ICountCache;
import com.jzfq.rms.third.web.action.auth.AbstractRequestAuthentication;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;

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
    protected ResponseResult bizHandle(AbstractRequestAuthentication request) throws Exception {
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
    private ResponseResult handler01(AbstractRequestAuthentication request) throws Exception{
        String orderNo = request.getParam("orderNo").toString();
        String taskIdStr = rmsService.queryByOrderNo(TraceIDThreadLocal.getTraceID(), orderNo);
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

        List<TJieanPhoneData> list = jieAnService.getJieanData(name,idNumber,phone, InterfaceIdEnum.THIRD_JIEAN03.getCode());
        if(!CollectionUtils.isEmpty(list)){
            // 1.有效数据
            TJieanPhoneData data = list.get(0);
            // 获取老系统数据
            String rmsData = changeBairongPhone3rdinfo(data.getcResult(),bizData);
            // 保存报mongodb
            editAndSavePostData(taskIdStr, "手机三要素", rmsData, custumType);
            return new ResponseResult(TraceIDThreadLocal.getTraceID(),ReturnCode.REQUEST_SUCCESS,data.getcValue());
        }

        String isRepeatKey = getRpcControlKey(bizData);
        boolean isRpc = interfaceCountCache.isRequestOutInterface(isRepeatKey,time);

        if(!isRpc){
            return new ResponseResult(TraceIDThreadLocal.getTraceID(),ReturnCode.ACTIVE_THIRD_RPC,null);
        }
        // 2.远程调用
        bizData.put("orderId",getOrderId());
        ResponseResult result = jieAnService.getMobilecheck3item(taskIdStr, bizData);
        if(result.getCode() == ReturnCode.REQUEST_SUCCESS.code()){
            // 获取捷安 返回时长
            String threeItem = getThreeItem((JSONObject) result.getData());
            String value = getThreeItemValue(threeItem);
            try {
                // 获取老系统数据
                String rmsData = changeBairongPhone3rdinfo(threeItem,bizData);
                // 保存报mongodb
                editAndSavePostData(taskIdStr, "手机三要素", rmsData, custumType);
                // 缓存到MYSQL
                jieAnService.savePhonesData(InterfaceIdEnum.THIRD_JIEAN03.getCode(),((JSONObject)result.getData()).get("respCode").toString(),threeItem, value,bizData);
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
        StringBuilder sb = new StringBuilder("rms_third_1015_");
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
    private ResponseResult handler02(AbstractRequestAuthentication request){
        return null;
    }

    /**
     * 三要素结果转化
     * @param data
     * @return
     */
    private String getThreeItem(JSONObject data){
        return data.getString("respCode");
    }

    /**
     * 三要素结果转化
     * @param threeItem
     * @return
     */
    private static String getThreeItemValue(String threeItem){
        if(StringUtils.equals(threeItem,"000")){
            return PhoneThreeItemEnum.AGREE.getCode();
        }
        if(StringUtils.equals(threeItem,"042")) {
            return  PhoneThreeItemEnum.UNAGREE.getCode();
        }
        return PhoneThreeItemEnum.OTHER.getCode();
    }
    /**
     * rms三要素结果转化
     * @param threeItem
     * @return
     */
    private static String getRmsThreeItemValue(String threeItem){
        if(StringUtils.equals(threeItem,"000")){
            return "1";
        }
        if(StringUtils.equals(threeItem,"042")) {
            return  "2";
        }
        return "0";
    }
    /**
     * 三要素转换  获取mongo保存值
     * @param threeItem
     * @param bizData
     * @return
     */
    private static String changeBairongPhone3rdinfo(String threeItem, Map<String,Object> bizData){
        String result ="{\"swift_number\":\""+bizData.get("orderId")+"\",\"code\":600000,\"product\":{\"result\":\"1\",\"operation\":\"3\",\"costTime\":31},\"flag\":{\"flag_telCheck\":1}}";
        JSONObject json3rd = JSONObject.parseObject(result);
        JSONObject product = json3rd.getJSONObject("product");
        product.put("result",getRmsThreeItemValue(threeItem));
        product.put("operation","4");
        return json3rd.toString();
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
