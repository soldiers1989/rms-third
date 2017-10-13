package com.jzfq.rms.third.web.action.handler;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.service.IGongPingjiaService;
import com.jzfq.rms.third.web.action.auth.AbstractRequestAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/10 21:28.
 **/
@Component("requestS000Handler")
public class RequestS000Handler extends AbstractRequestHandler{

    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        return true;
    }

    @Override
    protected ResponseResult bizHandle(AbstractRequestAuthentication request) throws RuntimeException {
        return null;
    }
}
