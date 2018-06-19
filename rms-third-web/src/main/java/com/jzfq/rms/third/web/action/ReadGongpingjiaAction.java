package com.jzfq.rms.third.web.action;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.mongo.GongPingJiaData;
import com.jzfq.rms.third.service.IGongPingjiaService;
import com.jzfq.rms.third.service.IJaoService;
import com.jzfq.rms.third.service.IRiskPostDataService;
import com.jzfq.rms.third.web.action.util.ExportExcelUtil;
import com.jzfq.rms.third.web.action.util.ReadExcelUtil;
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
@RequestMapping(value = "/readGpj")
public class ReadGongpingjiaAction {

    private static final Logger logger = LoggerFactory.getLogger(ReadGongpingjiaAction.class);

    @Autowired
    private IGongPingjiaService gongPingjiaService;

    /**
     * 导出excel数据信息
     *
     * @param
     * @param
     * @return
     */
    @RequestMapping(value = "export.json", method = RequestMethod.POST)
    public ResponseResult updateScore(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ResponseResult responseResult = new ResponseResult();
        List<GongPingJiaData> datas = gongPingjiaService.queryGaopingjiaDatas();
        String root = ReadGongpingjiaAction.class.getClassLoader().getResource("excel/gpjdata.xlsx").getPath();

        ExportExcelUtil.export(datas, root);
        responseResult.setCode(200);
        return responseResult;
    }



}
