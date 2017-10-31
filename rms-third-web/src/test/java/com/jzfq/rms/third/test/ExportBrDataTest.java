package com.jzfq.rms.third.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.enums.CustomerTypeEnum;
import com.jzfq.rms.mongo.BrPostData;
import com.jzfq.rms.mongo.PengYuan;
import com.jzfq.rms.third.common.vo.EvaluationInfoVo;
import com.jzfq.rms.third.service.IGongPingjiaService;
import com.jzfq.rms.third.service.IJieAnService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.CollectionUtils;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/16 11:25.
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class ExportBrDataTest {
    private static final Logger log = LoggerFactory.getLogger("ExportBrDataTest");
    @Autowired
    IGongPingjiaService gongPingjiaService;
    @Autowired
    private MongoTemplate mongoTemplate;
//    @Autowired
//    JieanxxMapper jieanxxMapper;
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
        // 第一步，创建一个webbook，对应一个Excel文件33
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

    /**
     * 导出一万条数据
     * @throws Exception
     */
    @Test
    public void test2() throws Exception{
        String driver = "com.mysql.jdbc.Driver";
//localhost指本机，也可以用本地ip地址代替，3306为MySQL数据库的默认端口号，“user”为要连接的数据库名
        String url = "jdbc:mysql://60.205.204.172:3312/rms";
//填入数据库的用户名跟密码
        String username = "f1ngk0ngprd";
        String password = "QFROSip@3oWxmeA";
        String sql = "select * from risk_task a,risk_loan_info b, risk_personal_info c ,risk_car_info d " +
                "where a.id = b.task_id and a.id = c.task_id and a.id = d.task_id and " +
                " b.loan_type=6 order by create_time desc limit 10000";//编写要执行的sql语句，此处为从user表中查询所有用户的信息
        try
        {
            Class.forName(driver);//加载驱动程序，此处运用隐式注册驱动程序的方法
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        Connection con = DriverManager.getConnection(url,username,password);//创建连接对象
        Statement st = con.createStatement();//创建sql执行对象
        ResultSet rs = st.executeQuery(sql);//执行sql语句并返回结果集

        List< Map<String,Object>> list = new ArrayList<>();
        int count=0;
        while(rs.next())//对结果集进行遍历输出
        {
            Map<String,Object> result = new HashMap<>();
            count++;
            result.put("apply_time",rs.getDate("apply_time"));
            result.put("order_no",rs.getString("order_no"));
            result.put("task_id",rs.getString("task_id"));
            result.put("user_id",rs.getString("c.id"));
            result.put("user_name",rs.getString("c.name"));
            result.put("cert_card_no",rs.getString("c.cert_card_no"));
            result.put("user_mobile",rs.getString("c.mobile"));

            result.put("frame_no",rs.getString("d.frame_no"));
            result.put("plate_no",rs.getString("d.plate_no"));


            result.put("customer_type",rs.getString("customer_type"));
            result.put("td_score",rs.getString("b.td_score"));
            list.add(result);
        }
        rs.close();

        st.close();
        con.close();
        int count1=0;
        for(Map<String,Object> ele:list) {
            System.out.println("第"+(++count1)+"條");

            String plate_no = StringUtils.isBlank((String)ele.get("plate_no"))
                    ?"":(String)ele.get("plate_no").toString();
            List<EvaluationInfoVo> list1=null;
            try{

             list1= gongPingjiaService.queryGaopingjiaEvalation(
                    (String)ele.get("frame_no"),plate_no.length()>1?plate_no.substring(0,2):plate_no);
           } catch(Exception e){

            }
            if(!CollectionUtils.isEmpty(list1)){
               for(EvaluationInfoVo eviduation:list1){
                   if(!StringUtils.isBlank(eviduation.getPrivatePrice())){
                       ele.put("price",eviduation.getPrivatePrice());
                       break;
                   }
               }
            }
            if(ele.get("customer_type")==null|| !NumberUtils.isNumber(ele.get("customer_type").toString())){
                continue;
            }
            int type = Integer.parseInt(ele.get("customer_type").toString());
            if ( type== CustomerTypeEnum.CUSTOMERTYPE_CAR.getCode()){
                type = CustomerTypeEnum.CUSTOMERTYPE_WHITE_COLLAR.getCode();
            }
            // 鹏元
            List<PengYuan> pyData = mongoTemplate.find(new Query(Criteria.where("taskId")
                    .is(ele.get("task_id")).and("idCard").is(ele.get("cert_card_no"))),PengYuan.class);
            JSONObject pengyuanData = new JSONObject();
            if (null != pyData && pyData.size() > 0) {
                pengyuanData = pyData.get(0).getData();

                if(pengyuanData != null){
                    boolean agreement = !pengyuanData.getString("carCheckInfo").contains("不一致");
                    if(agreement){
                        ele.put("pengyuan","一致");
                    }else{
                        ele.put("pengyuan","不一致");
                    }
                }

            }
            // 百融 融360
            List<BrPostData> datas = mongoTemplate.find(new Query(Criteria.where("taskId").is(ele.get("task_id"))
                    .and("interfaceType").is(type+ "")), BrPostData.class);
            JSONObject jsonObject = new JSONObject();
            for (BrPostData data : datas) {
                if (data.getDesc().equals("手机三要素") ) {
                    continue;
                }
                if (data.getDesc().equals("手机在网时长")) {
                    String time = data.getData();
                    if (StringUtils.isBlank(time)) {
                        continue;
                    }
                    JSONObject temp = JSON.parseObject(time);
                    Object str="";
                    if(StringUtils.equals("600000",temp.getString("code"))){
                        str = ((JSONObject) ((JSONObject) temp.get("product")).get("data")).get("value");
                    }

                    ele.put("value", getTimeStr((String) str));
                    continue;
                }
                if (!org.springframework.util.StringUtils.isEmpty(data.getData())) {
                    String str = data.getData().replace("dc_scorejzfq_cash", "scoreconsoffv2");      //现金贷的白领  字段转换
                    jsonObject.putAll(JSON.parseObject(str));
                }
            }
            net.sf.json.JSONObject json = net.sf.json.JSONObject.fromObject(jsonObject);
            //取数据
            String strBrScore = json.optString("scorepettycashv1");
            String strWeightScore = json.optString("Rule_final_weight");
            if (org.apache.commons.lang.StringUtils.isBlank(strBrScore)) {
                strBrScore = json.optString("scoreconsoffv2");
            }
            int brScore = 0;
            //转换成int类型
            if (org.apache.commons.lang.StringUtils.isNotBlank(strBrScore)) {
                brScore = Integer.parseInt(strBrScore);
            }
            int brWeightScore = 0;

            //百融权重分
            if (org.apache.commons.lang.StringUtils.isNotBlank(strWeightScore)) {
                brWeightScore = Integer.parseInt(strWeightScore);
            }
            ele.put("br", brScore);
            ele.put("qz", brWeightScore);
        }




        SXSSFWorkbook wb = new SXSSFWorkbook();
        // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
        String name ="data";
        Sheet sheet = wb.createSheet(name);
        // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
        Row row = sheet.createRow((int) 0);
        // 第四步，创建单元格，并设置值表头 设置表头居中
        CellStyle style = wb.createCellStyle();
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
        Cell cell = row.createCell( 0);
        cell.setCellValue("认证时间");
        cell.setCellStyle(style);
        cell = row.createCell( 1);
        cell.setCellValue("订单号");
        cell.setCellStyle(style);
        cell = row.createCell(  2);
        cell.setCellValue("用户ID");
        cell.setCellStyle(style);
        cell = row.createCell(  3);
        cell.setCellValue("客户姓名");
        cell.setCellStyle(style);
        cell = row.createCell(  4);
        cell.setCellValue("身份证号码");
        cell.setCellStyle(style);
        cell = row.createCell(  5);
        cell.setCellValue("手机号码");
        cell.setCellStyle(style);
        cell = row.createCell(  6);
        cell.setCellValue("同盾分");
        cell.setCellStyle(style);
        cell = row.createCell(  7);
        cell.setCellValue("百融分");
        cell.setCellStyle(style);
        cell = row.createCell(  8);
        cell.setCellValue("百融权重分");
        cell.setCellStyle(style);
        cell = row.createCell(  9);
        cell.setCellValue("在网时长");
        cell.setCellStyle(style);
        cell = row.createCell(  10);
        cell.setCellValue("车架号");
        cell.setCellStyle(style);
        cell = row.createCell(  11);
        cell.setCellValue("车牌号");
        cell.setCellStyle(style);
        cell = row.createCell(  12);
        cell.setCellValue("鹏元是否一致");
        cell.setCellStyle(style);
        cell = row.createCell(  13);
        cell.setCellValue("车辆残值");
        cell.setCellStyle(style);
        for(int j=0;j<list.size();){
            Map<String,Object> ele = list.get(j);
            row = sheet.createRow( (j++) + 1);
            row.createCell( 0).setCellValue(
                    new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(ele.get("apply_time")));
            row.createCell(1).setCellValue((String)ele.get("order_no"));
            row.createCell( 2).setCellValue((String)ele.get("user_id"));
            row.createCell(3).setCellValue((String)ele.get("user_name"));
            row.createCell( 4).setCellValue((String)ele.get("cert_card_no"));
            row.createCell(5).setCellValue((String)ele.get("user_mobile"));
            row.createCell(6).setCellValue((String)ele.get("td_score"));
            row.createCell( 7).setCellValue(ele.get("br").toString());
            row.createCell(8).setCellValue(ele.get("qz").toString());
            row.createCell( 9).setCellValue((String)ele.get("value"));
            row.createCell(10).setCellValue((String)ele.get("frame_no"));
            row.createCell( 11).setCellValue((String)ele.get("plate_no"));
            row.createCell( 12).setCellValue((String)ele.get("pengyuan"));
            row.createCell(13).setCellValue((String)ele.get("price"));
        }
        // 第六步，将文件存到指定位置
        try
        {
            FileOutputStream fout = new FileOutputStream("E:/personData.xlsx");
            wb.write(fout);
            fout.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    @Autowired
    IJieAnService jieAnService;

    private String getTimeStr(String value){
        if(StringUtils.equals("1",value)){
            return "小于6个月";
        }else if(StringUtils.equals("2",value)){
            return "半年以上，不到1年";
        }else if(StringUtils.equals("3",value)){
            return "一年以上，不到2年";
        }else if(StringUtils.equals("4",value)){
            return "两年以上";
        }else{
            return "";
        }
    }


//    @Test
//    public void test3(){
//        JieanxxExample example = new JieanxxExample();
//        JieanxxExample.Criteria c =example.createCriteria().andTaskidIsNotNull().andTaskidEqualTo("10532062");
//        List<Jieanxx> list = jieanxxMapper.selectByExample(example);
//        int i = 0;
//
//        for(Jieanxx jieanxx:list){
//            System.out.println(++i+"條");
//            if(!StringUtils.isBlank(jieanxx.getSanyaosu())&&!StringUtils.isBlank(jieanxx.getZhuangtai())
//                    &&!StringUtils.isBlank(jieanxx.getShichang())){
//                continue;
//            }
//            String idNumber = jieanxx.getIdnumber();
//            String name = jieanxx.getName();
//            String phone = jieanxx.getPhone();
//            Map<String, String> bizData = new HashMap<>();
//            bizData.put("name",name);
//            bizData.put("idNumber",idNumber);
//            bizData.put("phone",phone);
//            example = new JieanxxExample();
//            c =example.createCriteria().andTaskidEqualTo(jieanxx.getTaskid());
//            try {
//                net.sf.json.JSONObject resultJson = null;
//
//                if(StringUtils.isBlank(jieanxx.getSanyaosu())){
//                    try{
//                        resultJson = jieAnService.getMobilecheck3item(jieanxx.getTaskid(), bizData);
//                        String info = changeBairongPhone3rdinfo(resultJson);
//                        jieanxx.setSanyaosu(info);
//                    }catch (Exception e){
//                        log.info("taskId={} : {}",jieanxx.getTaskid(),e.getMessage());
//                    }
//                }
//                if(StringUtils.isBlank(jieanxx.getZhuangtai())){
//                    try{
//                        resultJson = jieAnService.getPhonestatus(jieanxx.getTaskid(), bizData);
//                        String status = changeBairongPhonestatus(resultJson);
//                        jieanxx.setZhuangtai(status);
//                    }catch (Exception e){
//                        log.info("taskId={} : {}",jieanxx.getTaskid(),e.getMessage());
//                    }
//
//                }
//                if(StringUtils.isBlank(jieanxx.getShichang())){
//                    try{
//                        resultJson = jieAnService.getPhoneNetworkLength(jieanxx.getTaskid(), bizData);
//                        String length = changeBairongPhoneNetworkLength(resultJson);
//                        jieanxx.setShichang(length);
//                    }catch (Exception e){
//                        log.info("taskId={} : {}",jieanxx.getTaskid(),e.getMessage());
//                    }
//                }
//                jieanxxMapper.updateByExample(jieanxx,example);
//            } catch (Exception e) {
//                log.info("taskId={} : {}",jieanxx.getTaskid(),e.getMessage());
//            }
//        }
//    }
//
//
//    /**
//     * 三要素转换
//     * @param paramJson
//     * @return
//     */
//    /**
//     * 三要素转换
//     * @param paramJson
//     * @return
//     */
//    private static String changeBairongPhone3rdinfo(net.sf.json.JSONObject paramJson){
//        return paramJson.getString("respCode");
//    }
//
//    /**
//     * 在网状态转换
//     * @param paramJson
//     * @return
//     */
//    private static String changeBairongPhonestatus(net.sf.json.JSONObject paramJson){
//        String key=paramJson.getString("jsonStr");
//        com.alibaba.fastjson.JSONObject json = com.alibaba.fastjson.JSONObject.parseObject(key);
//        return json.getString("OUTPUT1");
//    }
//
//    /**
//     * 在网时间转换
//     * @param paramJson
//     * @return
//     */
//    private static String changeBairongPhoneNetworkLength(net.sf.json.JSONObject paramJson){
//        String key=paramJson.getString("jsonStr");
//        com.alibaba.fastjson.JSONObject json = com.alibaba.fastjson.JSONObject.parseObject(key);
//        return json.getString("OUTPUT1");
//    }
//
//
//
//    @Test
//    public void test4(){
//        JieanxxExample example = new JieanxxExample();
//        JieanxxExample.Criteria c =example.createCriteria().andTaskidIsNotNull();
//        List<Jieanxx> list = jieanxxMapper.selectByExample(example);
//        int i = 0;
//
//        for(Jieanxx jieanxx:list){
//            System.out.println(++i+"條");
//            example = new JieanxxExample();
//            c =example.createCriteria().andTaskidEqualTo(jieanxx.getTaskid());
//            try {
//                if(StringUtils.isNotBlank(jieanxx.getShichang())&&StringUtils.isBlank(jieanxx.getShichangstr())){
//                    String length = changeLengthByValue(jieanxx.getShichang());
//                    jieanxx.setShichangstr(length);
//                    jieanxxMapper.updateByExample(jieanxx,example);
//                }
//            } catch (Exception e) {
//                log.info("taskId={} : {}",jieanxx.getTaskid(),e.getMessage());
//            }
//        }
//    }
//
//    private static String changeLengthByValue(String length){
//        if(!length.contains(",")){
//            return "";
//        }
//        String[] month = length.split(",");
//        String start = "";
//        if(month[0].length()>1){
//            start = month[0].substring(1,month[0].length()).trim();
//        }
//        String end = "";
//        if(month[1].length()>1){
//            end = month[1].substring(0,month[1].length()-1).trim();
//        }
//        if(org.apache.commons.lang.math.NumberUtils.isNumber(end)){
//            Integer endMonth = Integer.parseInt(end);
//            if(endMonth<=6){
//                return "1";
//            }
//            if(endMonth<=12){
//                return "2";
//            }
//            if(endMonth<=24){
//                return "3";
//            }
//        }
//        if(org.apache.commons.lang.math.NumberUtils.isNumber(start)){
//            Integer startMonth = Integer.parseInt(start);
//            if(startMonth>=24){
//                return "4";
//            }
//        }
//        return "";
//    }
}
