package com.hexcuse.first_code;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.hexcuse.first_code.MyBroadCast.MyBroadCast;

public class MainActivity extends AppCompatActivity {

//	private IntentFilter mIntentFilter;
//	private String action = "android.net.conn.CONNECTIVITY_CHANGE";
	private String action = "com.hexcuse.first_code.MyBroadCast";
	private MyBroadCast mMyBroadCast;



	private final String TAG = getClass().getSimpleName();

	private LocalBroadcastManager mLocalBroadcastManager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mLocalBroadcastManager = LocalBroadcastManager.getInstance(this);
		mMyBroadCast = new MyBroadCast();
		IntentFilter intentFilter = new IntentFilter(action);
		mLocalBroadcastManager.registerReceiver(mMyBroadCast, intentFilter);
//		initView();
	}

	private void setBroadCast() {
//		mMyBroadCast = new MyBroadCast();
//		mIntentFilter = new IntentFilter();
//		mIntentFilter.addAction(action);
//		registerReceiver(mMyBroadCast, mIntentFilter);

		/**
		 * 发送自定义广播
		 */

		Intent intent = new Intent(action);
//		mLocalBroadcastManager.sendBroadcast(intent);
		sendBroadcast(intent);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i(TAG, "onDestroy");
		unregisterReceiver(mMyBroadCast);
	}

	public void FirstClick(View view) {
		switch (view.getId()) {
			case R.id.btn:
				setBroadCast();
				break;

		}
	}
}
