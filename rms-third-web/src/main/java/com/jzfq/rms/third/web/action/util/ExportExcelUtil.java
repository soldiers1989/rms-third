package com.jzfq.rms.third.web.action.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.mongo.GongPingJiaData;
import com.jzfq.rms.third.persistence.dao.impl.GongpingjiaDao;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.util.CellRangeAddress;
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
        HSSFWorkbook wb = new HSSFWorkbook();

        //第二步创建sheet
        HSSFSheet sheet = wb.createSheet("公平价数据");

        //第三步创建行row:添加表头0行
        HSSFRow row = sheet.createRow(0);
        HSSFCellStyle style = wb.createCellStyle();
        //style.setAlignment(HSSFCellStyle.ALIGN_CENTER);  //居中


        //第四步创建单元格
        HSSFCell cell = row.createCell(0); //第一个单元格
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
                logger.info("第  "+j+"行====================="+JSON.toJSONString(array));
                for (int i = 0; i < array.size(); i++) {
                    System.out.println("excel:"+getValueByFileds("brandName", array.getJSONObject(i)));
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
