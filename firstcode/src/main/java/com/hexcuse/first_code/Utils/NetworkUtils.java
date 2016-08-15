package com.hexcuse.first_code.Utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Hexcuse on 2016/8/15.
 *
 * @Package com.hexcuse.first_code.Utils.
 * @ClassName: ${CLASS_NAME}.
 * @Description: ${todo}(用一句话描述该文件做什么).
 */
public class NetworkUtils {

	private static ConnectivityManager mConnectivityManager;

	/**
	 * 得到网络信息
	 * @param context
	 * @return
	 */
	public static NetworkInfo getActiveNetworkInfo(Context context) {
		mConnectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
		return mConnectivityManager.getActiveNetworkInfo();
	}

	/**
	 * 判断网络是否可用
	 * @param context
	 * @return
	 */
	public static boolean isAvailable(Context context) {
		NetworkInfo info = getActiveNetworkInfo(context);
		return info != null && info.isAvailable();
	}

	/**
	 * 判断网络是否连接
	 * @param context
	 * @return
	 */
	public static boolean isConnect(Context context) {
		NetworkInfo info = getActiveNetworkInfo(context);
		return info != null && info.isConnected();
	}

}
