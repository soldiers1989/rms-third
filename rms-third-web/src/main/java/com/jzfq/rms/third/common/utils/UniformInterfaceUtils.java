package com.jzfq.rms.third.common.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import java.util.List;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/10 19:50.
 **/
public class UniformInterfaceUtils {

    /**
     *
     */
    private static final String WEB_API_PARSED_PARAM = "uniform.interface.parsed.param";
    private static final Logger logger = LoggerFactory.getLogger(UniformInterfaceUtils.class);

    /**
     * 将请求中的参数构建为JSON数组
     * @param request
     * @return
     */
    public static JSONObject getParams(HttpServletRequest request) {
        JSONObject params = null;
        if (ServletFileUpload.isMultipartContent(request)) {
            return getMutipartParams(request);
        }
        try {
            String string = IOUtils.toString(request.getInputStream(), "UTF-8");
            params = JSON.parseObject(string);
        } catch (IOException e) {
            logger.error("读取客户端参数失败", e);
        }
        if (params == null) {
            params = new JSONObject();
        }
        @SuppressWarnings("unchecked")
        Enumeration<String> names = request.getParameterNames();
        while (names.hasMoreElements()) {
            String name = names.nextElement();
            String value = request.getParameter(name);
            if (value != null && !params.containsKey(name)) {
                params.put(name, value);
            }
        }
        request.setAttribute(WEB_API_PARSED_PARAM, params);
        return params;
    }

    /**
     * 获取请求中的字符串参数
     * @param request
     * @param name
     * @return
     */
    public static String getStringParam(HttpServletRequest request, String name) {
        Object param = request.getAttribute(WEB_API_PARSED_PARAM);
        if (param instanceof JSONObject) {
            return ((JSONObject) param).getString(name);
        }
        return getParams(request).getString(name);
    }
    /**
     * 解析上传文件请求MutipartRequest
     * @param request
     * @return
     */
    private static JSONObject getMutipartParams(HttpServletRequest request) {
        JSONObject params = new JSONObject();
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        try {
            List<FileItem> items = upload.parseRequest(request);
            for (FileItem item : items) {
                if (item.isFormField()) {
                    String name = item.getFieldName();
                    String value = item.getString();
                    params.put(name, value);
                } else {
                    String fieldName = item.getFieldName();
                    Object ori = params.get(fieldName);
                    if (ori == null) {
                        params.put(fieldName, item);
                    } else if (ori instanceof FileItem) {
                        JSONArray files = new JSONArray();
                        files.add(ori);
                        files.add(item);
                        params.put(fieldName, files);
                    } else if (ori instanceof JSONArray) {
                        ((JSONArray) ori).add(item);
                    }
                }
            }
        } catch (FileUploadException e) {
            logger.error("解析上传文件强求出错！", e);
        }
        return params;
    }


    public static final String PARAM_NAME_APPID = "appId";

    public static final String PARAM_NAME_APIID = "apiId";

    public static final String PARAM_NAME_TIMESTAMP = "timestamp";

    public static final String PARAM_NAME_TOKEN = "token";

    public static final String PARAM_NAME_APIVERSION = "v";

    /**
     *
     * @param appId
     * @param apiId
     * @param appSecret
     * @param timestamp
     * @return
     */
    public static String getToken(String appId, String apiId, String appSecret,  long timestamp) {
        return MD5Helper.encrypt(appId + appSecret + apiId + timestamp);
    }
}

class MD5Helper {
    private static final int MD5_LENGTH = 32;

    public static String encrypt(String str) {
        String sRes;
        try {
            MessageDigest alg = MessageDigest.getInstance("MD5");
            alg.update(str.getBytes("UTF-8"));
            byte[] digesta = alg.digest();
            sRes = byteToHex(digesta).toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5散列出错，不支持MD5算法！", e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("MD5散列出错，不支持UTF-8字符集！", e);
        }
        return sRes;
    }

    public static String byteToHex(byte[] bytes) {
        if (bytes == null) {
            return null;
        }
        StringBuilder hex = new StringBuilder(MD5_LENGTH);
        String temp;
        for (int i = 0; i < bytes.length; i++) {
            temp = Integer.toHexString(bytes[i] & 0XFF);
            if (1 == temp.length()) {
                hex.append('0');
            }
            hex.append(temp);
        }
        return hex.toString();
    }
}
