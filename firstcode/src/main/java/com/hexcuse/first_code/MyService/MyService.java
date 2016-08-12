package com.hexcuse.first_code.MyService;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Hexcuse on 2016/8/12.
 *
 * @Package com.hexcuse.first_code.MyService.
 * @ClassName: ${CLASS_NAME}.
 * @Description: ${todo}(用一句话描述该文件做什么).
 */
public class MyService extends Service{

	@Nullable
	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
}
