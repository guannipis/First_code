package com.hexcuse.network.net;

/**
 * Created by Hexcuse on 2016/8/23.
 *
 * @Package com.hexcuse.network.net.
 * @ClassName: ${CLASS_NAME}.
 * @Description: ${todo}(用一句话描述该文件做什么).
 */
public interface HttpStack {

	/**
	 * 执行HTTP请求
	 */
	public Response performRequest(Request<?> request);

}
