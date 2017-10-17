package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.service.IJxlDataService;
import com.jzfq.rms.third.web.action.auth.AbstractRequestAuthentication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Map;

/**
 * jxl 用户报告
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/16 18:15.
 **/
public class Request1004Handler   extends AbstractRequestHandler {
    private static final Logger log = LoggerFactory.getLogger("JXL 1004");
    @Autowired
    IJxlDataService jxlDataService;
    /**
     * 检查业务参数是否合法，交由子类实现。
     *
     * @param params 请求中携带的业务参数
     * @return 合法返回true，否则返回false
     */
    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        return true;
    }

    /**
     * 业务处理，交由子类实现。
     *
     * @param request 请求实体
     * @return 响应
     */
    @Override
    protected ResponseResult bizHandle(AbstractRequestAuthentication request) throws RuntimeException {
        String traceId = request.getParam("traceId").toString();
        String customerName = request.getParam("customerName").toString();
        String idCard = request.getParam("idCard").toString();
        String phone = request.getParam("phone").toString();
        JSONObject data = jxlDataService.queryAccessReportData(  customerName,   idCard,   phone);
        return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS,data);
    }
}
