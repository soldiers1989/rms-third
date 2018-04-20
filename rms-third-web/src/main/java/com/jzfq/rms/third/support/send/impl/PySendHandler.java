package com.jzfq.rms.third.support.send.impl;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.mongo.PengYuan;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.common.utils.Base64;
import com.jzfq.rms.third.common.utils.CompressStringUtil;
import com.jzfq.rms.third.exception.BusinessException;
import com.jzfq.rms.third.support.send.AbstractSendHandler;
import org.apache.commons.lang3.StringUtils;
import org.codehaus.xfire.client.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.Arrays;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/25 15:40.
 **/
public class PySendHandler extends AbstractSendHandler {
    private static final Logger logger = LoggerFactory.getLogger(PySendHandler.class);
    /**
     * 发送
     *
     * @return
     */
    @Override
    public ResponseResult send() throws Exception {

        long start=System.currentTimeMillis();
        String queryInfo = reqData(this.getBizParams());
        String traceId = (String)this.getParams().get("traceId");
        logger.info("TraceId=["+traceId+"]开始获取鹏元数据......");
        //调用webservice
        String pyUrl =(String) this.getParams().get("url");
        if(StringUtils.isBlank(pyUrl)){
//            new BusinessException("鹏元获取车辆信息 接口URL为null",true);
            return new ResponseResult(traceId,ReturnCode.REQUEST_NO_PY_URL,ReturnCode.REQUEST_NO_PY_URL.msg());
        }
        Client client = new Client(new URL(pyUrl));
        String userName =(String) this.getParams().get("userName");
        String passWord =(String) this.getParams().get("passWord");
        //得到子报告结果
        logger.info("traceId=["+traceId+"]请求报文【"+queryInfo+"】");
        Object[] results = client.invoke("queryReport",new Object[]{userName,passWord,queryInfo,"xml"});
        logger.info("traceId=["+traceId+"]执行结束, 耗时[ "+(System.currentTimeMillis()-start)+" ]ms");


        return new ResponseResult(traceId,ReturnCode.REQUEST_SUCCESS,results);
    }

    /**
     * 初始化
     *
     * @param params
     * @param bizParams
     */
    @Override
    public void init(Map<String, Object> params, Map<String, Object> bizParams) {
        this.setParams(params);
        this.setBizParams(bizParams);
    }

    private String reqData(Map<String,Object> carInfo) {
        String type = carInfo.get("type").toString();
        if (Integer.parseInt(type) <= 9) {
            type = String.format("%02d", Integer.parseInt(type));
        }
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
        sb.append("<conditions>");
        sb.append("<condition queryType=\"25200\">");
        sb.append("<item>");
        sb.append("<name>name</name>");
        sb.append("<value>"+carInfo.get("name")+"</value>");
        sb.append("</item>");
        sb.append("<item>");
        sb.append("<name>documentNo</name>");
        sb.append("<value>"+carInfo.get("certCardNo")+"</value>");
        sb.append("</item>");
        sb.append("<item>");
        sb.append("<name>licenseNo</name>");
        sb.append("<value>"+carInfo.get("plateNo")+"</value>");
        sb.append("</item>");
        sb.append("<item>");
        sb.append("<name>carType</name>");
        sb.append("<value>"+type+"</value>");
        sb.append("</item>");
        sb.append("<item>");
        sb.append("<name>queryReasonID</name>");
        sb.append("<value>101</value>");
        sb.append("</item>");
        sb.append("<item>");
        sb.append("<name>subreportIDs</name>");
        sb.append("<value>13812</value>");//13816：全国个人车辆信息核查 13813：车辆状态查询，根据权限和需要进行提交  13814：机动车信息查询，根据权限和需要进行提交
        sb.append("</item>");
        sb.append("<item>");
        sb.append("<name>refID</name>");
        sb.append("<value></value>");
        sb.append("</item>");
        sb.append("</condition>");
        sb.append("</conditions>");

        return sb.toString();
    }
}
