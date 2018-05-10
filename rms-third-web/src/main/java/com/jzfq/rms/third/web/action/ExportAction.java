package com.jzfq.rms.third.web.action;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.PhoneDataTypeEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.mongo.JiaoErrorData;
import com.jzfq.rms.third.service.IJaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2018年5月7日 17:04:55
 */
@RestController
@RequestMapping(value = "/export")
public class ExportAction {

    @Autowired
    IJaoService iJaoService;

    /**
     * 导出excel数据信息
     *
     * @param
     * @param
     * @return
     */
    @RequestMapping(value = "exportJaoData.json", method = RequestMethod.POST)
    public ResponseResult exportJaoData(HttpServletRequest request, HttpServletResponse response) {
        //获得三要素错误信息
        List<JiaoErrorData> dataThreeList = iJaoService.getData(InterfaceIdEnum.THIRD_RSLL03.getCode(),PhoneDataTypeEnum.THREE_ITEM);
        //获得手机在网时长信息
        List<JiaoErrorData> dataLengthList = iJaoService.getData(InterfaceIdEnum.THIRD_RSLL01.getCode(),PhoneDataTypeEnum.NETWORK_LENGTH);
        //获得在网状态信息
        List<JiaoErrorData> dataStatusList = iJaoService.getData(InterfaceIdEnum.THIRD_RSLL02.getCode(),PhoneDataTypeEnum.NETWORK_STATUS);

        JSONObject jsonObj = new JSONObject();
        jsonObj.put("dataThreeList", dataThreeList);
        jsonObj.put("dataLengthList", dataLengthList);
        jsonObj.put("dataStatusList", dataStatusList);
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCode(ReturnCode.ACTIVE_SUCCESS.code());
        responseResult.setData(jsonObj);
        return responseResult;
    }


}
