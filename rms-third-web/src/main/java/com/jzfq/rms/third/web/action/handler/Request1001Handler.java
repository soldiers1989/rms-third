package com.jzfq.rms.third.web.action.handler;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.common.vo.EvaluationInfoVo;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.exception.BusinessException;
import com.jzfq.rms.third.service.IGongPingjiaService;
import com.jzfq.rms.third.web.action.auth.AbstractRequestAuthentication;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/13 16:44.
 **/
@Component("request1001Handler")
public class Request1001Handler  extends AbstractRequestHandler{
    private static final Logger log = LoggerFactory.getLogger(Request1001Handler.class);
    @Autowired
    private IGongPingjiaService gongPingjiaService;

    /**
     * 是否控制重复调用
     *
     * @return 合法返回true，否则返回false
     */
    @Override
    protected boolean isCheckRepeat() {
        return false;
    }

    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        String vin = (String)params.get("vin");
        String licensePlatHeader = (String)params.get("licensePlatHeader");
        if(StringUtils.isBlank(vin)||StringUtils.isBlank(licensePlatHeader)){
            return false;
        }
        return true;
    }

    @Override
    protected ResponseResult bizHandle(AbstractRequestAuthentication request) throws Exception {
        if(StringUtils.equals("01",request.getApiVersion())){
            return handlerOfVersion01(request);
        }
        return handlerOfVersion01(request);
    }

    /**
     * 版本10
     * @param request
     * @return
     */
    private ResponseResult handlerOfVersion01(AbstractRequestAuthentication request) throws BusinessException{
        String vin = (String)request.getParam("vin");
        String licensePlatHeader = (String)request.getParam("licensePlatHeader");
        log.info("traceID={} 公平价估值信息 params：【" + vin + ":"+licensePlatHeader+"】",TraceIDThreadLocal.getTraceID());
        Map<String,Object> commonParams = getCommonParams(request);
        ResponseResult result = gongPingjiaService.queryCarEvaluations( vin, licensePlatHeader.toUpperCase(),commonParams);
        log.info("traceID={} 公平价估值信息 params：【" + vin + ":"+licensePlatHeader+"】结束 {}",TraceIDThreadLocal.getTraceID(),result.getMsg());
        return result;
    }

    private Map<String,Object> getCommonParams(AbstractRequestAuthentication request){
        Map<String,Object> commonParams = new HashMap<>();
        commonParams.put("frontId", StringUtil.getStringOfObject(request.getParam("frontId")));
        return commonParams;
    }
}
