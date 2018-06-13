package com.jzfq.rms.third.web.action.masterWork;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.mongo.BrPostData;
import com.jzfq.rms.third.common.mongo.BairongData;
import com.jzfq.rms.third.common.utils.DateUtils;
import com.jzfq.rms.third.common.utils.SpringContextHolder;
import com.jzfq.rms.third.service.IRiskPostDataService;
import com.jzfq.rms.third.web.action.model.BrScoreModel;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {

    private static Logger logger = LoggerFactory.getLogger(Worker.class);

    private IRiskPostDataService riskPostDataService;

    private ConcurrentLinkedQueue<BrScoreModel> workQueue;
    private ConcurrentHashMap<String, Object> resultMap;

    public void setWorkerQueue(ConcurrentLinkedQueue<BrScoreModel> workQueue) {
        this.workQueue = workQueue;
    }

    public void setResultMap(ConcurrentHashMap<String, Object> resultMap) {
        this.resultMap = resultMap;
    }

    public Worker(IRiskPostDataService riskPostDataService) {
        this.riskPostDataService = riskPostDataService;
    }


    @Override
    public void run() {
        //线程 获取 spring bean
//        IRiskPostDataService riskPostDataService = SpringContextHolder.getBean(IRiskPostDataService.class);
        while (true) {
            BrScoreModel input = this.workQueue.poll();
            if (input == null) break;
            //真正的去做业务处理
            Object output = handle(input);
            this.resultMap.put(Integer.toString(input.getId()), output);
        }
    }

    public  Object handle(BrScoreModel info) {
        Object output = null;
        try {
            //表示处理task任务的耗时，可能是数据的加工，也可能是操作数据库...
            Thread.sleep(500);
            //操作数据库
            //执行更新百融分操作
            //查询最近一次bairong_data数据
            BairongData brData = riskPostDataService.getLastBairongData(info.getName(), info.getIdCard(), info.getPhone(), info.getStrategyId());
            JSONObject json = JSONObject.parseObject("{\"rs_strategy_id\":\"STR0000799\",\"code\":\"00\",\"swift_number\":\"3002138_20180511135404_2553\",\"rs_Score_decision\":\"Accept\",\"rs_product_type\":\"100085\",\"rs_platform\":\"ios\",\"scorecust\":\"0\",\"flag_score\":\"1\",\"rs_final_decision\":\"Accept\",\"flag_riskstrategy\":\"1\",\"rs_product_name\":\"假数据" + new SimpleDateFormat(DateUtils.DATE_FORMAT_LONG) + "\",\"rs_Score_scorecust\":\"0\",\"rs_strategy_version\":\"1.0\",\"rs_scene\":\"lend\"}");
            if (null != brData) {
                //新增更新时间
                brData.setUpdateTime(info.getUpdateTime());
                brData.setFlag(info.getFlag());
                if (StringUtils.isNotBlank(brData.getData())) {
                    json = JSONObject.parseObject(brData.getData());
                }
                json.put("rs_Score_scorecust", info.getScore());
                brData.setData(JSONObject.toJSONString(json));
                logger.info("bairongdata更新后数据为:" + json);
                //更新bairong_data
                riskPostDataService.updateBairongData(info.getName(), info.getIdCard(), info.getPhone(), info.getStrategyId(), brData.getData(),brData.getUpdateTime(),brData.getFlag());
            }else {
                brData = new BairongData();
                brData.setUpdateTime(info.getUpdateTime());
                brData.setFlag(info.getFlag());
                json.put("rs_Score_scorecust", info.getScore());
                brData.setData(JSONObject.toJSONString(json));
                //新增一条
                riskPostDataService.saveBairongData(info.getName(),info.getIdCard(),info.getPhone(),"STR0000799",brData.getData(),brData.getUpdateTime(),brData.getFlag());
//                riskPostDataService.saveRmsThirdData(info, customerType, strategyId, brResponse);
            }
            //ch
            //更新br_post_data最近一次数据
            BrPostData brPostData = riskPostDataService.getLastBrPostData(info.getTaskId());
            JSONObject brJson = JSONObject.parseObject("{\"rs_strategy_id\":\"STR0000799\",\"code\":\"00\",\"swift_number\":\"3002138_20180502101600_2512\",\"rs_Score_decision\":\"Accept\",\"rs_product_type\":\"100085\",\"rs_platform\":\"ios\",\"scorecust\":\"0\",\"flag_score\":\"1\",\"rs_final_decision\":\"Accept\",\"flag_riskstrategy\":\"1\",\"rs_product_name\":\"假数据" + new SimpleDateFormat(DateUtils.DATE_FORMAT_LONG) + "\",\"rs_Score_scorecust\":\"0\",\"rs_strategy_version\":\"1.0\",\"scorepettycashv1\":\"0\",\"rs_scene\":\"lend\"}");
            if (null != brPostData) {
                if (StringUtils.isNotBlank(brPostData.getData())) {
                    brJson = JSONObject.parseObject(brPostData.getData());
                }
                brJson.put("scorepettycashv1", info.getScore());
                brJson.put("scoreconsoffv2", info.getScore());
                brPostData.setData(JSONObject.toJSONString(brJson));
                logger.info("brPostData更新后数据为:" + brJson);
                //更新br_post_data
                riskPostDataService.updateBrPostData(info.getTaskId(), brPostData.getData());
            }else {
                brPostData = new BrPostData();
                //新增一条
                brJson.put("scorepettycashv1", info.getScore());
                brJson.put("scoreconsoffv2", info.getScore());
                brPostData.setData(JSONObject.toJSONString(brJson));
                riskPostDataService.saveRmsBrPostData(info.getName(),info.getIdCard(),info.getPhone(),"STR0000799",brPostData.getData(),info.getTaskId());
            }
            output = info.getScore();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return output;
    }


}
