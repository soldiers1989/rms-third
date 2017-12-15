package com.jzfq.rms.third.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.*;
import com.jzfq.rms.constants.RmsConstants;
import com.jzfq.rms.mongo.JxlData;
import com.jzfq.rms.third.common.mongo.JuXinLiData;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.persistence.dao.IConfigDao;
import com.jzfq.rms.third.persistence.dao.IJxlDao;
import com.jzfq.rms.third.service.IJxlDataService;
import com.jzfq.rms.third.service.ISendMessageService;
import com.jzfq.rms.third.support.pool.ThreadProvider;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.text.SimpleDateFormat;
import java.util.*;

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
			 String reportData = (String)getAccessReportData(token, customerName, idCard, phone,commonParams).getData();
			 json.put("report_data", reportData==null ? "":reportData);
		 }
		 
		 //运营商
		 JxlData raw = mongoTemplate.findOne(new Query(Criteria.where("name").is(customerName)
	                .and("idCard").is(idCard).and("phone").is(phone).and("interfaceType").is(RmsConstants.JXL_RAW_INTERFACE)), JxlData.class);
		 
		 if(raw!=null)
			 json.put("raw_data", raw.getData());
		 else{
			 String accessData = (String)getAccessRawData(token, customerName, idCard, phone,commonParams).getData();
			 json.put("raw_data", accessData==null? "":accessData);
		 }
		 
		 //电商
		 JxlData rawBusi = mongoTemplate.findOne(new Query(Criteria.where("name").is(customerName)
	                .and("idCard").is(idCard).and("phone").is(phone).and("interfaceType").is(RmsConstants.JXL_BUSI_RAW_INTERFACE)), JxlData.class);
		 
		 if(rawBusi!=null)
			 json.put("raw_busi_data", rawBusi.getData());
		 else{
			 String accessBusiData = (String)getAccessBusiRawData(token, customerName, idCard, phone,commonParams).getData();
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
	public ResponseResult queryAccessReportData(String customerName, String idCard, String phone,Map<String,Object> commonParams ) {
		ResponseResult statusResponse = queryStatus(customerName, idCard, phone,null);
		jxlLog.info("traceId={} 聚信立获取用户报告状态",TraceIDThreadLocal.getTraceID(),statusResponse);
		if(statusResponse.getCode()!=ReturnCode.REQUEST_SUCCESS.code()){
			return statusResponse;
		}

		String token=getAccessToken();
		if(StringUtils.isBlank(token)){
			return null;
		}
		//用户报告
		ResponseResult response = getAccessReportData(token, customerName, idCard, phone, commonParams);
		if(response.getCode()!=ReturnCode.REQUEST_SUCCESS.code()){
			return response;
		}
		// 保存数据
		String reportData = (String)response.getData();
		if(reportData==null){
			return response;
		}
//		JSONArray details = (JSONArray)statusResponse.getData();
		JSONObject report = JSONObject.parseObject(reportData);
		JSONObject result = new JSONObject();
		result.put("contact_list",report.get("contact_list"));
		result.put("application_check",report.get("application_check"));
		result.put("contact_region",report.get("contact_region"));
		// 运营商
		ResponseResult rawResponse = getAccessRawData(token, customerName, idCard, phone, commonParams);
		String rawData = (String)rawResponse.getData();
		if(rawResponse.getCode()==ReturnCode.REQUEST_SUCCESS.code()&&StringUtils.isNotBlank(rawData)){
			saveResult(customerName,idCard,phone, JxlDataTypeEnum.JXL_DATA_TYPE_MOBILE,rawData);
		}
		// 电商
		ResponseResult businessResponse = getAccessBusiRawData(token, customerName, idCard, phone, commonParams);
		String ebusinessData = (String)businessResponse.getData();
		if(rawResponse.getCode()==ReturnCode.REQUEST_SUCCESS.code()&&StringUtils.isNotBlank(ebusinessData)){
			saveResult(customerName,idCard,phone, JxlDataTypeEnum.JXL_DATA_TYPE_EBUSINESS,ebusinessData);
			JSONObject ebusiness = JSONObject.parseObject(ebusinessData);
			String code = ebusiness.getJSONObject("members").getString("error_code");
			if(StringUtils.equals("31200",code)){
				ebusiness.getJSONObject("members").getJSONObject("basic");
				result.putAll(getJingDongInfo(ebusiness.getJSONObject("members").getJSONArray("transactions")));
			}
		}
//		boolean mobile = false;
//		boolean eBusiness = false;
//		for(int i=0;i<details.size();i++){
//			String status = details.getJSONObject(i).getString("websiteStatus");
//			String category = details.getJSONObject(i).getString("category");
//			if(!StringUtils.endsWithIgnoreCase(status,"SUCCESS")){
//				continue;
//			}
//			if(StringUtils.equals(category,"mobile")&&!mobile){
//				// 运营商
//				mobile = true;
//				ResponseResult rawResponse = getAccessRawData(token, customerName, idCard, phone, commonParams);
//				if(rawResponse.getCode()!=ReturnCode.REQUEST_SUCCESS.code()){
//					return statusResponse;
//				}
//				String rawData = (String)rawResponse.getData();
//				if(StringUtils.isBlank(rawData)){
//					continue;
//				}
//				saveResult(customerName,idCard,phone, JxlDataTypeEnum.JXL_DATA_TYPE_MOBILE,rawData);
//			}
//			if(StringUtils.equals(category,"e_business")&&!eBusiness){
//				// 电商
//				eBusiness = true;
//				ResponseResult businessResponse = getAccessBusiRawData(token, customerName, idCard, phone, commonParams);
//				if(businessResponse.getCode()!=ReturnCode.REQUEST_SUCCESS.code()){
//					return statusResponse;
//				}
//				String ebusinessData = (String)businessResponse.getData();
//				if(StringUtils.isBlank(ebusinessData)){
//					continue;
//				}
//				saveResult(customerName,idCard,phone, JxlDataTypeEnum.JXL_DATA_TYPE_EBUSINESS,ebusinessData);
//				JSONObject ebusiness = JSONObject.parseObject(ebusinessData);
//				String code = ebusiness.getJSONObject("members").getString("error_code");
//				if(StringUtils.equals("31200",code)){
//					ebusiness.getJSONObject("members").getJSONObject("basic");
//					result.putAll(getJingDongInfo(ebusiness.getJSONObject("members").getJSONArray("transactions")));
//				}
//			}
//		}
		response.setData(result);
		saveResult(customerName,idCard,phone, JxlDataTypeEnum.JXL_DATA_TYPE_REPORT,reportData);
		return response;
	}


	private JSONObject getJingDongInfo(JSONArray transactions){
		JSONObject result = new JSONObject();
		for(int i=0;i<transactions.size();i++){
			JSONObject element = transactions.getJSONObject(i);
			if(StringUtils.equals("jingdong",element.getString("datasource"))){
				result.put("account",element.getJSONObject("basic").get("website_id"));
				result.put("name",element.getJSONObject("basic").get("real_name"));
				result.put("phone",element.getJSONObject("basic").get("cell_phone"));
				break;
			}
		}
		return result;
	}
	/**
	 * 获取运营商数据
	 *
	 * @param customerName
	 * @param idCard
	 * @param phone
	 * @param commonParams
	 * @return
	 */
	@Override
	public ResponseResult queryAccessRawData(String customerName, String idCard, String phone, Map<String, Object> commonParams) {
		String token=getAccessToken();
		if(StringUtils.isBlank(token)){
			return null;
		}
		//用户报告
		return getAccessRawData(token, customerName, idCard, phone, commonParams);
	}

	/**
	 * 获取电商数据
	 *
	 * @param customerName
	 * @param idCard
	 * @param phone
	 * @param commonParams
	 * @return
	 */
	@Override
	public ResponseResult queryAccessBusiRawData(String customerName, String idCard, String phone, Map<String, Object> commonParams) {
		String token=getAccessToken();
		if(StringUtils.isBlank(token)){
			return null;
		}
		//用户报告
		return getAccessBusiRawData(token, customerName, idCard, phone, commonParams);
	}

	/**
	 * 保存结果
	 *
	 * @param name
	 * @param idCard
	 * @param phone
	 * @param type
	 * @param result
	 */
	@Override
	public void saveResult(String name, String idCard, String phone, JxlDataTypeEnum type, String result) {
		String traceId = TraceIDThreadLocal.getTraceID();
		try {
			ThreadProvider.getThreadPool().execute(()->{
				saveJxlData(new JxlData(Byte.parseByte(type.code()), name, idCard, phone, type.msg(), result));
				saveJxlData(new JuXinLiData(name+"_"+idCard+"_"+phone,type.code(),type.msg(), result));
			});
		}catch (Exception e){
			jxlLog.error("traceId={} 保存数据 聚信立 异常",traceId, e);
		}
	}

	@Autowired
	IConfigDao configCacheDao;
	/**
	 * 根据key和数据类型获取聚信立数据
	 *
	 * @param key
	 * @param type
	 * @return
	 */
	@Override
	public List<JuXinLiData> getJuXinLiDatas(String key, String type, String interfaceId) {
		Integer outTime = configCacheDao.getOutTimeUnit(interfaceId);
		List<JuXinLiData> report = mongoTemplate.find(new Query(Criteria.where("key").is(key)
				.and("type").is(type).and("createTime").gte(getMinTime(outTime))), JuXinLiData.class);
		return report;
	}

	/**
	 * 根据key和用户报告返回rms-pull所需数据
	 *
	 * @param key
	 * @param report
	 * @return
	 */
	@Override
	public JSONObject getJuXinLiToRmsPull(String key, JuXinLiData report) {
		JSONObject reportJson = JSONObject.parseObject(report.getData());
		JSONObject result = new JSONObject();
		result.put("contact_list",reportJson.get("contact_list"));
		result.put("application_check",reportJson.get("application_check"));
		result.put("contact_region",reportJson.get("contact_region"));
		Integer outTime = configCacheDao.getOutTimeUnit(InterfaceIdEnum.THIRD_JXL04.getCode());
		List<JuXinLiData> datas = mongoTemplate.find(new Query(Criteria.where("key").is(key)
				.and("type").is(JxlDataTypeEnum.JXL_DATA_TYPE_EBUSINESS.code()).and("createTime").gte(getMinTime(outTime))), JuXinLiData.class);
		if(!CollectionUtils.isEmpty(datas)){
			JuXinLiData ebusinessObject = datas.get(0);
			String ebusinessData = (String) ebusinessObject.getData();
			JSONObject ebusiness = JSONObject.parseObject(ebusinessData);
			String code = ebusiness.getJSONObject("members").getString("error_code");
			if(StringUtils.equals("31200",code)){
				ebusiness.getJSONObject("members").getJSONObject("basic");
				result.putAll(getJingDongInfo(ebusiness.getJSONObject("members").getJSONArray("transactions")));
			}
		}
		return result;
	}

	/**
	 * 根据电商数据返回分析数据
	 *
	 * @param businessDatas
	 * @return
	 */
	@Override
	public JSONObject getBusinessDataAnalysis(String businessDatas,String phone) {
		JSONObject result = new JSONObject();
		result.put("six_month_sum",null);
		result.put("register_phone",null);
		result.put("is_phone",false);
		if(StringUtils.isNotBlank(businessDatas)){
			return result;
		}
		JSONObject ebusiness = JSONObject.parseObject(businessDatas);
		String code = ebusiness.getJSONObject("members").getString("error_code");
		if(!StringUtils.equals("31200",code)){
			return result;
		}
		JSONArray transactions = ebusiness.getJSONObject("members").getJSONArray("transactions");
		String cellPhone = ebusiness.getJSONObject("members").getJSONObject("basic").getString("cell_phone");
		result.put("register_phone",cellPhone);
		result.put("is_phone",isCellPhone(cellPhone,phone));
		for(int i=0;i<transactions.size();i++){
			JSONObject element = transactions.getJSONObject(i);
			if(StringUtils.equals("jingdong",element.getString("datasource"))){
				result.put("six_month_sum",getSixMonthSum(element));
				break;
			}
		}
		return result;
	}

	/**
	 *
	 * @param cellPhone
	 * @return
	 */
	private boolean isCellPhone(String cellPhone,String phone){
		if(StringUtils.isBlank(cellPhone)||StringUtils.isBlank(phone)){
			return false;
		}
		if(cellPhone.trim().length()<6||phone.trim().length()<6){
			return false;
		}
		// 前三位和后三位一致即一致
		if(!StringUtils.equals(cellPhone.trim().substring(0,3),phone.trim().substring(0,3))
				||!StringUtils.equals(cellPhone.trim().substring(cellPhone.length()-3,cellPhone.length()),
				phone.trim().substring(phone.length()-3,phone.length()))){
			return false;
		}
		return true;
	}
	/**
	 *获取六个月订单数
	 * @param element
	 * @return
	 */
	private Integer getSixMonthSum(JSONObject element){
		JSONArray transInfo = element.getJSONArray("transactions");
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, -180);
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String sixMonthBefore = df.format(calendar.getTime());
		Integer sum = 0;
		for(int i=0;i<transInfo.size();i++){
			JSONObject transaction = transInfo.getJSONObject(i);
			String transTime = transaction.getString("trans_time");
			if(sixMonthBefore.compareTo(StringUtil.getStringOfObject(transTime)) <= 0){
				sum++;
			}
		}
		return sum;
	}

	private Date getMinTime(Integer time){
		Calendar calendar = Calendar.getInstance();//使用默认时区和语言环境获得一个日历。
		calendar.add(Calendar.DAY_OF_MONTH, -1*time);//取当前日期的前一天.
		return calendar.getTime();
	}
	/**
	 * 获取用户报告
	 * @param token
	 * @param name
	 * @param idCard
	 * @param phone
	 * @return JxlData
	 */
	private ResponseResult getAccessReportData(String token, String name, String idCard, String phone,Map<String,Object>commonParams){
		String url=jxlDao.getAccessReportDataUrl();
		Map<String, Object> bizParams = buildRequestParam(token, name, idCard, phone);
		commonParams.put("url",url);
		commonParams.put("targetId", SystemIdEnum.THIRD_JXL.getCode());
		commonParams.put("appId", "");
		commonParams.put("interfaceId", InterfaceIdEnum.THIRD_JXL02.getCode());
		commonParams.put("systemId", SystemIdEnum.RMS_THIRD.getCode());
		commonParams.put("traceId", TraceIDThreadLocal.getTraceID());
		ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.JXL02.getCode(),commonParams,bizParams);
		return  response;
	}

	private ResponseResult getAccessRawData(String token, String name, String idCard, String phone,Map<String,Object>commonParams){
		String url=jxlDao.getAccessRawDataUrl();

		Map<String, Object> bizParams = buildRequestParam(token, name, idCard, phone);
		commonParams.put("url",url);
		commonParams.put("targetId", SystemIdEnum.THIRD_JXL.getCode());
		commonParams.put("appId", "");
		commonParams.put("interfaceId", InterfaceIdEnum.THIRD_JXL03.getCode());
		commonParams.put("systemId", SystemIdEnum.RMS_THIRD.getCode());
		commonParams.put("traceId", TraceIDThreadLocal.getTraceID());
		jxlLog.info("开始获取移动运营商数据, [ "+ name +" ], [ "+ phone +" ], [ "+ idCard +" ]");
		ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.JXL03.getCode(),commonParams,bizParams);
		String rawData = (String)response.getData();
		if(rawData!=null){
			saveJxlData(new JxlData(RmsConstants.JXL_RAW_INTERFACE, name, idCard, phone, "移动运营商数据", rawData));
		}
		return response;
	}
	
	private ResponseResult getAccessBusiRawData(String token, String name, String idCard, String phone,Map<String,Object>commonParams){
		String url=jxlDao.getAccessBusiRawDataUrl();

		Map<String, Object> bizParams = buildRequestParam(token, name, idCard, phone);
		commonParams.put("url",url);
		commonParams.put("targetId", SystemIdEnum.THIRD_JXL.getCode());
		commonParams.put("appId", "");
		commonParams.put("interfaceId", InterfaceIdEnum.THIRD_JXL04.getCode());
		commonParams.put("systemId", SystemIdEnum.RMS_THIRD.getCode());
		commonParams.put("traceId", TraceIDThreadLocal.getTraceID());
		jxlLog.info("开始获取电商数据, [ "+ name +" ], [ "+ phone +" ], [ "+ idCard +" ]");
		ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.JXL04.getCode(),commonParams,bizParams);
		String rawData = (String)response.getData();
		if(rawData!=null){
			saveJxlData(new JxlData(RmsConstants.JXL_BUSI_RAW_INTERFACE, name, idCard, phone, "电商数据", rawData));
		}
		return response;
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
	
	private void saveJxlData(Object data) {
		jxlLog.info("开始入库...");
		try {
			mongoTemplate.insert(data);
		} catch (Exception e) {
			jxlLog.error("入库失败", e);
		}
		jxlLog.info("入库结束...");
	}

}
