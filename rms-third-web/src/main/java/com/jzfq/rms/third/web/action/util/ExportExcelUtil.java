package com.jzfq.rms.third.web.action.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.mongo.BairongData;
import com.jzfq.rms.third.common.mongo.GongPingJiaData;
import com.jzfq.rms.third.common.mongo.JiaoData;
import com.jzfq.rms.third.persistence.dao.impl.GongpingjiaDao;
import com.jzfq.rms.third.service.IRiskPostDataService;
import com.jzfq.rms.third.web.action.model.Run200Model;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExportExcelUtil {


    private final static Logger logger = LoggerFactory.getLogger(ExportExcelUtil.class);

    /*
     * 导出数据
     * */
    public static void export(List<GongPingJiaData> data, String file) throws Exception {


        //第一步创建workbook
        XSSFWorkbook wb = new XSSFWorkbook();

        //第二步创建sheet
        XSSFSheet sheet = wb.createSheet("公平价数据");

        //第三步创建行row:添加表头0行
        XSSFRow row = sheet.createRow(0);
        XSSFCellStyle style = wb.createCellStyle();
        //style.setAlignment(HSSFCellStyle.ALIGN_CENTER);  //居中


        //第四步创建单元格
        XSSFCell cell = row.createCell(0); //第一个单元格
        cell.setCellValue("客户id");
        cell.setCellStyle(style);

        cell = row.createCell(1);         //第二个单元格
        cell.setCellValue("汽车品牌");
        cell.setCellStyle(style);

        cell = row.createCell(2);         //第二个单元格
        cell.setCellValue("型号");
        cell.setCellStyle(style);

        cell = row.createCell(3);         //第二个单元格
        cell.setCellValue("发动机号");
        cell.setCellStyle(style);

        cell = row.createCell(4);         //第二个单元格
        cell.setCellValue("车架号");
        cell.setCellStyle(style);

        cell = row.createCell(5);         //第二个单元格
        cell.setCellValue("车商收购价下限");
        cell.setCellStyle(style);

        cell = row.createCell(6);         //第二个单元格
        cell.setCellValue("车商收购价");
        cell.setCellStyle(style);

        cell = row.createCell(7);         //第二个单元格
        cell.setCellValue("车上收购价上限");
        cell.setCellStyle(style);

        cell = row.createCell(8);         //第二个单元格
        cell.setCellValue("个人对个人交易价下限");
        cell.setCellStyle(style);

        cell = row.createCell(9);         //第二个单元格
        cell.setCellValue("个人对个人交易价");
        cell.setCellStyle(style);

        cell = row.createCell(10);         //第二个单元格
        cell.setCellValue("个人对个人交易价上限");
        cell.setCellStyle(style);

        cell = row.createCell(11);         //第二个单元格
        cell.setCellValue("车商卖车价下限");
        cell.setCellStyle(style);

        cell = row.createCell(12);         //第二个单元格
        cell.setCellValue("车商卖车价");
        cell.setCellStyle(style);

        cell = row.createCell(13);         //第二个单元格
        cell.setCellValue("车商卖车价上限");
        cell.setCellStyle(style);


        //第五步插入数据
        if (null != data && data.size() > 0) {
            int count = 0;
            for (int j = 0; j < data.size(); j++) {
                JSONArray array = JSONArray.parseArray(JSON.toJSONString(data.get(j).getData()));
                logger.info("第  " + j + "行=====================" + JSON.toJSONString(array));
                for (int i = 0; i < array.size(); i++) {
                    System.out.println("excel:" + getValueByFileds("brandName", array.getJSONObject(i)));
                    //创建行
                    row = sheet.createRow(count + 1);
                    //创建单元格并且添加数据
                    row.createCell(0).setCellValue("");
                    row.createCell(1).setCellValue(getValueByFileds("brandName", array.getJSONObject(i)));//汽车品牌
                    row.createCell(2).setCellValue(getValueByFileds("detailModelName", array.getJSONObject(i)));//型号
                    row.createCell(3).setCellValue("");//发动机号
                    row.createCell(4).setCellValue(data.get(j).getPlantNo().toString());//车架号
                    row.createCell(5).setCellValue(data.get(j).getVin());//车牌号
                    row.createCell(6).setCellValue(getValueByFileds("minSellPrice", array.getJSONObject(i)));//车商收购价下限
                    row.createCell(7).setCellValue(getValueByFileds("sellPrice", array.getJSONObject(i)));//车商收购价
                    row.createCell(8).setCellValue(getValueByFileds("maxSellPrice", array.getJSONObject(i)));//车商收购价上限
                    row.createCell(9).setCellValue(getValueByFileds("minPrivatePrice", array.getJSONObject(i)));//个人对个人交易价下限
                    row.createCell(10).setCellValue(getValueByFileds("privatePrice", array.getJSONObject(i)));//个人对个人交易价
                    row.createCell(11).setCellValue(getValueByFileds("maxPrivatePrice", array.getJSONObject(i)));//个人对个人交易价上限
                    row.createCell(12).setCellValue(getValueByFileds("minBuyPrice", array.getJSONObject(i)));//车商卖车价下限
                    row.createCell(13).setCellValue(getValueByFileds("buyPrice", array.getJSONObject(i)));//车商卖车价
                    row.createCell(14).setCellValue(getValueByFileds("maxBuyPrice", array.getJSONObject(i)));//车商卖车价上限
                    count++;
                }
            }
        }
        //第六步将生成excel文件保存到指定路径下
        try {
            FileOutputStream fout = new FileOutputStream(file);
            wb.write(fout);
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Excel文件生成成功...");

    }


    /*
     * 导出数据
     * */
    public static void export0613(List<Run200Model> data, List<Run200Model> newData, String file) throws Exception {


        //第一步创建workbook
        HSSFWorkbook wb = new HSSFWorkbook();

        //第二步创建sheet
        HSSFSheet sheet = wb.createSheet("历史分数匹配");

        //第三步创建行row:添加表头0行
        HSSFRow row = sheet.createRow(0);
        HSSFCellStyle style = wb.createCellStyle();
        //style.setAlignment(HSSFCellStyle.ALIGN_CENTER);  //居中


        //第四步创建单元格
        HSSFCell cell = row.createCell(0); //第一个单元格
        cell.setCellValue("手机号");
        cell.setCellStyle(style);

        cell = row.createCell(1);         //第二个单元格
        cell.setCellValue("姓名");
        cell.setCellStyle(style);

        cell = row.createCell(2);         //第二个单元格
        cell.setCellValue("身份证");
        cell.setCellStyle(style);

        cell = row.createCell(3);         //第二个单元格
        cell.setCellValue("同盾分");
        cell.setCellStyle(style);

        cell = row.createCell(4);         //第二个单元格
        cell.setCellValue("百融分");
        cell.setCellStyle(style);

        cell = row.createCell(5);         //第二个单元格
        cell.setCellValue("是否实名制");
        cell.setCellStyle(style);

        cell = row.createCell(6);         //第二个单元格
        cell.setCellValue("在网时长");
        cell.setCellStyle(style);

        cell = row.createCell(7);         //第二个单元格
        cell.setCellValue("在网状态");
        cell.setCellStyle(style);
        //第五步插入数据
        if (null != data && data.size() > 0) {
            int count = 0;
            for (Run200Model info : data) {
                count++;
                //创建行
                row = sheet.createRow(count);
                //创建单元格并且添加数据
                row.createCell(0).setCellValue(info.getPhone());//手机号
                row.createCell(1).setCellValue(info.getName());//姓名
                row.createCell(2).setCellValue(info.getIdCard());//身份证
                row.createCell(3).setCellValue(info.getTdScore());//同盾分
                row.createCell(4).setCellValue(info.getBrScore());//百融分
                row.createCell(5).setCellValue(info.getThree());//手机三要素
                row.createCell(6).setCellValue(info.getLength());//手机在网时长
                row.createCell(7).setCellValue(info.getStatus());//手机在网状态
            }
        }

        HSSFSheet sheet2 = wb.createSheet("重新拉取");


        //第三步创建行row:添加表头0行
        HSSFRow row2 = sheet2.createRow(0);
        HSSFCellStyle style2 = wb.createCellStyle();
        //style.setAlignment(HSSFCellStyle.ALIGN_CENTER);  //居中


        //第四步创建单元格
        HSSFCell cell2 = row2.createCell(0); //第一个单元格
        cell2.setCellValue("手机号");
        cell2.setCellStyle(style2);

        cell2 = row2.createCell(1);         //第二个单元格
        cell2.setCellValue("姓名");
        cell2.setCellStyle(style2);

        cell2 = row2.createCell(2);         //第二个单元格
        cell2.setCellValue("身份证");
        cell2.setCellStyle(style2);

        cell2 = row2.createCell(3);         //第二个单元格
        cell2.setCellValue("同盾分");
        cell2.setCellStyle(style2);

        cell2 = row2.createCell(4);         //第二个单元格
        cell2.setCellValue("百融分");
        cell2.setCellStyle(style2);

        cell2 = row2.createCell(5);         //第二个单元格
        cell2.setCellValue("是否实名制");
        cell2.setCellStyle(style2);

        cell2 = row2.createCell(6);         //第二个单元格
        cell2.setCellValue("在网时长");
        cell2.setCellStyle(style2);

        cell2 = row2.createCell(7);         //第二个单元格
        cell2.setCellValue("在网状态");
        cell2.setCellStyle(style2);
        //第五步插入数据
        if (null != newData && newData.size() > 0) {
            int count = 0;
            for (Run200Model info : newData) {
                count++;
                //创建行
                row2 = sheet2.createRow(count);
                //创建单元格并且添加数据
                row2.createCell(0).setCellValue(info.getPhone());//手机号
                row2.createCell(1).setCellValue(info.getName());//姓名
                row2.createCell(2).setCellValue(info.getIdCard());//身份证
                row2.createCell(3).setCellValue(info.getTdScore());//同盾分
                row2.createCell(4).setCellValue(info.getBrScore());//百融分
                row2.createCell(5).setCellValue(info.getThree());//手机三要素
                row2.createCell(6).setCellValue(info.getLength());//手机在网时长
                row2.createCell(7).setCellValue(info.getStatus());//手机在网状态
            }
        }


        //第六步将生成excel文件保存到指定路径下
        try {
            if (!new File(file).exists()) {
                new File(file).createNewFile();
            }
            FileOutputStream fout = new FileOutputStream(file);
            wb.write(fout);
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Excel文件生成成功...");

    }


    /*
     * 导出数据
     * */
    public static void export0629(List<Run200Model> data, String file) throws Exception {


        //第一步创建workbook
        HSSFWorkbook wb = new HSSFWorkbook();

        //第二步创建sheet
        HSSFSheet sheet = wb.createSheet("0629");

        //第三步创建行row:添加表头0行
        HSSFRow row = sheet.createRow(0);
        HSSFCellStyle style = wb.createCellStyle();
        //style.setAlignment(HSSFCellStyle.ALIGN_CENTER);  //居中


        //第四步创建单元格
        HSSFCell cell = row.createCell(0); //第一个单元格
        cell.setCellValue("手机号");
        cell.setCellStyle(style);

        cell = row.createCell(1);         //第二个单元格
        cell.setCellValue("姓名");
        cell.setCellStyle(style);

        cell = row.createCell(2);         //第二个单元格
        cell.setCellValue("身份证");
        cell.setCellStyle(style);

        cell = row.createCell(3);         //第二个单元格
        cell.setCellValue("百融分");
        cell.setCellStyle(style);

        cell = row.createCell(4);         //第二个单元格
        cell.setCellValue("百融权重分");
        cell.setCellStyle(style);

        //第五步插入数据
        if (null != data && data.size() > 0) {
            int count = 0;
            for (Run200Model info : data) {
                count++;
                //创建行
                row = sheet.createRow(count);
                //创建单元格并且添加数据
                row.createCell(0).setCellValue(info.getPhone());//手机号
                row.createCell(1).setCellValue(info.getName());//姓名
                row.createCell(2).setCellValue(info.getIdCard());//身份证
                row.createCell(3).setCellValue(info.getBrScore());//百融
                row.createCell(4).setCellValue(info.getTdScore());//百融权重

            }
        }

        //第六步将生成excel文件保存到指定路径下
        try {
            if (!new File(file).exists()) {
                new File(file).createNewFile();
            }
            FileOutputStream fout = new FileOutputStream(file);
            wb.write(fout);
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Excel文件生成成功...");

    }


    /*
     * 导出数据
     * */
    public static void export0702(List<BairongData> data, String file, IRiskPostDataService riskPostDataService) throws Exception {


        //第一步创建workbook
        HSSFWorkbook wb = new HSSFWorkbook();

        //第二步创建sheet
        HSSFSheet sheet = wb.createSheet("0702");

        //第三步创建行row:添加表头0行
        HSSFRow row = sheet.createRow(0);
        HSSFCellStyle style = wb.createCellStyle();
        //style.setAlignment(HSSFCellStyle.ALIGN_CENTER);  //居中


        //第四步创建单元格
        HSSFCell cell = row.createCell(0); //第一个单元格
        cell.setCellValue("手机号");
        cell.setCellStyle(style);

        cell = row.createCell(1);         //第二个单元格
        cell.setCellValue("姓名");
        cell.setCellStyle(style);

        cell = row.createCell(2);         //第二个单元格
        cell.setCellValue("身份证");
        cell.setCellStyle(style);

        cell = row.createCell(3);         //第二个单元格
        cell.setCellValue("百融分");
        cell.setCellStyle(style);

//        cell = row.createCell(4);         //第二个单元格
//        cell.setCellValue("百融权重分");
//        cell.setCellStyle(style);

        //第五步插入数据
        if (null != data && data.size() > 0) {
            int count = 0;
            for (BairongData info : data) {
                count++;
                //创建行
                row = sheet.createRow(count);
                //创建单元格并且添加数据
                row.createCell(0).setCellValue(info.getMobile());//手机号
                row.createCell(1).setCellValue(info.getName());//姓名
                row.createCell(2).setCellValue(info.getCertCardNo());//身份证
                row.createCell(3).setCellValue(riskPostDataService.getScoreByJson(JSONObject.parseObject(info.getData()), ""));//百融
//                row.createCell(4).setCellValue(info.getTdScore());//百融权重

            }
        }

        //第六步将生成excel文件保存到指定路径下
        try {
            if (!new File(file).exists()) {
                new File(file).createNewFile();
            }
            FileOutputStream fout = new FileOutputStream(file);
            wb.write(fout);
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Excel文件生成成功...");

    }


    /*
     * 导出数据
     * */
    public static void export0621(List<Run200Model> data, List<Run200Model> newData, String file) throws Exception {


        //第一步创建workbook
        HSSFWorkbook wb = new HSSFWorkbook();

        //第二步创建sheet
        HSSFSheet sheet = wb.createSheet("0622");

        //第三步创建行row:添加表头0行
        HSSFRow row = sheet.createRow(0);
        HSSFCellStyle style = wb.createCellStyle();
        //style.setAlignment(HSSFCellStyle.ALIGN_CENTER);  //居中


        //第四步创建单元格
        HSSFCell cell = row.createCell(0); //第一个单元格
        cell.setCellValue("手机号");
        cell.setCellStyle(style);

        cell = row.createCell(1);         //第二个单元格
        cell.setCellValue("姓名");
        cell.setCellStyle(style);

        cell = row.createCell(2);         //第二个单元格
        cell.setCellValue("身份证");
        cell.setCellStyle(style);

        cell = row.createCell(3);         //第二个单元格
        cell.setCellValue("百融分");
        cell.setCellStyle(style);

        //第五步插入数据
        if (null != data && data.size() > 0) {
            int count = 0;
            for (Run200Model info : data) {
                count++;
                //创建行
                row = sheet.createRow(count);
                //创建单元格并且添加数据
                row.createCell(0).setCellValue(info.getPhone());//手机号
                row.createCell(1).setCellValue(info.getName());//姓名
                row.createCell(2).setCellValue(info.getIdCard());//身份证
                row.createCell(3).setCellValue(info.getBrScore());//同盾分
            }
        }

        //第六步将生成excel文件保存到指定路径下
        try {
            if (!new File(file).exists()) {
                new File(file).createNewFile();
            }
            FileOutputStream fout = new FileOutputStream(file);
            wb.write(fout);
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Excel文件生成成功...");

    }


    /*
     * 导出数据
     * */
    public static void exportBy(List<JiaoData> data, String file) throws Exception {


        //第一步创建workbook
        XSSFWorkbook wb = new XSSFWorkbook();

        //第二步创建sheet
        XSSFSheet sheet = wb.createSheet("集奥在网状态数据0615-0630");

        //第三步创建行row:添加表头0行
        XSSFRow row = sheet.createRow(0);
        XSSFCellStyle style = wb.createCellStyle();
        //style.setAlignment(HSSFCellStyle.ALIGN_CENTER);  //居中


        //第四步创建单元格
        XSSFCell cell = row.createCell(0); //第一个单元格
        cell.setCellValue("姓名");
        cell.setCellStyle(style);

        cell = row.createCell(1);         //第二个单元格
        cell.setCellValue("手机号");
        cell.setCellStyle(style);

        cell = row.createCell(2);         //第二个单元格
        cell.setCellValue("身份证");
        cell.setCellStyle(style);

        cell = row.createCell(3);         //第二个单元格
        cell.setCellValue("值");
        cell.setCellStyle(style);

        cell = row.createCell(4);         //第二个单元格
        cell.setCellValue("创建时间");
        cell.setCellStyle(style);

        //第五步插入数据
        if (null != data && data.size() > 0) {
            int count = 0;
            for (JiaoData info : data) {
                count++;
                //创建行
                row = sheet.createRow(count);
                //创建单元格并且添加数据
                row.createCell(0).setCellValue(info.getName());//姓名
                row.createCell(1).setCellValue(info.getPhone());//手机号
                row.createCell(2).setCellValue(info.getIdCard());//身份证
                row.createCell(3).setCellValue(info.getValue());//值
                row.createCell(3).setCellValue(info.getCreateTime());//创建时间
            }
        }
        //第六步将生成excel文件保存到指定路径下
        try {
            FileOutputStream fout = new FileOutputStream(file);
            wb.write(fout);
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Excel文件生成成功...");

    }







    /*
     *
     * 解析json
     * */

    public static String getValueByFileds(String fileds, JSONObject data) {
        String obj = data.getString(fileds);
        return obj;
    }

    public static void main(String[] args) {

        //第一步创建workbook
        HSSFWorkbook wb = new HSSFWorkbook();

        //第二步创建sheet
        HSSFSheet sheet = wb.createSheet("测试");

        //第三步创建行row:添加表头0行
        HSSFRow row = sheet.createRow(0);
        HSSFCellStyle style = wb.createCellStyle();
        //style.setAlignment(HSSFCellStyle.ALIGN_CENTER);  //居中


        //第四步创建单元格
        HSSFCell cell = row.createCell(0); //第一个单元格
        cell.setCellValue("姓名");
        cell.setCellStyle(style);


        cell = row.createCell(1);         //第二个单元格
        cell.setCellValue("年龄");
        cell.setCellStyle(style);


        //第五步插入数据

        for (int i = 0; i < 5; i++) {
            //创建行
            row = sheet.createRow(i + 1);
            //创建单元格并且添加数据
            row.createCell(0).setCellValue("aa" + i);
            row.createCell(1).setCellValue(i);

        }

        //第六步将生成excel文件保存到指定路径下
        try {
            FileOutputStream fout = new FileOutputStream("d:\\mmm.xls");
            wb.write(fout);
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Excel文件生成成功...");
    }


}
