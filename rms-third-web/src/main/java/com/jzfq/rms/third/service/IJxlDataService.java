package com.jzfq.rms.third.service;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.JxlDataTypeEnum;
import com.jzfq.rms.third.common.mongo.JuXinLiData;

import java.util.List;
import java.util.Map;

/**
 *
 * @description 聚信立数据服务
 * @author 大连桔子分期科技有限公司
 *
 */
public interface IJxlDataService {
	/**
	 * 获取用户报告状态
	 * @param customerName
	 * @param idCard
	 * @param phone
	 * @param category
	 * @return
	 */
	ResponseResult queryStatus(String customerName, String idCard, String phone, String category);
	/**
	 * 获取jxl所有用户报告数据
	 * @param customerName
	 * @param idCard
	 * @param phone
	 * @param commonParams
	 * @return
	 */
	JSONObject queryJxlData(String customerName, String idCard, String phone,Map<String,Object> commonParams);

	/**
	 * 获取用户报告
	 * @param customerName
	 * @param idCard
	 * @param phone
	 * @param commonParams
	 * @return
	 */
	ResponseResult queryAccessReportData(String customerName, String idCard, String phone , Map<String,Object> commonParams );

	/**
	 * 获取运营商数据
	 * @param customerName
	 * @param idCard
	 * @param phone
	 * @param commonParams
	 * @return
	 */
	ResponseResult queryAccessRawData(String customerName, String idCard, String phone , Map<String,Object> commonParams );
	/**
	 * 获取电商数据
	 * @param customerName
	 * @param idCard
	 * @param phone
	 * @param commonParams
	 * @return
	 */
	ResponseResult queryAccessBusiRawData(String customerName, String idCard, String phone , Map<String,Object> commonParams );
	/**
	 * 保存结果
	 * @param name
	 * @param idCard
	 * @param phone
	 * @param type
	 * @param result
	 */
	void saveResult(String name, String idCard, String phone, JxlDataTypeEnum type, String result);

	/**
	 * 根据key和数据类型获取聚信立数据
	 * @param key
	 * @param type
	 * @return
	 */
	List<JuXinLiData> getJuXinLiDatas(String key, String type, String interfaceId);
}
