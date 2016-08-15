package com.hexcuse.first_code.MyBroadCast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.hexcuse.first_code.Utils.ToastUtils;

/**
 * Created by Hexcuse on 2016/8/12.
 *
 * @Package com.hexcuse.first_code.MyBroadCast.
 * @ClassName: ${CLASS_NAME}.
 * @Description: ${todo}(用一句话描述该文件做什么).
 */
public class MyBroadCast extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
//		if (NetworkUtils.isAvailable(context)) {
//			Log.i("network", "network is Available");
//			ToastUtils.showToast(context, "network is Available");
//		} else {
//			Log.i("network", "network is Unavailable");
//			ToastUtils.showToast(context, "network is Unavailable");
//		}
		ToastUtils.showToast(context, "com.hexcuse.first_code.MyBroadCast");
	}
}
