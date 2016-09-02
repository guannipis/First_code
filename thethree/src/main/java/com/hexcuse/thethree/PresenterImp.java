package com.hexcuse.thethree;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hexcuse on 2016/9/1.
 *
 * @Package com.hexcuse.thethree.
 * @ClassName: ${CLASS_NAME}.
 * @Description: ${todo}(用一句话描述该文件做什么).
 */
public class PresenterImp implements Contract.Presenter{

	private Contract.MainView mMainView;

	private MainModel mMainModel;

	public PresenterImp(Context context, Contract.MainView view) {
		this.mMainModel = new MainModelImp(context);
		this.mMainView = view;
	}

	@Override
	public void sendMessage(String message) {
		List<MessageBean> list = new ArrayList<>();
		MessageBean messageBean = new MessageBean(message, 1);
		list.add(messageBean);
		mMainView.showMessage(list);
		mMainView.clearMessage();
		getMessage(message);

	}

	@Override
	public void getMessage(String message) {
		mMainModel.getData(message, new MainModelImp.OnLoadImageListListener() {

			@Override
			public void onSuccess(List<MessageBean> list) {
				List<MessageBean> mList = list;
				mMainView.showMessage(list);
			}

			@Override
			public void onFailure(String msg, Exception e) {

			}
		});
	}

}
