package com.jzfq.rms.third.web.action;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.vo.EvaluationInfoVo;
import com.jzfq.rms.third.service.IGongPingjiaService;
import com.jzfq.rms.third.support.gpj.impl.CarDetailModelObservable;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017年9月29日 20:04:55
 */
@RestController
@RequestMapping(value = "/carDetailModel")
public class GongPingJiaAction {

    private static final Logger log = LoggerFactory.getLogger("GongPingjiaService");
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
    public ResponseResult getDetailModelEvaluation(String vin, String licensePlatHeader){
        log.info("公平价估值信息 params：【" + vin + ":"+licensePlatHeader+"】");
        if(StringUtils.isBlank(vin)||StringUtils.isBlank(licensePlatHeader)){
            ResponseResult dto = new ResponseResult("detailModelEvaluationAction",ReturnCode.ERROR_PARAMS_NOT_NULL);
            log.info("公平价估值信息 params：【" + vin + ":"+licensePlatHeader+"】失败");
            return dto;
        }
        List<EvaluationInfoVo> list = gongPingjiaService.queryGaopingjiaEvalation(vin, licensePlatHeader);
        ResponseResult dto = new ResponseResult("detailModelEvaluationAction",ReturnCode.REQUEST_SUCCESS, list);
        log.info("公平价估值信息 params：【" + vin + ":"+licensePlatHeader+"】成功");
        return dto;
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
            log.info("token校验不通过");
            return new ResponseResult("doCarDetailModelTask",ReturnCode.ACTIVE_FAILURE);
        }
        syncTask.sync();
        return new ResponseResult("doCarDetailModelTask",ReturnCode.REQUEST_SUCCESS);
    }
}
