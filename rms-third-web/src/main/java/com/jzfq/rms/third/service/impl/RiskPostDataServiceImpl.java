package com.jzfq.rms.third.service.impl;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.jzfq.rms.constants.CourtException;
import com.jzfq.rms.constants.SpecialListCode;
import com.jzfq.rms.domain.RiskPostTask;
import com.jzfq.rms.enums.BaiRongMapEnum;
import com.jzfq.rms.enums.CustomerTypeEnum;
import com.jzfq.rms.enums.DictionaryTypeEnum;
import com.jzfq.rms.mongo.BrPostData;
import com.jzfq.rms.mongo.TdData;
import com.jzfq.rms.mongo.XcData;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.constant.Constants;
import com.jzfq.rms.third.service.IRiskPostDataService;
import org.apache.commons.collections.keyvalue.DefaultKeyValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

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

    @Autowired
    private MongoTemplate mongoTemplate;


    @Transactional(rollbackFor = Exception.class)
    @Override
    public void saveDataAndUpdateTask(BrPostData data, long taskId, byte taskState) {
        mongoTemplate.save(data);
    }

    @Override
    public void saveData(BrPostData data) {
        mongoTemplate.insert(data);
    }

    @Override
    public void updateTask(long taskId, byte taskState) {
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
    public Object queryXingChenSchooldata(long taskId) {
         List<XcData> datas = mongoTemplate.find(new Query(Criteria.where("taskId").is(taskId + "")
                .and("desc").is("星辰征信学籍命中列表")), XcData.class);
        JSONObject jsonObject = new JSONObject();
         for (XcData data : datas) {
              if (!StringUtils.isEmpty(data.getData())) {
                 String str = data.getData().replace("1","一致");
                 str = str.replace("\"\"","\"不一致\"");
                jsonObject.putAll(JSON.parseObject(str));
            }
        }
        //翻译数据  如果数据为空直接返回
        if (!CollectionUtils.isEmpty(jsonObject) && jsonObject.size() > 2) {
            processResult(jsonObject);
        }
        return jsonObject;
    }

    public Object queryPhoneThreeData(long taskId, int type) {
        if (type == CustomerTypeEnum.CUSTOMERTYPE_CAR.getCode()){
            type = CustomerTypeEnum.CUSTOMERTYPE_WHITE_COLLAR.getCode();
        }

        List<BrPostData> datas = mongoTemplate.find(new Query(Criteria.where("taskId").is(taskId + "")
                .and("interfaceType").is(type + "")
                .and("desc").is("手机三要素")), BrPostData.class);
        JSONObject jsonObject = new JSONObject();
        for (BrPostData data : datas) {
            if (!StringUtils.isEmpty(data.getData()))
                jsonObject.putAll(JSON.parseObject(data.getData()));
        }
        //翻译数据  如果数据为空直接返回
        if (!CollectionUtils.isEmpty(jsonObject) && jsonObject.size() > 2) {
            processResult(jsonObject);
        }
        return jsonObject;
    }
    public boolean checkPhoneThreeData(Object obj){

        int phonePeriodValue = 0;
        try {
            net.sf.json.JSONObject json = net.sf.json.JSONObject.fromObject(obj);
            String product = json.optString("product");
            if (product == ""){
                return false;
            }
            json = net.sf.json.JSONObject.fromObject(product);
            product = json.optString("result");
            if (product == ""){
                return false;
            }
            phonePeriodValue = Integer.parseInt(product.toString());
        } catch (NumberFormatException e) {
            return false;
        } finally {
            if (phonePeriodValue == 1){         // 1均一致   2均不一致  3姓名手机号一致，姓名身份证号不一致
                return true;
            }
        }
        return false;
    }
    public boolean checkPhoneThreeData(long taskId, int type){
        Object obj = queryPhoneThreeData(taskId, type);
        return checkPhoneThreeData(obj);
    }

    public Object queryPhonePeriodData(long taskId, int type) {
        if (type == CustomerTypeEnum.CUSTOMERTYPE_CAR.getCode()){
            type = CustomerTypeEnum.CUSTOMERTYPE_WHITE_COLLAR.getCode();
        }


        List<BrPostData> datas = mongoTemplate.find(new Query(Criteria.where("taskId").is(taskId + "")
                .and("interfaceType").is(type + "")
                .and("desc").is("手机在网时长")), BrPostData.class);
        JSONObject jsonObject = new JSONObject();
        for (BrPostData data : datas) {
            if (!StringUtils.isEmpty(data.getData()))
                jsonObject.putAll(JSON.parseObject(data.getData()));
        }
        //翻译数据  如果数据为空直接返回
        if (!CollectionUtils.isEmpty(jsonObject) && jsonObject.size() > 2) {
            processResult(jsonObject);
        }
        return jsonObject;
    }

//    public boolean checkPhonePeriodData(Object obj){
//        int phonePeriodValue = 0;        //手机在网时长		防止拉取不到数据百融数据，默认给一个最低分
//        int phonePeriodData = Integer.parseInt(dictionaryService.getValue(DictionaryTypeEnum.JZFQRZ_CHECK_PHONE_PERIOD_DATA.getValue(), "1"));
//        try {
//            net.sf.json.JSONObject json = net.sf.json.JSONObject.fromObject(obj);
//            String product = json.optString("product");
//            json = net.sf.json.JSONObject.fromObject(product);
//            product = json.optString("data");
//
//            json = net.sf.json.JSONObject.fromObject(product);
//            product = json.optString("value");
//            phonePeriodValue = Integer.parseInt(product.toString());
//        } catch (Exception e) {
//            return false;
//        } finally {
////            1：[0,6)
////            2：[6,12)
////            3：[12,24)
////            4：[24,+)
//            if(phonePeriodValue==phonePeriodData){//小于6个月闭单为真
//                return true;
//            }
//        }
//        return false;
//    }

    /**
     * 根据任务id 查询 手机在网状态
     * @param taskId
     * @param type
     * @return
     */
    public Object queryPhoneStatusData(long taskId, int type) {
        if (type == CustomerTypeEnum.CUSTOMERTYPE_CAR.getCode()){
            type = CustomerTypeEnum.CUSTOMERTYPE_WHITE_COLLAR.getCode();
        }


        List<BrPostData> datas = mongoTemplate.find(new Query(Criteria.where("taskId").is(taskId + "")
                .and("interfaceType").is(type + "")
                .and("desc").is("手机在网状态")), BrPostData.class);
        JSONObject jsonObject = new JSONObject();
        for (BrPostData data : datas) {
            if (!StringUtils.isEmpty(data.getData()))
                jsonObject.putAll(JSON.parseObject(data.getData()));
        }
        //翻译数据  如果数据为空直接返回
        if (!CollectionUtils.isEmpty(jsonObject) && jsonObject.size() > 2) {
            processResult(jsonObject);
        }
        return jsonObject;
    }

    public boolean checkPhoneStatusData(Object obj){
        String product ="";
        try {
//            net.sf.json.JSONObject json = net.sf.json.JSONObject.fromObject(obj);
//            JSONArray jsonObject0 = json.getJSONArray("tianji_api_jiao_phonestatus_response");
//            net.sf.json.JSONObject jsonObject1 = jsonObject0.getJSONObject(0);
//            net.sf.json.JSONObject jsonObject2 = jsonObject1.getJSONObject("checkResult");
//            net.sf.json.JSONObject jsonObject3 = jsonObject2.getJSONObject("ISPNUM");
//            JSONArray jsonObject4 = jsonObject2.getJSONArray("RSL");
//            net.sf.json.JSONObject jsonObject5 = jsonObject4.getJSONObject(0);
//            net.sf.json.JSONObject jsonObject6 = jsonObject5.getJSONObject("RS");
//            String jsonOperation0=jsonObject3.getString("isp");
//            code=jsonObject6.getString("code");

            net.sf.json.JSONObject json = net.sf.json.JSONObject.fromObject(obj);
            product = json.optString("product");
            if (product == ""){
                return false;
            }
            json = net.sf.json.JSONObject.fromObject(product);
            product = json.optString("result");
            if (!"正常在用" .equals(product)){
                return false;
            }

        } catch (Exception e) {
            return false;
        } finally {
            if ("正常在用" .equals(product)){
                return true;//正常使用
            }
        }
        return false;
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
        if (!StringUtils.isEmpty(bankObj)) {
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
