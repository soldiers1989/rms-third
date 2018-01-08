package com.jzfq.rms.third.rpc.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.client.RmsThirdService;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.rpc.service.IXiaoJuHuiJinService;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/12/26 19:08.
 **/
public class XiaoJuHuiJinServiceImpl implements IXiaoJuHuiJinService{

    @Override
    public ResponseResult getTdAndBrData(Map<String, Object> requestParams) {
        try {
            RmsThirdService rmsThirdService = new RmsThirdService("http://192.168.162.27:8099/inter");
            ResponseResult dto = rmsThirdService.sendAndHandleRespose((String)requestParams.get("serialNo"),"36","","1019","01", requestParams);
            return dto;
        }catch (Exception e){
            System.out.println(e);
        }
        return null;

    }

    /**
     * 获取同盾百融数据
     *
     * @param requestParams
     * @return
     */
    @Override
    public ResponseResult getTdAndBrData(JSONObject requestParams) {
        return null;
    }
}
