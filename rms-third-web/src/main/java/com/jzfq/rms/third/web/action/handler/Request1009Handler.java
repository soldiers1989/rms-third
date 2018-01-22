package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.service.ITdDataService;
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
 * 同盾保镖
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/16 18:19.
 **/
@Component("request1009Handler")
public class Request1009Handler extends AbstractRequestHandler {
    private static final Logger log = LoggerFactory.getLogger(Request1009Handler.class);

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
        String appName = (String)params.get("appName");
        if(StringUtils.isBlank(frontId)||StringUtils.isBlank(orderNo)
                ||StringUtils.isBlank(appName)
                ||params.get("info")==null){
            return false;
        }
        return true;
    }

    @Autowired
    ITdDataService tdDataService;
    /**
     * 业务处理，交由子类实现。
     *
     * @param request 请求实体
     * @return 响应
     */
    @Override
    protected ResponseResult bizHandle(AbstractRequest request) throws Exception {

        return handler01(request);
    }
    /**
     * 版本01 处理器
     * @param request
     * @return
     */
    private ResponseResult handler01(AbstractRequest request) throws Exception{
        String traceId = TraceIDThreadLocal.getTraceID();
        String orderNo = request.getParam("orderNo").toString();
        String appName = request.getParam("appName").toString();
        Map<String, Object> info = JSONObject.parseObject(request.getParam("info").toString(),
                HashMap.class);
        return tdDataService.getTdBodyGuard(appName, info);
    }
}
