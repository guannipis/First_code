package com.hexcuse.network.net;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Hexcuse on 2016/8/24.
 *
 * @Package com.hexcuse.network.net.
 * @ClassName: ${CLASS_NAME}.
 * @Description: ${todo}(用一句话描述该文件做什么).
 */
public class HttpUrlConnStack implements HttpStack{

	private HttpUrlConfig mHttpUrlConfig = HttpUrlConfig.getConfig();

	@Override
	public Response performRequest(Request<?> request) {
		HttpURLConnection mConnection = null;
		try {
			mConnection = createUrlConnection(request.getUrl());
			mConnection.setRequestMethod(request.getHttpMethod().toString());


		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (mConnection != null) {
				mConnection.disconnect();
			}
		}
		return null;
	}

	private HttpURLConnection createUrlConnection(String url) throws IOException{
		URL newURl = new URL(url);
		URLConnection urlConnection = newURl.openConnection();
		urlConnection.setReadTimeout(mHttpUrlConfig.TimeOut);
		urlConnection.setConnectTimeout(mHttpUrlConfig.connTimeOut);
		urlConnection.setDoInput(true);
		urlConnection.setUseCaches(false);
		return (HttpURLConnection) urlConnection;
	}

}
