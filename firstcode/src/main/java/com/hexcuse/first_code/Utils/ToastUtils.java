package com.hexcuse.first_code.Utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Hexcuse on 2016/8/12.
 *
 * @Package com.hexcuse.first_code.Utils.
 * @ClassName: ${CLASS_NAME}.
 * @Description: ${todo}(用一句话描述该文件做什么).
 */
public class ToastUtils {

	private static Toast mToast = null;

	private static void showToast(Context context, String content) {
		if (mToast == null) {
			mToast = Toast.makeText(context, content, Toast.LENGTH_SHORT);
			mToast.show();
		} else {
			mToast.setText(content);
		}
	}


}
