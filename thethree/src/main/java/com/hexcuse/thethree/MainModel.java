package com.hexcuse.thethree;

/**
 * Created by Hexcuse on 2016/9/2.
 *
 * @Package com.hexcuse.thethree.
 * @ClassName: ${CLASS_NAME}.
 * @Description: ${todo}(用一句话描述该文件做什么).
 */
public interface MainModel {

	void getData(String message, MainModelImp.OnLoadImageListListener listener);
}
