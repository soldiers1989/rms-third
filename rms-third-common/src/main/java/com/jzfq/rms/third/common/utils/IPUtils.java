package com.jzfq.rms.third.common.utils;


import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017/10/23 13:28.
 **/
public class IPUtils {

    private static final Logger logger = LoggerFactory.getLogger(IPUtils.class);

    private static String ip = "";

    private static String localIp = "127.0.0.1";

    public static String getLocalHostIP() {
        if(StringUtils.isNotBlank(ip)){
            return ip;
        }
        Enumeration<NetworkInterface> en = null;
        try {
            en = NetworkInterface
                    .getNetworkInterfaces();
            while (en.hasMoreElements()) {
                NetworkInterface inter = en.nextElement();
                ip = getLocalHostIP(inter);
                if(StringUtils.isNotBlank(ip)){
                    break;
                }
            }
        } catch (SocketException e) {
//            e.printStackTrace();
            logger.info(e.getMessage());
        }
        return ip;
    }

    private static String getLocalHostIP(NetworkInterface inter)
            throws SocketException {
        if (inter.isUp()) {
            List<InterfaceAddress> list = inter.getInterfaceAddresses();
            Iterator<InterfaceAddress> it = list.iterator();
            while (it.hasNext()) {
                InterfaceAddress address = it.next();
                String ip = address.getAddress().getHostAddress();
                if(!StringUtils.contains(ip,":")&&!StringUtils.equals(ip,localIp)){
                    return ip;
                }
            }
        }
        return "";
    }
}
