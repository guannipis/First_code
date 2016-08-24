package com.hexcuse.network;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	private TextView tv;
	private Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		initData();
		processBiz();
	}

	private void initView() {
		tv = (TextView) findViewById(R.id.tv);
		btn = (Button) findViewById(R.id.btn);
	}

	private void initData() {
		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				requestNet();
			}
		});
	}

	private void processBiz() {

	}

	/**
	 * 请求网络
	 */
	private void requestNet() {

	}
}
