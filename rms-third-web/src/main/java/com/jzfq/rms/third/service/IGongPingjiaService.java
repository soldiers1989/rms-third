package com.jzfq.rms.third.service;

import com.jzfq.rms.third.common.domain.SysTask;
import com.jzfq.rms.third.common.domain.TThirdGongpingjiaData;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.mongo.GongPingJiaData;
import com.jzfq.rms.third.common.vo.EvaluationInfoVo;
import com.jzfq.rms.third.exception.BusinessException;

import java.util.List;
import java.util.Map;

/**
 *
 * @description 公平价服务接口
 * @author 大连桔子分期科技有限公司
 *
 */
public interface IGongPingjiaService {

    /**
     * 公平价估值信息查询
     * @param vin
     * @param licensePlatHeader
     * @return
     */
    List<EvaluationInfoVo> queryGaopingjiaEvalation(String vin, String licensePlatHeader);

    /**
     * 批量更新车型库-全量
     */
    void insertAllCarDetailModels(SysTask task);
    /**
     * 批量更新车型库-局部
     */
    void updateCarDetailModels(SysTask task);
    /**
     * 批量更新车型库-现存
     */
    int getCountCarDetailModels();

    /**
     * 根据vin和车牌前两位查询车辆估值信息 02
     * @param vin
     * @param licensePlatHeader
     * @return
     */
    ResponseResult queryCarEvaluations(String vin, String licensePlatHeader, Map<String,Object> commonParams) throws BusinessException;

    /**
     * 远程获取估值信息和计算这两残值
     * @param vin
     * @param licensePlatHeader
     * @return
     */
    ResponseResult getGpjDataAndCalculateEvaluations(String vin, String licensePlatHeader, Map<String,Object> commonParams) throws BusinessException;

    /**
     * 获取mongo缓存
     * @param vin
     * @param plantNo
     * @return
     */
    String getEvaluatePrice(String vin, String plantNo);


    /**
     * 查询全部公平价数据s
     * @return
     */
    List<GongPingJiaData> queryGaopingjiaDatas();

    /**
     * 保存mysql数据
     * @return
     */
    public void saveNewGongPingJiaData(List<TThirdGongpingjiaData> list) ;

}
