package com.jzfq.rms.third.web.action;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.PhoneDataTypeEnum;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.mongo.*;
import com.jzfq.rms.third.common.pojo.tongdun.FraudApiResponse;
import com.jzfq.rms.third.constant.Constants;
import com.jzfq.rms.third.service.*;
import com.jzfq.rms.third.web.action.util.PageModel;
import com.jzfq.rms.third.web.action.util.cleanParse.GpingjiaParser;
import com.jzfq.rms.third.web.action.util.cleanParse.JaoParser;
import net.sf.json.JSON;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2018/6/27 13:49.
 **/
@RestController
@RequestMapping(value = "/cleanData")
public class CleanDataAction {

    @Autowired
    private IJaoService iJaoService;//集奥接口服务
    @Autowired
    private IGongPingjiaService iGongPingjiaService;//公平价接口服务
    @Autowired
    private IPengYuanService iPengYuanService;//鹏元接口服务
    @Autowired
    private ITdDataService iTdDataService;//同盾接口服务
    @Autowired
    private IRiskPostDataService iRiskPostDataService;//百融接口服务


    /**
     * 清洗数据信息方法
     *
     * @param
     * @param
     * @return
     */
    @RequestMapping(value = "clean.json", method = RequestMethod.POST)
    public ResponseResult cleanData(HttpServletRequest request, HttpServletResponse response) throws Exception {

        //+++++++++++++++++++++++++++++++++++++++++++++++++一，集奥清洗+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        //获得三要素错误信息
        List<JiaoData> dataThreeList = iJaoService.getAllData(PhoneDataTypeEnum.THREE_ITEM);
        //获得手机在网时长信息
        List<JiaoData> dataLengthList = iJaoService.getAllData(PhoneDataTypeEnum.NETWORK_LENGTH);
        //获得在网状态信息
        List<JiaoData> dataStatusList = iJaoService.getAllData(PhoneDataTypeEnum.NETWORK_STATUS);


//        //集奥三要素
//        if (null != dataThreeList && dataThreeList.size() > 0) {
//            for (JiaoData dataThree : dataThreeList) {
//                iJaoService.saveNewDatas(JaoParser.getValueOfRmsPull(dataThree.getData(), dataThree.getIdCard(), dataThree.getPhone(), dataThree.getName(), "1111", "123", dataThree.getCreateTime()));
//            }
//        }
//
//        //集奥在网时长
        if (null != dataLengthList && dataLengthList.size() > 0) {
            for (JiaoData dataLength : dataLengthList) {
                iJaoService.saveNewDatas(JaoParser.getNetworkLengthOfRmsPull(dataLength.getData(), dataLength.getIdCard(), dataLength.getPhone(), dataLength.getName(), "1111", "123", dataLength.getCreateTime()));
            }
        }
//
//        //集奥在网状态
        if (null != dataStatusList && dataStatusList.size() > 0) {
            for (JiaoData dataStatus : dataStatusList) {
                iJaoService.saveNewDatas(JaoParser.getStatusOfRmsPull(dataStatus.getData(), dataStatus.getIdCard(), dataStatus.getPhone(), dataStatus.getName(), "1111", "123", dataStatus.getCreateTime()));
            }
        }


        //+++++++++++++++++++++++++++++++++++++++++++++++++二，公平价清洗+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        List<GongPingJiaData> gpjList = iGongPingjiaService.queryGaopingjiaDatas();
        if (null != gpjList && gpjList.size() > 0) {
            for (GongPingJiaData gpjData : gpjList) {
                ResponseResult result = new ResponseResult("111", ReturnCode.REQUEST_SUCCESS, gpjData.getData());
                iGongPingjiaService.saveNewGongPingJiaData(GpingjiaParser.getHistGongPingJiaData(result, "111", gpjData.getVin(), "111", gpjData.getPlantNo(), gpjData.getValue(), "123", gpjData.getCreateTime()));
            }
        }

        //+++++++++++++++++++++++++++++++++++++++++++++++++三，鹏元清洗+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//        List<PengYuan> pyList = iPengYuanService.getAllDatas();
//        if (null != pyList && pyList.size() > 0) {
//            for (PengYuan pyData : pyList) {
//                iPengYuanService.saveNewDatas(PengYuanParser.getHistrData(pyData.getData(),pyData.getIdCard(),"111","123"));
//            }
//        }


        //+++++++++++++++++++++++++++++++++++++++++++++++++四，同盾清洗+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        //获取总数量
        int count = iTdDataService.getCount();
        System.out.println("总数量:" + count);
        //计算总页数
        int page = count % 1000 == 0 ? count / 1000 : count / 1000 + 1;
        for (int i = 0; i < page; i++) {
            System.out.println("当前页：" + i);
            PageModel<TongDunStringData> pages = new PageModel<TongDunStringData>();
            pages.setPageNo(i);
            PageModel<TongDunStringData> tdList = iTdDataService.getAllData(pages);
            if (null != tdList) {
                if (null != tdList.getDatas() && tdList.getDatas().size() > 0) {
                    for (TongDunStringData tdData : tdList.getDatas()) {
                        if (StringUtils.isNotBlank(tdData.getApiResp())) {
                            FraudApiResponse apiResp = (FraudApiResponse) com.alibaba.fastjson.JSON.parseObject(tdData.getApiResp(), FraudApiResponse.class);
                            iTdDataService.saveNewResult(apiResp, tdData.getOrderNo(), "1111", "111", "1111", "111", tdData.getCreateTime());
                        }
                    }
                }
            }
        }


        //+++++++++++++++++++++++++++++++++++++++++++++++++五，百融清洗+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        //获取总数量
        int countBr = iRiskPostDataService.getCount();
        System.out.println("总数量:" + countBr);
        //计算总页数
        int pageBr = countBr % 1000 == 0 ? countBr / 1000 : countBr / 1000 + 1;
        for (int i = 0; i < pageBr; i++) {
            System.out.println("当前页：" + i);
            PageModel<BairongData> pages = new PageModel<BairongData>();
            pages.setPageNo(i);
            PageModel<BairongData> tdList = iRiskPostDataService.getAllData(pages);
            if (null != tdList) {
                if (null != tdList.getDatas() && tdList.getDatas().size() > 0) {
                    for (BairongData brData : tdList.getDatas()) {
                        if (StringUtils.isNotBlank(brData.getData())) {
                            iRiskPostDataService.saveNewData(JSONObject.parseObject(brData.getData()), "1111", "1111", brData.getName(), brData.getCertCardNo(), brData.getMobile(), brData.getCreateTime());
                        }
                    }
                }
            }
        }
        return null;
    }
}
