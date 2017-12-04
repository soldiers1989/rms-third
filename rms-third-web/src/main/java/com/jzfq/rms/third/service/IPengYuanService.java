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
    /**
     * 远程 调用查询车辆核查信息
     * @param carInfo
     * @param commonParams
     * @return
     * @throws Exception
     */
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

    /**
     * 保存rms旧系统鹏元数据
     * @param taskId
     * @param result
     */
    void saveRmsDatas(Long taskId, String result, Map<String,Object> carInfo);
}
