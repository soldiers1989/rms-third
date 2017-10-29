package com.jzfq.rms.third.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.enums.SendMethodEnum;
import com.jzfq.rms.third.common.enums.SystemIdEnum;
import com.jzfq.rms.constants.RmsConstants;
import com.jzfq.rms.mongo.JxlData;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.persistence.dao.IJxlDao;
import com.jzfq.rms.third.service.IJxlDataService;
import com.jzfq.rms.third.service.ISendMessageService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @description 获取聚信立数据
 * @author 大连桔子分期科技有限公司
 *
 */
@Service
public class JxlDataServiceImpl implements IJxlDataService {
    private static final Logger jxlLog = LoggerFactory.getLogger(JxlDataServiceImpl.class);

    @Value("${jxl.data.orgname}")
    private String orgName;

    @Value("${jxl.data.clientsecret}")
    private String clientSecret;
    @Autowired
	private IJxlDao jxlDao;

    @Autowired
    private MongoTemplate mongoTemplate;

	@Override
	public JSONObject queryJxlData(String customerName, String idCard, String phone,Map<String,Object> commonParams) {
		 JSONObject json = new JSONObject();
		 
		 String token=getAccessToken();
		 if(StringUtils.isBlank(token))
			return null;
		 
		 //用户报告
		 JxlData report = mongoTemplate.findOne(new Query(Criteria.where("name").is(customerName)
	                .and("idCard").is(idCard).and("phone").is(phone).and("interfaceType").is(RmsConstants.JXL_REPORT_INTERFACE)), JxlData.class);
		 
		 if(report!=null)
			 json.put("report_data", report.getData());
		 else{
			 String reportData = getAccessReportData(token, customerName, idCard, phone,commonParams);
			 json.put("report_data", reportData==null ? "":reportData);
		 }
		 
		 //运营商
		 JxlData raw = mongoTemplate.findOne(new Query(Criteria.where("name").is(customerName)
	                .and("idCard").is(idCard).and("phone").is(phone).and("interfaceType").is(RmsConstants.JXL_RAW_INTERFACE)), JxlData.class);
		 
		 if(raw!=null)
			 json.put("raw_data", raw.getData());
		 else{
			 String accessData = getAccessRawData(token, customerName, idCard, phone,commonParams);
			 json.put("raw_data", accessData==null? "":accessData);
		 }
		 
		 //电商
		 JxlData rawBusi = mongoTemplate.findOne(new Query(Criteria.where("name").is(customerName)
	                .and("idCard").is(idCard).and("phone").is(phone).and("interfaceType").is(RmsConstants.JXL_BUSI_RAW_INTERFACE)), JxlData.class);
		 
		 if(rawBusi!=null)
			 json.put("raw_busi_data", rawBusi.getData());
		 else{
			 String accessBusiData = getAccessBusiRawData(token, customerName, idCard, phone,commonParams);
			 json.put("raw_busi_data", accessBusiData==null ? "":accessBusiData);
		 }
		return json;
	}

	@Autowired
    ISendMessageService sendMessegeService;
	@Override
	public ResponseResult queryStatus(String customerName, String idCard, String phone, String category) {

		String url = jxlDao.getAccessReportStatusUrl();
		String token=getAccessToken();
		if(StringUtils.isBlank(token)){
			return null;
		}

		Map<String, Object> commonParams = new HashMap<>();
		commonParams.put("url",url);
		commonParams.put("targetId", SystemIdEnum.THIRD_JXL.getCode());
		commonParams.put("appId", "");
		commonParams.put("interfaceId", InterfaceIdEnum.THIRD_JXL01.getCode());
		commonParams.put("systemId", SystemIdEnum.RMS_THIRD.getCode());
		commonParams.put("traceId", TraceIDThreadLocal.getTraceID());
		Map<String, Object> params = buildRequestParam(token, customerName, idCard, phone, category, "false");
		ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.JXL01.getCode(),commonParams,params);
		return response;
	}


	@Override
	public JSONObject queryAccessReportData(String customerName, String idCard, String phone,Map<String,Object> commonParams ) {
		JSONObject json = new JSONObject();
		String token=getAccessToken();
		if(StringUtils.isBlank(token))
			return null;
		//用户报告
		if(!(boolean)commonParams.get("isRpc")){
			JxlData report = mongoTemplate.findOne(new Query(Criteria.where("name").is(customerName)
					.and("idCard").is(idCard).and("phone").is(phone).and("interfaceType").is(RmsConstants.JXL_REPORT_INTERFACE)), JxlData.class);
			json.put("report_data", report.getData());
			return json;
		}
		String reportData = getAccessReportData(token, customerName, idCard, phone, commonParams);
		json.put("report_data", reportData==null ? "":reportData);
		return json;
	}
	
	/**
	 * 获取用户报告
	 * @param token
	 * @param name
	 * @param idCard
	 * @param phone
	 * @return JxlData
	 */
	private String getAccessReportData(String token, String name, String idCard, String phone,Map<String,Object>commonParams){
		String url=jxlDao.getAccessReportDataUrl();
		Map<String, Object> bizParams = buildRequestParam(token, name, idCard, phone);
		commonParams.put("url",url);
		commonParams.put("targetId", SystemIdEnum.THIRD_JXL.getCode());
		commonParams.put("appId", "");
		commonParams.put("interfaceId", InterfaceIdEnum.THIRD_JXL01.getCode());
		commonParams.put("systemId", SystemIdEnum.RMS_THIRD.getCode());
		commonParams.put("traceId", TraceIDThreadLocal.getTraceID());
		ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.JXL02.getCode(),commonParams,bizParams);
		String reportData = (String)response.getData();
		if(reportData!=null){
			saveJxlData(new JxlData(RmsConstants.JXL_REPORT_INTERFACE, name, idCard, phone, "用户报告数据", reportData));
		}
		return reportData;
	}

	private String getAccessRawData(String token, String name, String idCard, String phone,Map<String,Object>commonParams){
		String url=jxlDao.getAccessRawDataUrl();

		Map<String, Object> bizParams = buildRequestParam(token, name, idCard, phone);
		commonParams.put("url",url);
		commonParams.put("targetId", SystemIdEnum.THIRD_JXL.getCode());
		commonParams.put("appId", "");
		commonParams.put("interfaceId", InterfaceIdEnum.THIRD_JXL01.getCode());
		commonParams.put("systemId", SystemIdEnum.RMS_THIRD.getCode());
		commonParams.put("traceId", TraceIDThreadLocal.getTraceID());
		jxlLog.info("开始获取移动运营商数据, [ "+ name +" ], [ "+ phone +" ], [ "+ idCard +" ]");
		ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.JXL03.getCode(),commonParams,bizParams);
		String rawData = (String)response.getData();
		if(rawData!=null){
			saveJxlData(new JxlData(RmsConstants.JXL_RAW_INTERFACE, name, idCard, phone, "移动运营商数据", rawData));
		}
		return rawData;
	}
	
	private String getAccessBusiRawData(String token, String name, String idCard, String phone,Map<String,Object>commonParams){
		String url=jxlDao.getAccessBusiRawDataUrl();

		Map<String, Object> bizParams = buildRequestParam(token, name, idCard, phone);
		commonParams.put("url",url);
		commonParams.put("targetId", SystemIdEnum.THIRD_JXL.getCode());
		commonParams.put("appId", "");
		commonParams.put("interfaceId", InterfaceIdEnum.THIRD_JXL01.getCode());
		commonParams.put("systemId", SystemIdEnum.RMS_THIRD.getCode());
		commonParams.put("traceId", TraceIDThreadLocal.getTraceID());
		jxlLog.info("开始获取电商数据, [ "+ name +" ], [ "+ phone +" ], [ "+ idCard +" ]");
		ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.JXL04.getCode(),commonParams,bizParams);
		String rawData = (String)response.getData();
		if(rawData!=null){
			saveJxlData(new JxlData(RmsConstants.JXL_BUSI_RAW_INTERFACE, name, idCard, phone, "电商数据", rawData));
		}
		return rawData;
	}

	private String getAccessToken(){
		String url= jxlDao.getAccessTokenUrl();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("org_name", orgName);
		params.put("client_secret", clientSecret);
		params.put("hours", RmsConstants.JXL_TOKEN_EXPIRED_HOUR);

		Map<String, Object> commonParams = new HashMap<>();
		commonParams.put("url",url);
		commonParams.put("targetId", SystemIdEnum.THIRD_JXL.getCode());
		commonParams.put("appId", "");
		commonParams.put("interfaceId", InterfaceIdEnum.THIRD_JXL05.getCode());
		commonParams.put("systemId", SystemIdEnum.RMS_THIRD.getCode());
		commonParams.put("traceId", TraceIDThreadLocal.getTraceID());
		ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.JXL05.getCode(),commonParams,params);
		if(response!=null&&response.getCode()== ReturnCode.REQUEST_SUCCESS.code()){
			return (String)response.getData();
		}
		return null;
	}
	
	private Map<String, Object> buildRequestParam(String token, String name, String idCard, String phone) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("access_token", token);
		params.put("client_secret", clientSecret);
		params.put("name", name);
		params.put("phone", phone);
		params.put("idcard", idCard);
		return params;
	}
	
	private Map<String, Object> buildRequestParam(String token, String name, String idCard, String phone, String category, String rptCheck) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("access_token", token);
		params.put("client_secret", clientSecret);
		params.put("name", name);
		params.put("phone", phone);
		params.put("idCard", idCard);
		params.put("category", category);
		params.put("rptCheck", rptCheck);
		return params;
	}
	
	private void saveJxlData(JxlData data) {
		jxlLog.info("开始入库...");
		try {
			mongoTemplate.insert(data);
		} catch (Exception e) {
			jxlLog.error("入库失败", e);
		}
		jxlLog.info("入库结束...");
	}

}
