package com.jzfq.rms.third.web.action.parser;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.enums.JiguangCodeEnum;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2018/5/21 13:16.
 **/
public class JiguangParser {

    private static final Logger logger = LoggerFactory.getLogger(JiguangParser.class);

    /**
     * 获取极光分 代码值
     *
     * @param json
     * @return
     */
    public static Map<String, String> getScore(JSONObject json) throws Exception {
        Map<String, String> map = null;
        try {
            logger.info("极光反欺诈接口返回数据data：" + json.toJSONString());
            JSONObject jsonObject0 = json.getJSONObject("data");
            String code = json.get("code").toString();
            //校验code是否正常
            boolean flag = JiguangCodeEnum.checkJaoCode(code);
            if (!flag) {
                map = new HashMap<String, String>();
                map.put("code", code);
                return map;
            }
            if (null != jsonObject0) {
                map = new HashMap<String, String>();
                //判断是否是黑名单
                JSONArray jsonArray = jsonObject0.getJSONArray("hits");
                if (jsonArray!= null && jsonArray.size() > 0) {
                    //黑名单
                    for (int i =0 ; i < jsonArray.size(); i++) {
                        JSONObject job = jsonArray.getJSONObject(i);
                        if (null != job) {
                            String name = job.get("name").toString();
                            if ("逾期分".equals(name)) {
                                map.put("yqScore",job.get("score").toString());
                            }else if ("违约分".equals(name)) {
                                map.put("wyScore",job.get("score").toString());
                            }else if ("关系圈风险分".equals(name)) {
                                map.put("gxfxScore",job.get("score").toString());
                            }else if (!"逾期分".equals(name)) {
                                map.put("yqScore","0");
                            }else if (!"违约分".equals(name)) {
                                map.put("wyScore","0");
                            }else if (!"关系圈风险分".equals(name)) {
                                map.put("gxfxScore","0");
                            }

                        }
                    }
                }else {
                    map.put("yqScore","0");
                    map.put("wyScore","0");
                    map.put("gxfxScore","0");
                }
                map.put("description", (String) jsonObject0.get("description"));
                map.put("sumScore", String.valueOf(jsonObject0.get("score")));//总分
            }
            return map;
        } catch (Exception e) {
            logger.error("traceId={} 极光反欺诈接口返回数据[{}]解析异常:e", TraceIDThreadLocal.getTraceID(), json, e);
            throw e;
        }
    }


}
