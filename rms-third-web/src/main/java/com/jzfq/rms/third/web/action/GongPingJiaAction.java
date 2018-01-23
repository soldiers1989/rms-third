package com.jzfq.rms.third.web.action;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.exception.BusinessException;
import com.jzfq.rms.third.service.IGongPingjiaService;
import com.jzfq.rms.third.support.gpj.impl.CarDetailModelObservable;
import com.jzfq.rms.third.support.log.ILogger;
import com.jzfq.rms.third.support.log.impl.RmsLogger;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017年9月29日 20:04:55
 */
@RestController
@RequestMapping(value = "/carDetailModel")
public class GongPingJiaAction {

    final protected static ILogger log = RmsLogger.getFactory(LoggerFactory.getLogger(GongPingJiaAction.class));
    @Autowired
    private IGongPingjiaService gongPingjiaService;

    @Autowired
    private CarDetailModelObservable syncTask;

    @Value("${syncTask.gongpingjia.token}")
    private String sycnToken ;
    /**
     * 车辆估价信息
     * @param vin
     * @param licensePlatHeader
     * @return
     */
    @RequestMapping(value="detailModelEvaluation.json", method= RequestMethod.GET)
    public ResponseResult getDetailModelEvaluation(String vin, String licensePlatHeader) throws BusinessException{
        log.info("N/A","gpjQuary","公平价估值信息 params：【{}:{}】",vin,licensePlatHeader);
        if(StringUtils.isBlank(vin)||StringUtils.isBlank(licensePlatHeader)){
            ResponseResult dto = new ResponseResult("detailModelEvaluationAction",ReturnCode.ERROR_PARAMS_NOT_NULL);
            log.info("N/A","gpjQuary","公平价估值信息 params：【{}:{}】失败",vin,licensePlatHeader);
            return dto;
        }
        Map<String,Object> commonParams = new HashMap<>();
        ResponseResult result = gongPingjiaService.queryCarEvaluations( vin, licensePlatHeader.toUpperCase(),commonParams);
        log.info("N/A","gpjQuary","公平价估值信息 params：【{}:{}】结束{}", vin, licensePlatHeader, result.getMsg());
        return result;
    }

    /**
     *
     * @param token
     * @return
     */
    @RequestMapping(value="doCarDetailModel.json", method= RequestMethod.GET)
    public ResponseResult doCarDetailModel(String token){
        ResponseResult dto;
        if(!StringUtils.equals(token,sycnToken)){
            log.info("N/A","gpjUpdate","token校验不通过");
            return new ResponseResult("doCarDetailModelTask",ReturnCode.ACTIVE_FAILURE);
        }
        syncTask.sync();
        return new ResponseResult("doCarDetailModelTask",ReturnCode.REQUEST_SUCCESS);
    }
}
