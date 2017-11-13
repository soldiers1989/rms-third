package com.jzfq.rms.third.service;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.domain.TPyCarCheck;
import com.jzfq.rms.third.common.dto.ResponseResult;

import java.util.List;
import java.util.Map;

/**
 *
 * @description 鹏元服务接口
 * @author 大连桔子分期科技有限公司
 *
 */
public interface IPengYuanService {

    JSONObject queryPengYuanData(Long taskId,  Map<String,Object> carInfo);

    ResponseResult queryPyCarDatas(Map<String,Object> carInfo, Map<String,Object> commonParams)throws Exception;

    /**
     * 获取 鹏元车辆核查数据
     * @param name
     * @param documentNo
     * @param lisence
     * @param carType
     * @return
     */
    List<TPyCarCheck> getPengYuanData(String name,String documentNo,String lisence,String carType);

    /**
     * 保存 车辆审核信息
     * @param result
     * @param value
     * @param carInfo
     * @param status
     */
    void saveCarCheckInfo(String reqId, String result, String value, Map<String,Object> carInfo,Integer status);
}
