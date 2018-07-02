package com.jzfq.rms.third.web.action;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.PhoneDataTypeEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.mongo.JiaoData;
import com.jzfq.rms.third.common.mongo.JiaoErrorData;
import com.jzfq.rms.third.service.IJaoService;
import com.jzfq.rms.third.web.action.util.ExportExcelUtil;
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
@RequestMapping(value = "/exportStatus")
public class ExportJaoStatusAction {



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
    public ResponseResult exportJaoData(HttpServletRequest request, HttpServletResponse response) throws Exception{
        List<JiaoData> dataStatusEnums = iJaoService.getJaoData(InterfaceIdEnum.THIRD_RSLL02.getCode(), PhoneDataTypeEnum.NETWORK_STATUS);
        String root = ReadGongpingjiaAction.class.getClassLoader().getResource("excel/0702JaoStatus.xlsx").getPath();
        ExportExcelUtil.exportBy(dataStatusEnums, root);
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCode(ReturnCode.ACTIVE_SUCCESS.code());
        responseResult.setData(null);
        return responseResult;
    }

}
