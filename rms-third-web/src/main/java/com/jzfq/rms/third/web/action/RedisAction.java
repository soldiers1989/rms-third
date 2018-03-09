package com.jzfq.rms.third.web.action;

import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.enums.ReturnCode;
import com.jzfq.rms.third.exception.BusinessException;
import com.jzfq.rms.third.support.cache.ICache;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2018/2/11 11:47.
 **/
@RestController
@RequestMapping(value = "/system/redis")
public class RedisAction {
    @Autowired
    ICache prefixCache;
    private static String STR_REDIS_DEL_SECRET = "redisClearCount";

    @RequestMapping(value = "del.json", method = RequestMethod.GET)
    public ResponseResult deleteAll(String secret) throws BusinessException {
        if (StringUtils.equals(STR_REDIS_DEL_SECRET, secret)) {
            prefixCache.batchDel("rms_third_10");
            return new ResponseResult("", ReturnCode.REQUEST_SUCCESS, null);
        }
        return new ResponseResult("", ReturnCode.ERROR_INVALID_ARGS, null);
    }

    @RequestMapping(value = "deleteByKey.json", method = RequestMethod.GET)
    public ResponseResult deleteByKey(String secret, String key) throws BusinessException {
        if (StringUtils.equals(STR_REDIS_DEL_SECRET, secret)) {
            prefixCache.batchDel("rms_third_10" + key);
            return new ResponseResult("", ReturnCode.REQUEST_SUCCESS, null);
        }
        return new ResponseResult("", ReturnCode.ERROR_INVALID_ARGS, null);
    }

    @RequestMapping(value = "deleteLikeKey.json", method = RequestMethod.GET)
    public ResponseResult deleteLikeKey() throws BusinessException {
        try {
            File file = new File("/data/redis/redis.txt");//txt文件
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s = null;
            while ((s = br.readLine()) != null) {//使用readLine方法，一次读一行
                System.out.println(s);
                if (!"".equals(s)) {
                    prefixCache.batchDel(s);
                }
            }
            br.close();
            ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseResult("", ReturnCode.ACTIVE_SUCCESS, null);
    }

}
