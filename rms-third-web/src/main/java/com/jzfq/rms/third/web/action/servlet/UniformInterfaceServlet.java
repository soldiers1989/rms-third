package com.jzfq.rms.third.web.action.servlet;

import com.alibaba.fastjson.JSONObject;
import com.jzfq.rms.third.common.dto.ResponseResult;
import com.jzfq.rms.third.common.utils.UniformInterfaceUtils;
import com.jzfq.rms.third.web.action.auth.AbstractRequestAuthentication;
import com.jzfq.rms.third.web.action.handler.AbstractRequestHandler;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/10 18:49.
 **/
public class UniformInterfaceServlet extends HttpServlet  {



    final protected static Logger logger = LoggerFactory.getLogger(UniformInterfaceServlet.class);
    /**
     * Destruction of the servlet. <br>
     */
    @Override
    public void destroy() {
        super.destroy();
    }

    /**
     * The doGet method of the servlet. <br>
     *
     * This method is called when a form has its tag value method equals to get.
     *
     * @param request the request send by the client to the server
     * @param response the response send by the server to the client
     * @throws ServletException if an error occurred
     * @throws IOException if an error occurred
     */
    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {
        JSONObject params = UniformInterfaceUtils.getParams(request);
        AbstractRequestAuthentication bizReq = null;
        ResponseResult bizResp = null;
        try {
            logger.debug("接收到来自[host:{}({}:{})]的请求",
                    new Object[] { request.getRemoteHost(), request.getRemoteAddr(),
                            request.getRemotePort() });
            bizReq = AbstractRequestAuthentication.fromHttpRequest(params);
        } catch (RuntimeException e) {
            if (e instanceof IllegalArgumentException) {
                logger.warn(e.getMessage() + " \tallParams：{}", params);
            } else {
                logger.warn("请求参数不合法，无法构建完整请求！allParams：{}", params, e);
            }
//            bizResp = ResponseResult.ERROR_INVALID_ARGS();
            bizResp = new ResponseResult();
        }
        if (bizReq != null) {
            logger.debug("解析到请求：{}", bizReq);
            bizResp = AbstractRequestHandler.handleRequest(bizReq,request.getServletContext());
        }
        logger.debug("响应：{}", bizResp);

        Serializable data = bizResp.getData()==null?null:(Serializable)bizResp.getData();
        if (data instanceof File) {
            File f = (File) data;
            InputStream in = new FileInputStream(f);
            try {
                responseDataStreamAndClose(response, in, (int) f.length(),
                        f.getName());
            } finally {
                FileUtils.deleteQuietly(f);
            }
        } else if (data instanceof byte[]) {
            byte[] bytes = (byte[]) data;
            InputStream in = new ByteArrayInputStream(bytes);
            responseDataStreamAndClose(response, in, bytes.length, "data");
        } else {
            response.setContentType("application/json;charset=utf-8");
            PrintWriter out = response.getWriter();
            out.print(bizResp.toJsonString());
            out.flush();
            out.close();
        }
        logger.debug("响应完成。");
    }


    /**
     * The doPost method of the servlet. <br>
     *
     * This method is called when a form has its tag value method equals to post.
     *
     * @param request the request send by the client to the server
     * @param response the response send by the server to the client
     * @throws ServletException if an error occurred
     * @throws IOException if an error occurred
     */
    @Override
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    private void responseDataStreamAndClose(HttpServletResponse response,
                                            InputStream in, int length, String fileName) throws IOException {
        if (StringUtils.endsWithIgnoreCase(fileName, ".pdf")) {
            response.setContentType("application/pdf");
            response.addHeader("Content-Disposition",
                    "inline;filename=" + URLEncoder.encode(fileName, "iso8859-1"));
        } else {
            response.setContentType("application/octet-stream");
            response.addHeader("Content-Disposition", "attachment;filename="
                    + URLEncoder.encode(fileName, "iso8859-1"));
        }
        response.setContentLength(length);
        response.addHeader("Content-Length", String.valueOf(length));

        try {
            OutputStream out = response.getOutputStream();
            IOUtils.copy(in, out);
            out.flush();
            out.close();
        } finally {
            IOUtils.closeQuietly(in);
        }
    }

    /**
     * Initialization of the servlet. <br>
     *
     * @throws ServletException if an error occurs
     */
    @Override
    public void init() throws ServletException {
        String appKey = getInitParameter("appKey");
        AbstractRequestAuthentication.setCurrentApp(appKey);
        String requestPackage = getInitParameter("requestPackage");
        AbstractRequestAuthentication.setRequestPackage(requestPackage);
    }

}
