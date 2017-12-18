package com.jzfq.rms.third.web.action.handler;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.support.gpj.impl.CarDetailModelObservable;
import com.jzfq.rms.third.web.action.auth.AbstractRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Map;

/**
 * 公平价车型库更新任务
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/23 19:56.
 **/
@Component("request1018Handler")
public class Request1018Handler extends AbstractRequestHandler {
    @Autowired
    private CarDetailModelObservable syncTask;

    /**
     * 检查业务参数是否合法，交由子类实现。
     *
     * @param params 请求中携带的业务参数
     * @return 合法返回true，否则返回false
     */
    @Override
    protected boolean checkParams(Map<String, Serializable> params) {
        return true;
    }

    /**
     * 业务处理，交由子类实现。
     *
     * @param request 请求实体
     * @return 响应
     */
    @Override
    protected ResponseResult bizHandle(AbstractRequest request) throws Exception {
        syncTask.sync();
        return new ResponseResult("doCarDetailModelTask",ReturnCode.REQUEST_SUCCESS);
    }
}
