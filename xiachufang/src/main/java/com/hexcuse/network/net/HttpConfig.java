package com.hexcuse.network.net;

/**
 * Created by Hexcuse on 2016/8/24.
 *
 * @Package com.hexcuse.network.
 * @ClassName: ${CLASS_NAME}.
 * @Description: ${todo}(Http配置类).
 */
public abstract class HttpConfig {

	/**
	 * 聚合数据菜谱Key
	 */
	public static final String APPKEY = "ee25a316d352be12f2f1de16ed6d21cd";

	public String userAgent = "default";
	public int TimeOut = 10000;
	public int connTimeOut = 10000;
}
