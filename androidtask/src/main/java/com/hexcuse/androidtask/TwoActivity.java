package com.hexcuse.androidtask;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by Hexcuse on 2016/8/15.
 *
 * @Package com.hexcuse.androidtask.
 * @ClassName: ${CLASS_NAME}.
 * @Description: ${todo}(用一句话描述该文件做什么).
 */
public class TwoActivity extends Activity{

	private final String TAG = getClass().getSimpleName();
	private final int TASK = getTaskId();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		((TextView)findViewById(R.id.tv)).setText(getClass().getSimpleName());
		Log.d(TAG, String.valueOf(TASK));
	}


}
