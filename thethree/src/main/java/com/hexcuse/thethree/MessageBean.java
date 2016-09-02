package com.hexcuse.thethree;

import java.io.Serializable;

/**
 * Created by Hexcuse on 2016/9/1.
 *
 * @Package com.hexcuse.thethree.
 * @ClassName: ${CLASS_NAME}.
 * @Description: ${todo}(用一句话描述该文件做什么).
 */
public class MessageBean implements Serializable {

	public MessageBean(String message, int type) {
		this.message = message;
		this.type = type;
	}

	private String message;
	private int type;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
