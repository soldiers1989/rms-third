package com.jzfq.rms.third.web.action.util;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonObject;
import com.jzfq.rms.mongo.BrPostData;
import com.jzfq.rms.third.common.mongo.BairongData;
import com.jzfq.rms.third.common.utils.DateUtils;
import com.jzfq.rms.third.service.IRiskPostDataService;
import com.jzfq.rms.third.web.action.masterWork.Master;
import com.jzfq.rms.third.web.action.masterWork.Worker;
import com.jzfq.rms.third.web.action.model.BrScoreModel;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class ReadExcelUtil {


    private static Logger logger = LoggerFactory.getLogger(ReadExcelUtil.class);


    private static ReadExcelUtil singleton;

    /*
     * 静态内部类   保证初始化instance时只有一个线程 没有性能损耗
     *
     * */
    private static class LazyHolder {
        private static final ReadExcelUtil INSTANCE = new ReadExcelUtil();
    }

    private ReadExcelUtil() {
    }

    public static final ReadExcelUtil getInstance() {
        return LazyHolder.INSTANCE;
    }


    /**
     * @ClassName: ReadExcelUtil
     * @Description: TODO(读取excel2003内容)
     * @author xuliang
     * @date 2016-11-8
     */

    public List<BrScoreModel> readExcelXLS(InputStream in) {
        // TODO Auto-generated method stub
//        List<ProviderInfoMationErrorMessage> infolist = new ArrayList<ProviderInfoMationErrorMessage>();
        try {
            //通过得到的文件输入流inputstream创建一个HSSFWordbook对象
            HSSFWorkbook hssfworkbook = new HSSFWorkbook(in);
            HSSFSheet hssfsheet = hssfworkbook.getSheetAt(0);//第一个工作表
            HSSFRow hssfrow = hssfsheet.getRow(0);//第一行
            int input = 0;
            int rowNumCount = 0;
            //遍历该表格中所有的工作表，i表示工作表的数量 getNumberOfSheets表示工作表的总数
            for (int i = 0; i < hssfworkbook.getNumberOfSheets(); i++) {
                hssfsheet = hssfworkbook.getSheetAt(i);
                //遍历该行所有的行,j表示行数 getPhysicalNumberOfRows行的总数
                for (int j = 1; j < hssfsheet.getPhysicalNumberOfRows(); j++) {
                    rowNumCount = hssfsheet.getPhysicalNumberOfRows();
//                        ProviderInfoMationErrorMessage info = new ProviderInfoMationErrorMessage();
//                        vendor = new HiadsPurcVendor();
                    BrScoreModel model = new BrScoreModel();
                    try {
                        hssfrow = hssfsheet.getRow(j);

                        /**将EXCEL中的第 j 行，第一列的值插入到实例中*/
                        //姓名
                        model.setName(getCellXLSValue(hssfrow.getCell((short) 0), null));

                        /**将EXCEL中的第 j 行，第二列的值插入到实例中*/
                        //身份证
                        model.setIdCard(getCellXLSValue(hssfrow.getCell((short) 1), null));

                        /**将EXCEL中的第 j 行，第三列的值插入到实例中*/
                        //电话
                        model.setPhone(getCellXLSValue(hssfrow.getCell((short) 2), null));
                        /**将EXCEL中的第 j 行，第四列的值插入到实例中*/
                        //策略id
                        model.setStrategyId(getCellXLSValue(hssfrow.getCell((short) 3), null));


                        /**将EXCEL中的第 j 行，第五列的值插入到实例中*/
                        //百融分
                        model.setScore(getCellXLSValue(hssfrow.getCell((short) 4), null));

                        //执行修改百融分操作
//                            dao.save(vendor);
                        //导入成功加1
                        input++;
                    } catch (Exception e) {
                        // TODO: handle exception
                        e.printStackTrace();
                        break;
                    }
                }
            }
        } catch (Exception e) {
            // TODO: handle exception

            e.printStackTrace();
        }
        return null;
    }


    /**
     * @ClassName: ReadExcelUtil
     * @Description: TODO(读取excel2007内容)
     * @author xuliang
     * @date 2016-11-8
     */

    public int readExcelXLSX(FileInputStream in, IRiskPostDataService riskPostDataService) {
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
            //计算要执行多少行
            int page = rowNumCount % 1000 == 0 ? rowNumCount / 1000 : rowNumCount / 1000 + 1;
            //执行递归操作
//            input = updateScore(0, 1000, page, input, hssfrow, hssfsheet,riskPostDataService);
            updateScoreMaster(rowNumCount, hssfrow, hssfsheet, riskPostDataService);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return input;
    }


    /**
     * @ClassName: ReadExcelUtil
     * @Description: TODO(递归遍历master - work设计模式)
     * @author xuliang
     * @date 2016-11-8
     */

    public int updateScoreMaster(int rowNumCount, XSSFRow hssfrow, XSSFSheet hssfsheet, IRiskPostDataService riskPostDataService) {
        Master master = new Master(new Worker(riskPostDataService), 50);

        for (int j = 1; j < rowNumCount; j++) {
            BrScoreModel info = new BrScoreModel();
            try {
                hssfrow = hssfsheet.getRow(j);

                //不处理乱码
                if (getCellXLSXValue(hssfrow.getCell((short) 1), null).contains("?")) {
                    continue;
                }
                info.setId(j);
                /**将EXCEL中的第 j 行，第五列的值插入到实例中*/
                //百融分
                info.setScore(getCellXLSXValue(hssfrow.getCell((short) 0), null));
                //姓名
                info.setName(getCellXLSXValue(hssfrow.getCell((short) 1), null).trim());

                /**将EXCEL中的第 j 行，第二列的值插入到实例中*/
                //身份证
                info.setIdCard(getCellXLSXValue(hssfrow.getCell((short) 2), null));

                /**将EXCEL中的第 j 行，第三列的值插入到实例中*/
                //电话
                info.setPhone(getCellXLSXValue(hssfrow.getCell((short) 3), null));

                /**将EXCEL中的第 j 行，第四列的值插入到实例中*/
                //taskId
                info.setTaskId(getCellXLSXValue(hssfrow.getCell((short) 4), null));

                //时间
                info.setUpdateTime(new Date());
                logger.info("当前行：" + j + "当前数据：【" + info.toString() + "】");

                info.setFlag("1");
                //添加任务
                master.submit(info);
                //更新成功加1
//                input++;
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
                break;
            }
        }
        //开始执行
        master.execute();
        long start = System.currentTimeMillis();
        while (true) {
            if (master.isComplete()) {
                long end = System.currentTimeMillis() - start;
                int ret = master.getResult();
                logger.info("最终结果：" + ret + "， 50个线程执行" + rowNumCount + "条数据共耗时：" + end / 1000 + "s");
                break;
            }
        }

        //继续执行递归
//        updateScore(page+1, pageSize+1000, sumPage, input, hssfrow, hssfsheet,riskPostDataService);
        return 0;
    }


    /**
     * @ClassName: ReadExcelUtil
     * @Description: TODO(递归遍历)
     * @author xuliang
     * @date 2016-11-8
     */

    public int updateScore(int page, int pageSize, int sumPage, int input, XSSFRow hssfrow, XSSFSheet hssfsheet, IRiskPostDataService riskPostDataService) {
        logger.info("当前页：" + page);
        if (page == sumPage) {
            return input;
        }
        for (int j = page * 1000 + 1; j < pageSize; j++) {

            BrScoreModel info = new BrScoreModel();
            try {
                hssfrow = hssfsheet.getRow(j);

                /**将EXCEL中的第 j 行，第五列的值插入到实例中*/
                //百融分
                info.setScore(getCellXLSXValue(hssfrow.getCell((short) 1), null));

                /**将EXCEL中的第 j 行，第二列的值插入到实例中*/
                //身份证
                info.setIdCard(getCellXLSXValue(hssfrow.getCell((short) 2), null));

                /**将EXCEL中的第 j 行，第三列的值插入到实例中*/
                //电话
                info.setPhone(getCellXLSXValue(hssfrow.getCell((short) 3), null));
                //姓名
                info.setName(getCellXLSXValue(hssfrow.getCell((short) 4), null));
                /**将EXCEL中的第 j 行，第四列的值插入到实例中*/
                //taskId
                info.setTaskId(getCellXLSXValue(hssfrow.getCell((short) 5), null));

                //执行更新百融分操作
                //查询最近一次bairong_data数据
                BairongData brData = riskPostDataService.getLastBairongData(info.getName(), info.getIdCard(), info.getPhone(), info.getStrategyId());
                if (null != brData) {
                    JSONObject json = JSONObject.parseObject("{\"rs_strategy_id\":\"STR0000799\",\"code\":\"00\",\"swift_number\":\"3002138_20180511135404_2553\",\"rs_Score_decision\":\"Accept\",\"rs_product_type\":\"100085\",\"rs_platform\":\"ios\",\"scorecust\":\"787\",\"flag_score\":\"1\",\"rs_final_decision\":\"Accept\",\"flag_riskstrategy\":\"1\",\"rs_product_name\":\"假数据" + new SimpleDateFormat(DateUtils.DATE_FORMAT_LONG) + "\",\"rs_Score_scorecust\":\"666\",\"rs_strategy_version\":\"1.0\",\"rs_scene\":\"lend\"}");
                    if (StringUtils.isNotBlank(brData.getData())) {
                        json = JSONObject.parseObject(brData.getData());
                    }
                    json.put("rs_Score_scorecust", info.getScore());
                    brData.setData(JSONObject.toJSONString(json));
                    logger.info("bairongdata更新后数据为:" + json);
                    //更新bairong_data
                    riskPostDataService.updateBairongData(info.getName(), info.getIdCard(), info.getPhone(), info.getStrategyId(), brData.getData(),brData.getUpdateTime(),brData.getFlag());
                }
                //ch
                //更新br_post_data最近一次数据
                BrPostData brPostData = riskPostDataService.getLastBrPostData(info.getTaskId());
                if (null != brPostData) {
                    JSONObject brJson = JSONObject.parseObject("{\"rs_strategy_id\":\"STR0000799\",\"code\":\"00\",\"swift_number\":\"3002138_20180502101600_2512\",\"rs_Score_decision\":\"Accept\",\"rs_product_type\":\"100085\",\"rs_platform\":\"ios\",\"scorecust\":\"787\",\"flag_score\":\"1\",\"rs_final_decision\":\"Accept\",\"flag_riskstrategy\":\"1\",\"rs_product_name\":\"假数据" + new SimpleDateFormat(DateUtils.DATE_FORMAT_LONG) + "\",\"rs_Score_scorecust\":\"787\",\"rs_strategy_version\":\"1.0\",\"scorepettycashv1\":\"666\",\"rs_scene\":\"lend\"}");
                    if (StringUtils.isNotBlank(brPostData.getData())) {
                        brJson = JSONObject.parseObject(brPostData.getData());
                    }
                    brJson.put("scorepettycashv1", info.getScore());
                    brPostData.setData(JSONObject.toJSONString(brJson));
                    logger.info("brPostData更新后数据为:" + brJson);
                    //更新br_post_data
                    riskPostDataService.updateBrPostData(info.getTaskId(), brPostData.getData());
                }

                logger.info("当前行：" + j + "当前数据：【" + info.toString() + "】");

                //更新成功加1
                input++;
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
                break;
            }
        }
        //继续执行递归
        updateScore(page + 1, pageSize + 1000, sumPage, input, hssfrow, hssfsheet, riskPostDataService);
        return input;
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


    /**
     * @ClassName: ReadExcelUtil
     * @Description: TODO(判断excel单元格2003XLS)
     * @author xuliang
     * @date 2016-11-8
     */

    private String getCellXLSValue(HSSFCell cell, String timefalg) {
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
