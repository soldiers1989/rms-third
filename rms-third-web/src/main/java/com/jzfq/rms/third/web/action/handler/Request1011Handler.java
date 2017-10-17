package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONObject;
import com.br.bean.MerchantBean;
import com.jzfq.rms.mongo.BrPostData;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.service.IRiskPostDataService;
import com.jzfq.rms.third.service.impl.BrPostService;
import com.jzfq.rms.third.web.action.auth.AbstractRequestAuthentication;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

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
        String taskId = request.getParam("taskId").toString();
        String fraudId = request.getParam("fraudId").toString();
        Integer customerType = Integer.parseInt(request.getParam("customerType").toString());
        MerchantBean bean = JSONObject.parseObject(request.getParam("personInfo").toString(),
                MerchantBean.class);
        String id = StringUtils.isBlank(taskId)?fraudId:taskId;

        JSONObject jsonObject = (JSONObject) riskPostDataService.queryData(Long.parseLong(id),customerType);
        if(!CollectionUtils.isEmpty(jsonObject) && jsonObject.size() > 2){
            return new ResponseResult(traceId,ReturnCode.REQUEST_SUCCESS,jsonObject);
        }
        String result = brPostService.getApiData(bean, customerType);
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
}
