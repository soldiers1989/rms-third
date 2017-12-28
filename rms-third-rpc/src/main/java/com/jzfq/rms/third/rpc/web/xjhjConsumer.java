package com.jzfq.rms.third.rpc.web;

import com.jzfq.rms.third.rpc.service.IXiaoJuHuiJinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

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
    public void isRpc(){
        xjhjService.getTdAndBrData(new HashMap<>());
    }
}
