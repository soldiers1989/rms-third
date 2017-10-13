package com.jzfq.rms.third.common.httpclient;

import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.protocol.HttpContext;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;

/**
 * http Socket创建类
 * @ClassName:  MyPlainSocketFactory
 * @author 大连桔子分期科技有限公司
 */
public class MyPlainSocketFactory extends PlainConnectionSocketFactory {

	@Override
	public Socket createSocket(final HttpContext context) throws IOException {
		InetSocketAddress socksAddr = (InetSocketAddress) context
				.getAttribute("socks.address");
		if (socksAddr != null) {
			Proxy proxy = new Proxy(Proxy.Type.SOCKS, socksAddr);
			return new Socket(proxy);
		}
		return new Socket();
	}
}
