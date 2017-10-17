package com.jzfq.rms.third.test;

import com.jzfq.rms.mongo.BrPostData;
import com.jzfq.rms.mongo.PengYuan;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.bson.types.ObjectId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.CollectionUtils;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/16 11:25.
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class ExportBrDataTest {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Test
    public void test() throws Exception{
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start = sf.parse("2017-09-01 00:00:00");
        Date end = sf.parse("2017-09-30 23:59:59");
        List<BrPostData> pyData = mongoTemplate.find(new Query(Criteria.where("createTime").gte(start).lte(end))
                ,BrPostData.class);
        Map<String,List<BrPostData>> map = new HashMap<>();
        for(BrPostData data:pyData){
            String taskId = data.getTaskId();
            if(StringUtils.isBlank(taskId)){
                continue;
            }
            List list = map.get(taskId);
            if(list==null){
                list = new ArrayList();
                map.put(taskId,list);
            }
            list.add(data);
        }
        Map<String,List<BrPostData>> month = new HashMap<>();
        sf = new SimpleDateFormat("yyyy-MM-dd");
        List<String> taskIdList = new ArrayList<>();
        for (Map.Entry<String, List<BrPostData>> entry : map.entrySet()) {
            String key = entry.getKey().toString();
            List<BrPostData> value = entry.getValue();
            if(CollectionUtils.isEmpty(value)||value.size()<=1){
                continue;
            }

            String date = sf.format(value.get(0).getCreateTime());
            List list = month.get(date);
            if(!taskIdList.contains(date)){
                taskIdList.add(date);
            }

            if(list==null){
                list = new ArrayList();
                month.put(date,list);
            }
            list.addAll(value);
        }
        Collections.sort(taskIdList);





    // 第五步，写入实体数据 实际应用中这些数据从数据库得到，
        // 第一步，创建一个webbook，对应一个Excel文件
        HSSFWorkbook wb = new HSSFWorkbook();
        for (String setId : taskIdList) {

            String key = setId;
            List<BrPostData> value = month.get(setId);
            // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
            HSSFSheet sheet = wb.createSheet(key);
            // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
            HSSFRow row = sheet.createRow((int) 0);
            // 第四步，创建单元格，并设置值表头 设置表头居中
            HSSFCellStyle style = wb.createCellStyle();
            style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
            HSSFCell cell = row.createCell( 0);
//            protected ObjectId id;
//            private String interfaceType;
//            @Indexed
//            private String taskId;
//            private String desc;
//            private String data;
//            private Date createTime;
            cell.setCellValue("编号");
            cell.setCellStyle(style);
            cell = row.createCell( 1);
            cell.setCellValue("接口类型");
            cell.setCellStyle(style);
            cell = row.createCell(  2);
            cell.setCellValue("任务编号");
            cell.setCellStyle(style);
            cell = row.createCell(  3);
            cell.setCellValue("描述");
            cell.setCellStyle(style);
            cell = row.createCell(  4);
            cell.setCellValue("数据");
            cell.setCellStyle(style);
            cell = row.createCell(  5);
            cell.setCellValue("入库时间");
            cell.setCellStyle(style);
            int i = 0;
            for(BrPostData ele:value){
                row = sheet.createRow( (i++) + 1);
                row.createCell( 0).setCellValue( ele.getId().toString());
                row.createCell(1).setCellValue(ele.getInterfaceType());
                row.createCell( 2).setCellValue(ele.getTaskId());
                row.createCell(3).setCellValue(ele.getDesc());
                row.createCell( 4).setCellValue(ele.getData());
                row.createCell(5).setCellValue(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(ele.getCreateTime()));
                System.out.println(ele.getCreateTime());
                System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(ele.getCreateTime()));
            }
        }
    // 第六步，将文件存到指定位置
    try
    {
      FileOutputStream fout = new FileOutputStream("E:/brData.xls");
      wb.write(fout);
      fout.close();
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    }
    @Test
    public void test1() throws Exception{

        int count = 0;
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start = sf.parse("2017-09-01 00:00:00");
        Date end = sf.parse("2017-09-30 23:59:59");
        List<BrPostData> brData = mongoTemplate.find(new Query(Criteria.where("createTime").gte(start).lte(end).and("desc").is("拉取数据集合信息信息")
                )
                ,BrPostData.class);
        int dataSize = brData.size();
        Map<String,List<BrPostData>> map = new HashMap<>();
        for(BrPostData data:brData){
            String taskId = data.getTaskId();
            String des = data.getDesc();
            if(StringUtils.isBlank(taskId)){
                continue;
            }
            List list = map.get(taskId+des);
            if(list==null){
                list = new ArrayList();
                map.put(taskId+des,list);
            }
            list.add(data);
        }
        Map<String,List<BrPostData>> month = new HashMap<>();
        sf = new SimpleDateFormat("yyyy-MM-dd");
        List<String> taskIdList = new ArrayList<>();
        for (Map.Entry<String, List<BrPostData>> entry : map.entrySet()) {
            String key = entry.getKey().toString();
            List<BrPostData> value = entry.getValue();
            if(CollectionUtils.isEmpty(value)||value.size()<=1){
                continue;
            }
            String date = sf.format(value.get(0).getCreateTime());
            List list = month.get(date);
            if(list==null){
                taskIdList.add(date);
                list = new ArrayList();
                month.put(date,list);
            }else{
                count+=value.size()-1;
            }
            list.addAll(value);
        }
        Collections.sort(taskIdList);



        // 第五步，写入实体数据 实际应用中这些数据从数据库得到，
        // 第一步，创建一个webbook，对应一个Excel文件
        SXSSFWorkbook wb = new SXSSFWorkbook();

        Sheet hejiSheet = wb.createSheet("合计");
        // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
        Row hjRow = hejiSheet.createRow((int) 0);
        // 第四步，创建单元格，并设置值表头 设置表头居中
        CellStyle hejiStyle = wb.createCellStyle();
        hejiStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
        Cell heji = hjRow.createCell( 0);
        heji.setCellValue("总调用次数");
        heji.setCellStyle(hejiStyle);
        heji = hjRow.createCell( 1);
        heji.setCellValue("多调用次数");
        heji.setCellStyle(hejiStyle);
        hjRow = hejiSheet.createRow(1);
        hjRow.createCell( 0).setCellValue( dataSize);
        hjRow.createCell(1).setCellValue(count);
        for (String setId : taskIdList) {

            String key = setId;
            List<BrPostData> value = month.get(setId);
            int size = value.size();
            int sizePage = size/65530+1;
            int sizeMod = size%65530;
            int firstIndex = 0;
            int page = 1;
            do{
                firstIndex = 65530*(page-1);

                // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
//                String name = key+"("+page+")";
                String name = key+"|共"+size+"条|第"+page+"页";
                Sheet sheet = wb.createSheet(name);
                // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
                Row row = sheet.createRow((int) 0);
                // 第四步，创建单元格，并设置值表头 设置表头居中
                CellStyle style = wb.createCellStyle();
                style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
                Cell cell = row.createCell( 0);
                cell.setCellValue("编号");
                cell.setCellStyle(style);
                cell = row.createCell( 1);
                cell.setCellValue("接口类型");
                cell.setCellStyle(style);
                cell = row.createCell(  2);
                cell.setCellValue("任务编号");
                cell.setCellStyle(style);
                cell = row.createCell(  3);
                cell.setCellValue("描述");
                cell.setCellStyle(style);
                cell = row.createCell(  4);
                cell.setCellValue("数据");
                cell.setCellStyle(style);
                cell = row.createCell(  5);
                cell.setCellValue("入库时间");
                cell.setCellStyle(style);
                cell = row.createCell(  6);
                cell.setCellValue(count);
                cell.setCellStyle(style);
                int maxIndex = firstIndex+65529;
                for(int j=0;firstIndex<=maxIndex&&firstIndex<size;){
                    BrPostData ele = value.get(firstIndex++);
                    row = sheet.createRow( (j++) + 1);
                    row.createCell( 0).setCellValue( ele.getId().toString());
                    row.createCell(1).setCellValue(ele.getInterfaceType());
                    row.createCell( 2).setCellValue(ele.getTaskId());
                    row.createCell(3).setCellValue(ele.getDesc());
                    row.createCell( 4).setCellValue(ele.getData());
                    row.createCell(5).setCellValue(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(ele.getCreateTime()));
                }
                page++;
            }while(page<=sizePage);

        }
        // 第六步，将文件存到指定位置
        try
        {
            FileOutputStream fout = new FileOutputStream("E:/brData.xlsx");
            wb.write(fout);
            fout.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
