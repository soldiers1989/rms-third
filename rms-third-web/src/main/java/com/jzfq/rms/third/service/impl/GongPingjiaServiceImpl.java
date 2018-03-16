package com.jzfq.rms.third.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.mongo.JxlData;
import com.jzfq.rms.third.common.domain.GpjCarDetailModel;
import com.jzfq.rms.third.common.domain.SysTask;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.*;
import com.jzfq.rms.third.common.mongo.GongPingJiaData;
import com.jzfq.rms.third.common.mongo.JuXinLiData;
import com.jzfq.rms.third.common.utils.JWTUtils;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.common.vo.EvaluationInfoVo;
import com.jzfq.rms.third.constant.Constants;
import com.jzfq.rms.third.context.CallSystemIDThreadLocal;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.exception.BusinessException;
import com.jzfq.rms.third.persistence.dao.IConfigDao;
import com.jzfq.rms.third.persistence.mapper.GpjCarDetailModelMapper;
import com.jzfq.rms.third.persistence.mapper.SysTaskMapper;
import com.jzfq.rms.third.service.IGongPingjiaService;
import com.jzfq.rms.third.service.ISendMessageService;
import com.jzfq.rms.third.support.cache.ICache;
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

@Service("gongPingjiaService")
public class GongPingjiaServiceImpl implements IGongPingjiaService {

    private static final Logger log = LoggerFactory.getLogger("GongPingjiaService");

    @Value("${gongpingjia.key}")
    private String key;
    @Value("${gongpingjia.secret}")
    private String secret;
    @Value("${gongpingjia.timeout}")
    private Long timeout ;


    @Autowired
    ICache prefixCache;

    @Value("${gongpingjia.detail.model.page.size}")
    private int size;

    @Autowired
    private GpjCarDetailModelMapper gpjCarDetailModelMapper;

    @Autowired
    private SysTaskMapper sysTaskMapper;

    @Autowired
    ISendMessageService sendMessegeService;

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<EvaluationInfoVo> queryGaopingjiaEvalation(String vin, String licensePlatHeader) {
        log.info("公平价接口调用[车架号=" + vin + "车牌头两位" + licensePlatHeader + "]-开始");
        JSONObject evaluation = getGongpingjiaData(vin, licensePlatHeader);
        if (evaluation == null) {
            return null;
        }
        return createCarEvaluations((List<Map<String, String>>) evaluation.get("data"));
    }

    /**
     * 调用公平价接口
     *
     * @param vin
     * @param licensePlatHeader
     * @return
     */
    private JSONObject getGongpingjiaData(String vin, String licensePlatHeader) {
        ResponseResult response;
        try {
            response = JWTUtils.getData(key, secret, timeout, getEvaluationUrl(vin, licensePlatHeader));
        } catch (Exception e) {
            return null;
        }
        if (!(ReturnCode.REQUEST_SUCCESS.code() == response.getCode()) || response.getData() == null) {
            log.info("公平价估价接口调用[车架号=" + vin + "车牌头两位=" + licensePlatHeader + "]失败:" + response.getCode() + "响应信息：" + response.getData());
            return null;
        }
        String evaluationStr = response.getData().toString();
        if (StringUtils.isBlank(evaluationStr)) {
            log.info("公平价估价接口调用[车架号=" + vin + "车牌头两位=" + licensePlatHeader + "]返回信息为空");
            return null;
        }
        JSONObject evaluationInfo = JSONObject.parseObject(evaluationStr);
        if (!StringUtils.equals(evaluationInfo.get("status").toString(), "success")) {
            log.info("公平价估价接口调用[车架号=" + vin + "车牌头两位=" + licensePlatHeader + "]返回失败:" + evaluationInfo.get("message").toString());
            return null;
        }
        log.info("公平价估价接口调用[车架号=" + vin + "车牌头两位=" + licensePlatHeader + "]成功");
        return evaluationInfo;
    }

    /**
     * 计算残值和保存车辆估值
     *
     * @param result
     * @return
     */
    private String calculateVluationAndSaveData(ResponseResult result, String vin, String licensePlatHeader) {
        Integer productiveYear = getProductiveYearByVin(vin);
        if (productiveYear == null) {

            return StringUtil.getStringOfObject(prefixCache.readConfig(Constants.DICTIONARY_PREFIX_DEFAULT_VALUE_CAR_VALUATION));
        }
        List<Map<String, String>> datas = (List<Map<String, String>>) result.getData();
        if (CollectionUtils.isEmpty(datas)) {
            return StringUtil.getStringOfObject(prefixCache.readConfig(Constants.DICTIONARY_PREFIX_DEFAULT_VALUE_CAR_VALUATION));
        }
        Set<String> slugs = new HashSet<>();
        List<EvaluationInfoVo> evaluationInfos = new ArrayList<>();
        for (Map<String, String> data : datas) {
            EvaluationInfoVo evaluation = getEvaluationDatas(data, slugs);
            if (evaluation != null) {
                evaluationInfos.add(evaluation);
            }
        }
        // 查新车型库信息
        if (CollectionUtils.isEmpty(slugs) || CollectionUtils.isEmpty(evaluationInfos)) {

            return StringUtil.getStringOfObject(prefixCache.readConfig(Constants.DICTIONARY_PREFIX_DEFAULT_VALUE_CAR_VALUATION));
        }
        List<GpjCarDetailModel> carRepositories = gpjCarDetailModelMapper.selectByModelSlugList(slugs);
        if (CollectionUtils.isEmpty(carRepositories)) {
            return StringUtil.getStringOfObject(prefixCache.readConfig(Constants.DICTIONARY_PREFIX_DEFAULT_VALUE_CAR_VALUATION));
        }
        Map<String, GpjCarDetailModel> repositories = new HashMap<>();
        for (GpjCarDetailModel repository : carRepositories) {
            repositories.put(repository.getDetailModelSlug(), repository);
        }
        for (EvaluationInfoVo evaluation : evaluationInfos) {
            String modelSlug = evaluation.getDetailModelSlug();
            GpjCarDetailModel repository = repositories.get(modelSlug);
            if (repository == null) {
                continue;
            }
            evaluation.setBrandName(repository.getBrandName());
            evaluation.setBrandSlug(repository.getBrandSlug());
            evaluation.setModelName(repository.getModelName());
            evaluation.setModelSlug(repository.getModelSlug());
            evaluation.setDetailModelName(repository.getDetailModelName());
            evaluation.setGuidePrice(repository.getPriceBn());
            evaluation.setListedYear(repository.getListedYear());
        }
        EvaluationInfoVo tempEvaluation = null;
        for (EvaluationInfoVo evaluation : evaluationInfos) {
            if (tempEvaluation == null) {
                tempEvaluation = evaluation;
                continue;
            }
            tempEvaluation = getDataByNearYear(tempEvaluation, evaluation, productiveYear);
        }
        // 保存数据  如果公平价估值为null吧 推送49999，返回页面49999
        if (StringUtils.isBlank(tempEvaluation.getPrivatePrice())) {
            tempEvaluation.setPrivatePrice(StringUtil.getStringOfObject(prefixCache.readConfig(Constants.DICTIONARY_PREFIX_DEFAULT_VALUE_CAR_VALUATION)));
        }
        saveGongPingJiaData(vin, licensePlatHeader, evaluationInfos, tempEvaluation.getPrivatePrice());
        return tempEvaluation.getPrivatePrice();
    }


    /**
     * 保存数据
     *
     * @param vin
     * @param licensePlatHeader
     * @param evaluationInfos
     * @param value
     */
    private void saveGongPingJiaData(String vin, String licensePlatHeader, List<EvaluationInfoVo> evaluationInfos, String value) {
        ThreadProvider.getThreadPool().execute(() -> {
            saveData(new GongPingJiaData(vin, licensePlatHeader, GpjTypeEnum.GPJ_EVALUATION, value, evaluationInfos, new Date()));
        });
    }

    /**
     * 根据规则获取最终数据
     * 若该型号车有多个款型，取与该车生产年份相同或相近的款型的个人对个人价作为该车的实际估值，
     * 且先生产的款型较后生产的款型优先级跟高。例如由车架号判断出该车生产年份为2010年，公平价返回有生产年份为2008,
     * 2009,2011，2015年的款型，则取2009年款型的个人对个人价作为车辆估值。
     *
     * @param currentInfo
     * @param otherInfo
     * @param productYear
     * @return
     */
    private EvaluationInfoVo getDataByNearYear(EvaluationInfoVo currentInfo, EvaluationInfoVo otherInfo, Integer productYear) {
        // 年份相同 去最小值
        if (otherInfo.getListedYear() == currentInfo.getListedYear()) {
            if (Integer.parseInt(otherInfo.getPrivatePrice()) < Integer.parseInt(currentInfo.getPrivatePrice())) {
                return otherInfo;
            }
        }
        // 去和上市年份相近的 靠前年份
        Integer current = currentInfo.getListedYear() - productYear;
        Integer other = otherInfo.getListedYear() - productYear;
        if (isCurrentInfo(current, other)) {
            return currentInfo;
        }
        return otherInfo;
    }

    /**
     * 判断是否取当前值作为下次比较
     *
     * @param current
     * @param other
     * @return
     */
    private boolean isCurrentInfo(Integer current, Integer other) {
        if (current == 0) {
            return true;
        }
        if (other == 0) {
            return false;
        }
        if (Math.abs(current) > Math.abs(other)) {
            return false;
        }
        Integer flag = current * other;
        if (flag > 0) {
            return true;
        }
        if (Math.abs(current) == Math.abs(other)) {
            if (other < 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 根据车辆信息和公平价返回数据拼接页面数据
     *
     * @param datas
     * @return
     */
    private List<EvaluationInfoVo> createCarEvaluations(List<Map<String, String>> datas) {
        if (CollectionUtils.isEmpty(datas)) {
            return null;
        }
        Set<String> slugs = new HashSet<>();
        List<EvaluationInfoVo> evaluationInfos = new ArrayList<>();
        for (Map<String, String> data : datas) {
            EvaluationInfoVo evaluation = getEvaluationDatas(data, slugs);
            if (evaluation != null) {
                evaluationInfos.add(evaluation);
            }
        }
        // 查新车型库信息
        if (CollectionUtils.isEmpty(slugs) || CollectionUtils.isEmpty(evaluationInfos)) {
            return null;
        }
        List<GpjCarDetailModel> carRepositories = gpjCarDetailModelMapper.selectByModelSlugList(slugs);
        if (CollectionUtils.isEmpty(carRepositories)) {
            return null;
        }
        Map<String, GpjCarDetailModel> repositories = new HashMap<>();
        for (GpjCarDetailModel repository : carRepositories) {
            repositories.put(repository.getDetailModelSlug(), repository);
        }
        for (EvaluationInfoVo evaluation : evaluationInfos) {
            String modelSlug = evaluation.getDetailModelSlug();
            GpjCarDetailModel repository = repositories.get(modelSlug);
            if (repository == null) {
                continue;
            }
            evaluation.setBrandName(repository.getBrandName());
            evaluation.setBrandSlug(repository.getBrandSlug());
            evaluation.setModelName(repository.getModelName());
            evaluation.setModelSlug(repository.getModelSlug());
            evaluation.setDetailModelName(repository.getDetailModelName());
            evaluation.setGuidePrice(repository.getPriceBn());
            evaluation.setListedYear(repository.getListedYear());
        }

        return evaluationInfos;
    }

    private EvaluationInfoVo getEvaluationDatas(Map<String, String> data, Set<String> slugs) {
        String modelDetailSlug = data.get("model_detail_slug");
        if (StringUtils.isBlank(modelDetailSlug) || slugs.contains(modelDetailSlug)) {
            return null;
        }
        slugs.add(modelDetailSlug);
        EvaluationInfoVo evaluation = new EvaluationInfoVo();
        evaluation.setMinSellPrice(data.get("min_sell_price"));
        evaluation.setSellPrice(data.get("sell_price"));
        evaluation.setMaxSellPrice(data.get("max_sell_price"));
        evaluation.setSellUrl(data.get("sell_url"));

        evaluation.setMinPrivatePrice(data.get("min_private_price"));
        evaluation.setPrivatePrice(data.get("private_price"));
        evaluation.setMaxPrivatePrice(data.get("max_private_price"));
        evaluation.setPrivateUrl(data.get("private_url"));

        evaluation.setMinBuyPrice(data.get("min_buy_price"));
        evaluation.setBuyPrice(data.get("buy_price"));
        evaluation.setMaxBuyPrice(data.get("max_buy_price"));
        evaluation.setBuyUrl(data.get("buy_url"));

        evaluation.setDetailModelSlug(modelDetailSlug);
        return evaluation;
    }

    /**
     * 拼接估值接口URL参数
     */
    private String getEvaluationUrl(String vin, String licensePlatHeader) {
        String params = "?vin=" + vin + "&license_plat_header=" + licensePlatHeader;
        return prefixCache.readConfigByGroup("rms-third-interface-url", "gpj-evaluation") + params;
    }

    /**
     * 全量更新
     *
     * @param currentTask
     */
    public void insertAllCarDetailModels(SysTask currentTask) {
        Integer totalPages = 0;
        Integer page = 1;
        synchronizeData(totalPages, currentTask, page, "all", null);
    }

    private void saveData(Object data) {
        log.info("开始入库...");
        try {
            mongoTemplate.insert(data);
        } catch (Exception e) {
            log.error("入库失败", e);
        }
        log.info("入库结束...");
    }

    public int getCountCarDetailModels() {
        return gpjCarDetailModelMapper.getCountCarDetailModel();
    }

    /**
     * 增量更新
     *
     * @param currentTask
     */
    public void updateCarDetailModels(SysTask currentTask) {
        SysTask task = sysTaskMapper.selectByTaskSlug("GPJgetCarDetailModel");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String beginTime = "all";
        if (task != null && task.getExcTime() != null) {
            beginTime = sdf.format(task.getExcTime());
        }
        String endTime = sdf.format(currentTask.getExcTime());
        Integer totalPages = 0;
        Integer page = 1;
        synchronizeData(totalPages, currentTask, page, beginTime, endTime);
    }

    /**
     * 根据条件同步数据
     *
     * @param totalPages
     * @param currentTask
     * @param page
     * @param beginTime
     * @param endTime
     */
    private void synchronizeData(Integer totalPages, SysTask currentTask, Integer page, String beginTime, String endTime) {
        do {
            ResponseResult dto = synchronizeData(page, beginTime, endTime);
            if (dto.getCode() != ReturnCode.REQUEST_SUCCESS.code()) {
                log.info("调用公平价接口失败:{} ", dto.getMsg());
                currentTask.setStatus(TaskCode.EXCUTE_FAILURE.code());
                break;
            }
            JSONObject json = JSONObject.parseObject(dto.getData().toString());
            String models = json.getString("data");
            if (totalPages == 0) {
                totalPages = json.getInteger("total_pages");
                currentTask.setTaskParams("total_pages:" + totalPages);
            }
            totalPages--;
            page++;
            JSONArray array = JSONObject.parseArray(models);
            List<GpjCarDetailModel> modelList = new ArrayList<>();
            Set<String> slugs = new HashSet<>();
            for (int i = 0; i < array.size(); i++) {
                GpjCarDetailModel car = new GpjCarDetailModel();
                buildCar(array, i, car);
                slugs.add(car.getDetailModelSlug());
                modelList.add(car);
            }
            try {
                gpjCarDetailModelMapper.batchDelete(slugs);
                gpjCarDetailModelMapper.batchInsert(modelList);
            } catch (Exception e) {
                log.error("批量插入车型出错：", e);
                currentTask.setStatus(TaskCode.EXCUTE_FAILURE.code());
            }
        } while (totalPages > 0);
    }

    /**
     * 调用接口
     *
     * @param page
     * @param beginTime
     * @param endTime
     * @return
     */
    private ResponseResult synchronizeData(Integer page, String beginTime, String endTime) {

        Map<String, Object> params = new HashMap<>();
        params.put("key", key);
        params.put("secret", secret);
        params.put("timeout", timeout);
        String url = (String) prefixCache.readConfigByGroup("rms-third-interface-url", "gpj-detail-model");
        params.put("url", url);
        params.put("targetId", SystemIdEnum.THIRD_GPJ.getCode());
        params.put("appId", "");
        params.put("interfaceId", InterfaceIdEnum.THIRD_GPJ_SYNCHRONIZEDATA.getCode());
        params.put("systemId", CallSystemIDThreadLocal.getCallSystemID());
        params.put("traceId", TraceIDThreadLocal.getTraceID());

        Map<String, Object> bizParams = new HashMap<>();
        bizParams.put("size", size);
        bizParams.put("page", page);
        bizParams.put("beginTime", beginTime);
        bizParams.put("endTime", endTime);
        return sendMessegeService.sendByThreeChance(SendMethodEnum.GPJ02.getCode(), params, bizParams);
    }

    /**
     * 构建车型库对象
     *
     * @param array
     * @param i
     * @param car
     */
    private void buildCar(JSONArray array, int i, GpjCarDetailModel car) {
        JSONObject o = (JSONObject) array.get(i);
        Integer gpj_id = o.getInteger("gpj_id");
        car.setGpjId(gpj_id);
        String detail_model = o.getString("detail_model");
        car.setDetailModelName(detail_model);
        Date update_time = o.getDate("update_time");
        car.setUpdateTime(update_time);
        String emission_standard = o.getString("emission_standard");
        car.setEmissionStandard(emission_standard);
        String volume = o.getString("volume");
        if (StringUtils.isNotBlank(volume) && com.alibaba.druid.util.StringUtils.isNumber(volume.trim())) {
            car.setVolume(Float.parseFloat(volume.trim()));
        }
        String listed_year = o.getString("listed_year");
        if (StringUtils.isNotBlank(listed_year) && com.alibaba.druid.util.StringUtils.isNumber(listed_year.trim())) {
            car.setListedYear(Integer.parseInt(listed_year.trim()));
        }
        String delisted_year = o.getString("delisted_year");
        if (StringUtils.isNotBlank(delisted_year) && com.alibaba.druid.util.StringUtils.isNumber(delisted_year.trim())) {
            car.setDelistedYear(Integer.parseInt(delisted_year.trim()));
        }
        String detail_model_slug = o.getString("detail_model_slug");
        car.setDetailModelSlug(detail_model_slug);
        String price_bn = o.getString("price_bn");
        if (StringUtils.isNotBlank(price_bn) && com.alibaba.druid.util.StringUtils.isNumber(price_bn.trim())) {
            car.setPriceBn(Float.parseFloat(price_bn.trim()));
        }
        String brand = o.getString("brand");
        JSONObject o1 = JSONObject.parseObject(brand);
        String name = o1.getString("name");
        car.setBrandName(name);
        String slug = o1.getString("slug");
        car.setBrandSlug(slug);
        String model = o.getString("model");
        JSONObject o2 = JSONObject.parseObject(model);
        String name1 = o2.getString("name");
        car.setModelName(name1);
        String slug1 = o2.getString("slug");
        car.setModelSlug(slug1);
        String mum = o2.getString("mum");
        car.setModelMum(mum);
        car.setStatus("0");
        car.setOptTime(new Date());
    }

    /**
     * 根据vin和车牌前两位查询车辆估值信息 02
     *
     * @param vin
     * @param licensePlatHeader
     * @return
     */
    public ResponseResult queryCarEvaluations(String vin, String licensePlatHeader, Map<String, Object> commonParams) throws
            BusinessException {
        log.info("traceId={} 公平价接口调用[车架号={} 车牌头两位{}]-开始",
                TraceIDThreadLocal.getTraceID(), vin, licensePlatHeader);
        Map<String, Object> params = new HashMap<>();
        params.put("key", key);
        params.put("secret", secret);
        params.put("timeout", timeout);
        String url = (String) prefixCache.readConfigByGroup("rms-third-interface-url", "gpj-evaluation");
        params.put("url", url);
        params.put("targetId", SystemIdEnum.THIRD_GPJ.getCode());
        params.put("appId", "");
        params.put("interfaceId", InterfaceIdEnum.THIRD_GPJ_EVALATION.getCode());
        params.put("systemId", CallSystemIDThreadLocal.getCallSystemID());
        params.put("traceId", TraceIDThreadLocal.getTraceID());

        Map<String, Object> bizParams = new HashMap<>();
        bizParams.put("vin", vin);
        bizParams.put("licensePlatHeader", licensePlatHeader);
        ResponseResult result = getGongpingjiaData(params, bizParams);
        List<Map<String, String>> list = (List<Map<String, String>>) result.getData();
        if (list == null && result.getCode() != ReturnCode.REQUEST_SUCCESS.code()) {
            return result;
        }
        // 计算估值
        result.setData(createCarEvaluations(list));
        return result;
    }

    /**
     * 远程获取估值信息和计算这两残值
     *
     * @param vin
     * @param licensePlatHeader
     * @param commonParams
     * @return
     */
    @Override
    public ResponseResult getGpjDataAndCalculateEvaluations(String vin, String licensePlatHeader, Map<String, Object> commonParams) throws BusinessException {
        log.info("traceId={} 公平价接口调用[车架号={} 车牌头两位{}]-开始",
                TraceIDThreadLocal.getTraceID(), vin, licensePlatHeader);
        Map<String, Object> params = new HashMap<>();
        params.put("key", key);
        params.put("secret", secret);
        params.put("timeout", timeout);
        String url = (String) prefixCache.readConfigByGroup("rms-third-interface-url", "gpj-evaluation");
        params.put("url", url);
        params.put("targetId", SystemIdEnum.THIRD_GPJ.getCode());
        params.put("appId", "");
        params.put("interfaceId", InterfaceIdEnum.THIRD_GPJ_EVALATION.getCode());
        params.put("systemId", CallSystemIDThreadLocal.getCallSystemID());
        params.put("traceId", TraceIDThreadLocal.getTraceID());

        Map<String, Object> bizParams = new HashMap<>();
        bizParams.put("vin", vin);
        bizParams.put("licensePlatHeader", licensePlatHeader);
        ResponseResult result = getGongpingjiaData(params, bizParams);
        List<Map<String,String>> list = (List<Map<String,String>>)result.getData();
        if (list == null && result.getCode() != ReturnCode.REQUEST_SUCCESS.code()) {
            //如果公平价没有返回data数据  则返回49999  并推送
            result.setCode(200);
            result.setData(StringUtil.getStringOfObject(prefixCache.readConfig(Constants.DICTIONARY_PREFIX_DEFAULT_VALUE_CAR_VALUATION)));
            return result;
        }
        // 计算估值
        String evaluation = calculateVluationAndSaveData(result, vin, licensePlatHeader);
        result.setData(evaluation);
        return result;
    }

    @Autowired
    IConfigDao configCacheDao;

    /**
     * 获取mongo缓存
     *
     * @param vin
     * @param plantNo
     * @return
     */
    @Override
    public String getEvaluatePrice(String vin, String plantNo) {
        Integer outTime = configCacheDao.getOutTimeUnit(InterfaceIdEnum.THIRD_GPJ_EVALATION.getCode());
        List<GongPingJiaData> report = mongoTemplate.find(new Query(Criteria.where("vin").is(vin)
                .and("plantNo").is(plantNo).and("createTime").gte(getMinTime(outTime))), GongPingJiaData.class);
        if (CollectionUtils.isEmpty(report)) {
            return null;
        }
        return report.get(0).getValue();
    }

    private Date getMinTime(Integer time) {
        Calendar calendar = Calendar.getInstance();//使用默认时区和语言环境获得一个日历。
        calendar.add(Calendar.DAY_OF_MONTH, -1 * time);//取当前日期的前一天.
        return calendar.getTime();
    }

    /**
     * 根据vin第十位获取生产年份
     *
     * @param vin
     * @return
     */
    Integer getProductiveYearByVin(String vin) {
        if (StringUtils.isBlank(vin) || vin.length() < 10) {
            return null;
        }
        String vinTenStr = vin.substring(9, 10);
        return CarProductiveYearEnum.getCode(vinTenStr);
    }

    /**
     * 调用公平价接口 02
     *
     * @param params
     * @param bizParams
     * @return
     */

    private ResponseResult getGongpingjiaData( Map<String, Object> params,Map<String, Object> bizParams) throws BusinessException{
        ResponseResult response = sendMessegeService.sendByThreeChance(SendMethodEnum.GPJ01.getCode(),params,bizParams);
//        response = null;
        if(response==null){
            log.info("公平价估价接口调用[车架号={} 车牌头两位={}] 响应信息为空" ,
                    bizParams.get("vin"),bizParams.get("licensePlatHeader"));
//            throw new BusinessException(ReturnCode.ERROR_RESPONSE_NULL.code(),"公平价估价接口失败 返回为空",true);
            response = new ResponseResult();

        }
        return response;
    }
}
