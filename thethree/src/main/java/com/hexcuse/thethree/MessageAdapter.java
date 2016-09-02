package com.hexcuse.thethree;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hexcuse on 2016/9/1.
 *
 * @Package com.hexcuse.thethree.
 * @ClassName: ${CLASS_NAME}.
 * @Description: ${todo}(用一句话描述该文件做什么).
 */
public class MessageAdapter extends BaseAdapter{

	private List<MessageBean> mList = new ArrayList<>();

	private Context mContext;

	public MessageAdapter(Context context) {
		this.mContext = context;
	}

	public void setData(List<MessageBean> mDate) {
		if (mDate != null) {
			this.mList.clear();
		}
		this.mList = mDate;

	}

	public void addData(List<MessageBean> mDate) {
		if (mDate != null) {
			mList.addAll(mDate);
		}
		this.notifyDataSetChanged();
	}

	@Override
	public int getViewTypeCount() {
		return 2;
	}

	@Override
	public int getItemViewType(int position) {
		if (1 == mList.get(position).getType()) {
			return 1;
		}else {
			return 2;
		}
	}

	@Override
	public int getCount() {
		return mList.size();
	}

	@Override
	public Object getItem(int position) {
		return mList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (1 == getItemViewType(position)) {
			View view = null;
			if (view == null) {
				view = LayoutInflater.from(mContext).inflate(R.layout.adapter_send, parent, false);
			}
			TextView tv = ViewHolder.get(view, R.id.tv_send);
			tv.setText(mList.get(position).getMessage());
			return view;
		} else {
			View view = null;
			if (view == null) {
				view = LayoutInflater.from(mContext).inflate(R.layout.adapter_receive, parent, false);
			}
			TextView tv = ViewHolder.get(view, R.id.tv_receive);
			tv.setText(mList.get(position).getMessage());
			return view;
		}
	}
}
