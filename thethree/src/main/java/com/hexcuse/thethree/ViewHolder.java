package com.hexcuse.thethree;

import android.util.SparseArray;
import android.view.View;

/**
 * Created by Hexcuse on 2016/9/1.
 *
 * @Package com.hexcuse.thethree.
 * @ClassName: ${CLASS_NAME}.
 * @Description: ${todo}(用一句话描述该文件做什么).
 */
public class ViewHolder {

	public static <T extends View> T get(View view, int id) {
		SparseArray<View> viewHolder = (SparseArray<View>) view.getTag();
		if (viewHolder == null) {
			viewHolder = new SparseArray<>();
			view.setTag(viewHolder);
		}
		View chileView = viewHolder.get(id);
		if (chileView == null) {
			chileView = view.findViewById(id);
			viewHolder.put(id, chileView);
		}
		return (T) chileView;
	}

}
