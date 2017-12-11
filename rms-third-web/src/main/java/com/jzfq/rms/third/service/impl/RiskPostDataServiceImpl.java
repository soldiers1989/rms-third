package com.jzfq.rms.third.service.impl;


import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.jzfq.rms.constants.CourtException;
import com.jzfq.rms.constants.SpecialListCode;
import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.enums.BaiRongMapEnum;
import com.jzfq.rms.enums.CustomerTypeEnum;
import com.jzfq.rms.mongo.BrPostData;
import com.jzfq.rms.mongo.TdData;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.mongo.BairongData;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.constant.Constants;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.persistence.dao.IConfigDao;
import com.jzfq.rms.third.service.IRiskPostDataService;
import com.jzfq.rms.third.service.IRmsService;
import com.jzfq.rms.third.support.pool.ThreadProvider;
import org.apache.commons.collections.keyvalue.DefaultKeyValue;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.jzfq.rms.enums.BaiRongMapEnum.WEIGHTS;

/**
 *
 * @description 拉取数据服务实现
 * @author 大连桔子分期科技有限公司
 *
 */
@Service
public class RiskPostDataServiceImpl implements IRiskPostDataService {
    private static final Logger log = LoggerFactory.getLogger(RiskPostDataServiceImpl.class);
    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    IConfigDao configCacheDao;

    @Override
    public void saveData(Object data) {
        mongoTemplate.insert(data);
    }


    /**
     * 构建 老rms系统 百融数据结构
     * @param taskId
     * @param desc
     * @param data
     * @param type
     * @return
     */
    private BrPostData buildPostData(String taskId, String desc, String data, String type) {
        BrPostData dataBean = new BrPostData.BrDataBuild().createTime(new Date()).taskId(taskId)
                .desc(desc).data(data).interfaceType(type).build();
        return dataBean;
    }

    private BairongData buildBairongData(String name, String certCardNo, String mobile, String type,String data) {
        BairongData dataBean = new BairongData.BairongDataBuild().createTime(new Date()).name(name)
                .certCardNo(certCardNo).mobile(mobile).type(type).data(data).build();
        return dataBean;
    }
    @Autowired
    IRmsService rmsService;
    @Override
    public void saveRmsData(String orderNo, String result,String customerType) {
        String traceId = TraceIDThreadLocal.getTraceID();
        try{
            ThreadProvider.getThreadPool().execute(()->{
                String taskIdStr = rmsService.queryByOrderNo(traceId, orderNo);
                BrPostData data = buildPostData(taskIdStr, "拉取数据集合信息信息", result, customerType.toString());
                //保存rms系统数据结构
                saveData(data);
            });
        }catch (Exception e){
            log.error("traceId={} 保存rms百融数据出现异常",traceId,e);
        }
    }

    @Override
    public void saveRmsThirdData(RiskPersonalInfo info,String customerType, String result) {
        String traceId = TraceIDThreadLocal.getTraceID();
        try{
            ThreadProvider.getThreadPool().execute(()->{
                BairongData baiRongScore = buildBairongData(info.getName(), info.getCertCardNo(), info.getMobile(),
                        customerType,result);
                saveData(baiRongScore);
            });
        }catch (Exception e){
            log.error("traceId={} 保存rms-third百融数据出现异常",traceId,e);
        }
    }


    @Override
    public Object queryData(long taskId, int type) {
        if (type == CustomerTypeEnum.CUSTOMERTYPE_CAR.getCode()){
            type = CustomerTypeEnum.CUSTOMERTYPE_WHITE_COLLAR.getCode();
        }
        List<BrPostData> datas = mongoTemplate.find(new Query(Criteria.where("taskId").is(taskId + "")
                .and("interfaceType").is(type + "")), BrPostData.class);
        JSONObject jsonObject = new JSONObject();
        for (BrPostData data : datas) {
            if (data.getDesc().equals("手机三要素") || data.getDesc().equals("手机在网时长")){
                continue;
            }
            if (!StringUtils.isEmpty(data.getData())){
                String str = data.getData().replace("dc_scorejzfq_cash","scoreconsoffv2");      //现金贷的白领  字段转换
                jsonObject.putAll(JSON.parseObject(str));
            }
        }
        //翻译数据  如果数据为空直接返回
        if (!CollectionUtils.isEmpty(jsonObject) && jsonObject.size() > 2) {
            processResult(jsonObject);
        }
        return jsonObject;
    }

    @Override
    public Object queryTdRuleData(long taskId) {
        List<TdData> tdDatas = mongoTemplate.find(new Query(Criteria.where("taskId").is(taskId + "")
                .and("type").is("td")), TdData.class);
        JSONObject jsonObject = new JSONObject();
        for (TdData data : tdDatas) {
            if (!StringUtils.isEmpty(data.getData())) {
                jsonObject.putAll(JSON.parseObject(data.getData()));
            }
        }
        //翻译数据  如果数据为空直接返回
        if (!CollectionUtils.isEmpty(jsonObject) && jsonObject.size() > 2) {
            processResult(jsonObject);
        }

        //强制转换 有问题  未采取
        /*RuleDetailResult result = JsonUtils.readValue(tdDatas.get(0).getData().toString(), RuleDetailResult.class);*/

        return jsonObject;
    }

    /**
     * @param name
     * @param certCardNo
     * @param mobile
     * @param type
     * @return
     */
    @Override
    public JSONObject getBairongData(String name, String certCardNo, String mobile, String type) {
        Integer outTime = configCacheDao.getOutTimeUnit(InterfaceIdEnum.THIRD_BR01.getCode());
        List<BairongData> datas = mongoTemplate.find(new Query(Criteria.where("name").is(name)
                .and("certCardNo").is(certCardNo).and("mobile").is(mobile)
        .and("createTime").gte(getMinTime(outTime))), BairongData.class);
        if(CollectionUtils.isEmpty(datas)){
            return null;
        }
        String data = datas.get(0).getData();
        if(StringUtils.isBlank(data)){
            return null;
        }
        return JSONObject.parseObject(data);
    }
    private Date getMinTime(Integer time){
        Calendar calendar = Calendar.getInstance();//使用默认时区和语言环境获得一个日历。
        calendar.add(Calendar.DAY_OF_MONTH, -1*time);//取当前日期的前一天.
        return calendar.getTime();
    }

    private void processResult(JSONObject json) {
        String value = (String) json.get(BaiRongMapEnum.RULE_FINAL_DECISION.getUrl());
        value = WEIGHTS.get(value);
        json.put(BaiRongMapEnum.RULE_FINAL_DECISION.getUrl(), value);

        //翻译中文
        int count = getExceptionCount(json.toJSONString());
        List<DefaultKeyValue> exceptions = jsonToList(json.toJSONString(), count);
        json.put("exceptions", exceptions);

        //翻译规则返回码
        Pattern p = Pattern.compile("Rule_name_[\\d\\w]{6}+");
        Matcher m = p.matcher(json.toString());
        while (m.find()) {
            String code = m.group();
            String key = BaiRongMapEnum.CODES.get(code);
            if (StringUtil.checkNotEmpty(key)) {
                json.put(key, json.get(code));
            }
            json.remove(code);
        }

        //翻译权重分
        Pattern weightPattern = Pattern.compile("Rule_weight_[\\d\\w]{6}+");
        Matcher weightMatcher = weightPattern.matcher(json.toString());
        while (weightMatcher.find()) {
            String code = weightMatcher.group();
            String key = BaiRongMapEnum.WEIGHTS.get(code);
            if (StringUtil.checkNotEmpty(key)) {
                json.put(key, json.get(code));
            }
            json.remove(code);
        }

        //转译 银行信息码
        JSONObject bankObj = (JSONObject) json.get("product");
        if (bankObj!=null&&!bankObj.isEmpty()) {
            bankObj.put("respCode", BaiRongMapEnum.CODES.get(bankObj.get("respCode")));
        }

        //翻译特殊名单 
        if (json.getIntValue("flag_specialList_c") != Constants.ZERO) {
            List<DefaultKeyValue> kvs = Lists.newArrayList();
            //翻译规则返回码
            Pattern specialPattern = Pattern.compile("sl_[_\\d\\w]+");
            Matcher specialMatcher = specialPattern.matcher(json.toString());
            while (specialMatcher.find()) {
                String code = specialMatcher.group();
                DefaultKeyValue kv = SpecialListCode.CODES.get(code);
                kvs.add(kv);
            }
            json.put("special_list", kvs);
        }


    }

    /**
     * 获取json数据中一共有几组法院执行数据
     *
     * @param str
     * @return
     */
    private int getExceptionCount(String str) {
        Pattern p = Pattern.compile("ex_bad\\d");
        Matcher m = p.matcher(str);
        int count = 0;
        while (m.find()) {
            String column = m.group();
            int num = Integer.valueOf(column.substring(column.length() - 1));
            count = num > count ? num : count;
        }
        return count;
    }

    /**
     * 把json 数据转换为正常的list
     *
     * @param str
     * @param count
     * @return
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    private List<DefaultKeyValue> jsonToList(String str, int count) {
        Map json = JSONObject.parseObject(str, HashMap.class);
        List<DefaultKeyValue> list = new ArrayList();
        for (int i = 1; i <= count; i++) {
            Iterator<Map.Entry> it = json.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = it.next();
                String key = entry.getKey().toString();
                if (key.startsWith("ex_bad" + i)) {
                    list.add(getKv(key, entry.getValue().toString()));
                } else if (key.startsWith("ex_execut" + i)) {
                    list.add(getKv(key, entry.getValue().toString()));
                }
            }

        }
        return list;
    }

    private DefaultKeyValue getKv(String key, String value) {
        String exception = key.substring(key.lastIndexOf("_") + 1);
        String nameKey = CourtException.COURT_EXCEPTIONS.get(exception);
        DefaultKeyValue kv = new DefaultKeyValue();
        kv.setKey(nameKey);
        kv.setValue(value);
        return kv;
    }
}
