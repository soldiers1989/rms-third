package com.jzfq.rms.third.web.action.handler;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.JxlDataTypeEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.mongo.JuXinLiData;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.service.IJxlDataService;
import com.jzfq.rms.third.support.cache.ICountCache;
import com.jzfq.rms.third.web.action.auth.AbstractRequest;
import com.jzfq.rms.third.web.action.parser.JuXinLinParser;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * jxl 用户报告
 *
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/16 18:15.
 **/
@Component("request1004Handler")
public class Request1004Handler extends AbstractRequestHandler {
    private static final Logger log = LoggerFactory.getLogger(Request1004Handler.class);
    @Autowired
    IJxlDataService jxlDataService;

    @Autowired
    ICountCache interfaceCountCache;
    /**
     * 超时时间 三天
     */
    private static final Long time = 3 * 24 * 60 * 60L;

    /**
     * 检查业务参数是否合法，交由子类实现。
     *
     * @param params 请求中携带的业务参数
     * @return 合法返回true，否则返回false
     */
    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        String frontId = (String) params.get("frontId");
        String customerName = (String) params.get("customerName");
        String idCard = (String) params.get("idCard");
        String phone = (String) params.get("phone");
        boolean check = StringUtils.isBlank(frontId) || StringUtils.isBlank(customerName) ||
                StringUtils.isBlank(idCard) || StringUtils.isBlank(phone);
        if (check) {
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
        return handler01(request);
    }

    /**
     * 版本01 处理器
     *
     * @param request
     * @return
     */
    private ResponseResult handler01(AbstractRequest request) throws Exception {
        String traceId = TraceIDThreadLocal.getTraceID();
        String customerName = request.getParam("customerName").toString();
        String idCard = request.getParam("idCard").toString();
        String phone = request.getParam("phone").toString();
        log.info("traceId={} 开始获取用户报告数据", traceId);
        // 根据身份证获取token
        String token = jxlDataService.getTokenByIdNumber(idCard, "2");
        // 查询数据库
        String primaryKey = JuXinLinParser.getPrimaryKey(customerName, idCard, phone, token);
        List<JuXinLiData> juXinLiDatas = jxlDataService.getJuXinLiDatas(primaryKey, JxlDataTypeEnum.JXL_DATA_TYPE_REPORT.code(), InterfaceIdEnum.THIRD_JXL02.getCode());
        if (!CollectionUtils.isEmpty(juXinLiDatas)) {
            return getData(traceId, primaryKey, juXinLiDatas);
        }
        // 远程获取数据
        return getDataByHttp(customerName, idCard, phone, request, token);
    }

    /**
     * @param traceId
     * @param primaryKey
     * @param juXinLiDatas
     * @return
     */
    private ResponseResult getData(String traceId, String primaryKey, List<JuXinLiData> juXinLiDatas) {
        JuXinLiData juXinLiData = juXinLiDatas.get(0);
        log.info("traceId={} 聚信立获取用户报告数据结束 数据库,返回结果={}",traceId,new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS,
                jxlDataService.getJuXinLiToRmsPull(primaryKey, juXinLiData)).toString());
        return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS,
                jxlDataService.getJuXinLiToRmsPull(primaryKey, juXinLiData));
    }

    /**
     * http 获取数据
     *
     * @param customerName
     * @param idCard
     * @param phone
     * @param request
     * @return
     */
    private ResponseResult getDataByHttp(String customerName, String idCard, String phone, AbstractRequest request, String token) {
        String traceId = TraceIDThreadLocal.getTraceID();
        String isRepeatKey = JuXinLinParser.getKeyByInfo(customerName, idCard, phone, token);
        boolean isRpc = interfaceCountCache.isRequestOutInterface(isRepeatKey, time);
        if (!isRpc) {
            log.info("traceId={} 聚信立获取用户报告数据 调用中");
            return new ResponseResult(traceId, ReturnCode.ACTIVE_THIRD_RPC, null);
        }
        // 远程调用
        Map<String, Object> commonParams = JuXinLinParser.getCommonParams(request);
        ResponseResult response = null;
        if (StringUtils.isNotBlank(token)) {
            response = jxlDataService.queryAccessReportData(commonParams, token, "2");
        } else {
            response = jxlDataService.queryAccessReportData(customerName, idCard, phone, commonParams);
        }
        if (response.getCode() != ReturnCode.REQUEST_SUCCESS.code()) {
            log.info("traceId={} 聚信立获取用户报告数据失败{}", traceId, response);
            interfaceCountCache.setFailure(isRepeatKey);
            return response;
        }
        log.info("traceId={} 聚信立获取用户报告数据成功，返回结果={}", traceId, response.toString());
        return response;
    }
}
