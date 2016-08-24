package com.hexcuse.network.net;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hexcuse on 2016/8/23.
 *
 * @Package com.hexcuse.network.net.
 * @ClassName: ${CLASS_NAME}.
 * @Description: ${todo}(用一句话描述该文件做什么).
 */
public abstract class Request<T> {

	public static enum HttpMethod {

		GET("GET"),
		POST("POST");

		private String mHttpMethod = "";

		private HttpMethod(String Method) {
			mHttpMethod = Method;
		}

		@Override
		public String toString() {
			return mHttpMethod;
		}
	}

	/**
	 * 编码格式
	 */
	public static final String DEFAULT_PARAMS_ENCODING = "UTF-8";

	/**
	 * Http头部类型
	 */
	public static final String HEADER_CONTENT_TYPE = "Content-Type";

	/**
	 * 是否取消
	 */
	protected boolean isCancel = false;

	/**
	 * 是否缓存
	 */
	protected boolean isCache = true;

	/**
	 * 网络请求回调
	 */
	protected RequestCallback<T> mTRequestCallback;

	/**
	 * 请求的URL
	 */
	private String Url = "";

	/**
	 * 请求的http方法,默认是post方法
	 */
	private HttpMethod mHttpMethod = HttpMethod.POST;

	/**
	 * Http请求头
	 */
	private Map<String, Object> headerMap = new HashMap<>();

	/**
	 * 请求参数
	 */
	private Map<String, Object> bodyMap = new HashMap<>();

	public Request(HttpMethod method, String url, RequestCallback<T> requestCallback){
		mHttpMethod = method;
		Url = url;
		mTRequestCallback = requestCallback;
	}

	public void cancleRequest() {
		isCancel = true;
	}

	public void addHeader(String name, String value) {
		headerMap.put(name, value);
	}

	public String getUrl() {
		return Url;
	}

	public boolean isCancel() {
		return isCancel;
	}

	public void setCancel(boolean cancel) {
		isCancel = cancel;
	}

	public boolean isCache() {
		return isCache;
	}

	public void setCache(boolean cache) {
		isCache = cache;
	}

	public Map<String, Object> getHeaderMap() {
		return headerMap;
	}

	public void setHeaderMap(Map<String, Object> headerMap) {
		this.headerMap = headerMap;
	}

	public Map<String, Object> getBodyMap() {
		return bodyMap;
	}

	public void setBodyMap(Map<String, Object> bodyMap) {
		this.bodyMap = bodyMap;
	}

	public HttpMethod getHttpMethod() {
		return mHttpMethod;
	}

	public void setHttpMethod(HttpMethod httpMethod) {
		mHttpMethod = httpMethod;
	}
}
