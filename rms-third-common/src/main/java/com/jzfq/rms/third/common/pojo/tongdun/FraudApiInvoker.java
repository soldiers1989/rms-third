
package com.jzfq.rms.third.common.pojo.tongdun;

import com.alibaba.fastjson.JSON;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 查询同盾分的方法
 * @author 大连桔子分期科技有限公司
 * @date   2016/12/1. 下午4:04:55
 */
public class FraudApiInvoker {

    private final Log log = LogFactory.getLog("postLogger");
    private static String apiUrl = "";
    private PoolingHttpClientConnectionManager connMgr;
    private RequestConfig requestConfig;

    public FraudApiInvoker(String url) {
        apiUrl = url;
        // 设置连接池
        connMgr = new PoolingHttpClientConnectionManager();
        // 设置连接池大小
        connMgr.setMaxTotal(50);
        connMgr.setDefaultMaxPerRoute(connMgr.getMaxTotal());

        RequestConfig.Builder configBuilder = RequestConfig.custom();
        // 设置连接超时
        configBuilder.setConnectTimeout(1500);      // 原为都为500，现改成1500
        // 设置读取超时
        configBuilder.setSocketTimeout(1500);
        // 设置从连接池获取连接实例的超时
        configBuilder.setConnectionRequestTimeout(1500);
        // 在提交请求之前 测试连接是否可用
        configBuilder.setStaleConnectionCheckEnabled(true);
        requestConfig = configBuilder.build();
    }

    public FraudApiResponse invoke(Map<String, Object> params) throws Exception {
        CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(createSSLConnSocketFactory()).setConnectionManager(connMgr).setDefaultRequestConfig(requestConfig).build();
        HttpPost httpPost = new HttpPost(apiUrl);
        CloseableHttpResponse response = null;
        HttpEntity entity;

        try {
            httpPost.setConfig(requestConfig);
            List<NameValuePair> pairList = new ArrayList<NameValuePair>(params.size());
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                NameValuePair pair = new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue()));
                pairList.add(pair);
            }
            httpPost.setEntity(new UrlEncodedFormEntity(pairList, Charset.forName("utf-8")));
            response = httpClient.execute(httpPost);
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK) {
                log.warn("[FraudApiInvoker] invoke failed, response status: " + statusCode);
                return null;
            }
            entity = response.getEntity();
            if (entity == null) {
                log.warn("[FraudApiInvoker] invoke failed, response output is null!");
                return null;
            }
            String result = EntityUtils.toString(entity, "utf-8");
            return JSON.parseObject(result, FraudApiResponse.class);
        } catch (Exception e) {
            log.error("[FraudApiInvoker] invoke throw exception, details: ", e);
            throw e;
        } finally {
            if (response != null) {
                EntityUtils.consume(response.getEntity());
            }
        }
    }

    private SSLConnectionSocketFactory createSSLConnSocketFactory() {
        SSLConnectionSocketFactory sslsf = null;
        try {
            SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {

                public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                    return true;
                }
            }).build();
            sslsf = new SSLConnectionSocketFactory(sslContext, new X509HostnameVerifier() {

                @Override
                public boolean verify(String arg0, SSLSession arg1) {
                    return true;
                }

                @Override
                public void verify(String host, SSLSocket ssl) throws IOException {
                }

                @Override
                public void verify(String host, X509Certificate cert) throws SSLException {
                }

                @Override
                public void verify(String host, String[] cns, String[] subjectAlts) throws SSLException {
                }
            });
        } catch (GeneralSecurityException e) {
            log.error(e.getMessage(), e);
        }
        return sslsf;
    }

    public static void main(String[] args) throws Exception {
        String url = "https://apitest.tongdun.cn/riskService";

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("partner_code", "bestfenqi");// 此处值填写您的合作方标识
        params.put("secret_key", "b1d08f4a76ae401ba25a11f73f45315c");// 此处填写对应app密钥
        params.put("event_id", "loan_professional_web");// 此处填写策略集上的事件标识
        //params.put("token_id", "your_token_id_to_send_to_api");//此处填写设备指纹服务的会话标识，和部署设备脚本的token一致
        params.put("account_login", "your_login_name");// 以下填写其他要传的参数，比如系统字段，扩展字段
        params.put("ip_address", "your_login_ip");
        FraudApiResponse apiResp = new FraudApiInvoker(url).invoke(params);
        System.out.println("结果如何：" + apiResp.getSuccess());
        System.out.println("-----------------");
        System.out.println(apiResp.toString());
        for (HitRule item:apiResp.getHit_rules()) {
            System.out.println("----score= " + item.getScore() + "  -----");
        }
        System.out.println("-----------------");
        System.out.println(apiResp.getReason_code());
    }

    public static void heartbeat() {
        String url = "https://apitest.tongdun.cn/riskService";
        final com.jzfq.rms.mongo.FraudApiInvoker invoker = new com.jzfq.rms.mongo.FraudApiInvoker(url);
        final Map<String, Object> params = new HashMap<String, Object>();
        params.put("partner_code", "bestfenqi");
        params.put("secret_key", "heartbeat");
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        invoker.invoke(params);
                        Thread.sleep(60000);
                    } catch (InterruptedException | IOException e) {
                        break;
                    }
                }
            }
        }, "FraudApiInvoker Heartbeat Thread").start();
    }
}
