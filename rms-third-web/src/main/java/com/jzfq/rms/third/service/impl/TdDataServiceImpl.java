package com.jzfq.rms.third.service.impl;

import cn.fraudmetrix.riskservice.RuleDetailResult;
import cn.fraudmetrix.riskservice.object.Environment;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.enums.ApplyChannelEnum;
import com.jzfq.rms.enums.ProductTypeEnum;
import com.jzfq.rms.mongo.TdData;
import com.jzfq.rms.mongo.TdHitRuleData;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.*;
import com.jzfq.rms.third.common.mongo.TongDunData;
import com.jzfq.rms.third.common.pojo.tongdun.FraudApiResponse;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.persistence.dao.ITdDao;
import com.jzfq.rms.third.service.IRmsService;
import com.jzfq.rms.third.service.ISendMessageService;
import com.jzfq.rms.third.service.ITdDataService;
import com.jzfq.rms.third.support.cache.ICache;
import com.jzfq.rms.third.support.pool.ThreadProvider;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @description 同盾数据服务实现
 * @author 大连桔子分期科技有限公司
 */
@Service("tdDataService")
public class TdDataServiceImpl implements ITdDataService {
    private static final Logger log = LoggerFactory.getLogger("postLogger");
    private static final Logger noticeLog= LoggerFactory.getLogger("noticeLogger");

    @Value("${td.data.partner_code}")
    private String partner_code;
    @Value("${td.data.partner_key}")
    private String partner_key;
    @Value("${td.data.env}")
    private String urlEnv;
    @Value("${td.data.bodyGuardApiUrl}")
    private String bodyGuardApiUrl;

    @Value("${td.data.apiUrl}")
    private String apiUrl;

    @Value("${td.data.bt_ios_secret_key}")
    private String bt_ios_secret_key;
    @Value("${td.data.bt_android_secret_key}")
    private String bt_android_secret_key;
    @Value("${td.data.jzfq_ios_secret_key}")
    private String jzfq_ios_secret_key;
    @Value("${td.data.jzfq_android_secret_key}")
    private String jzfq_android_secret_key;
    @Value("${td.data.jzfq_h5_secret_key}")
    private String jzfq_h5_secret_key;

    @Value("${td.data.loan.bt.ios.event_id}")
    private String bt_ios_loan_event_id;
    @Value("${td.data.trade.bt.ios.event_id}")
    private String bt_ios_trade_event_id;
    @Value("${td.data.loan.bt.android.event_id}")
    private String bt_android_loan_event_id;
    @Value("${td.data.trade.bt.android.event_id}")
    private String bt_android_trade_event_id;
    @Value("${td.data.loan.jzfq.ios.event_id}")
    private String jzfq_ios_loan_event_id;
    @Value("${td.data.trade.jzfq.ios.event_id}")
    private String jzfq_ios_trade_event_id;
    @Value("${td.data.loan.jzfq.android.event_id}")
    private String jzfq_android_loan_event_id;
    @Value("${td.data.trade.jzfq.android.event_id}")
    private String jzfq_android_trade_event_id;
    @Value("${td.data.loan.jzfq.h5.event_id}")
    private String jzfq_h5_loan_event_id;
    @Value("${td.data.trade.jzfq.h5.event_id}")
    private String jzfq_h5_trade_event_id;

    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    ITdDao tdDao;

    private String eventId;

    private Map<String, Object> getBizParams(RiskPersonalInfo info){
        Map<String, Object> result = new HashMap<String, Object>();
        //写个人信息的查询
        StringBuilder builder = new StringBuilder();
        builder.append("param [");
        if (info.getName() != null){
            result.put("account_name", info.getName());                     //  姓名
            builder.append(" account_name = " + info.getName() + " ");
        }
        if (info.getCertCardNo() != null){
            result.put("id_number", info.getCertCardNo());                  //  身份证号
            builder.append(" id_number = " + info.getCertCardNo() + " ");
        }
        if (info.getMobile() != null){
            result.put("account_mobile", info.getMobile());                  //  手机号
            builder.append(" account_mobile = " + info.getMobile() + " ");
        }
        if (info.getBankNo() != null){
            result.put("card_number", info.getBankNo());                    //  银行卡号
            builder.append(" card_number = " + info.getBankNo() + " ");
        }
        if (info.getEmail() != null){
            result.put("account_email", info.getEmail());                   //  邮箱
            builder.append(" account_email = " + info.getEmail() + " ");
        }
        if (info.getQq() != null){
            result.put("qq_number", info.getQq());                          //  qq
            builder.append(" qq_number = " + info.getQq() + " ");
        }
        builder.append(" ]");
        log.info("traceId={} apiUrl ={} 执行参数列表：{}", TraceIDThreadLocal.getTraceID(), apiUrl, builder.toString());
        return result;
    }
    @Autowired
    IRmsService rmsService;
    /**
     *
     * @param orderNo
     */
    @Override
    public void saveResult(String orderNo, FraudApiResponse apiResp) {
        String traceId = TraceIDThreadLocal.getTraceID();
        try{
            ThreadProvider.getThreadPool().execute(() ->  {
                String taskId = rmsService.queryByOrderNo(traceId, orderNo);
                TongDunData tongDunData = new TongDunData();
                tongDunData.setOrderNo(orderNo);
                tongDunData.setCreateTime(new Date());
                tongDunData.setApiResp(apiResp);

                //同盾信息写入mongo
                if(StringUtils.isNotBlank(taskId)){
                    TdHitRuleData tdHitRuleData = new TdHitRuleData(null,
                            "同盾规则命中信息", new Date());
                    tdHitRuleData.setTaskId(taskId);
                    if(apiResp.getDevice_info()!=null && apiResp.getDevice_info().get("deviceId")!=null){
                        tdHitRuleData.setData(apiResp.getDevice_info().get("deviceId").toString());
                    }
                    log.info("traceId= {} 同盾拉取结果：{} --同盾分= {} 拉取结果:{}"
                            ,traceId,apiResp.getSuccess(),apiResp.getFinal_score(),apiResp.toString());     //是否成功
                    try{
                        BeanUtils.copyProperties(tdHitRuleData, apiResp);
                    }catch (Exception e){
                        log.error("保存数据 订单号为{} 克隆数据",orderNo,e);
                    }
                    if (tdHitRuleData==null){
                        log.info("保存数据 订单号为{}获取同盾是返回的结果为null",orderNo);
                        return ;
                    }
                    mongoTemplate.insert(tdHitRuleData);
                }
                String sequenceId = apiResp.getSeq_id();
                if (StringUtils.isBlank(sequenceId)){
                    log.info("保存数据 订单号为{}获取同盾是返回的结果seq_id为空",orderNo);
                    return ;
                }
                //通过seqid 查询 同盾规则详情，保存到mongo
                RuleDetailResult ruleDetailResult = getTdRuleData(taskId,  sequenceId,  traceId);
                tongDunData.setRuleDetailResult(ruleDetailResult);
                mongoTemplate.insert(tongDunData);
            });
        }catch (Exception e){
            log.info("保存数据 订单号为{}异常",e);
        }
    }

    /**
     * 根据订单号 获取同盾数据
     *
     * @param orderNo
     * @return
     */
    @Override
    public List<TongDunData> getTongDongData(String orderNo) {
        List<TongDunData> datas = mongoTemplate.find(new Query(Criteria.where("orderNo").is(orderNo))
                , TongDunData.class);
        return datas;
    }

    /**
     * 把同盾命中的规则，保存到mongo
     * @param data
     */
    private void saveTdData(TdData data) {
        log.info("开始入库...");
        try {
            mongoTemplate.insert(data);
        } catch (Exception e) {
            log.error("入库失败", e);
        }
        log.info("入库结束...");
    }

    /**
     * 按照应用划分
     * @param loanType
     * @param channel
     * @param traceId
     * @return
     */
    private String getSecret2(Integer loanType, String channel, String traceId){
        if (Objects.equals(loanType, ProductTypeEnum.CAR_ORDER.getCode().byteValue())
                || Objects.equals(loanType, ProductTypeEnum.CAR_QUOTA.getCode().byteValue())){
            if (ApplyChannelEnum.APP.getCode().equals(channel) || ApplyChannelEnum.ANDROID.getCode().equals(channel) || ApplyChannelEnum.ANDROID_ENGLISH.getCode().equalsIgnoreCase(channel)){
                if (ProductTypeEnum.CAR_ORDER.getCode().byteValue() == loanType){
                    eventId = bt_android_trade_event_id;
                    log.info("traceId[{}] 渠道[{}] 类型交易",traceId,ApplyChannelEnum.getName(channel));
                }else {
                    eventId = bt_android_loan_event_id;
                    log.info("traceId[{}] 渠道[{}] 类型借款",traceId,ApplyChannelEnum.getName(channel));
                }
                return bt_android_secret_key;
            }else {
                if (ProductTypeEnum.CAR_ORDER.getCode().byteValue() == loanType){
                    eventId = bt_ios_trade_event_id;
                    log.info("traceId[{}] 渠道[{}] 类型交易",traceId,ApplyChannelEnum.getName(channel));
                }else {
                    log.info("traceId[{}] 渠道[{}] 类型借款",traceId,ApplyChannelEnum.getName(channel));
                    eventId = bt_ios_loan_event_id;
                }
                return bt_ios_secret_key;
            }
        }else {
            if (ApplyChannelEnum.APP.getCode().equals(channel) || ApplyChannelEnum.ANDROID.getCode().equals(channel) || ApplyChannelEnum.ANDROID_ENGLISH.getCode().equalsIgnoreCase(channel)){
                if (ProductTypeEnum.FENQI_ORDER.getCode().byteValue() == loanType || ProductTypeEnum.COMMERCIAL.getCode().byteValue() == loanType){
                    log.info("traceId["+traceId+"] 渠道["+ ApplyChannelEnum.getName(channel)+"] 类型交易");
                    eventId = jzfq_android_trade_event_id;
                }else {
                    log.info("traceId["+traceId+"] 渠道["+ ApplyChannelEnum.getName(channel)+"] 类型借款");
                    eventId = jzfq_android_loan_event_id;
                }
                return jzfq_android_secret_key;
            }
            if (ApplyChannelEnum.IOS.getCode().equalsIgnoreCase(channel)){
                if (ProductTypeEnum.FENQI_ORDER.getCode().byteValue() == loanType || ProductTypeEnum.COMMERCIAL.getCode().byteValue() == loanType){
                    log.info("traceId[{}] 渠道[{}] 类型交易",traceId,ApplyChannelEnum.getName(channel));
                    eventId = jzfq_ios_trade_event_id;
                }else {
                    log.info("traceId[{}] 渠道[{}] 类型借款",traceId,ApplyChannelEnum.getName(channel));
                    eventId = jzfq_ios_loan_event_id;
                }
                return jzfq_ios_secret_key;
            }
            if (ApplyChannelEnum.PC.getCode().equals(channel) || ApplyChannelEnum.H5.getCode().equals(channel)){
                if (ProductTypeEnum.FENQI_ORDER.getCode().byteValue() == loanType || ProductTypeEnum.COMMERCIAL.getCode().byteValue() == loanType){
                    log.info("traceId[{}] 渠道[{}] 类型交易",traceId,ApplyChannelEnum.getName(channel));
                    eventId = jzfq_h5_trade_event_id;
                }else {
                    log.info("traceId[{}] 渠道[{}] 类型借款",traceId,ApplyChannelEnum.getName(channel));
                    eventId = jzfq_h5_loan_event_id;
                }
                return jzfq_h5_secret_key;
            }
        }
        return "";
    }

    @Autowired
    ICache prefixCache;

    /**
     * 按照应用划分
     * @param channelId
     * @param financialProductId
     * @param operationType
     * @param clientType
     * @return
     */
    private String getEventId(String channelId, String financialProductId, String operationType, String clientType){
        StringBuilder key = new StringBuilder();
        key.append(channelId).append("_").append(financialProductId).append("_").append(clientType).append("_").append(operationType);
        return StringUtil.getStringOfObject(prefixCache.readConfig(key.toString()));
    }

    private String getSecretKey(String channelId, String clientType){
        if(StringUtils.equals(channelId, ChannelIdEnum.JZFQ.getCode())){
            if(StringUtils.equals(clientType, ClientTypeEnum.IOS.getCode())){
                return jzfq_ios_secret_key;
            }
            if(StringUtils.equals(clientType, ClientTypeEnum.AND.getCode())){
                return jzfq_android_secret_key;
            }
            return jzfq_h5_secret_key;
        }
        if(StringUtils.equals(channelId, ChannelIdEnum.CZBT.getCode())){
            if(StringUtils.equals(clientType, ClientTypeEnum.IOS.getCode())){
                return bt_ios_secret_key;
            }
            if(StringUtils.equals(clientType, ClientTypeEnum.AND.getCode())){
                return bt_android_secret_key;
            }
            return "";// bt_h5_loan_event_id;
        }
        return "";
    }
    @Autowired
    ISendMessageService sendMessegeService;

    /**
     *
     * @param commonParams
     * @return
     * @throws Exception
     */
    @Override
    public ResponseResult queryTdDatas(Map<String,Object> commonParams)  throws Exception  {
        RiskPersonalInfo info = (RiskPersonalInfo)commonParams.get("personalInfo");
        String traceId = TraceIDThreadLocal.getTraceID();
        String taskId = (String)commonParams.get("taskId");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("partner_code", partner_code);       // 合作方标识
        String channelId = (String)commonParams.get("channelId");
        String financialProductId = (String)commonParams.get("financialProductId");
        String operationType = (String)commonParams.get("operationType");
        String clientType = (String)commonParams.get("clientType");
        String eventId = getEventId(channelId, financialProductId, operationType, clientType);
        String sceretKey = getSecretKey(channelId, clientType);
        params.put("secret_key", sceretKey); // app密钥
        params.put("event_id", eventId); // 策略集上的事件标识
        //写个人信息的查询
        StringBuilder builder = new StringBuilder();
        builder.append("param [");
        if (info.getName() != null){
            params.put("account_name", info.getName());                     //  姓名
            builder.append(" account_name = " + info.getName() + " ");
        }
        if (info.getCertCardNo() != null){
            params.put("id_number", info.getCertCardNo());                  //  身份证号
            builder.append(" id_number = " + info.getCertCardNo() + " ");
        }
        if (info.getMobile() != null){
            params.put("account_mobile", info.getMobile());                  //  手机号
            builder.append(" account_mobile = " + info.getMobile() + " ");
        }
        if (info.getBankNo() != null){
            params.put("card_number", info.getBankNo());                    //  银行卡号
            builder.append(" card_number = " + info.getBankNo() + " ");
        }
        if (info.getEmail() != null){
            params.put("account_email", info.getEmail());                   //  邮箱
            builder.append(" account_email = " + info.getEmail() + " ");
        }
        if (info.getQq() != null){
            params.put("qq_number", info.getQq());                          //  qq
            builder.append(" qq_number = " + info.getQq() + " ");
        }
        builder.append(" ]");
        log.info("apiUrl = {} 执行参数列表：{} " ,apiUrl,builder.toString());
        //公共参数
        commonParams.put("url",apiUrl);
        commonParams.put("targetId", SystemIdEnum.THIRD_TD.getCode());
        commonParams.put("appId", "");
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_TD01.getCode());
        commonParams.put("systemId", SystemIdEnum.RMS_THIRD.getCode());
        commonParams.put("traceId", TraceIDThreadLocal.getTraceID());

        commonParams.put("taskId", taskId);

        log.info("traceId={} 参数列表：{} " ,traceId,  builder.toString());
        ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.TD01.getCode(),commonParams,params);
        return response;
    }


    private RuleDetailResult getTdRuleData(String taskId,String sequenceId,String traceId){
        Environment env = null;
        // Environment.PRODUCT表示调用生产环境, 测试环境请修改为Environment.SANDBOX
        if (Objects.equals(urlEnv, "prd")){
            env = Environment.PRODUCT;
        }else {
            env = Environment.SANDBOX;
        }
        Map<String,Object> commonParams = new HashMap<>();
        commonParams.put("url",env.getRuleDetailUrl());
        commonParams.put("targetId", SystemIdEnum.THIRD_TD.getCode());
        commonParams.put("appId", "");
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_TD02.getCode());
        commonParams.put("systemId", SystemIdEnum.RMS_THIRD.getCode());
        commonParams.put("traceId", traceId);

        commonParams.put("partner_code", partner_code);
        commonParams.put("partner_key", partner_key);
        commonParams.put("env", env);

        Map<String,Object> bizParams = new HashMap<>();
        bizParams.put("sequenceId",sequenceId);
        ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.TD02.getCode(),commonParams,bizParams);
        log.info("traceId={} 拉取同盾规则",traceId );         //是否成功
        if (response == null||response.getData()==null||response.getCode()!=ReturnCode.REQUEST_SUCCESS.code()) {
            log.info("traceId={} 拉取同盾规则命中详情结束：返回为空", traceId);
            return null;
        }
        RuleDetailResult result = (RuleDetailResult)response.getData();
        if (result.getSuccess() != true){
            log.info("traceId={} 拉取同盾规则失败：result={}", traceId , JSONObject.toJSON(result));
            return null;//是否成功
        }
        String json= JSON.toJSONString(result);
        TdData data = new TdData(taskId, json, "同盾规则命中列表", new Date());
        saveTdData(data);
        log.info("traceId={} 拉取同盾规则命中详情结束", traceId);
        return result;
    }

    @Override
    public ResponseResult getTdBodyGuard(String appName, Map<String,Object> bizParams){
        String url = getRequestUrl(appName);
        Map<String,Object> commonParams = new HashMap<>();
        commonParams.put("url",url);
        commonParams.put("targetId", SystemIdEnum.THIRD_TD.getCode());
        commonParams.put("appId", "");
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_TD03.getCode());
        commonParams.put("systemId", SystemIdEnum.RMS_THIRD.getCode());
        commonParams.put("traceId", TraceIDThreadLocal.getTraceID());

        ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.TD02.getCode(),commonParams,bizParams);
        return response;
    }

    private String getRequestUrl(String appName){
        return new StringBuilder().append(bodyGuardApiUrl).append("?partner_code=").append(partner_code).append("&partner_key=").append(partner_key).append("&app_name=").append(appName).toString();
    }
}
