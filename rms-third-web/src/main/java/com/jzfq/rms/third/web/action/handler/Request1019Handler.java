package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.mongo.BairongData;
import com.jzfq.rms.third.common.mongo.TongDunData;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.service.IRiskPostDataService;
import com.jzfq.rms.third.service.ITdDataService;
import com.jzfq.rms.third.web.action.auth.AbstractRequest;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Map;

/**
 * 小桔汇金 同盾百融
 * @author 大连桔子分期科技有限公司
 * @date 2017/12/18 13:11.
 **/
@Component("request1019Handler")
public class Request1019Handler extends AbstractRequestHandler {
    private static final Logger log = LoggerFactory.getLogger(Request1019Handler.class);
    /**
     * 检查业务参数是否合法，交由子类实现。
     *
     * @param params 请求中携带的业务参数
     * @return 合法返回true，否则返回false
     */
    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        String name = (String)params.get("name");
        String certCardNo = (String)params.get("certCardNo");
        if(StringUtils.isBlank(name)||StringUtils.isBlank(certCardNo)){
            return false;
        }
        return true;
    }
    @Autowired
    ITdDataService tdDataService;
    @Autowired
    IRiskPostDataService riskPostDataService;
    /**
     * 业务处理，交由子类实现。
     *
     * @param request 请求实体
     * @return 响应
     */
    @Override
    protected ResponseResult bizHandle(AbstractRequest request) throws Exception {

        String name = request.getParam("name").toString();
        String certCardNo = request.getParam("certCardNo").toString();
        log.info("traceId={} 小桔汇金接口 1019 开始", TraceIDThreadLocal.getTraceID());
        JSONObject result = new JSONObject();
        boolean isSuccess = false;
        // 百融
        BairongData bairongData = riskPostDataService.getBairongData(name, certCardNo);
        if(bairongData!=null){
            result.put("brScore",bairongData.getData());
            isSuccess = true;
        }
        // 同盾
        TongDunData tongDunData = tdDataService.getTongDongData(name, certCardNo);
        if(tongDunData!=null){
            result.put("tdScore",tongDunData.getApiResp());
            result.put("tdDetail",tongDunData.getRuleDetailResult());
            isSuccess = true;
        }
        if(isSuccess){
            log.info("traceId={} 小桔汇金接口 1019 结束", TraceIDThreadLocal.getTraceID());
            return new ResponseResult(TraceIDThreadLocal.getTraceID(), ReturnCode.REQUEST_SUCCESS, result);
        }
        return new ResponseResult(TraceIDThreadLocal.getTraceID(),ReturnCode.ERROR_RESPONSE_NULL, request);
    }
}
