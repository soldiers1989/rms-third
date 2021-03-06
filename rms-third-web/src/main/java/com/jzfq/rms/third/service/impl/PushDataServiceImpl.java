package com.jzfq.rms.third.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseDTO;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.httpclient.HttpConnectionManager;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.service.IMonitorService;
import com.jzfq.rms.third.service.IPushDataService;
import com.jzfq.rms.third.support.pool.ThreadProvider;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @description 推送同盾/百融数据服务接口实现
 */
@Service
public class PushDataServiceImpl implements IPushDataService {

    private static final Logger log = LoggerFactory.getLogger(PushDataServiceImpl.class);
    //请求push url
    @Value("${rms.api.push.url}")
    private String apiUrl;
    //百融私钥key
    @Value("${thirdToCustomerBr}")
    private String thirdToCustomerBr;
    //百融私钥key
    @Value("${thirdToCustomerTd}")
    private String thirdToCustomerTd;

    /**
     * 将参数推送到push内部系统
     *
     * @param traceId
     * @param scoreType
     * @param score
     * @param idcard
     * @param orderNo
     * @return
     */

    @Override
    public void pushData(String traceId, String scoreType, String score, String idcard, String orderNo) {
        pushDataToRmsPush(traceId, scoreType, score, idcard, orderNo);
    }


    /**
     * 将推送请求放到线程池中统一管理
     *
     * @return
     */

    public void pushDataToRmsPush(String traceId, String scoreType, String result, String idcard, String orderNo) {
        ThreadProvider.getThreadPool().execute(() -> {
            requestPushParams(traceId, scoreType, result, idcard, orderNo);
        });

    }

    /**
     * 封装参数
     *
     * @return
     */
    public void requestPushParams(String traceId, String scoreType, String result, String idcard, String orderNo) {
        //封装推送数据
        log.info("开始推送数据到push系统流水号traceID：", traceId);
        JSONObject jsonData = new JSONObject();
        jsonData.put(scoreType, result);
        jsonData.put("idcard", idcard  );
        jsonData.put("orderNo", orderNo);
        JSONObject jsonParams = new JSONObject();
        if ("tdscore".equals(scoreType)) {
            jsonParams.put("pushkey", thirdToCustomerTd);
        } else if ("brscore".equals(scoreType)) {
            jsonParams.put("pushkey", thirdToCustomerBr);
        }
        jsonParams.put("sourceID", 1);//风控rms
        jsonParams.put("targetID", 7);//third
        jsonParams.put("sendtype", 2);//http
        jsonParams.put("sendparam", jsonData.toString());
        Map<String, String> map = new HashMap<String, String>();
        map.put("params", jsonParams.toString());
        log.info("推送push系统数据参数封装完成："+ map.toString());
        //開始推送
        doPostData(traceId, map);
    }

    /**
     * 发起请求1
     *
     * @return
     */
    public void doPostData(String traceId, Map<String, String> params) throws RuntimeException {
        log.info("traceId:" + traceId + " 推送push系统apiUrl" + apiUrl + "，推送数据：" + params);
        try {
            ResponseResult dto = HttpConnectionManager.doPost(apiUrl, params);
            Object respose = dto.getData();
            ResponseDTO responseDTO = JSONObject.parseObject((String) respose, ResponseDTO.class);
            if (null != responseDTO) {
                // 调用日志存入数据库
                log.info("推送push系统返回結果通知：" + responseDTO);
            }
        } catch (Exception e) {
            log.info("推送push系统发生异常：", e.getMessage());
        }
    }


}
