package com.jzfq.rms.third.web.action.util.cleanParse;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.domain.TThirdJiguangData;
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
    public static TThirdJiguangData getData(JSONObject json,String name,String idCard,String phone) throws Exception {
        TThirdJiguangData data = new TThirdJiguangData();
        data.setcName(name);
        data.setcIdCard(name);
        data.setcPhone(phone);
        try {
            logger.info("极光反欺诈接口返回数据data：" + json.toJSONString());
            JSONObject jsonObject0 = json.getJSONObject("data");
            data.setcMessage((String)jsonObject0.get("description"));
            String code = json.get("code").toString();
            //校验code是否正常
            boolean flag = JiguangCodeEnum.checkJaoCode(code);
            if (!flag) {
                data.setcCode(code);
                return data;
            }
            boolean wycount = true;
            boolean yqcount = true;
            boolean gxfxcount = true;
            if (null != jsonObject0) {
                //判断是否是黑名单
                JSONArray jsonArray = jsonObject0.getJSONArray("hits");
                if (jsonArray!= null && jsonArray.size() > 0) {
                    //黑名单
                    for (int i =0 ; i < jsonArray.size(); i++) {
                        JSONObject job = jsonArray.getJSONObject(i);
                        if (null != job) {
                            String nameJg = job.get("name").toString();
                            if ("逾期分".equals(nameJg)) {
                                yqcount=false;
                                data.setcOverduescore(job.get("score").toString());
                            }else if ("违约分".equals(nameJg)) {
                                wycount=false;
                                data.setcContractscore(job.get("score").toString());
                            }else if ("关系圈风险分".equals(nameJg)) {
                                gxfxcount=false;
                                data.setcRiskscore(job.get("score").toString());
                            }

                        }
                    }
                }else {
                    data.setcOverduescore("0");
                    data.setcContractscore("0");
                    data.setcRiskscore("0");
                }
                if (!wycount) {
                    data.setcContractscore("0");
                }
                if (!yqcount) {
                    data.setcOverduescore("0");
                }
                if (!gxfxcount) {
                    data.setcRiskscore("0");
                }
                data.setcTotalscore(String.valueOf(jsonObject0.get("score")));//总分
            }
            return data;
        } catch (Exception e) {
            logger.error("traceId={} 极光反欺诈接口返回数据[{}]解析异常:e", TraceIDThreadLocal.getTraceID(), json, e);
            throw e;
        }
    }
}
