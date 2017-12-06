package com.jzfq.rms.third.test;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.service.ITdDataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/12/5 18:29.
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class TdBodyTest {
    @Autowired
    ITdDataService tdDataService;
    @Test
    public void test(){
        Map<String, Object> params = new HashMap<String, Object>();
//        params.put("company_type", "私营");
//        params.put("coborrower_home_address", "浙江省杭州市西湖区古荡新村2幢201");
//        params.put("career", "半专业人员");
//        params.put("occupation", "见习专员");
//        params.put("contact3_relation", "test");
//        params.put("customer_channel", "test");
//        params.put("contact5_name", "test");
//        params.put("work_phone", "0571-111111111");
//        params.put("surety_name", "刘能");
//        params.put("contact1_id_number", "test");
//        params.put("contact5_id_number", "test");
//        params.put("loan_purpose", "车贷");
//        params.put("coborrower_id_number", "321282555555555555");
//        params.put("coborrower_phone", "0571-10101010");
//        params.put("surety_phone", "0571-222222222");
//        params.put("trueip_address", "test");
//        params.put("recent1month_contact_sms_in_count", "1.0");
//        params.put("token_id", "test");
//        params.put("house_property", "有房");
//        params.put("contact2_id_number", "test");
//        params.put("diploma", "研究生");
//        params.put("annual_income", "100000-200000");
//        params.put("call_in_silent_recent1_time_to_now", "1.0");
        params.put("id_number", "370404199006301915");
//        params.put("surety_id_number", "321282333333333333");
//        params.put("card_number", "6333380402564890000");
//        params.put("contact1_mobile", "test");
//        params.put("account_phone", "0571-42331233");
//        params.put("loan_amount", "10000");
//        params.put("qq_number", "313131313");
//        params.put("monthly_income", "12000以上");
//        params.put("apply_province", "四川");
//        params.put("surety_mobile", "15223456789");
//        params.put("contact4_relation", "test");
//        params.put("contact5_mobile", "test");
//        params.put("recent6month_contact_call_out_count", "1.0");
//        params.put("loan_term", "12");
        params.put("account_mobile", "15961718173");
//        params.put("organization_address", "浙江省杭州市阿里巴巴西溪园区");
//        params.put("contact3_mobile", "test");
//        params.put("work_time", "1年以下");
//        params.put("contact3_id_number", "test");
//        params.put("contact3_name", "test");
//        params.put("coborrower_name", "王五");
//        params.put("loan_date", "2015-11-19");
//        params.put("applyer_type", "在职");
//        params.put("is_cross_loan", "否");
//        params.put("recent6month_call_in_mobile_time_ratio", "1.0");
//        params.put("industry", "金融业");
//        params.put("surety_company_address", "浙江省杭州市下城区潮王路18号");
//        params.put("contact2_name", "test");
//        params.put("resp_detail_type", "test");
//        params.put("apply_city", "成都");
//        params.put("recent6month_contact_call_other_count", "1.0");
//        params.put("account_email", "212121212@qq.com");
//        params.put("surety_home_address", "浙江省杭州市西湖区古荡新村");
//        params.put("recent1month_sms_in_late_night_time_count", "1.0");
//        params.put("home_address", "浙江省杭州市西湖区古荡新村2幢101");
//        params.put("marriage", "未婚");
        params.put("account_name", "皮晴晴");
//        params.put("contact5_relation", "test");
//        params.put("house_type", "商品房");
//        params.put("contact_address", "浙江省杭州市西湖区古荡新村2幢101");
//        params.put("contact1_name", "test");
//        params.put("contact4_id_number", "test");
//        params.put("contact2_relation", "test");
//        params.put("coborrower_mobile", "17012345678");
//        params.put("apply_channel", "app申请");
//        params.put("contact4_name", "test");
//        params.put("ip_address", "test");
//        params.put("coborrower_company_address", "杭州市江干区2号大街928号");
//        params.put("graduate_school", "南京大学");
//        params.put("contact1_relation", "test");
//        params.put("contact4_mobile", "test");
//        params.put("recent6month_contact_call_telephone_count", "1.0");
//        params.put("organization", "阿里巴巴西溪园区");
//        params.put("recent6month_call_overdue_count", "1.0");
//        params.put("contact2_mobile", "test");
//        params.put("recent6month_call_in_late_night_time_count", "1.0");
//        BodyGuardApiResponse bodyGuardApiResponse = new BodyGuardApiInvoker(new StringBuilder().append("https://apitest.tongdun.cn/bodyguard/apply/v4").append("?partner_code=").append(PARTNER_CODE).append("&partner_key=").append(PARTNER_KEY).append("&app_name=").append(PARTNER_APP).toString()).invoke(params);
//        System.out.println(bodyGuardApiResponse.toString());
        ResponseResult responseResult = tdDataService.getTdBodyGuard("jzfq_ios",params);
        System.out.println(responseResult);
    }
}
