package com.jzfq.rms.third.web.action;


import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.domain.RiskPersonalInfo;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.pojo.tongdun.FraudApiResponse;
import com.jzfq.rms.third.service.IRiskPostDataService;
import com.jzfq.rms.third.service.ITdDataService;
import com.jzfq.rms.third.service.impl.BrPostService;
import com.jzfq.rms.third.web.action.model.Run200Model;
import com.jzfq.rms.third.web.action.util.ExportExcelUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017年9月29日 20:04:55
 */
@RestController
@RequestMapping(value = "/queryBr")
public class QueryBrRuleScore {


    private static final Logger logger = LoggerFactory.getLogger(QueryBrRuleScore.class);

    @Autowired
    IRiskPostDataService riskPostDataService;


    @RequestMapping("/query")
    public void query(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String root = QueryBrRuleScore.class.getClassLoader().getResource("excel/queryBr.xlsx").getPath();
        File file = new File(root);
        //生成数据 old
        List<Run200Model> result = readExcelXLSX(new FileInputStream(file));

        //生成数据 old
//        List<Run200Model> resultNew = readExcelXLSXNew(new FileInputStream(file));

        String rootExport = RequestBrTdGeoAction.class.getClassLoader().getResource("excel/0629.xlsx").getPath();
        //导出数据
        ExportExcelUtil.export0629(result, rootExport);

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
                info.setPhone(getCellXLSXValue(hssfrow.getCell((short) 1), null));

                /**将EXCEL中的第 j 行，第二列的值插入到实例中*/
                //姓名
                info.setName(getCellXLSXValue(hssfrow.getCell((short) 0), null));

                /**将EXCEL中的第 j 行，第三列的值插入到实例中*/
                //身份证
                info.setIdCard(getCellXLSXValue(hssfrow.getCell((short) 2), null));


                /**将EXCEL中的第 j 行，第四列的值插入到实例中*/
                //百融分
                info.setBrScore(getBrScore(getCommonParamsBr(info)));

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
//        map.put("strategyId", "STR0000799");
        return map;
    }



    //百融分权重
    public String getBrScore(Map<String, Object> commonParams) {
        // 3.远程拉取
        ResponseResult result = null;
        RiskPersonalInfo info = (RiskPersonalInfo) commonParams.get("personalInfo");
        JSONObject jsonObject = riskPostDataService.getHBBairongData(info.getName(), info.getCertCardNo(), info.getMobile());
        //取历史数据
        if (null != jsonObject) {
            return jsonObject.getString("Rule_final_weight");
        }
        return "";
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
