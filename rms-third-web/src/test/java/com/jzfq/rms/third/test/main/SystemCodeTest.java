package com.jzfq.rms.third.test.main;

import com.jzfq.rms.third.common.domain.TSysCode;
import com.jzfq.rms.third.common.domain.TSysConfig;
import com.jzfq.rms.third.persistence.mapper.TSysCodeMapper;
import com.jzfq.rms.third.persistence.mapper.TSysConfigMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.UUID;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/15 12:16.
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class SystemCodeTest {
    @Autowired
    TSysCodeMapper tSysCodeMapper;
    @Autowired
    TSysConfigMapper tTSysConfigMapper;

    @Test
    public void test(){
//        TSysCode code = tSysCodeMapper.selectByPrimaryKey("000001");
//        System.out.println(code);
//        TSysConfig config = new TSysConfig();
//        config.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
//        config.setcKey("com.jzfq.rms.third.url.pengyuan.pycredit");
//        config.setcValue("http://test.pycredit.com:9001/services/WebServiceSingleQuery?wsdl");
//        config.setcLevel("1");
//        config.setcDescription("鹏元pycredit接口");
//        config.setcDel("0");
//        config.setcCreateUser("init");
//        config.setDtCreateTime(new Date());
//        tTSysConfigMapper.insert(config);
//        TSysConfig config = new TSysConfig();
//        config.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
//        config.setcKey("com.jzfq.rms.third.url.jxl.accessreportstatus");
//        config.setcValue("https://www.juxinli.com/api/v2/job/access_jobs_status_by_user_info");
//        config.setcLevel("1");
//        config.setcDescription("获取聚信立报告状态");
//        config.setcDel("0");
//        config.setcCreateUser("init");
//        config.setDtCreateTime(new Date());
//        tTSysConfigMapper.insert(config);
//        TSysConfig config = new TSysConfig();
//        config.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
//        config.setcKey("com.jzfq.rms.third.url.jxl.accessreportdata");
//        config.setcValue("https://www.juxinli.com/api/access_report_data");
//        config.setcLevel("1");
//        config.setcDescription("获取聚信立用户报告");
//        config.setcDel("0");
//        config.setcCreateUser("init");
//        config.setDtCreateTime(new Date());
//        tTSysConfigMapper.insert(config);

//        TSysConfig config = new TSysConfig();
//        config.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
//        config.setcKey("com.jzfq.rms.third.url.jxl.accessrawdata");
//        config.setcValue("https://www.juxinli.com/api/access_raw_data");
//        config.setcLevel("1");
//        config.setcDescription("获取聚信立移动运营商数据");
//        config.setcDel("0");
//        config.setcCreateUser("init");
//        config.setDtCreateTime(new Date());
//        tTSysConfigMapper.insert(config);

//        TSysConfig config = new TSysConfig();
//        config.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
//        config.setcKey("com.jzfq.rms.third.url.jxl.accesstoken");
//        config.setcValue("https://www.juxinli.com/api/access_report_token");
//        config.setcLevel("1");
//        config.setcDescription("获取聚信立安全凭证");
//        config.setcDel("0");
//        config.setcCreateUser("init");
//        config.setDtCreateTime(new Date());
//        tTSysConfigMapper.insert(config);

//        TSysConfig config = new TSysConfig();
//        config.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
//        config.setcKey("com.jzfq.rms.third.url.jxl.accessbusirawdata");
//        config.setcValue("https://www.juxinli.com/api/access_e_business_raw_data");
//        config.setcLevel("1");
//        config.setcDescription("获取聚信立电商数据");
//        config.setcDel("0");
//        config.setcCreateUser("init");
//        config.setDtCreateTime(new Date());
//        tTSysConfigMapper.insert(config);
//        TSysConfig config = new TSysConfig();
//        config.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
//        config.setcKey("com.jzfq.rms.third.url.td.logintdscore");
//        config.setcValue("http://dev2.fraud.juzifenqi.com/fraud/tdscore.json?mobile=%s");
//        config.setcLevel("1");
//        config.setcDescription("查询同盾登录决策分");
//        config.setcDel("0");
//        config.setcCreateUser("init");
//        config.setDtCreateTime(new Date());
//        tTSysConfigMapper.insert(config);

//        TSysConfig config = new TSysConfig();
//        config.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
//        config.setcKey("com.jzfq.rms.third.url.td.addtdfraudblack");
//        config.setcValue("http://dev2.fraud.juzifenqi.com/fraud/addblack.json");
//        config.setcLevel("1");
//        config.setcDescription("同盾反欺诈加黑接口");
//        config.setcDel("0");
//        config.setcCreateUser("init");
//        config.setDtCreateTime(new Date());
//        tTSysConfigMapper.insert(config);

//        TSysConfig config = new TSysConfig();
//        config.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
//        config.setcKey("gongpingjia.detail.model.apiUrl");
//        config.setcValue("http://openapi.gongpingjia.com/api/modeldetail/lastupdated/");
//        config.setcLevel("1");
//        config.setcDescription("公平价更新车型库接口");
//        config.setcDel("0");
//        config.setcCreateUser("init");
//        config.setDtCreateTime(new Date());
//        tTSysConfigMapper.insert(config);

        TSysConfig config = new TSysConfig();
        config.setcId(UUID.randomUUID().toString().replaceAll("-", ""));
        config.setcKey("gongpingjia.evaluation.apiUrl");
        config.setcValue("https://apigw.gongpingjia.com/api/cars/evaluation/juzi/");
        config.setcLevel("1");
        config.setcDescription("公平价更新车型库接口");
        config.setcDel("0");
        config.setcCreateUser("init");
        config.setDtCreateTime(new Date());
        tTSysConfigMapper.insert(config);
    }
}
