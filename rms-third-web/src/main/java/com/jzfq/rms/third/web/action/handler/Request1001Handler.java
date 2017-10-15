package com.jzfq.rms.third.web.action.handler;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.vo.EvaluationInfoVo;
import com.jzfq.rms.third.service.IGongPingjiaService;
import com.jzfq.rms.third.web.action.auth.AbstractRequestAuthentication;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/13 16:44.
 **/
@Component("request1001Handler")
public class Request1001Handler  extends AbstractRequestHandler{
    private static final Logger log = LoggerFactory.getLogger("GongPingjiaService");
    @Autowired
    private IGongPingjiaService gongPingjiaService;
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
    protected ResponseResult bizHandle(AbstractRequestAuthentication request) throws RuntimeException {
        String vin = (String)request.getParam("vin");
        String licensePlatHeader = (String)request.getParam("licensePlatHeader");
        log.info("公平价估值信息 params：【" + vin + ":"+licensePlatHeader+"】");
        List<EvaluationInfoVo> list = gongPingjiaService.queryGaopingjiaEvalation(vin, licensePlatHeader);
        ResponseResult dto = new ResponseResult("1001",ReturnCode.REQUEST_SUCCESS, list);
        log.info("公平价估值信息 params：【" + vin + ":"+licensePlatHeader+"】成功");
        return dto;
    }
}
