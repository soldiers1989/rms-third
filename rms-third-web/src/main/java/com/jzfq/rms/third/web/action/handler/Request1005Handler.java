package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.service.IJxlDataService;
import com.jzfq.rms.third.support.cache.ICountCache;
import com.jzfq.rms.third.web.action.auth.AbstractRequest;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * jxl 所有数据
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/16 18:15.
 **/
@Component("request1005Handler")
public class Request1005Handler   extends AbstractRequestHandler{
    private static final Logger log = LoggerFactory.getLogger(Request1005Handler.class);
    @Autowired
    IJxlDataService jxlDataService;

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
    protected ResponseResult bizHandle(AbstractRequest request) throws RuntimeException {
        String customerName = request.getParam("customerName").toString();
        String idCard = request.getParam("idCard").toString();
        String phone = request.getParam("phone").toString();
        Map<String,Object> commonParams = getCommonParams( request);
        JSONObject data = jxlDataService.queryJxlData(  customerName,   idCard,   phone, commonParams);
        if(data==null){
            new RuntimeException("traceId="+ TraceIDThreadLocal.getTraceID()+" 聚信立 用户报告等数据接口，返回为null");
        }
        return new ResponseResult(TraceIDThreadLocal.getTraceID(), ReturnCode.REQUEST_SUCCESS,data);
    }

    private Map<String,Object> getCommonParams(AbstractRequest request){
        Map<String,Object> commonParams = new HashMap<>();
        commonParams.put("frontId", StringUtil.getStringOfObject(request.getParam("frontId")));
        commonParams.put("isRpc",this.isRpc());
        return commonParams;
    }
}
