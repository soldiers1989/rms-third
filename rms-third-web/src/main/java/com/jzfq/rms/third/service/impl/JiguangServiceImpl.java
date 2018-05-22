package com.jzfq.rms.third.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.httpclient.HttpConnectionManager;
import com.jzfq.rms.third.common.mongo.JiguangData;
import com.jzfq.rms.third.common.utils.MD5Helper;
import com.jzfq.rms.third.service.IJiguangService;
import com.jzfq.rms.third.support.pool.ThreadProvider;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class JiguangServiceImpl implements IJiguangService {


    @Value("${jiguang.api.url}")
    private String jiguang_api_url;

    @Value("${jiguang.jzfq.key}")
    private String jiguang_jzfq_key;

    @Value("${jiguang.jzfq.secret}")
    private String jiguang_jzfq_secret;

    @Value("${jiguang.czbt.key}")
    private String jiguang_czbt_key;

    @Value("${jiguang.czbt.secret}")
    private String jiguang_czbt_secret;

    @Autowired
    private MongoTemplate mongoTemplate;

    private static Logger logger = LoggerFactory.getLogger(JiguangServiceImpl.class);


    @Override
    public void saveData(RiskPersonalInfo info, JSONObject data, String orderNo, String channelId, String traceId
            ,Map<String,String> resultMap) {
        ThreadProvider.getThreadPool().execute(() -> {
            saveData(getJiguangData(info, data, orderNo, channelId, traceId,resultMap));
        });
    }

    public JiguangData getJiguangData(RiskPersonalInfo info, JSONObject data, String orderNo, String channelId, String traceId
            , Map<String,String> resultMap) {
        JiguangData jiguangData = new JiguangData();
        jiguangData.setName(info.getName());
        jiguangData.setPhone(info.getMobile());
        jiguangData.setIdCard(info.getCertCardNo());
        jiguangData.setChannel(channelId);
        jiguangData.setCreateTime(new Date());
        jiguangData.setData(data);
        jiguangData.setTraceId(traceId);
        jiguangData.setYqScore(resultMap.get("yqScore"));
        jiguangData.setWyScore(resultMap.get("wyScore"));
        jiguangData.setGxfxScore(resultMap.get("gxfxScore"));
        jiguangData.setSumScore(resultMap.get("sumScore"));
        jiguangData.setOrderNo(orderNo);
        jiguangData.setDescription(resultMap.get("description"));
        return jiguangData;
    }


    @Override
    public ResponseResult getHttpData(String name, String idcard, String phone, String channelId) {
        phone = MD5Helper.encrypt(phone);//MD5加密手机号
        String url = jiguang_api_url + "?name=" + name + "&id_number=" + idcard + "&phone=" + phone;
        ResponseResult result = null;
        if ("1".equals(channelId)) {
            //桔子分期
            result = HttpConnectionManager.doGet(url, jiguang_jzfq_key, jiguang_jzfq_secret, "utf-8", "application/json");
        }else if ("2".equals(channelId)) {
            //车主白条
            result = HttpConnectionManager.doGet(url, jiguang_czbt_key, jiguang_czbt_secret, "utf-8", "application/json");
        }
         return result;
    }


    @Override
    public JSONObject getData(String name, String idcard, String phone, String orderNo, String channelId) {
        List<JiguangData> datas = mongoTemplate.find(new Query(Criteria.where("name").is(name)
                .and("idCard").is(idcard).and("phone").is(phone).and("channel").is(channelId)
                .and("orderNo").is(orderNo)).with(new Sort(Sort.Direction.DESC, "createTime")), JiguangData.class);
        if (CollectionUtils.isEmpty(datas)) {
            return null;
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("yqScore", datas.get(0).getYqScore());
        jsonObject.put("wyScore", datas.get(0).getWyScore());
        jsonObject.put("gxfxScore", datas.get(0).getGxfxScore());
        jsonObject.put("sumScore", datas.get(0).getSumScore());
        return jsonObject;
    }


    private void saveData(JiguangData data) {
        logger.info("极光 数据开始入库......");
        try {
            mongoTemplate.insert(data);
        } catch (Exception e) {
            logger.error("极光入库失败......", e);
        }
        logger.info("极光 数据入库结束......");
    }


}
