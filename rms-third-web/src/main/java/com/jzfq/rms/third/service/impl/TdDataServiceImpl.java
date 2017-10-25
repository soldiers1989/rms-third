package com.jzfq.rms.third.service.impl;

import cn.fraudmetrix.riskservice.RuleDetailClient;
import cn.fraudmetrix.riskservice.RuleDetailResult;
import cn.fraudmetrix.riskservice.object.Environment;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.enums.ApplyChannelEnum;
import com.jzfq.rms.enums.ProductTypeEnum;
import com.jzfq.rms.mongo.FraudApiInvoker;
import com.jzfq.rms.mongo.FraudApiResponse;
import com.jzfq.rms.mongo.TdData;
import com.jzfq.rms.mongo.TdHitRuleData;
import com.jzfq.rms.third.persistence.dao.ITdDao;
import com.jzfq.rms.third.service.ITdDataService;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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

    /**
     * 抓取同盾分
     * @param riskPostInfo
     * @return
     */
    @Override
    public TdHitRuleData getTdStoreData(Map<String, Object> riskPostInfo)    {
        RiskPersonalInfo info = (RiskPersonalInfo)riskPostInfo.get("personalInfo");
        try {
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("partner_code", partner_code);       // 合作方标识
            params.put("secret_key", getSecret2((Byte)riskPostInfo.get("loanType"),
                    (String)riskPostInfo.get("channel"),(String)riskPostInfo.get("traceId")));           // app密钥
            params.put("event_id", eventId);               // 策略集上的事件标识
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

            FraudApiResponse apiResp = null;

            log.info("apiUrl = " + apiUrl+"执行参数列表：" + builder.toString());
            apiResp = new FraudApiInvoker(apiUrl).invoke(params);
            log.info("traceId=【" + riskPostInfo.get("traceId") + "】参数列表：" + builder.toString());

            if (apiResp == null){
                log.info("traceId=【" + riskPostInfo.get("traceId") + "】同盾拉取无效：false ");     //失败
                return null;
            }
            log.info("traceId=【" +riskPostInfo.get("traceId")+ "】同盾拉取结果：" + apiResp.getSuccess()
                    + "--同盾分= " + apiResp.getFinal_score() + "拉取结果:" + apiResp.toString());     //是否成功

            //同盾信息写入mongo
            TdHitRuleData tdHitRuleData = new TdHitRuleData((String)riskPostInfo.get("orderNo"),
                    "同盾规则命中信息", new Date());
            if(apiResp.getDevice_info()!=null && apiResp.getDevice_info().get("deviceId")!=null)
                tdHitRuleData.setData(apiResp.getDevice_info().get("deviceId").toString());
            try {
                BeanUtils.copyProperties(tdHitRuleData, apiResp);
            } catch (Exception e){
            }
            mongoTemplate.insert(tdHitRuleData);
            return tdHitRuleData;
        }catch (IOException e){
            log.error("",e);
        }
        return null;
    }

    public TdData getTdRuleData(String taskId,String sequenceId,String traceId){
        Environment env = null;
        // Environment.PRODUCT表示调用生产环境, 测试环境请修改为Environment.SANDBOX
        if (Objects.equals(urlEnv, "prd")){
            env = Environment.PRODUCT;
        }else {
            env = Environment.SANDBOX;
        }
        // 调用接口
        RuleDetailClient client = RuleDetailClient.getInstance(partner_code, env);
        RuleDetailResult result = client.execute(partner_key, sequenceId);

        log.info("traceId={} 拉取同盾规则",traceId );         //是否成功
        if (result != null) {
            return null;
        }
        if (result.getSuccess() == true){
            String json= JSON.toJSONString(result);
            TdData data = new TdData(taskId, json, "同盾规则命中列表", new Date());
            saveTdData(data);
            return data;
        }else {
            log.info("traceId={} 拉取同盾规则失败,result={}", traceId , JSONObject.toJSON(result));
            return null;//是否成功
        }
    }

    /**
     * 抓取同盾分和规则
     * @param riskPostInfo
     * @return
     */
    @Override
    public Object getTdData(Map<String, Object> riskPostInfo)  throws Exception  {
        String traceId = (String)riskPostInfo.get("traceId");
        String taskId = (String)riskPostInfo.get("taskId");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("partner_code", partner_code);       // 合作方标识
        params.put("secret_key", getSecret2((Byte)riskPostInfo.get("loanType"),
                (String)riskPostInfo.get("channel"),(String)riskPostInfo.get("traceId"))); // app密钥
        params.put("event_id", eventId); // 策略集上的事件标识
        //写个人信息的查询
        StringBuilder builder = new StringBuilder();
        RiskPersonalInfo info = (RiskPersonalInfo)riskPostInfo.get("personalInfo");
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

        FraudApiResponse apiResp = null;

        log.info("apiUrl = {} 执行参数列表：{} " ,apiUrl,builder.toString());
        try {
            apiResp = new FraudApiInvoker(apiUrl).invoke(params);
        }catch (Exception e){
            log.error("获取同盾数据异常",e);
        }
        log.info("traceId={} 参数列表：{} " ,riskPostInfo.get("traceId"),  builder.toString());

        if (apiResp == null){
            log.info("traceId={} 同盾拉取无效：false ",riskPostInfo.get("traceId"));     //失败
            return null;
        }
        log.info("traceId= {} 同盾拉取结果：{} --同盾分= {} 拉取结果:{} "
                ,riskPostInfo.get("traceId"),apiResp.getSuccess(),apiResp.getFinal_score(),apiResp.toString());     //是否成功

        //同盾信息写入mongo
        TdHitRuleData tdHitRuleData = new TdHitRuleData(taskId,
                "同盾规则命中信息", new Date());
        if(apiResp.getDevice_info()!=null && apiResp.getDevice_info().get("deviceId")!=null)
            tdHitRuleData.setData(apiResp.getDevice_info().get("deviceId").toString());
        BeanUtils.copyProperties(tdHitRuleData, apiResp);
        mongoTemplate.insert(tdHitRuleData);

        Map<String,Object> datas = new HashMap<>();
        datas.put("tdHitRuleData",tdHitRuleData);
        if (apiResp == null || apiResp.getSeq_id()==null){
            return datas;
        }
        //通过seqid 查询 同盾规则，保存到mongo
        String sequenceId = apiResp.getSeq_id();
        log.info("seq = " + apiResp.getSeq_id());
        TdData tdRule = getTdRuleData(  taskId,  sequenceId,  traceId);
        datas.put("tdRule",tdRule);
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
    private String getSecret2(Byte loanType, String channel, String traceId){
        if (Objects.equals(loanType, ProductTypeEnum.CAR_ORDER.getCode().byteValue())
                || Objects.equals(loanType, ProductTypeEnum.CAR_QUOTA.getCode().byteValue())){
            if (ApplyChannelEnum.APP.getCode().equals(channel) || ApplyChannelEnum.ANDROID.getCode().equals(channel) || ApplyChannelEnum.ANDROID_ENGLISH.getCode().equalsIgnoreCase(channel)){
                if (ProductTypeEnum.CAR_ORDER.getCode().byteValue() == loanType){
                    eventId = bt_android_trade_event_id;
                    log.info("traceId["+traceId+"] 渠道["+ ApplyChannelEnum.getName(channel)+"] 类型"+"交易");
                }else {
                    eventId = bt_android_loan_event_id;
                    log.info("traceId["+traceId+"] 渠道["+ ApplyChannelEnum.getName(channel)+"] 类型"+"借款");
                }
                return bt_android_secret_key;
            }else {
                if (ProductTypeEnum.CAR_ORDER.getCode().byteValue() == loanType){
                    eventId = bt_ios_trade_event_id;
                    log.info("traceId["+traceId+"] 渠道["+ ApplyChannelEnum.getName(channel)+"] 类型"+"交易");
                }else {
                    log.info("traceId["+traceId+"] 渠道["+ ApplyChannelEnum.getName(channel)+"] 类型"+"借款");
                    eventId = bt_ios_loan_event_id;
                }
                return bt_ios_secret_key;
            }
        }else {
            if (ApplyChannelEnum.APP.getCode().equals(channel) || ApplyChannelEnum.ANDROID.getCode().equals(channel) || ApplyChannelEnum.ANDROID_ENGLISH.getCode().equalsIgnoreCase(channel)){
                if (ProductTypeEnum.FENQI_ORDER.getCode().byteValue() == loanType || ProductTypeEnum.COMMERCIAL.getCode().byteValue() == loanType){
                    log.info("traceId["+traceId+"] 渠道["+ ApplyChannelEnum.getName(channel)+"] 类型"+"交易");
                    eventId = jzfq_android_trade_event_id;
                }else {
                    log.info("traceId["+traceId+"] 渠道["+ ApplyChannelEnum.getName(channel)+"] 类型"+"借款");
                    eventId = jzfq_android_loan_event_id;
                }
                return jzfq_android_secret_key;
            }
            if (ApplyChannelEnum.IOS.getCode().equalsIgnoreCase(channel)){
                if (ProductTypeEnum.FENQI_ORDER.getCode().byteValue() == loanType || ProductTypeEnum.COMMERCIAL.getCode().byteValue() == loanType){
                    log.info("traceId["+traceId+"] 渠道["+ ApplyChannelEnum.getName(channel)+"] 类型"+"交易");
                    eventId = jzfq_ios_trade_event_id;
                }else {
                    log.info("traceId["+traceId+"] 渠道["+ ApplyChannelEnum.getName(channel)+"] 类型"+"借款");
                    eventId = jzfq_ios_loan_event_id;
                }
                return jzfq_ios_secret_key;
            }
            if (ApplyChannelEnum.PC.getCode().equals(channel) || ApplyChannelEnum.H5.getCode().equals(channel)){
                if (ProductTypeEnum.FENQI_ORDER.getCode().byteValue() == loanType || ProductTypeEnum.COMMERCIAL.getCode().byteValue() == loanType){
                    log.info("traceId["+traceId+"] 渠道["+ ApplyChannelEnum.getName(channel)+"] 类型"+"交易");
                    eventId = jzfq_h5_trade_event_id;
                }else {
                    log.info("traceId["+traceId+"] 渠道["+ ApplyChannelEnum.getName(channel)+"] 类型"+"借款");
                    eventId = jzfq_h5_loan_event_id;
                }
                return jzfq_h5_secret_key;
            }
        }
        return "";
    }
}
