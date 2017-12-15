package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.JxlDataTypeEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.mongo.JuXinLiData;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.service.IJxlDataService;
import com.jzfq.rms.third.support.cache.ICountCache;
import com.jzfq.rms.third.web.action.auth.AbstractRequestAuthentication;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * jxl allot 电商数据分析
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/16 18:16.
 **/
@Component("request1006Handler")
public class Request1006Handler   extends AbstractRequestHandler {
    private static final Logger log = LoggerFactory.getLogger("JXL 1006");

    @Autowired
    IJxlDataService jxlDataService;

    @Autowired
    ICountCache interfaceCountCache;
    /**
     * 检查业务参数是否合法，交由子类实现。
     *
     * @param params 请求中携带的业务参数
     * @return 合法返回true，否则返回false
     */
    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        String frontId = (String)params.get("frontId");
        String customerName = (String)params.get("customerName");
        String idCard = (String)params.get("idCard");
        String phone = (String)params.get("phone");
        boolean check = StringUtils.isBlank(frontId)||StringUtils.isBlank(customerName)||
                StringUtils.isBlank(idCard)||StringUtils.isBlank(phone);
        if(check){
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
        return handler01(request);
    }

    /**
     * 超时时间 三天
     */
    private static final Long time = 3*24*60*60L;

    /**
     * 版本01 处理器
     * @param request
     * @return
     */
    private ResponseResult handler01(AbstractRequestAuthentication request) throws Exception{
        String traceId = TraceIDThreadLocal.getTraceID();
        String customerName = request.getParam("customerName").toString();
        String idCard = request.getParam("idCard").toString();
        String phone = request.getParam("phone").toString();
        log.info("traceId={} 开始获取用户报告数据, [{}], [{}], [{}]",traceId,customerName, phone, idCard);
        // 查询数据库
        List<JuXinLiData> juXinLiDatas = jxlDataService.getJuXinLiDatas(customerName+"_"+idCard+"_"+phone, JxlDataTypeEnum.JXL_DATA_TYPE_REPORT.code(), InterfaceIdEnum.THIRD_JXL04.getCode());
        if(!CollectionUtils.isEmpty(juXinLiDatas)){
            JuXinLiData juXinLiData = juXinLiDatas.get(0);
            log.info("traceId={} 聚信立获取用户报告数据结束");
            JSONObject result = jxlDataService.getBusinessDataAnalysis(juXinLiData.getData(),phone);
            return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS,result);
        }
        String isRepeatKey = getKeyByInfo(customerName, idCard, phone);
        boolean isRpc = interfaceCountCache.isRequestOutInterface(isRepeatKey,time);
        if(!isRpc){
            return new ResponseResult(traceId,ReturnCode.ACTIVE_THIRD_RPC,null);
        }
        // 远程调用
        Map<String,Object> commonParams = getCommonParams( request);
        ResponseResult response = jxlDataService.queryAccessRawData(customerName, idCard, phone, commonParams);
        if(response.getCode()!=ReturnCode.REQUEST_SUCCESS.code()){
            log.info("traceId={} 聚信立获取电商数据",traceId,response);
            interfaceCountCache.setFailure(isRepeatKey);
            return response;
        }
        JSONObject result = jxlDataService.getBusinessDataAnalysis((String)response.getData(),phone);
        response.setData(result);
        return response;
    }
    private Map<String,Object> getCommonParams(AbstractRequestAuthentication request){
        Map<String,Object> commonParams = new HashMap<>();
        commonParams.put("frontId", StringUtil.getStringOfObject(request.getParam("frontId")));
        return commonParams;
    }
    private String getKeyByInfo(String name, String idCard, String phone){
        StringBuilder sb = new StringBuilder("rms_third_1006_");
        sb.append(name);
        sb.append("_");
        sb.append(idCard);
        sb.append("_");
        sb.append(phone);
        return sb.toString() ;
    }
}
