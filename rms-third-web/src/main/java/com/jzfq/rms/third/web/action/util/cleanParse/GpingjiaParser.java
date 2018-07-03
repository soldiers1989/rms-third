package com.jzfq.rms.third.web.action.util.cleanParse;


import com.jzfq.rms.third.common.domain.TThirdGongpingjiaData;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.common.vo.EvaluationInfoVo;
import com.jzfq.rms.third.constant.Constants;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2018/6/22 16:27.
 **/
public class GpingjiaParser {


    public static List<TThirdGongpingjiaData> getGongPingJiaData(ResponseResult result, String orderNo, String vin,
                                                                 String licensePlateNum, String licensePlatHeader, String evaluation, String traceId) {
        List<Map<String, String>> datas = (List<Map<String, String>>) result.getData();
        if (CollectionUtils.isEmpty(datas)) {
            return null;
        }
        Set<String> slugs = new HashSet<>();
        List<TThirdGongpingjiaData> gpjList = new ArrayList<>();
        for (Map<String, String> data : datas) {

            TThirdGongpingjiaData gpj = getGongpingjianDatas(data, orderNo, vin, licensePlateNum, licensePlatHeader, traceId);
            gpj.setcStatus(String.valueOf(result.getCode()));
            gpj.setcMessage(result.getMsg());
            gpj.setGpjValue(evaluation);

            if (gpj != null) {
                gpjList.add(gpj);
            }
        }
        return gpjList;
    }

    private static TThirdGongpingjiaData getGongpingjianDatas(Map<String, String> data, String orderNo, String vin, String licensePlateNum, String licensePlatHeader, String traceId) {
        String modelDetailSlug = data.get("model_detail_slug");
        TThirdGongpingjiaData gpj = new TThirdGongpingjiaData();
        gpj.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        gpj.setcTraceId(traceId);
        gpj.setcVin(vin);
        gpj.setcLicensePlatHeader(licensePlatHeader);
        gpj.setcLicensePlateNum(licensePlateNum);
        gpj.setcOrderNo(orderNo);
        gpj.setcMinSellPrice(data.get("min_sell_price"));//车辆收购下限
        gpj.setcSellPrice(data.get("sell_price"));//收购价
        gpj.setcMaxSellPrice(data.get("max_sell_price"));//收购价上线
        gpj.setcSellUrl(data.get("sell_url"));//结果url
        gpj.setcMinPrivatePrice(data.get("min_private_price"));//收购价上线url
        gpj.setcPrivatePrice(data.get("private_price"));//个人对个人交易
        gpj.setcMaxPrivatePrice(data.get("max_private_price"));//个人对个人加一加上线
        gpj.setcPrivateUrl(data.get("private_url"));//个人对个人url
        gpj.setcMinBuyPrice(data.get("min_buy_price"));//车商卖车下限
        gpj.setcBuyPrice(data.get("buy_price"));//车商卖车价
        gpj.setcBuyUrl(data.get("buy_price"));
        gpj.setcMaxBuyPrice(data.get("max_buy_price"));//车商卖车价上线
        gpj.setcModelDetailSlug(modelDetailSlug);//模型
        return gpj;
    }


    public static List<TThirdGongpingjiaData> getHistGongPingJiaData(ResponseResult result, String orderNo, String vin,
                                                                 String licensePlateNum, String licensePlatHeader, String evaluation, String traceId,Date requestTime) {
        List<Map<String, String>> datas = (List<Map<String, String>>) result.getData();
        if (CollectionUtils.isEmpty(datas)) {
            return null;
        }
        Set<String> slugs = new HashSet<>();
        List<TThirdGongpingjiaData> gpjList = new ArrayList<>();
        for (Map<String, String> data : datas) {

            TThirdGongpingjiaData gpj = getHisGongpingjianDatas(data, orderNo, vin, licensePlateNum, licensePlatHeader, traceId);
            gpj.setcStatus(String.valueOf(result.getCode()));
            gpj.setcMessage(result.getMsg());
            gpj.setGpjValue(evaluation);
            gpj.setcCreateTime(requestTime);
            if (gpj != null) {
                gpjList.add(gpj);
            }
        }
        return gpjList;
    }

    private static TThirdGongpingjiaData getHisGongpingjianDatas(Map<String, String> data, String orderNo, String vin, String licensePlateNum, String licensePlatHeader, String traceId) {
        String modelDetailSlug = data.get("modelDetailSlug");
        TThirdGongpingjiaData gpj = new TThirdGongpingjiaData();
        gpj.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        gpj.setcTraceId(traceId);
        gpj.setcVin(vin);
        gpj.setcLicensePlatHeader(licensePlatHeader);
        gpj.setcLicensePlateNum(licensePlateNum);
        gpj.setcOrderNo(orderNo);
        gpj.setcMinSellPrice(data.get("minSellPrice"));//车辆收购下限
        gpj.setcSellPrice(data.get("sellPrice"));//收购价
        gpj.setcMaxSellPrice(data.get("maxSellPrice"));//收购价上线
        gpj.setcSellUrl(data.get("sellUrl"));//结果url
        gpj.setcMinPrivatePrice(data.get("minPrivatePrice"));//收购价上线url
        gpj.setcPrivatePrice(data.get("privatePrice"));//个人对个人交易
        gpj.setcMaxPrivatePrice(data.get("maxPrivatePrice"));//个人对个人加一加上线
        gpj.setcPrivateUrl(data.get("privateUrl"));//个人对个人url
        gpj.setcMinBuyPrice(data.get("minBuyPrice"));//车商卖车下限
        gpj.setcBuyPrice(data.get("buyPrice"));//车商卖车价
        gpj.setcBuyUrl(data.get("buyPrice"));
        gpj.setcMaxBuyPrice(data.get("maxBuyPrice"));//车商卖车价上线
        gpj.setcModelDetailSlug(modelDetailSlug);//模型
        return gpj;
    }


}
