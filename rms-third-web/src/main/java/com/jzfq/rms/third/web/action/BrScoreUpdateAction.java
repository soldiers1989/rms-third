package com.jzfq.rms.third.web.action;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.InterfaceIdEnum;
import com.jzfq.rms.third.common.enums.PhoneDataTypeEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.mongo.JiaoErrorData;
import com.jzfq.rms.third.service.IJaoService;
import com.jzfq.rms.third.service.IRiskPostDataService;
import com.jzfq.rms.third.web.action.model.BrScoreModel;
import com.jzfq.rms.third.web.action.util.ReadExcelUtil;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2018年5月7日 17:04:55
 */
@RestController
@RequestMapping(value = "/brScoreUpdate")
public class BrScoreUpdateAction {

    private static final Logger logger = LoggerFactory.getLogger(BrScoreUpdateAction.class);

    @Autowired
    IJaoService iJaoService;
    @Autowired
    IRiskPostDataService riskPostDataService;

    /**
     * 导出excel数据信息
     *
     * @param
     * @param
     * @return
     */
    @RequestMapping(value = "updateScore.json", method = RequestMethod.POST)
    public ResponseResult updateScore(HttpServletRequest request, HttpServletResponse response) throws Exception{
        logger.info("comein...................");
        ResponseResult responseResult = new ResponseResult();
        String root = BrScoreUpdateAction.class.getClassLoader().getResource("excel/brscore.xlsx").getPath();
        logger.info(root);
        File file = new File(root);
        int result = ReadExcelUtil.getInstance().readExcelXLSX(new FileInputStream(file),riskPostDataService);
        responseResult.setCode(ReturnCode.ACTIVE_SUCCESS.code());
        responseResult.setData(result);
        responseResult.setMsg("共执行excel数据："+result+"条！");
        logger.info("共执行excel数据："+result+"条！");
        return responseResult;
    }


}
