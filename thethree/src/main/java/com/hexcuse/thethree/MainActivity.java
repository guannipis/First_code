package com.hexcuse.thethree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Contract.MainView {

	private ListView lv_message;

	private EditText et_send;
	private Button btn_send;

	private MessageAdapter mMessageAdapter;
	private List<MessageBean> mList;

	private PresenterImp mPresenterImp;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		initData();

	}

	private void initView() {
		lv_message = (ListView) findViewById(R.id.lv_message);
		et_send = (EditText) findViewById(R.id.et_send);
		btn_send = (Button) findViewById(R.id.btn_send);
		mMessageAdapter = new MessageAdapter(getApplicationContext());
		mList = new ArrayList<>();
		mMessageAdapter.setData(mList);
		lv_message.setAdapter(mMessageAdapter);
		mPresenterImp = new PresenterImp(getApplicationContext(), this);
	}

	private void initData() {
		btn_send.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String message = et_send.getText().toString();
				if (!TextUtils.isEmpty(message)) {
					mPresenterImp.sendMessage(message);
				}
			}
		});
	}


	@Override
	public void showMessage(List mList) {
		this.mList = mList;
		mMessageAdapter.addData(mList);
	}

	@Override
	public void clearMessage() {
		et_send.setText("");
	}
}
