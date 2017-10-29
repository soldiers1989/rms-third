package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONObject;
import com.br.bean.MerchantBean;
import com.br.bean.TerBean;
import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.enums.BrPostUrl;
import com.jzfq.rms.enums.ProductTypeEnum;
import com.jzfq.rms.mongo.BrPostData;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
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
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 百融分
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/17 15:03.
 **/
@Component("request1011Handler")
public class Request1011Handler extends AbstractRequestHandler{
    private static final Logger log = LoggerFactory.getLogger("Bairong 1011");

    @Autowired
    BrPostService brPostService;

    @Autowired
    IRiskPostDataService riskPostDataService;

    @Autowired
    IRmsService rmsService;

    private Map<Integer, String> urls = new HashMap<Integer, String>(10);

    {
        urls.put(BrPostService.OFFICE_TYPE, BrPostUrl.OFFICE_LIST);
        urls.put(BrPostService.STU_TYPE, BrPostUrl.STU_LIST);
        urls.put(BrPostService.OFFICE_TYPE_XJD, BrPostUrl.OFFICE_LIST_XJD);
        urls.put(BrPostService.STU_TYPE_XJD, BrPostUrl.STU_LIST_XJD);
    }
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
//        String orderNo = (String)params.get("orderNo");
//        String customerType = (String)params.get("customerType");
//        String personInfo = (String)params.get("personInfo");
//        String phone = (String)params.get("phone");
//        String custumType = (String)params.get("custumType");
//        if(StringUtils.isBlank(orderNo)||StringUtils.isBlank(name)
//                || StringUtils.isBlank(idNumber)||StringUtils.isBlank(phone)
//                || StringUtils.isBlank(custumType)){
//            return false;
//        }
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
        String traceId = TraceIDThreadLocal.getTraceID();
        String customerType =(String) request.getParam("customerType");
        String orderNo = request.getParam("orderNo").toString();
        String taskId = rmsService.queryByOrderNo(traceId, orderNo);
        Integer loanType = (Integer)request.getParam("loanType");
        RiskPersonalInfo info = JSONObject.parseObject(request.getParam("personInfo").toString(),
                RiskPersonalInfo.class);
        Integer type = Integer.parseInt(customerType);
        String url = "";
        if (loanType == ProductTypeEnum.CASH_LOAN.getCode().byteValue()){
            int customerTypeNum = type + 2;
            url = urls.get(customerTypeNum);                //现金贷，需要换取百融分的接口
        }else {
            url = urls.get(type);
        }
        TerBean terBean = createBean(url, info, type);
        JSONObject jsonObject = (JSONObject) riskPostDataService.queryData(Long.parseLong(taskId),type);
        if(!CollectionUtils.isEmpty(jsonObject) && jsonObject.size() > 2){
            return new ResponseResult(traceId,ReturnCode.REQUEST_SUCCESS,jsonObject);
        }
        Map<String,Object> commonParams = getCommonParams( request);
        String result = brPostService.getApiData(terBean, type,commonParams);
        if (StringUtil.checkNotEmpty(result)) {
            BrPostData data = buildPostData(taskId, "", result, customerType.toString());
            //保存信息，并且更新任务
            riskPostDataService.saveData(data);
            return new ResponseResult(traceId,ReturnCode.REQUEST_SUCCESS,data);
        }
        return new ResponseResult(traceId,ReturnCode.REQUEST_SUCCESS,jsonObject);
    }

    private BrPostData buildPostData(String taskId, String desc, String data, String type) {
        BrPostData dataBean = new BrPostData.BrDataBuild().createTime(new Date()).taskId(taskId)
                .desc(desc).data(data).interfaceType(type).build();
        return dataBean;
    }

    private Map<String,Object> getCommonParams(AbstractRequestAuthentication request){
        Map<String,Object> commonParams = new HashMap<>();
        commonParams.put("frontId", StringUtil.getStringOfObject(request.getParam("frontId")));
        commonParams.put("isRpc",this.isRpc());
        return commonParams;
    }

    /**
     * 创建批量查询的bean
     *
     * @param url
     * @param info
     * @param type
     * @return
     */
    private TerBean createBean(String url, RiskPersonalInfo info, int type) {
        TerBean bean = new TerBean();
        bean.setMeal(url);
        bean.setApicode(brPostService.getApiCode(type));
        bean.setId(info.getCertCardNo());
        bean.setName(info.getName());
        bean.setCell(info.getMobile());
        bean.setApiType("ter");
        return bean;
    }
}
