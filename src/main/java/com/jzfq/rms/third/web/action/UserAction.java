package com.jzfq.rms.third.web.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.jzfq.rms.third.bean.ResponseResult;
import com.jzfq.rms.third.constant.ResponseCode;
import com.jzfq.rms.third.exception.BusinessException;
import com.jzfq.rms.third.bean.User;
import com.jzfq.rms.third.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017年9月05日 20:04:55
 */
@RestController
@RequestMapping(value = "/inner")
public class UserAction {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/user/list")
    public ResponseResult getUserList(String traceID) throws Exception {
        return new ResponseResult(traceID, ResponseCode.REQUEST_SUCCESS, "正常调用", userService.getUserList());
    }

    @RequestMapping(value = "/user/get")
    public ResponseResult getUser(String traceID, String params) throws Exception {
        if (StringUtils.isNotBlank(params)) {
            Map<String, String> paramsMap = JSON.parseObject(params, new TypeReference<Map<String, String>>() {});
            String userID = paramsMap.get("userID");

            if (StringUtils.isNotBlank(userID)) {
                User user = userService.getUser(Long.parseLong(userID));
                return new ResponseResult(traceID, ResponseCode.REQUEST_SUCCESS, "正常调用", user);
            } else {
                throw new BusinessException(-1, "userID不能为空", true);
            }
        } else {
            throw new BusinessException(-1, "业务参数不能为空", true);
        }
    }


    @RequestMapping(value = "/user/insert")
    public ResponseResult insertUser(String traceID, String params) throws Exception {
        if (StringUtils.isNotBlank(params)) {
            User user = JSON.parseObject(params, new TypeReference<User>() {});
            long userID = userService.insertUser(user);
            return new ResponseResult(traceID, ResponseCode.REQUEST_SUCCESS, "正常调用", userID);
        } else {
            throw new BusinessException(-1, "业务参数不能为空", true);
        }
    }

    @RequestMapping(value = "/user/update")
    public ResponseResult updateUser(String traceID, String params) throws Exception {
        if (StringUtils.isNotBlank(params)) {
            User user = JSON.parseObject(params, new TypeReference<User>() {});
            if (user != null && user.getUserID() != 0L) {
                userService.updateUser(user);
                return new ResponseResult(traceID, ResponseCode.REQUEST_SUCCESS, "正常调用");
            } else {
                throw new BusinessException(-1, "userID不能为空", true);
            }
        } else {
            throw new BusinessException(-1, "业务参数不能为空", true);
        }
    }

    @RequestMapping(value = "/user/delete")
    public ResponseResult deleteUser(String traceID, String params) throws Exception {
        if (params != null && !params.trim().isEmpty()) {
            Map<String, String> paramsMap = JSON.parseObject(params, new TypeReference<Map<String, String>>() {});
            String userID = paramsMap.get("userID");

            if (userID != null && !userID.trim().isEmpty()) {
                userService.deleteUser(Long.parseLong(userID));
                return new ResponseResult(traceID, ResponseCode.REQUEST_SUCCESS, "正常调用");
            } else {
                throw new BusinessException(-1, "userID不能为空", true);
            }
        } else {
            throw new BusinessException(-1, "业务参数不能为空", true);
        }
    }
}