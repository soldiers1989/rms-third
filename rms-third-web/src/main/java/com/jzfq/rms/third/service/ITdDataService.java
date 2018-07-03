package com.jzfq.rms.third.service;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.mongo.TongDunStringData;
import com.jzfq.rms.third.common.pojo.tongdun.FraudApiResponse;
import com.jzfq.rms.third.web.action.util.PageModel;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @description 同盾数据服务接口
 * @author 大连桔子分期科技有限公司
 *
 */
public interface ITdDataService {

    /**
     * 获取 eventId
     * @param channelId
     * @param financialProductId
     * @param operationType
     * @param clientType
     * @return
     */
    String getEventId(String channelId, String financialProductId, String operationType, String clientType);

    /**
     * 抓取同盾数据
     * @param params
     * @return
     * @throws Exception
     */
    ResponseResult queryTdDatas(Map<String,Object> params) throws Exception;

    /**
     * 保存同盾规则按照订单号
     * @param orderNo
     */
     void saveResult( String orderNo, String eventId, FraudApiResponse apiResp, Map<String,Object> commonParams);

    /**
     * 根据订单号 获取同盾数据
     * @param orderNo
     * @return
     */
     List<TongDunStringData> getTongDongData(String orderNo);
    /**
     * 根据订单号 获取同盾数据
     * @param orderNo
     * @return
     */
    List<TongDunStringData> getDataByEvent(String orderNo, String eventId);

    /**
     * 根据流水号 获取同盾数据
     * @param serialNo
     * @return
     */
    List<TongDunStringData> getTongDongDataBySerialNo(String serialNo);

    /**
     * 根据订单号 获取同盾数据
     * @param name
     * @param certCardNo
     * @return
     */
    TongDunStringData getTongDongData(String name, String certCardNo);

    /**
     * 获取同盾保镖数据
     * @param appName
     * @param bizParams
     * @return
     */
    ResponseResult getTdBodyGuard(String appName, Map<String,Object> bizParams);
    /**
     * 获取同盾全部数据
     * @param commonParams
     * @return
     * @throws Exception
     */
    JSONObject queryTdAllDatas(String serialNo, Map<String, Object> commonParams)  throws Exception;

    /**
     * 自定义抓取同盾数据
     * @param params
     * @return
     * @throws Exception
     */
    ResponseResult queryTdDatasByParams(Map<String,Object> params) throws Exception;


    /**
     * 保存最新同盾信息
     *
     * @param orderNo
     */
    void saveNewResult(FraudApiResponse apiResponse, String orderNo, String traceId, String name, String idCard, String phone,Date requstTime);

    /**
     *  获取全部同盾数据
     *
     * @param
     * @return
     */
    PageModel<TongDunStringData> getAllData(PageModel<TongDunStringData> page);

    /**
     *  获取全部同盾数据count
     *
     * @param
     * @return
     */
    int getCount();


}
