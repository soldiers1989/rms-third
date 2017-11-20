package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.mongo.BrPostData;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.mongo.BairongData;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.service.IRiskPostDataService;
import com.jzfq.rms.third.service.IRmsService;
import com.jzfq.rms.third.service.impl.BrPostService;
import com.jzfq.rms.third.support.cache.ICountCache;
import com.jzfq.rms.third.web.action.auth.AbstractRequestAuthentication;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 百融分
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/17 15:03.
 **/
@Component("request1011Handler")
public class Request1011Handler extends AbstractRequestHandler {
    private static final Logger log = LoggerFactory.getLogger("Bairong 1011");

    @Autowired
    BrPostService brPostService;

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

    @Autowired
    ICountCache interfaceCountCache;
    /**
     * 超时时间 三天
     */
    private static final Long time = 3*24*60*60L;

    private static final String SPLIT_STR = "_";
    @Override
    protected boolean isRpc(Map<String, Serializable> params){
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
        String customerType = (String)params.get("customerType");
        Integer loanType = (Integer)params.get("loanType");
        if(StringUtils.isBlank(orderNo)||params.get("personInfo")==null
                || loanType==null||StringUtils.isBlank(orderNo)
                || StringUtils.isBlank(customerType)){
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

    /**
     * 版本01
     * @param request
     * @return
     */
    private ResponseResult handler01(AbstractRequestAuthentication request) throws Exception{
        String traceId = TraceIDThreadLocal.getTraceID();
        String orderNo = request.getParam("orderNo").toString();
        String taskIdStr = rmsService.queryByOrderNo(traceId, orderNo);
        Long taskId = Long.parseLong(taskIdStr);
        if(taskId==null){
            return new ResponseResult(traceId, ReturnCode.ERROR_TASK_ID_NULL,null);
        }
        String customerType =(String) request.getParam("customerType");
        Integer loanType = (Integer)request.getParam("loanType");
        RiskPersonalInfo info = JSONObject.parseObject(request.getParam("personInfo").toString(),
                RiskPersonalInfo.class);
        Integer type = Integer.parseInt(customerType);
        // 1.搜索mongo中是否存在
        JSONObject jsonObject = riskPostDataService.getBairongData(info.getName(), info.getCertCardNo(),info.getMobile(),customerType);
        if(null != jsonObject){
            BrPostData data = buildPostData(taskIdStr, "拉取数据集合信息信息", jsonObject.toJSONString(), customerType.toString());
            //保存rms系统数据结构
            riskPostDataService.saveData(data);
            return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS,jsonObject);
        }
        // 2.判断是否远程拉取
        String isRepeatKey = getKeyPersonalInfo(info);
        boolean isRpc = interfaceCountCache.isRequestOutInterface(isRepeatKey,time);
        if(!isRpc){
            return new ResponseResult(traceId,ReturnCode.ACTIVE_THIRD_RPC,null);
        }
        // 3.远程拉取
        String result = null;
        try{
            result = brPostService.getApiData(info,type,loanType,getCommonParams(request));
        }catch (Exception e){
            interfaceCountCache.setFailure(isRepeatKey);
            log.error("traceId={} 保存数据失败",traceId,e);
            throw e;
        }
        if (StringUtil.checkNotEmpty(result)) {
            try{
                BrPostData data = buildPostData(taskIdStr, "拉取数据集合信息信息", result, customerType.toString());
                //保存rms系统数据结构
                riskPostDataService.saveData(data);
                BairongData baiRongScore = buildBairongData(info.getName(), info.getCertCardNo(), info.getMobile(),
                        customerType,result);
                riskPostDataService.saveData(baiRongScore);
            }catch (Exception e) {
                log.error("traceId={} 保存数据失败",traceId,e);
                interfaceCountCache.setFailure(isRepeatKey);
            }
            return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS,result);
        }
        interfaceCountCache.setFailure(isRepeatKey);
        return new ResponseResult(traceId, ReturnCode.ERROR_RESPONSE_NULL,result);
    }

    /**
     * 构建 老rms系统 百融数据结构
     * @param taskId
     * @param desc
     * @param data
     * @param type
     * @return
     */
    private BrPostData buildPostData(String taskId, String desc, String data, String type) {
        BrPostData dataBean = new BrPostData.BrDataBuild().createTime(new Date()).taskId(taskId)
                .desc(desc).data(data).interfaceType(type).build();
        return dataBean;
    }


    private BairongData buildBairongData(String name, String certCardNo, String mobile, String type,String data) {
        BairongData dataBean = new BairongData.BairongDataBuild().createTime(new Date()).name(name)
                .certCardNo(certCardNo).mobile(mobile).type(type).data(data).build();
        return dataBean;
    }
    /**
     * 获取 唯一Key
     * @return
     */
    private String getKeyPersonalInfo(RiskPersonalInfo info){
        StringBuilder sb = new StringBuilder("rms_third_1011_");
        sb.append(info.getName());
        sb.append("_");
        sb.append(info.getCertCardNo());
        sb.append("_");
        sb.append(info.getMobile());
        return sb.toString();
    }
    /**
     * 版本02
     * @param request
     * @return
     */
    private ResponseResult handler02(AbstractRequestAuthentication request) throws Exception{
        String traceId = TraceIDThreadLocal.getTraceID();
        String customerType =(String) request.getParam("customerType");
        String orderNo = request.getParam("orderNo").toString();
        String taskId = rmsService.queryByOrderNo(traceId, orderNo);
        Integer loanType = (Integer)request.getParam("loanType");
        RiskPersonalInfo info = JSONObject.parseObject(request.getParam("personInfo").toString(),
                RiskPersonalInfo.class);
        Integer type = Integer.parseInt(customerType);
        JSONObject jsonObject = (JSONObject) riskPostDataService.queryData(Long.parseLong(taskId),type);
        if(!CollectionUtils.isEmpty(jsonObject) && jsonObject.size() > 2){
            return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS,jsonObject);
        }
        Map<String,Object> commonParams = getCommonParams( request);
        commonParams.put("customerType",customerType);
        commonParams.put("loanType",loanType);
        commonParams.put("personInfo",info);
        String result = brPostService.getApiData(info, type,loanType, commonParams);
        if (StringUtil.checkNotEmpty(result)) {
            BrPostData data = buildPostData(taskId, "", result, customerType.toString());
            //保存信息，并且更新任务
            riskPostDataService.saveData(data);
            return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS,data);
        }
        return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS,jsonObject);
    }


    private Map<String,Object> getCommonParams(AbstractRequestAuthentication request){
        Map<String,Object> commonParams = new HashMap<>();
        commonParams.put("frontId", StringUtil.getStringOfObject(request.getParam("frontId")));
        commonParams.put("isRpc",this.isRpc());
        return commonParams;
    }


}
