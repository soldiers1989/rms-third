package com.jzfq.rms.third.support.response;

import com.jzfq.rms.third.web.action.UniformInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/23 21:00.
 **/
public abstract class AbstractResponseHandler implements IResponseHandler{

    final protected static Logger logger = LoggerFactory.getLogger(UniformInterface.class);
    /**
     * 默认类路径
     */
    protected static final String DEFAULT_BASE_PACKAGE = "com.jzfq.rms.third.support.response.impl";
    /**
     * 处理参数
     */
    protected Map<String,Object> params;


    public static String getDefaultBasePackage(){
        return DEFAULT_BASE_PACKAGE;
    }


}