package com.jzfq.rms.third.web.action;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.*;
import com.jzfq.rms.third.common.pojo.tongdun.FraudApiResponse;
import com.jzfq.rms.third.common.utils.StringUtil;
import com.jzfq.rms.third.context.TraceIDThreadLocal;
import com.jzfq.rms.third.exception.BusinessException;
import com.jzfq.rms.third.service.IJaoService;
import com.jzfq.rms.third.service.IRiskPostDataService;
import com.jzfq.rms.third.service.ITdDataService;
import com.jzfq.rms.third.service.impl.BrPostService;
import com.jzfq.rms.third.web.action.masterWork.Master;
import com.jzfq.rms.third.web.action.masterWork.Worker;
import com.jzfq.rms.third.web.action.model.BrScoreModel;
import com.jzfq.rms.third.web.action.model.Run200Model;
import com.jzfq.rms.third.web.action.parser.JaoParser;
import com.jzfq.rms.third.web.action.util.ExportExcelUtil;
import com.jzfq.rms.third.web.action.util.ReadExcelUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2018年5月7日 17:04:55
 */
@RestController
@RequestMapping(value = "/brTdGeoRequestData")
public class RequestBrTdGeoAction {

    private static final Logger logger = LoggerFactory.getLogger(RequestBrTdGeoAction.class);

    @Autowired
    IJaoService iJaoService;
    @Autowired
    IRiskPostDataService riskPostDataService;

    @Autowired
    ITdDataService tdDataService;

    @Autowired
    BrPostService brPostService;

    /**
     * 导出excel数据信息
     *
     * @param
     * @param
     * @return
     */
    @RequestMapping(value = "brTdGeoRequestData.json", method = RequestMethod.POST)
    public ResponseResult brTdGeoRequestData(HttpServletRequest request, HttpServletResponse response) throws Exception {
        MDC.put("traceID", "1234567890");
        TraceIDThreadLocal.setTraceID("1234567890");
        logger.info("comein...................");
        ResponseResult responseResult = new ResponseResult();
        String root = RequestBrTdGeoAction.class.getClassLoader().getResource("excel/0619500.xlsx").getPath();
        File file = new File(root);
        //生成数据 old
        List<Run200Model> result = readExcelXLSX(new FileInputStream(file));

        //生成数据 old
        List<Run200Model> resultNew = readExcelXLSXNew(new FileInputStream(file));

        String rootExport = RequestBrTdGeoAction.class.getClassLoader().getResource("excel/0619.xlsx").getPath();
        //导出数据
        ExportExcelUtil.export0613(result, resultNew, rootExport);
        responseResult.setCode(ReturnCode.ACTIVE_SUCCESS.code());
        responseResult.setData(result);
        responseResult.setMsg("共执行excel数据：" + result + "条！");
        logger.info("共执行excel数据：" + result + "条！");
        MDC.remove("traceID");
        TraceIDThreadLocal.removeTraceID();
        return responseResult;
    }


    public List<Run200Model> readExcelXLSX(FileInputStream in) {
        // TODO Auto-generated method stub
        int input = 0;
        try {
            //通过得到的文件输入流inputstream创建一个HSSFWordbook对象
            XSSFWorkbook hssfworkbook = new XSSFWorkbook(in);
            XSSFSheet hssfsheet = hssfworkbook.getSheetAt(0);//第一个工作表
            XSSFRow hssfrow = hssfsheet.getRow(0);//第一行
            //遍历该表格中所有的工作表，i表示工作表的数量 getNumberOfSheets表示工作表的总数
            hssfsheet = hssfworkbook.getSheetAt(0);
            int rowNumCount = hssfsheet.getPhysicalNumberOfRows();
            //执行递归操作
//            input = updateScore(0, 1000, page, input, hssfrow, hssfsheet,riskPostDataService);
            //取历史数据
            List<Run200Model> list = updateScoreMaster(rowNumCount, hssfrow, hssfsheet, "1");
            return list;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return null;
    }


    public List<Run200Model> readExcelXLSXNew(FileInputStream in) {
        // TODO Auto-generated method stub
        int input = 0;
        try {
            //通过得到的文件输入流inputstream创建一个HSSFWordbook对象
            XSSFWorkbook hssfworkbook = new XSSFWorkbook(in);
            XSSFSheet hssfsheet = hssfworkbook.getSheetAt(1);//第一个工作表
            XSSFRow hssfrow = hssfsheet.getRow(0);//第一行
            //遍历该表格中所有的工作表，i表示工作表的数量 getNumberOfSheets表示工作表的总数
            hssfsheet = hssfworkbook.getSheetAt(0);
            int rowNumCount = hssfsheet.getPhysicalNumberOfRows();
            //执行递归操作
//            input = updateScore(0, 1000, page, input, hssfrow, hssfsheet,riskPostDataService);
            //重新拉取
            List<Run200Model> list = updateScoreMaster(rowNumCount, hssfrow, hssfsheet, "0");
            return list;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return null;
    }


    /**
     * @ClassName: updateScoreMaster
     * @Description: TODO()
     * @author xuliang
     * @date 2018-06-13
     */

    public List<Run200Model> updateScoreMaster(int rowNumCount, XSSFRow hssfrow, XSSFSheet hssfsheet, String flag) {
        List<Run200Model> list = new ArrayList<Run200Model>();
        for (int j = 1; j < rowNumCount; j++) {
            Run200Model info = new Run200Model();
            try {
                hssfrow = hssfsheet.getRow(j);

                /**将EXCEL中的第 j 行，第五列的值插入到实例中*/
                //电话
                info.setPhone(getCellXLSXValue(hssfrow.getCell((short) 0), null));

                /**将EXCEL中的第 j 行，第二列的值插入到实例中*/
                //姓名
                info.setName(getCellXLSXValue(hssfrow.getCell((short) 1), null));

                /**将EXCEL中的第 j 行，第三列的值插入到实例中*/
                //身份证
                info.setIdCard(getCellXLSXValue(hssfrow.getCell((short) 2), null));

                //同盾分
                info.setTdScore(getTdScore(getCommonParamsTd(info), flag));
                /**将EXCEL中的第 j 行，第四列的值插入到实例中*/
                //百融分
                info.setBrScore(getBrScore(getCommonParamsBr(info), flag));
                //三要素
                info.setThree(getThree(getJaoCommonParams(info), flag));
                //在网时长
                info.setLength(getLength(getJaoCommonParams(info), flag));
                //在网状态
                info.setStatus(getStatus(getJaoCommonParams(info), flag));
                logger.info("当前行：" + j + "当前数据：【" + info.toString() + "】");
                list.add(info);
                //添加任务
                //更新成功加1
//                input++;
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
                break;
            }
        }
        return list;
    }

    //封装请求三方参数
    public Map<String, Object> getCommonParamsTd(Run200Model info) {
        RiskPersonalInfo per = new RiskPersonalInfo();
        per.setName(info.getName());
        per.setMobile(info.getPhone());
        per.setCertCardNo(info.getIdCard());

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("personalInfo", per);
        map.put("eventId", "Loan_ios_20170509");//同盾事件id
        map.put("channelId", "1");//渠道  桔子分期
        map.put("clientType", "1");//设备类型  ios
//        map.put()
        return map;
    }

    //封装请求三方参数
    public Map<String, Object> getCommonParamsBr(Run200Model info) {
        RiskPersonalInfo per = new RiskPersonalInfo();
        per.setName(info.getName());
        per.setMobile(info.getPhone());
        per.setCertCardNo(info.getIdCard());

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("personalInfo", per);
        map.put("channelId", "1");//渠道  桔子分期
        map.put("clientType", "1");//设备类型  ios
        map.put("strategyId", "STR0000187");//百融策略id
        return map;
    }

    //封装请求集奥三方参数
    public Map<String, Object> getJaoCommonParams(Run200Model info) {
        Map<String, Object> bizData = new HashMap<>();
        bizData.put("realName", info.getName());
        bizData.put("idNumber", info.getIdCard());
        bizData.put("cid", info.getPhone());
//        bizData.put("custumType", custumType);
        return bizData;
    }

    //同盾分
    public String getTdScore(Map<String, Object> commonParams, String flag) {
        if ("1".equals(flag)) {
            return "";
        }
        ResponseResult response = new ResponseResult();
        try {
            response = tdDataService.queryTdDatasByParams(commonParams);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (response == null) {
            logger.info("traceId={} 同盾拉取无效：false ", commonParams);     //失败
            throw null;
        }
        if (response.getCode() != ReturnCode.REQUEST_SUCCESS.code()) {
            logger.info("traceId={} 同盾拉取失败：false ,同盾返回结果={}", commonParams, response);     //失败
            return null;
        }
        FraudApiResponse apiResp = (FraudApiResponse) response.getData();
        //push推送
        if (null != apiResp.getFinal_score()) {
            logger.info("traceId={} 拉取三方同盾分成功,返回结果={}", null, apiResp.getFinal_score()); //成功
            return apiResp.getFinal_score().toString();
        }
        return null;
    }


    //百融分
    public String getBrScore(Map<String, Object> commonParams, String flag) {
        // 3.远程拉取
        ResponseResult result = null;
        RiskPersonalInfo info = (RiskPersonalInfo) commonParams.get("personalInfo");
        JSONObject jsonObject = riskPostDataService.getBairongData(info.getName(), info.getCertCardNo(), info.getMobile(), (String) commonParams.get("strategyId"));
        if ("1".equals(flag)) {
            //取历史数据
            if (null != jsonObject) {
                logger.info("traceId={} 获取百融分成功(mongodb),返回结果={}", null, riskPostDataService.getScoreByJson(jsonObject)); //成功
                return riskPostDataService.getScoreByJson(jsonObject);
            }
        }
        //flag 为0时
        if (null != jsonObject) {
//            logger.info("traceId={} 获取百融分成功(mongodb),返回结果={}", null, riskPostDataService.getScoreByJson(jsonObject)); //成功
            return "";
        }
        try {
            result = brPostService.getApiDataByParams(info, commonParams);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (result == null || result.getCode() != ReturnCode.REQUEST_SUCCESS.code()) {
            logger.info("traceId={} 拉取百融分失败,返回结果={}", commonParams, result); //失败
            return null;
        }
        String brResponse = (String) result.getData();
        JSONObject resultJson = new JSONObject();
        JSONObject tempResult = JSONObject.parseObject(brResponse);
//        resultJson.put("weight", tempResult.getString("Rule_final_weight"));
        if (StringUtils.isNotBlank(riskPostDataService.getScoreByJson(tempResult))) {
            logger.info("traceId={} 拉取三方百融成功,返回结果={}", null, riskPostDataService.getScoreByJson(tempResult)); //成功
            return riskPostDataService.getScoreByJson(tempResult);
        }
        return null;
    }


    //三要素
    public String getThree(Map<String, Object> bizData, String flag) {
        try {
            String valueDb = iJaoService.getValueByDB(InterfaceIdEnum.THIRD_RSLL03.getCode(), PhoneDataTypeEnum.THREE_ITEM, bizData);
            if ("1".equals(flag)) {
                //qu历史数据
                if (StringUtils.isNotBlank(valueDb)) {
                    logger.info("traceId={} 获取手机三要素成功(mongodb==jao),返回结果={}", null, valueDb); //成功
                    return valueDb;
                }
            }
            //flag 为0
            if (StringUtils.isNotBlank(valueDb)) {
                logger.info("traceId={} 获取手机三要素成功(mongodb==jao),返回结果={}", null, valueDb); //成功
                return "";
            }
            //手机三要素远程拉取
            ResponseResult responseResult = iJaoService.getMobilecheck3item(bizData);
            if (responseResult.getCode() != ReturnCode.REQUEST_SUCCESS.code()) {
                logger.info("traceId={} 拉取三方手机三要素失败,返回结果={}", bizData, responseResult); //失败
                return null;
            }
            //恢复上线
            JSONObject resultJson = (JSONObject) responseResult.getData();
            // 转换rms-pull需要的值
            String value = JaoParser.getValueOfRmsPull(resultJson);
            //校验验证码
            if (!JaoCodeEnum.checkJaoCode(value) || !JaoEclCodeEnum.checkJaoCode(value)) {
                logger.info("traceId={} 拉取三方手机三要素返回错误码={},返回结果={}", bizData, value, responseResult); //失败
                return null;
            }
            return PhoneThreeItemEnum.getName(value);
        } catch (Exception e) {
            logger.error("traceId={} 手机三要素异常", bizData, e);
            return null;
        }
    }


    //在网时长
    public String getLength(Map<String, Object> bizData, String flag) {
        try {
            String valueDb = iJaoService.getValueByDB(InterfaceIdEnum.THIRD_RSLL01.getCode(), PhoneDataTypeEnum.NETWORK_LENGTH, bizData);
            if ("1".equals(flag)) {
                if (StringUtils.isNotBlank(valueDb)) {
                    logger.info("traceId={}，获取手机在网时长成功(mongodb==jao),返回结果={}", null, valueDb); //成功
                    return valueDb;
                }
            }
            //flag 为0
            if (StringUtils.isNotBlank(valueDb)) {
                logger.info("traceId={}，获取手机在网时长成功(mongodb==jao),返回结果={}", null, valueDb); //成功
                return "";
            }
            //在网时长
            ResponseResult responseResult = iJaoService.getPhoneNetworkLength(bizData);
            if (responseResult.getCode() != ReturnCode.REQUEST_SUCCESS.code()) {
                logger.info("traceId={} 拉取三方手机在网时长失败,返回结果={}", bizData, responseResult); //失败
                return null;
            }
            //恢复上线
            JSONObject resultJson = (JSONObject) responseResult.getData();
            // 转换rms-pull需要的值
            String value = JaoParser.getNetworkLengthOfRmsPull(resultJson);
            //校验验证码
            if (!JaoCodeEnum.checkJaoCode(value) || !JaoEclCodeEnum.checkJaoCode(value)) {
                logger.info("traceId={} 拉取三方手机在网时长返回错误码={},返回结果={}", bizData, value, responseResult); //失败
                return null;
            }
            return PhoneNetworkLengthEnum.getName(value);
        } catch (Exception e) {
            logger.error("traceId={} 手机在网时长异常", bizData, e);
            return null;
        }
    }


    //在网状态
    public String getStatus(Map<String, Object> bizData, String flag) {
        try {
            String valueDb = iJaoService.getValueByDB(InterfaceIdEnum.JAO21.getCode(), PhoneDataTypeEnum.NETWORK_STATUS, bizData);
            if ("1".equals(flag)) {
                if (StringUtils.isNotBlank(valueDb)) {
                    logger.info("traceId={}，获取手机在网状态成功(mongodb==jao),返回结果={}", null, valueDb); //成功
                    return valueDb;
                }
            }
            //flag 为0
            if (StringUtils.isNotBlank(valueDb)) {
                logger.info("traceId={}，获取手机在网状态成功(mongodb==jao),返回结果={}", null, valueDb); //成功
                return "";
            }
            //手机三要素远程拉取
            ResponseResult responseResult = iJaoService.getPhonestatus(bizData);
            if (responseResult.getCode() != ReturnCode.REQUEST_SUCCESS.code()) {
                logger.info("traceId={} 拉取三方手机在网状态失败,返回结果={}", bizData, responseResult); //失败
                return null;
            }
            //恢复上线
            JSONObject resultJson = (JSONObject) responseResult.getData();
            // 转换rms-pull需要的值
            String value = JaoParser.getStatusOfRmsPull(resultJson);
            //校验验证码
            if (!JaoCodeEnum.checkJaoCode(value) || !JaoEclCodeEnum.checkJaoCode(value)) {
                logger.info("traceId={} 拉取三方手机在网状态返回错误码={},返回结果={}", bizData, value, responseResult); //失败
                return null;
            }
            return PhoneStatusEnum.getName(value);
        } catch (Exception e) {
            logger.error("traceId={} 手机在网状态异常", bizData, e);
            return null;
        }
    }


    /**
     * @ClassName: ReadExcelUtil
     * @Description: TODO(判断excel单元格2007XLSX)
     * @author xuliang
     * @date 2016-11-8
     */

    private String getCellXLSXValue(XSSFCell cell, String timefalg) {
        String cellValue = "";
        DecimalFormat df = new DecimalFormat("#");
        boolean falg = true;
        if (null != cell) {
            switch (cell.getCellType()) {
                case HSSFCell.CELL_TYPE_STRING:
                    cellValue = cell.getRichStringCellValue().getString().trim();
                    falg = false;
                    break;
                case HSSFCell.CELL_TYPE_NUMERIC:
                    if (HSSFDateUtil.isCellDateFormatted(cell)) {
                        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                        java.util.Date dt = HSSFDateUtil.getJavaDate(cell.getNumericCellValue());
                        cellValue = dateformat.format(dt);
                    } else {
                        cellValue = df.format(cell.getNumericCellValue()).toString();
                        falg = false;
                    }
                    break;
                case HSSFCell.CELL_TYPE_BOOLEAN:
                    cellValue = String.valueOf(cell.getBooleanCellValue()).trim();
                    falg = false;
                    break;
                case HSSFCell.CELL_TYPE_FORMULA:
                    cellValue = cell.getCellFormula();
                    falg = false;
                    break;
                default:
                    cellValue = "";
            }
        }
        return cellValue;
    }


}
