package com.hexcuse.first_code.MyBroadCast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.hexcuse.first_code.MyService.MyService;
import com.hexcuse.first_code.Utils.ToastUtils;

/**
 * Created by Hexcuse on 2016/8/15.
 *
 * @Package com.hexcuse.first_code.MyBroadCast.
 * @ClassName: ${CLASS_NAME}.
 * @Description: ${todo}(用一句话描述该文件做什么).
 */
public class BootCompleteReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		ToastUtils.showToast(context, "Boot Complete");
		Intent intentservice = new Intent(context, MyService.class);
		context.startService(intentservice);
	}
}
