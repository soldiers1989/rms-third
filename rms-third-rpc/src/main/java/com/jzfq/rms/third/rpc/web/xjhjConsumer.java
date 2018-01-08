package com.jzfq.rms.third.rpc.web;

import com.jzfq.rms.third.rpc.service.IXiaoJuHuiJinService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/12/27 16:06.
 **/
@RestController
@RequestMapping("/inter")
public class xjhjConsumer {
    @Resource
    IXiaoJuHuiJinService xjhjService;

    @RequestMapping( method= {RequestMethod.GET,RequestMethod.POST})
    public void isRpc(HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> map = new HashMap<>();
        map.put("certCardNo","140502198811102244");
        map.put("name","王亮222dre");
        map.put("phone","13986671110");
        map.put("orderNo","305582D");
        map.put("juzi",false);
        map.put("channelId","1");
        map.put("operationType","1");
        map.put("clientType","2");
        map.put("financialProductId","1");
        map.put("serialNo","1234");
        List apis = new ArrayList<String>();
        // bairong
        apis.add("1");
//         tongdun
//        apis.add("2");
        map.put("apiBox",apis);
        xjhjService.getTdAndBrData(map);
    }
}
