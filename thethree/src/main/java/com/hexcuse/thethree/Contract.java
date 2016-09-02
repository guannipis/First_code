package com.hexcuse.thethree;

import java.util.List;

/**
 * Created by Hexcuse on 2016/9/1.
 *
 * @Package com.hexcuse.thethree.
 * @ClassName: ${CLASS_NAME}.
 * @Description: ${todo}(用一句话描述该文件做什么).
 */
public class Contract {

	interface Presenter{

		void getMessage(String message);

		void sendMessage(String message);

	}

	interface MainView<Presenter> {
		void showMessage(List<MessageBean> mList);

		void clearMessage();
	}
}
