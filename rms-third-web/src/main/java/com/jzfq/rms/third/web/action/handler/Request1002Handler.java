package com.jzfq.rms.third.web.action.handler;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.mongo.PengYuan;
import com.jzfq.rms.third.common.domain.TPyCarCheck;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.CarCheckEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.service.IPengYuanService;
import com.jzfq.rms.third.support.cache.ICountCache;
import com.jzfq.rms.third.web.action.auth.AbstractRequest;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * PengYuan
 *
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/15 15:35.
 **/
@Component("request1002Handler")
public class Request1002Handler extends AbstractRequestHandler {
    private static final Logger log = LoggerFactory.getLogger(Request1002Handler.class);


    @Autowired
    private IPengYuanService pengYuanService;

    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        String frontId = (String) params.get("frontId");
        String orderNo = (String) params.get("orderNo");
        if (StringUtils.isBlank(frontId) || StringUtils.isBlank(orderNo) || params.get("carInfo") == null) {
            return false;
        }
        Map<String, Object> carInfo = JSONObject.parseObject(params.get("carInfo").toString(), HashMap.class);
        if (carInfo == null) {
            return false;
        }
        return true;
    }

    @Override
    protected ResponseResult bizHandle(AbstractRequest request) throws Exception {
        if (StringUtils.equals(request.getApiVersion(), "02")) {
            return handler02(request);
        }
        return handler01(request);
    }

    @Autowired
    ICountCache interfaceCountCache;


    Long time = 24 * 60 * 60 * 180L;

    /**
     * 版本01 处理器
     *
     * @param request
     * @return
     */
    private ResponseResult handler01(AbstractRequest request) throws Exception {
        String traceId = TraceIDThreadLocal.getTraceID();
        String orderNo = request.getParam("orderNo").toString();
        // 根据查询数据库
        Map<String, Object> carInfo = JSONObject.parseObject(request.getParam("carInfo").toString(), HashMap.class);
        log.info("traceId=" + traceId + " 鹏元车辆信息 params：【" + carInfo + "】");
        List<TPyCarCheck> carChecksInfo = pengYuanService.getPengYuanData(StringUtil.getStringOfObject(carInfo.get("name")), StringUtil.getStringOfObject(carInfo.get("certCardNo")), StringUtil.getStringOfObject(carInfo.get("plateNo")), StringUtil.getStringOfObject(carInfo.get("type")));
        if (!CollectionUtils.isEmpty(carChecksInfo)) {
            TPyCarCheck carCheck = carChecksInfo.get(0);
            // 存mongodb
            String result = carCheck.getcResult();
            pengYuanService.saveRmsDatas(orderNo, result, carInfo);
            return new ResponseResult(traceId, ReturnCode.REQUEST_SUCCESS, carCheck.getcValue());
        }
        Map<String, Object> commonParams = getCommonParams(request);
        String isRepeatKey = getKeyByFourItem(carInfo);
        boolean isRpc = interfaceCountCache.isRequestOutInterface(isRepeatKey, time);
        if (!isRpc) {
            return new ResponseResult(traceId, ReturnCode.ACTIVE_THIRD_RPC, null);
        }
        String reqId = getReqId();
        commonParams.put("reqId", reqId);
        ResponseResult result = null;
        try {
            result = pengYuanService.queryPyCarDatas(carInfo, commonParams);
            log.info("traceId=" + traceId + " 鹏元车辆信息 结束{} ", result.getMsg());
        } catch (Exception e) {
            interfaceCountCache.setFailure(isRepeatKey);
            throw e;
        }
        if (result.getCode() == ReturnCode.REQUEST_SUCCESS.code()) {
            JSONObject data = (JSONObject) result.getData();
            if (data != null) {
                pengYuanService.saveRmsDatas(orderNo, data.toJSONString(), carInfo);
                String value = getThirdResult(data);
                pengYuanService.saveCarCheckInfo(reqId, data.toJSONString(), value, carInfo, ReturnCode.REQUEST_SUCCESS.code());
                result.setData(value);
            }
        } else {
            interfaceCountCache.setFailure(isRepeatKey);
        }
        return result;
    }

    private String getKeyByFourItem(Map<String, Object> carInfo) {
        StringBuilder sb = new StringBuilder("rms_third_1002_");
        sb.append(StringUtil.getStringOfObject(carInfo.get("name")));
        sb.append("_");
        sb.append(StringUtil.getStringOfObject(carInfo.get("certCardNo")));
        sb.append("_");
        sb.append(StringUtil.getStringOfObject(carInfo.get("plateNo")));
        sb.append("_");
        sb.append(StringUtil.getStringOfObject(carInfo.get("type")));
        return sb.toString();
    }

    private String getReqId() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return formatter.format(new Date()) + (new Random()).nextInt(1000);
    }


    private String getThirdResult(JSONObject json) {


        log.info("解析后的json："+json);

        if (json == null) {
            return CarCheckEnum.OTHER.getCode();
        }
        JSONObject carInfo = json.getJSONObject("checkInfo");
        if (carInfo == null) {
            return CarCheckEnum.OTHER.getCode();
        }
        Set<String> set = carInfo.keySet();
        int other = 0;
        int unCheckCount = 0;
        int unAgreeCount = 0;
        for (String key : set) {
            if (StringUtils.equals("不一致", carInfo.getString(key))) {
                unAgreeCount++;
                continue;
            }
            if (StringUtils.equals("无法核查", carInfo.getString(key))) {
                unCheckCount++;
                continue;
            }
            if (!StringUtils.equals("一致", carInfo.getString(key))) {
                other++;
            }
        }
        if (unAgreeCount > 0) {
            return CarCheckEnum.UNAGREE.getCode();
        }
        if (other > 0) {
            return CarCheckEnum.OTHER.getCode();
        }
        if (unCheckCount > 0) {
            return CarCheckEnum.UNCHECK.getCode();
        }
        return CarCheckEnum.AGREE.getCode();
    }

    /**
     * 版本02 处理器
     *
     * @param request
     * @return
     */
    private ResponseResult handler02(AbstractRequest request) throws Exception {
//        String traceId = TraceIDThreadLocal.getTraceID();
//        Map<String,Object> carInfo = JSONObject.parseObject(request.getParam("carInfo").toString(), HashMap.class);
//        log.info("traceId="+traceId+" 鹏元车辆信息 params：【"+carInfo+"】");
//        Map<String,Object> commonParams = getCommonParams(  request);
//        ResponseResult result = pengYuanService.queryPyCarDatas(carInfo,commonParams);
//        log.info("traceId="+traceId+" 鹏元车辆信息 结束{} ",result.getMsg());
//        if(result.getCode()!=ReturnCode.REQUEST_SUCCESS.code()&&isRpc()){
//            //TODO 缓存过期
//
//        }
//        interfaceCountCache.setFailure(getKey(request));
        return null;
    }

    private Map<String, Object> getCommonParams(AbstractRequest request) {
        Map<String, Object> commonParams = new HashMap<>();
        commonParams.put("frontId", StringUtil.getStringOfObject(request.getParam("frontId")));
        return commonParams;
    }

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 保存rms格式数据
     *
     * @param pengYuan
     */
    private void saveData(PengYuan pengYuan) {
        log.info("鹏元数据开始入库......");
        try {
            mongoTemplate.insert(pengYuan);
        } catch (Exception e) {
            log.error("入库失败......", e);
        }
        log.info("鹏元数据入库结束......");
    }

}
