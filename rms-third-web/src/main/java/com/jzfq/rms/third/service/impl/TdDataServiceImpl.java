package com.jzfq.rms.third.service.impl;

import cn.fraudmetrix.riskservice.RuleDetailResult;
import cn.fraudmetrix.riskservice.object.Environment;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.mongo.TdData;
import com.jzfq.rms.mongo.TdHitRuleData;
import com.jzfq.rms.third.common.domain.*;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.*;
import com.jzfq.rms.third.common.mongo.TongDunStringData;
import com.jzfq.rms.third.common.pojo.tongdun.FraudApiResponse;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.CallSystemIDThreadLocal;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.persistence.dao.ITdDao;
import com.jzfq.rms.third.persistence.mapper.*;
import com.jzfq.rms.third.service.IRmsService;
import com.jzfq.rms.third.service.ISendMessageService;
import com.jzfq.rms.third.service.ITdDataService;
import com.jzfq.rms.third.support.cache.ICache;
import com.jzfq.rms.third.support.pool.ThreadProvider;
import com.jzfq.rms.third.web.action.util.PageModel;
import com.jzfq.rms.third.web.action.util.cleanParse.TdParser;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @author 大连桔子分期科技有限公司
 * @description 同盾数据服务实现
 */
@Service("tdDataService")
public class TdDataServiceImpl implements ITdDataService {
    private static final Logger log = LoggerFactory.getLogger("postLogger");
    private static final Logger noticeLog = LoggerFactory.getLogger("noticeLogger");

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
    @Value("${td.data.bt_h5_secret_key}")
    private String bt_h5_secret_key;

    @Value("${td.data.jzfq_ios_secret_key}")
    private String jzfq_ios_secret_key;
    @Value("${td.data.jzfq_android_secret_key}")
    private String jzfq_android_secret_key;
    @Value("${td.data.jzfq_h5_secret_key}")
    private String jzfq_h5_secret_key;

    @Value("${td.prefix.redis.key}")
    private String eventRedisKey;


    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    ITdDao tdDao;
    @Autowired
    private TThirdTdSeqOrderDataMapper seqOrderDataMapper;
    @Autowired
    private TThirdTdMainDataMapper mainDataMapper;
    @Autowired
    private TThirdTdGeoipInfoDataMapper geoipInfoDataMapper;
    @Autowired
    private TThirdTdAttributionDataMapper attributionDataMapper;
    @Autowired
    private TThirdTdPolicySetDataMapper policySetDataMapper;
    @Autowired
    private TThirdTdHitRulesDataMapper hitRulesDataMapper;
    @Autowired
    private TThirdTdH5DataMapper h5DataMapper;
    @Autowired
    private TThirdTdAndriodDataMapper andriodDataMapper;
    @Autowired
    private TThirdTdIosDataMapper iosDataMapper;


    private String eventId;

    private Map<String, Object> getBizParams(RiskPersonalInfo info) {
        Map<String, Object> result = new HashMap<String, Object>();
        //写个人信息的查询
        StringBuilder builder = new StringBuilder();
        builder.append("param [");
        if (info.getName() != null) {
            result.put("account_name", info.getName());                     //  姓名
            builder.append(" account_name = " + info.getName() + " ");
        }
        if (info.getCertCardNo() != null) {
            result.put("id_number", info.getCertCardNo());                  //  身份证号
            builder.append(" id_number = " + info.getCertCardNo() + " ");
        }
        if (info.getMobile() != null) {
            result.put("account_mobile", info.getMobile());                  //  手机号
            builder.append(" account_mobile = " + info.getMobile() + " ");
        }
        if (info.getBankNo() != null) {
            result.put("card_number", info.getBankNo());                    //  银行卡号
            builder.append(" card_number = " + info.getBankNo() + " ");
        }
        if (info.getEmail() != null) {
            result.put("account_email", info.getEmail());                   //  邮箱
            builder.append(" account_email = " + info.getEmail() + " ");
        }
        if (info.getQq() != null) {
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
     * @param orderNo
     */
    @Override
    public void saveResult(String orderNo, String eventId, FraudApiResponse apiResp, Map<String, Object> commonParams) {
        String traceId = TraceIDThreadLocal.getTraceID();
        String systemID = CallSystemIDThreadLocal.getCallSystemID();
        try {
            ThreadProvider.getThreadPool().execute(() -> {
                RiskPersonalInfo info = (RiskPersonalInfo) commonParams.get("personalInfo");
                String taskId = rmsService.queryByOrderNo(traceId, orderNo);
                TongDunStringData tongDunData = new TongDunStringData();
                tongDunData.setOrderNo(orderNo);
                tongDunData.setCreateTime(new Date());
                tongDunData.setApiResp(StringUtil.toJSONString(apiResp));
                tongDunData.setValue(apiResp.getFinal_score());
                tongDunData.setEventId(eventId);
                //同盾信息写入mongo
                if (StringUtils.isNotBlank(taskId)) {
                    TdHitRuleData tdHitRuleData = new TdHitRuleData(taskId,
                            "同盾规则命中信息", new Date());
                    if (apiResp.getDevice_info() != null && apiResp.getDevice_info().get("deviceId") != null) {
                        tdHitRuleData.setData(apiResp.getDevice_info().get("deviceId").toString());
                    }
                    log.info("traceId= {} 同盾拉取结果：{} --同盾分= {} 拉取结果:{}"
                            , traceId, apiResp.getSuccess(), apiResp.getFinal_score(), apiResp.toString());     //是否成功
//                    try{
//                        BeanUtils.copyProperties(tdHitRuleData, apiResp);
//                    }catch (Exception e){
//                        log.error("保存数据 订单号为{} 克隆数据",orderNo,e);
//                    }
                    tdHitRuleData.setDevice_info(StringUtil.toJSONString(apiResp.getDevice_info()));
                    tdHitRuleData.setFinal_score(apiResp.getFinal_score());
                    tdHitRuleData.setHit_rules(StringUtil.toJSONString(apiResp.getHit_rules()));
                    tdHitRuleData.setPolicy_set(StringUtil.toJSONString(apiResp.getPolicy_set()));
                    tdHitRuleData.setPolicy_set_name(apiResp.getPolicy_set_name());
                    tdHitRuleData.setSeq_id(apiResp.getSeq_id());
//                    if (tdHitRuleData==null){
//                        log.info("保存数据 订单号为{}获取同盾时返回的结果为null",orderNo);
//                    }else{
//                        mongoTemplate.insert(tdHitRuleData);
//                    }
                    log.info("保存数据 订单号为{}rms老结构结果为:{}", orderNo, tdHitRuleData);
                    mongoTemplate.insert(tdHitRuleData);
                }
                String sequenceId = apiResp.getSeq_id();
                if (StringUtils.isBlank(sequenceId)) {
                    log.info("保存数据 订单号为{}获取同盾时返回的结果seq_id为空：{}", orderNo, apiResp.toString());
                    mongoTemplate.insert(tongDunData);
                    return;
                }
                //通过seqid 查询 同盾规则详情，保存到mongo
                RuleDetailResult ruleDetailResult = getTdRuleData(taskId, sequenceId, traceId, systemID);
                tongDunData.setRuleDetailResult(StringUtil.toJSONString(ruleDetailResult));
                mongoTemplate.insert(tongDunData);
            });
        } catch (Exception e) {
            log.info("保存数据 订单号为{}异常", e);
        }
    }


    @Override
    public void saveNewResult(FraudApiResponse apiResponse, String orderNo, String traceId, String name, String idCard, String phone,Date requstTime) {
        ThreadProvider.getThreadPool().execute(() -> {
            //关联表信息
            saveNewSeqData(TdParser.getSeqData(apiResponse, orderNo, traceId, name, idCard, phone,requstTime));
            //主表
            saveNewMainData(TdParser.getMainData(apiResponse,requstTime));
            //地理信息表
            saveNewGeoData(TdParser.getGeoInfoData(apiResponse,requstTime));
            //手机信息表
            saveNewPhoneData(TdParser.getAttrInfoData(apiResponse,requstTime));
            //命中策略信息IAO
            List<TThirdTdPolicySetData> policySetDataList = TdParser.getPolicySetInfoData(apiResponse,requstTime);
            if (null != policySetDataList && policySetDataList.size() > 0) {
                for (TThirdTdPolicySetData data : policySetDataList) {
                    saveNewPolisetData(data);
                    if (null != data.getRuleDatas() && data.getRuleDatas().size() > 0) {
                        for (TThirdTdHitRulesData rule : data.getRuleDatas()) {
                            saveNewHitData(rule);
                        }
                    }
                }
            }
            //h5 信息表
            saveNewH5Data(TdParser.getH5InfoData(apiResponse,requstTime));
            //andriod信息表
            saveNewAndriodData(TdParser.getAndriodInfoData(apiResponse,requstTime));
            //ios信息表
            saveNewIOSData(TdParser.getIOSInfoData(apiResponse,requstTime));

        });
    }

    private void saveNewSeqData(TThirdTdSeqOrderData data) {
        log.info("同盾关联表 mysql数据开始入库......");
        try {
            if (null != data) {
                seqOrderDataMapper.insert(data);
            }
        } catch (Exception e) {
            log.error("同盾关联表 mysql入库失败......", e);
        }
        log.info("同盾关联表 mysql数据入库结束......");
    }

    private void saveNewMainData(TThirdTdMainData data) {
        log.info("同盾主表 mysql数据开始入库......");
        try {
            if (null != data) {
                mainDataMapper.insert(data);
            }
        } catch (Exception e) {
            log.error("同盾主表 mysql入库失败......", e);
        }
        log.info("同盾主表 mysql数据入库结束......");
    }

    private void saveNewGeoData(TThirdTdGeoipInfoData data) {
        log.info("同盾地理信息表 mysql数据开始入库......");
        try {
            if (null != data) {
                geoipInfoDataMapper.insert(data);
            }
        } catch (Exception e) {
            log.error("同盾地理信息表 mysql入库失败......", e);
        }
        log.info("同盾地理信息表 mysql数据入库结束......");
    }

    private void saveNewPhoneData(TThirdTdAttributionData data) {
        log.info("同盾手机号表 mysql数据开始入库......");
        try {
            if (null != data) {
                attributionDataMapper.insert(data);
            }
        } catch (Exception e) {
            log.error("同盾手机号表 mysql入库失败......", e);
        }
        log.info("同盾关手机号表 mysql数据入库结束......");
    }

    private void saveNewPolisetData(TThirdTdPolicySetData data) {
        log.info("同盾命中规则表 mysql数据开始入库......");
        try {
            if (null != data) {
                policySetDataMapper.insert(data);
            }
        } catch (Exception e) {
            log.error("同盾命中规则表 mysql入库失败......", e);
        }
        log.info("同盾命中规则的表 mysql数据入库结束......");
    }

    private void saveNewHitData(TThirdTdHitRulesData data) {
        log.info("同盾规则表 mysql数据开始入库......");
        try {
            if (null != data) {
                hitRulesDataMapper.insert(data);
            }
        } catch (Exception e) {
            log.error("同盾规则表 mysql入库失败......", e);
        }
        log.info("同盾规则表 mysql数据入库结束......");
    }

    private void saveNewH5Data(TThirdTdH5Data data) {
        log.info("同盾H5表 mysql数据开始入库......");
        try {
            if (null != data) {
                h5DataMapper.insert(data);
            }
        } catch (Exception e) {
            log.error("同盾H5表 mysql入库失败......", e);
        }
        log.info("同盾H5表 mysql数据入库结束......");
    }

    private void saveNewAndriodData(TThirdTdAndriodData data) {
        log.info("同盾andriod表 mysql数据开始入库......");
        try {
            if (null != data) {
                andriodDataMapper.insert(data);
            }
        } catch (Exception e) {
            log.error("同盾andriod表 mysql入库失败......", e);
        }
        log.info("同盾andriod表 mysql数据入库结束......");
    }

    private void saveNewIOSData(TThirdTdIosData data) {
        log.info("同盾IOS表 mysql数据开始入库......");
        try {
            if (null != data) {
                iosDataMapper.insert(data);
            }
        } catch (Exception e) {
            log.error("同盾IOS表 mysql入库失败......", e);
        }
        log.info("同盾IOS表 mysql数据入库结束......");
    }


    /**
     * 根据订单号 获取同盾数据
     *
     * @param orderNo
     * @return
     */
    @Override
    public List<TongDunStringData> getTongDongData(String orderNo) {
        List<TongDunStringData> datas = mongoTemplate.find(new Query(Criteria.where("orderNo").is(orderNo))
                , TongDunStringData.class);
        return datas;
    }

    /**
     * 根据订单号 获取同盾数据
     *
     * @param orderNo
     * @param eventId
     * @return
     */
    @Override
    public List<TongDunStringData> getDataByEvent(String orderNo, String eventId) {
        List<TongDunStringData> datas = mongoTemplate.find(new Query(Criteria.where("orderNo").is(orderNo).and("eventId").is(eventId)).with(new Sort(Sort.Direction.DESC, "createTime"))
                , TongDunStringData.class);
        return datas;
    }

    @Override
    public PageModel<TongDunStringData> getAllData(PageModel<TongDunStringData> page) {
        List<TongDunStringData> datas = mongoTemplate.find(new Query().skip(page.getSkip()).limit(page.getPageSize()), TongDunStringData.class);
        page.setDatas(datas);
        return page;
    }

    @Override
    public int getCount() {
        //计算总数
        int count = (int)mongoTemplate.count(null,TongDunStringData.class);
        return count;
    }

    /**
     * 根据流水号 获取同盾数据
     *
     * @param serialNo
     * @return
     */
    @Override
    public List<TongDunStringData> getTongDongDataBySerialNo(String serialNo) {
        List<TongDunStringData> datas = mongoTemplate.find(new Query(Criteria.where("serialNo").is(serialNo))
                , TongDunStringData.class);
        return datas;
    }

    /**
     * 根据订单号 获取同盾数据
     *
     * @param name
     * @param certCardNo
     * @return
     */
    @Override
    public TongDunStringData getTongDongData(String name, String certCardNo) {
        List<TongDunStringData> datas = mongoTemplate.find(new Query(Criteria.where("name").is(name)
                        .and("certCardNo").is(certCardNo))
                , TongDunStringData.class);
        if (!CollectionUtils.isEmpty(datas)) {
            Collections.sort(datas, (elementA, elementB) -> {
                Date dateA = elementA.getCreateTime();
                Date dateB = elementB.getCreateTime();
                if (dateA != null && dateB != null) {
                    return dateA.compareTo(dateB);
                }
                if (dateA == null && dateB == null) {
                    return 0;
                }
                if (dateA == null) {
                    return -1;
                }
                return 1;
            });
            return datas.get(0);
        }
        return null;
    }

    /**
     * 把同盾命中的规则，保存到mongo
     *
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

    @Autowired
    ICache prefixCache;

    /**
     * 按照应用划分
     *
     * @param channelId
     * @param financialProductId
     * @param operationType
     * @param clientType
     * @return
     */
    @Override
    public String getEventId(String channelId, String financialProductId, String operationType, String clientType) {
        StringBuilder key = new StringBuilder("dictionary_prefix_");
        key.append(eventRedisKey).append("_");
        key.append(channelId).append("-").append(financialProductId)
                .append("-").append(clientType).append("-").append(operationType);
        return StringUtil.getStringOfObject(prefixCache.readConfig(key.toString()));
    }

    private String getSecretKey(String channelId, String clientType) {
        if (StringUtils.equals(channelId, ChannelIdEnum.JZFQ.getCode())) {
            if (StringUtils.equals(clientType, ClientTypeEnum.IOS.getCode())) {
                return jzfq_ios_secret_key;
            }
            if (StringUtils.equals(clientType, ClientTypeEnum.AND.getCode())) {
                return jzfq_android_secret_key;
            }
            return jzfq_h5_secret_key;
        }
        if (StringUtils.equals(channelId, ChannelIdEnum.CZBT.getCode())) {
            if (StringUtils.equals(clientType, ClientTypeEnum.IOS.getCode())) {
                return bt_ios_secret_key;
            }
            if (StringUtils.equals(clientType, ClientTypeEnum.AND.getCode())) {
                return bt_android_secret_key;
            }
            return bt_h5_secret_key;
        }
        return "";
    }

    @Autowired
    ISendMessageService sendMessegeService;

    /**
     * @param commonParams
     * @return
     * @throws Exception
     */
    @Override
    public ResponseResult queryTdDatas(Map<String, Object> commonParams) throws Exception {
        RiskPersonalInfo info = (RiskPersonalInfo) commonParams.get("personalInfo");
        String traceId = TraceIDThreadLocal.getTraceID();
        String taskId = (String) commonParams.get("taskId");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("partner_code", partner_code);       // 合作方标识
        String channelId = (String) commonParams.get("channelId");
        String financialProductId = (String) commonParams.get("financialProductId");
        String operationType = (String) commonParams.get("operationType");
        String clientType = (String) commonParams.get("clientType");
        String eventId = getEventId(channelId, financialProductId, operationType, clientType);
        String sceretKey = getSecretKey(channelId, clientType);
        params.put("secret_key", sceretKey); // app密钥
        params.put("event_id", eventId); // 策略集上的事件标识
        //写个人信息的查询
        StringBuilder builder = new StringBuilder();
        builder.append("param [");
        if (info.getName() != null) {
            params.put("account_name", info.getName());                     //  姓名
            builder.append(" account_name = " + info.getName() + " ");
        }
        if (info.getCertCardNo() != null) {
            params.put("id_number", info.getCertCardNo());                  //  身份证号
            builder.append(" id_number = " + info.getCertCardNo() + " ");
        }
        if (info.getMobile() != null) {
            params.put("account_mobile", info.getMobile());                  //  手机号
            builder.append(" account_mobile = " + info.getMobile() + " ");
        }
        if (info.getBankNo() != null) {
            params.put("card_number", info.getBankNo());                    //  银行卡号
            builder.append(" card_number = " + info.getBankNo() + " ");
        }
        if (info.getEmail() != null) {
            params.put("account_email", info.getEmail());                   //  邮箱
            builder.append(" account_email = " + info.getEmail() + " ");
        }
        if (info.getQq() != null) {
            params.put("qq_number", info.getQq());                          //  qq
            builder.append(" qq_number = " + info.getQq() + " ");
        }
        builder.append(" ]");
        log.info("apiUrl = {} 执行参数列表：{} ", apiUrl, builder.toString());
        //公共参数
        commonParams.put("url", apiUrl);
        commonParams.put("targetId", SystemIdEnum.THIRD_TD.getCode());
        commonParams.put("appId", "");
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_TD01.getCode());
        commonParams.put("systemId", CallSystemIDThreadLocal.getCallSystemID());
        commonParams.put("traceId", TraceIDThreadLocal.getTraceID());

        commonParams.put("taskId", taskId);

        log.info("traceId={} 参数列表：{} ", traceId, builder.toString());
        ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.TD01.getCode(), commonParams, params);
        return response;
    }


    /**
     * @param commonParams
     * @return
     * @throws Exception
     */
    @Override
    public ResponseResult queryTdDatasByParams(Map<String, Object> commonParams) throws Exception {
        RiskPersonalInfo info = (RiskPersonalInfo) commonParams.get("personalInfo");
        String traceId = TraceIDThreadLocal.getTraceID();
        String taskId = (String) commonParams.get("taskId");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("partner_code", partner_code);       // 合作方标识
        String channelId = (String) commonParams.get("channelId");
        String clientType = (String) commonParams.get("clientType");
        String eventId = (String) commonParams.get("eventId");
        String sceretKey = getSecretKey(channelId, clientType);
        params.put("secret_key", sceretKey); // app密钥
        params.put("event_id", eventId); // 策略集上的事件标识
        //写个人信息的查询
        StringBuilder builder = new StringBuilder();
        builder.append("param [");
        if (info.getName() != null) {
            params.put("account_name", info.getName());                     //  姓名
            builder.append(" account_name = " + info.getName() + " ");
        }
        if (info.getCertCardNo() != null) {
            params.put("id_number", info.getCertCardNo());                  //  身份证号
            builder.append(" id_number = " + info.getCertCardNo() + " ");
        }
        if (info.getMobile() != null) {
            params.put("account_mobile", info.getMobile());                  //  手机号
            builder.append(" account_mobile = " + info.getMobile() + " ");
        }
        if (info.getBankNo() != null) {
            params.put("card_number", info.getBankNo());                    //  银行卡号
            builder.append(" card_number = " + info.getBankNo() + " ");
        }
        if (info.getEmail() != null) {
            params.put("account_email", info.getEmail());                   //  邮箱
            builder.append(" account_email = " + info.getEmail() + " ");
        }
        if (info.getQq() != null) {
            params.put("qq_number", info.getQq());                          //  qq
            builder.append(" qq_number = " + info.getQq() + " ");
        }
        builder.append(" ]");
        log.info("apiUrl = {} 执行参数列表：{} ", apiUrl, builder.toString());
        //公共参数
        commonParams.put("url", apiUrl);
        commonParams.put("targetId", SystemIdEnum.THIRD_TD.getCode());
        commonParams.put("appId", "");
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_TD01.getCode());
        commonParams.put("systemId", CallSystemIDThreadLocal.getCallSystemID());
        commonParams.put("traceId", TraceIDThreadLocal.getTraceID());

        commonParams.put("taskId", taskId);

        log.info("traceId={} 参数列表：{} ", traceId, builder.toString());
        ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.TD01.getCode(), commonParams, params);
        return response;
    }


    private RuleDetailResult getTdRuleData(String taskId, String sequenceId, String traceId, String systemID) {
        Environment env = null;
        // Environment.PRODUCT表示调用生产环境, 测试环境请修改为Environment.SANDBOX
        if (Objects.equals(urlEnv, "prd")) {
            env = Environment.PRODUCT;
        } else {
            env = Environment.SANDBOX;
        }
        Map<String, Object> commonParams = new HashMap<>();
        commonParams.put("url", env.getRuleDetailUrl());
        commonParams.put("targetId", SystemIdEnum.THIRD_TD.getCode());
        commonParams.put("appId", "");
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_TD02.getCode());
        commonParams.put("systemId", systemID);
        commonParams.put("traceId", traceId);

        commonParams.put("partner_code", partner_code);
        commonParams.put("partner_key", partner_key);
        commonParams.put("env", env);

        Map<String, Object> bizParams = new HashMap<>();
        bizParams.put("sequenceId", sequenceId);
        ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.TD02.getCode(), commonParams, bizParams);
        log.info("traceId={} 拉取同盾规则", traceId);         //是否成功
        if (response == null || response.getData() == null || response.getCode() != ReturnCode.REQUEST_SUCCESS.code()) {
            log.info("traceId={} 拉取同盾规则命中详情结束：返回为空", traceId);
            return null;
        }
        RuleDetailResult result = (RuleDetailResult) response.getData();
        if (result.getSuccess() != true) {
            log.info("traceId={} 拉取同盾规则失败：result={}", traceId, JSONObject.toJSON(result));
            return null;//是否成功
        }
        String json = JSON.toJSONString(result);
//        TdData data = new TdData(taskId, json, "同盾规则命中列表", new Date());
//        saveTdData(data);
        log.info("traceId={} 拉取同盾规则命中详情结束", traceId);
        return result;
    }

    @Override
    public ResponseResult getTdBodyGuard(String appName, Map<String, Object> bizParams) {
        String url = getRequestUrl(appName);
        Map<String, Object> commonParams = new HashMap<>();
        commonParams.put("url", url);
        commonParams.put("targetId", SystemIdEnum.THIRD_TD.getCode());
        commonParams.put("appId", "");
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_TD03.getCode());
        commonParams.put("systemId", CallSystemIDThreadLocal.getCallSystemID());
        commonParams.put("traceId", TraceIDThreadLocal.getTraceID());

        ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.TD02.getCode(), commonParams, bizParams);
        return response;
    }

    private String getRequestUrl(String appName) {
        return new StringBuilder().append(bodyGuardApiUrl).append("?partner_code=").append(partner_code).append("&partner_key=").append(partner_key).append("&app_name=").append(appName).toString();
    }


    /**
     * 获取同盾全部数据
     *
     * @param commonParams
     * @return
     * @throws Exception
     */
    @Override
    public JSONObject queryTdAllDatas(String serialNo, Map<String, Object> commonParams) throws Exception {
        RiskPersonalInfo info = (RiskPersonalInfo) commonParams.get("personalInfo");
        String traceId = TraceIDThreadLocal.getTraceID();
        String taskId = (String) commonParams.get("taskId");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("partner_code", partner_code);       // 合作方标识
        String channelId = (String) commonParams.get("channelId");
        String financialProductId = (String) commonParams.get("financialProductId");
        String operationType = (String) commonParams.get("operationType");
        String clientType = (String) commonParams.get("clientType");
        String eventId = getEventId(channelId, financialProductId, operationType, clientType);
        String sceretKey = getSecretKey(channelId, clientType);
        params.put("secret_key", sceretKey); // app密钥
        params.put("event_id", eventId); // 策略集上的事件标识
        //写个人信息的查询
        StringBuilder builder = new StringBuilder();
        builder.append("param [");
        if (info.getName() != null) {
            params.put("account_name", info.getName());                     //  姓名
            builder.append(" account_name = " + info.getName() + " ");
        }
        if (info.getCertCardNo() != null) {
            params.put("id_number", info.getCertCardNo());                  //  身份证号
            builder.append(" id_number = " + info.getCertCardNo() + " ");
        }
        if (info.getMobile() != null) {
            params.put("account_mobile", info.getMobile());                  //  手机号
            builder.append(" account_mobile = " + info.getMobile() + " ");
        }
        if (info.getBankNo() != null) {
            params.put("card_number", info.getBankNo());                    //  银行卡号
            builder.append(" card_number = " + info.getBankNo() + " ");
        }
        if (info.getEmail() != null) {
            params.put("account_email", info.getEmail());                   //  邮箱
            builder.append(" account_email = " + info.getEmail() + " ");
        }
        if (info.getQq() != null) {
            params.put("qq_number", info.getQq());                          //  qq
            builder.append(" qq_number = " + info.getQq() + " ");
        }
        builder.append(" ]");
        log.info("apiUrl = {} 执行参数列表：{} ", apiUrl, builder.toString());
        //公共参数
        commonParams.put("url", apiUrl);
        commonParams.put("targetId", SystemIdEnum.THIRD_TD.getCode());
        commonParams.put("appId", "");
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_TD01.getCode());
        commonParams.put("systemId", CallSystemIDThreadLocal.getCallSystemID());
        commonParams.put("traceId", TraceIDThreadLocal.getTraceID());

        commonParams.put("taskId", taskId);

        log.info("traceId={} 参数列表：{} ", traceId, builder.toString());
        ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.TD01.getCode(), commonParams, params);
        JSONObject result = new JSONObject();
        result.put("tdScore", "");
        result.put("tdDetail", "");
        result.put("tdFlag", "200");
        if (response == null) {
            log.info("traceId={} 同盾拉取无效：false ", commonParams.get("traceId"));     //失败
            result.put("tdFlag", ReturnCode.ERROR_RESPONSE_NULL.code());
            return result;
        }
        if (response.getCode() != ReturnCode.REQUEST_SUCCESS.code()) {
            result.put("tdFlag", response.getCode());
            return result;
        }
        FraudApiResponse apiResp = (FraudApiResponse) response.getData();
        result.put("tdScore", response.getData());
        result.put("tdDetail", getTdDetailBySerialNo(serialNo, apiResp));
        return result;
    }

    private RuleDetailResult getTdDetailBySerialNo(String serialNo, FraudApiResponse apiResp) {
        String traceId = TraceIDThreadLocal.getTraceID();
        TongDunStringData tongDunData = new TongDunStringData();
        tongDunData.setSerialNo(serialNo);
        tongDunData.setCreateTime(new Date());
        tongDunData.setValue(apiResp.getFinal_score());
        tongDunData.setApiResp(StringUtil.toJSONString(apiResp));
        String sequenceId = apiResp.getSeq_id();
        if (StringUtils.isBlank(sequenceId)) {
            log.info("保存数据 流水号为{}获取同盾时返回的结果seq_id为空", serialNo);
            mongoTemplate.insert(tongDunData);
            return null;
        }
        //通过seqid 查询 同盾规则详情，保存到mongo
        RuleDetailResult ruleDetailResult = getTdRuleData(sequenceId, traceId);
        tongDunData.setRuleDetailResult(StringUtil.toJSONString(ruleDetailResult));
        mongoTemplate.insert(tongDunData);
        return ruleDetailResult;
    }


    private RuleDetailResult getTdRuleData(String sequenceId, String traceId) {
        Environment env = null;
        // Environment.PRODUCT表示调用生产环境, 测试环境请修改为Environment.SANDBOX
        if (Objects.equals(urlEnv, "prd")) {
            env = Environment.PRODUCT;
        } else {
            env = Environment.SANDBOX;
        }
        Map<String, Object> commonParams = new HashMap<>();
        commonParams.put("url", env.getRuleDetailUrl());
        commonParams.put("targetId", SystemIdEnum.THIRD_TD.getCode());
        commonParams.put("appId", "");
        commonParams.put("interfaceId", InterfaceIdEnum.THIRD_TD02.getCode());
        commonParams.put("systemId", CallSystemIDThreadLocal.getCallSystemID());
        commonParams.put("traceId", traceId);

        commonParams.put("partner_code", partner_code);
        commonParams.put("partner_key", partner_key);
        commonParams.put("env", env);

        Map<String, Object> bizParams = new HashMap<>();
        bizParams.put("sequenceId", sequenceId);
        ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.TD02.getCode(), commonParams, bizParams);
        log.info("traceId={} 拉取同盾规则", traceId);         //是否成功
        if (response == null || response.getData() == null || response.getCode() != ReturnCode.REQUEST_SUCCESS.code()) {
            log.info("traceId={} 拉取同盾规则命中详情结束：返回为空", traceId);
            return null;
        }
        RuleDetailResult result = (RuleDetailResult) response.getData();
        if (result.getSuccess() != true) {
            log.info("traceId={} 拉取同盾规则失败：result={}", traceId, JSONObject.toJSON(result));
            return null;//是否成功
        }
        String json = JSON.toJSONString(result);
        log.info("traceId={} 拉取同盾规则命中详情结束", traceId);
        return result;
    }
}
