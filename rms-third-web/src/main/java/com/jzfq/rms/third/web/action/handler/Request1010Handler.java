package com.jzfq.rms.third.web.action.handler;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.web.action.auth.AbstractRequestAuthentication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Map;

/**
 * 同盾预留
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/17 14:16.
 **/
@Component("request1010Handler")
public class Request1010Handler extends AbstractRequestHandler{
    private static final Logger log = LoggerFactory.getLogger("TongDun 1010");
    /**
     * 检查业务参数是否合法，交由子类实现。
     *
     * @param params 请求中携带的业务参数
     * @return 合法返回true，否则返回false
     */
    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        return false;
    }

    /**
     * 业务处理，交由子类实现。
     *
     * @param request 请求实体
     * @return 响应
     */
    @Override
    protected ResponseResult bizHandle(AbstractRequestAuthentication request) throws RuntimeException {
        return null;
    }
}
