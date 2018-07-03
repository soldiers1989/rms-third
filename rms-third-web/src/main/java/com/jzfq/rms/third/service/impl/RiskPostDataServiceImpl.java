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
import com.jzfq.rms.third.common.domain.*;
import com.jzfq.rms.third.common.domain.TThirdBrSpecialList;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.mongo.BairongData;
import com.jzfq.rms.third.common.utils.DateUtils;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.constant.Constants;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.persistence.dao.IConfigDao;
import com.jzfq.rms.third.persistence.mapper.*;
import com.jzfq.rms.third.service.IRiskPostDataService;
import com.jzfq.rms.third.service.IRmsService;
import com.jzfq.rms.third.support.pool.ThreadProvider;
import com.jzfq.rms.third.web.action.util.PageModel;
import com.jzfq.rms.third.web.action.util.cleanParse.BrParser;
import org.apache.commons.collections.keyvalue.DefaultKeyValue;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.jzfq.rms.enums.BaiRongMapEnum.WEIGHTS;

/**
 * @author 大连桔子分期科技有限公司
 * @description 拉取数据服务实现
 */
@Service
public class RiskPostDataServiceImpl implements IRiskPostDataService {
    private static final Logger log = LoggerFactory.getLogger(RiskPostDataServiceImpl.class);
    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    IConfigDao configCacheDao;
    @Autowired
    private TThirdBrSwiftOrderDataMapper brSwiftOrderDataMapper;
    @Autowired
    private TThirdBrScoreMapper brScoreMapper;
    @Autowired
    private TThirdBrRuleMapper brRuleMapper;
    @Autowired
    private TThirdBrSpecialListMapper specialListMapper;
    @Autowired
    private TThirdBrRealInfoMapper realInfoMapper;
    @Autowired
    private TThirdBrExecutInfoMapper executInfoMapper;
    @Autowired
    private TThirdBrStabInfoMapper stabInfoMapper;
    @Autowired
    private TThirdBrConsInfoMapper consInfoMapper;


    @Override
    public void saveData(Object data) {
        mongoTemplate.insert(data);
    }


    /**
     * 构建 老rms系统 百融数据结构
     *
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

    private BairongData buildBairongData(String name, String certCardNo, String mobile, String type, String data) {
        BairongData dataBean = new BairongData.BairongDataBuild().createTime(new Date()).name(name)
                .certCardNo(certCardNo).mobile(mobile).type(type).data(data).build();
        return dataBean;
    }

    private BairongData buildBairongData(String name, String certCardNo, String mobile, String strategyId, String type, String data) {
        BairongData dataBean = new BairongData.BairongDataBuild().createTime(new Date()).name(name)
                .certCardNo(certCardNo).mobile(mobile).strategyId(strategyId).type(type).data(data).build();
        return dataBean;
    }

    @Autowired
    IRmsService rmsService;

    @Override
    public void saveRmsData(String orderNo, String result, String customerType) {
        String traceId = TraceIDThreadLocal.getTraceID();
        try {
            ThreadProvider.getThreadPool().execute(() -> {
                JSONObject json = JSONObject.parseObject(result);
                json.put("scorepettycashv1", getRmsScoreByJson(json));
                String taskIdStr = rmsService.queryByOrderNo(traceId, orderNo);
                BrPostData data = buildPostData(taskIdStr, "拉取数据集合信息信息", json.toJSONString(), customerType.toString());
                //保存rms系统数据结构
                saveData(data);
            });
        } catch (Exception e) {
            log.error("traceId={} 保存rms百融数据出现异常", traceId, e);
        }
    }


    @Override
    public void saveNewData(JSONObject json, String orderNo, String traceId, String name, String idCard, String phone,Date requestTime) {
        ThreadProvider.getThreadPool().execute(() -> {
            //关联信息
            saveNewBrSwiftData(BrParser.getBrSwiftData(json,orderNo,traceId,name,idCard,phone,requestTime));
            //百融分
            saveNewBrScoreData(BrParser.getScoreInfoData(json,requestTime));
            //百融规则
            saveNewRuleData(BrParser.getBrRuleInfoData(json,requestTime));
            //百融特殊名单
            saveNewSpecialData(BrParser.getBrSpeciaInfoData(json,requestTime));
            //百融实名认证信息
            saveNewRealData(BrParser.getBrRealInfoData(json,requestTime));
            //百融被执行人
            saveNewExcuteData(BrParser.getBrExecutInfoData(json,requestTime));
            //百融稳定性指数
            saveNewStabData(BrParser.getBrStabInfoData(json,requestTime));
            //百融消费评估
            saveNewConsData(BrParser.getBrConsInfoData(json,requestTime));
        });
    }


    private void saveNewBrSwiftData(TThirdBrSwiftOrderData data) {
        log.info("百融关联表 mysql数据开始入库......");
        try {
            if (null != data) {
                brSwiftOrderDataMapper.insert(data);
            }
        } catch (Exception e) {
            log.error("百融关联表 mysql入库失败......", e);
        }
        log.info("百融关联表 mysql数据入库结束......");
    }

    private void saveNewBrScoreData(TThirdBrScore data) {
        log.info("百融分表 mysql数据开始入库......");
        try {
            if (null != data) {
                brScoreMapper.insert(data);
            }
        } catch (Exception e) {
            log.error("百融分表 mysql入库失败......", e);
        }
        log.info("百融分表 mysql数据入库结束......");
    }

    private void saveNewRuleData(TThirdBrRule data) {
        log.info("百融规则信息表 mysql数据开始入库......");
        try {
            if (null != data) {
                brRuleMapper.insert(data);
            }
        } catch (Exception e) {
            log.error("百融规则信息表 mysql入库失败......", e);
        }
        log.info("百融规则信息表 mysql数据入库结束......");
    }

    private void saveNewSpecialData(TThirdBrSpecialList data) {
        log.info("百融特殊名单表 mysql数据开始入库......");
        try {
            if (null != data) {
                specialListMapper.insert(data);
            }
        } catch (Exception e) {
            log.error("百融特殊名单表 mysql入库失败......", e);
        }
        log.info("百融特殊名单表 mysql数据入库结束......");
    }

    private void saveNewRealData(TThirdBrRealInfo data) {
        log.info("百融实名信息 mysql数据开始入库......");
        try {
            if (null != data) {
                realInfoMapper.insert(data);
            }
        } catch (Exception e) {
            log.error("百融实名信息 mysql入库失败......", e);
        }
        log.info("百融实名信息 mysql数据入库结束......");
    }

    private void saveNewExcuteData(TThirdBrExecutInfo data) {
        log.info("百融法院被执行一人 mysql数据开始入库......");
        try {
            if (null != data) {
                executInfoMapper.insert(data);
            }
        } catch (Exception e) {
            log.error("百融法院被执行一人 mysql入库失败......", e);
        }
        log.info("百融法院被执行一人 mysql数据入库结束......");
    }

    private void saveNewStabData(TThirdBrStabInfo data) {
        log.info("百融稳定性指数 mysql数据开始入库......");
        try {
            if (null != data) {
                stabInfoMapper.insert(data);
            }
        } catch (Exception e) {
            log.error("百融稳定性指数 mysql入库失败......", e);
        }
        log.info("百融稳定性指数 mysql数据入库结束......");
    }

    private void saveNewConsData(TThirdBrConsInfo data) {
        log.info("百融消费评估指数 mysql数据开始入库......");
        try {
            if (null != data) {
                consInfoMapper.insert(data);
            }
        } catch (Exception e) {
            log.error("百融消费评估指数 mysql入库失败......", e);
        }
        log.info("百融消费评估指数 mysql数据入库结束......");
    }


    @Override
    public void saveRmsThirdData(RiskPersonalInfo info, String customerType, String result) {
        String traceId = TraceIDThreadLocal.getTraceID();
        try {
            ThreadProvider.getThreadPool().execute(() -> {
                BairongData baiRongScore = buildBairongData(info.getName(), info.getCertCardNo(), info.getMobile(),
                        customerType, result);
                saveData(baiRongScore);
            });
        } catch (Exception e) {
            log.error("traceId={} 保存rms-third百融数据出现异常", traceId, e);
        }
    }

    @Override
    public void saveRmsThirdData(RiskPersonalInfo info, String customerType, String strategyId, String result) {
        String traceId = TraceIDThreadLocal.getTraceID();
        try {
            ThreadProvider.getThreadPool().execute(() -> {
                BairongData baiRongScore = buildBairongData(info.getName(), info.getCertCardNo(), info.getMobile(), strategyId,
                        customerType, result);
                saveData(baiRongScore);
            });
        } catch (Exception e) {
            log.error("traceId={} 保存rms-third百融数据出现异常", traceId, e);
        }
    }


    @Override
    public void saveBairongData(String name, String certCardNo, String mobile, String strategyId, String data, Date updateTime, String flag) {
        ThreadProvider.getThreadPool().execute(() -> {
//            BairongData baiRongScore = buildBairongData(name, certCardNo, mobile, strategyId,
//                    "0", data);
            BairongData bairongData = new BairongData();
            bairongData.setFlag(flag);
            bairongData.setUpdateTime(updateTime);
            bairongData.setData(data);
            bairongData.setCertCardNo(certCardNo);
            bairongData.setMobile(mobile);
            bairongData.setName(name);
            bairongData.setCreateTime(new Date());
            bairongData.setStrategyId(strategyId);
            bairongData.setType("0");
            saveData(bairongData);
        });
    }

    @Override
    public void saveRmsBrPostData(String name, String certCardNo, String mobile, String strategyId, String data, String taskId) {
        ThreadProvider.getThreadPool().execute(() -> {
            JSONObject json = JSONObject.parseObject(data);
//            json.put("scorepettycashv1", getScoreByJson(json));
            BrPostData brPostData = buildPostData(taskId, "拉取数据集合信息信息", json.toJSONString(), "0");
            //保存rms系统数据结构
            saveData(brPostData);
        });
    }

    @Override
    public Object queryData(long taskId, int type) {
        if (type == CustomerTypeEnum.CUSTOMERTYPE_CAR.getCode()) {
            type = CustomerTypeEnum.CUSTOMERTYPE_WHITE_COLLAR.getCode();
        }
        List<BrPostData> datas = mongoTemplate.find(new Query(Criteria.where("taskId").is(taskId + "")
                .and("interfaceType").is(type + "")), BrPostData.class);
        JSONObject jsonObject = new JSONObject();
        for (BrPostData data : datas) {
            if (data.getDesc().equals("手机三要素") || data.getDesc().equals("手机在网时长")) {
                continue;
            }
            if (!StringUtils.isEmpty(data.getData())) {
                String str = data.getData().replace("dc_scorejzfq_cash", "scoreconsoffv2");      //现金贷的白领  字段转换
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
     * @return
     */
    @Override
    public JSONObject getBairongData(String name, String certCardNo, String mobile) {
        Integer outTime = configCacheDao.getOutTimeUnit(InterfaceIdEnum.THIRD_BR01.getCode());
        List<BairongData> datas = mongoTemplate.find(new Query(Criteria.where("name").is(name)
                .and("certCardNo").is(certCardNo).and("mobile").is(mobile)
                .and("createTime").gte(getMinTime(outTime))), BairongData.class);
        if (CollectionUtils.isEmpty(datas)) {
            return null;
        }
        String data = datas.get(0).getData();
        if (StringUtils.isBlank(data)) {
            return null;
        }
        return JSONObject.parseObject(data);
    }


    @Override
    public List<BairongData> getHistDatas1() {
        List<BairongData> datas = mongoTemplate.find(new Query(Criteria.where("createTime")
                .gte(DateUtils.str2Date("2018-06-25 00:00:00", DateUtils.DATE_FORMAT_LONG)).lt(new Date())
        ), BairongData.class);
        if (CollectionUtils.isEmpty(datas)) {
            return null;
        }
        return datas;
    }

    /**
     * 更新百融分
     *
     * @param name
     * @param certCardNo
     * @param mobile
     * @return
     */
    @Override
    public int updateBairongData(String name, String certCardNo, String mobile, String strategyId, String data, Date updateTime, String flag) {
        int num = mongoTemplate.updateMulti(new Query(Criteria.where("name").is(name)
                .and("certCardNo").is(certCardNo).and("mobile").is(mobile)), Update.update("data", data).set("updateTime", updateTime).set("flag", flag), BairongData.class).getN();
        return num;
    }


    @Override
    public BairongData getLastBairongData(String name, String certCardNo, String mobile, String strategyId) {
        List<BairongData> datas = mongoTemplate.find(new Query(Criteria.where("name").is(name)
                .and("certCardNo").is(certCardNo).and("mobile").is(mobile)).with(new Sort(Sort.Direction.DESC, "createTime")), BairongData.class);
        if (CollectionUtils.isEmpty(datas)) {
            return null;
        }
        if (null == datas.get(0)) {
            return null;
        }
        return datas.get(0);
    }


    @Override
    public PageModel<BairongData> getAllData(PageModel<BairongData> page) {
        List<BairongData> datas = mongoTemplate.find(new Query().skip(page.getSkip()).limit(page.getPageSize()), BairongData.class);
        page.setDatas(datas);
        return page;
    }


    @Override
    public int getCount() {
        //计算总数
        int count = (int)mongoTemplate.count(null,BairongData.class);
        return count;
    }

    @Override
    public BrPostData getLastBrPostData(String taskId) {
        List<BrPostData> datas = mongoTemplate.find(new Query(Criteria.where("taskId").is(taskId)
                .and("desc").is("拉取数据集合信息信息")).with(new Sort(Sort.Direction.DESC, "createTime")), BrPostData.class);
        if (CollectionUtils.isEmpty(datas)) {
            return null;
        }
        if (null == datas.get(0)) {
            return null;
        }
        return datas.get(0);
    }

    @Override
    public int updateBrPostData(String taskId, String data) {
        int num = mongoTemplate.updateMulti(new Query(Criteria.where("taskId").is(taskId)
                .and("desc").regex("拉取数据集合信息信息")), Update.update("data", data), BrPostData.class).getN();
        return num;
    }

    /**
     * 根据姓名和身份证号获取百融数据
     *
     * @param name
     * @param certCardNo
     * @return
     */
    @Override
    public BairongData getBairongDataByOrder(String name, String certCardNo, String mobile) {
        Integer outTime = configCacheDao.getOutTimeUnit(InterfaceIdEnum.THIRD_BR01.getCode());
        List<BairongData> datas = mongoTemplate.find(new Query(Criteria.where("name").is(name)
                .and("certCardNo").is(certCardNo).and("mobile").is(mobile)
                .and("createTime").gte(getMinTime(outTime))), BairongData.class);
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
     * 推送rms老系统 从json中读取百融评分
     *
     * @param json
     * @return
     */

    public String getRmsScoreByJson(JSONObject json) {
        String score = json.getString("rs_Score_scorecust");
        if (StringUtils.isBlank(score)) {
            score = json.getString("rs_Score_scorelargecashv1");
        }
        if (StringUtils.isBlank(score)) {
            score = json.getString("rs_Score_scorelargecashv2");
        }
        return score;
    }

    /**
     * 从json中读取百融评分
     *
     * @param json
     * @return
     */
    @Override
    public String getScoreByJson(JSONObject json, String channelId) {
        String score = json.getString("rs_Score_scorecust");
        if (StringUtils.isBlank(score)) {
            score = json.getString("rs_Score_scorelargecashv1");
        }
        if (StringUtils.isBlank(score)) {
            score = json.getString("rs_Score_scorelargecashv2");
        }
        if (StringUtils.isBlank(score)) {
            score = "";
        }
        return score;
    }

    /**
     * @param name
     * @param certCardNo
     * @param mobile
     * @return
     */
    @Override
    public JSONObject getBairongData(String name, String certCardNo, String mobile, String strategyId) {
        Integer outTime = configCacheDao.getOutTimeUnit(InterfaceIdEnum.THIRD_BR01.getCode());
        List<BairongData> datas = mongoTemplate.find(new Query(Criteria.where("name").is(name)
                .and("certCardNo").is(certCardNo).and("mobile").is(mobile).and("strategyId").is(strategyId)
                .and("createTime").gte(getMinTime(outTime))).with(new Sort(Sort.Direction.DESC, "createTime")), BairongData.class);
        if (CollectionUtils.isEmpty(datas)) {
            return null;
        }
        String data = datas.get(0).getData();
        if (StringUtils.isBlank(data)) {
            return null;
        }
        return JSONObject.parseObject(data);
    }


    @Override
    public JSONObject getHBBairongData(String name, String certCardNo, String mobile) {
        Integer outTime = configCacheDao.getOutTimeUnit(InterfaceIdEnum.THIRD_BR01.getCode());
        List<BairongData> datas = mongoTemplate.find(new Query(Criteria.where("name").is(name)
                .and("certCardNo").is(certCardNo).and("mobile").is(mobile)
                .and("createTime").gte(getMinTime(outTime))).with(new Sort(Sort.Direction.DESC, "createTime")), BairongData.class);
        if (CollectionUtils.isEmpty(datas)) {
            return null;
        }
        String data = datas.get(0).getData();
        if (StringUtils.isBlank(data)) {
            return null;
        }
        return JSONObject.parseObject(data);
    }

    private Date getMinTime(Integer time) {
        Calendar calendar = Calendar.getInstance();//使用默认时区和语言环境获得一个日历。
        calendar.add(Calendar.DAY_OF_MONTH, -1 * time);//取当前日期的前一天.
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
        if (bankObj != null && !bankObj.isEmpty()) {
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
                if (key.startsWith("ex_bad" + i) || key.startsWith("ex_execut" + i)) {
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
