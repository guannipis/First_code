package com.hexcuse.thethree;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hexcuse on 2016/9/2.
 *
 * @Package com.hexcuse.thethree.
 * @ClassName: ${CLASS_NAME}.
 * @Description: ${todo}(用一句话描述该文件做什么).
 */
public class MainModelImp implements MainModel{

	private Context mContext;

	public MainModelImp(Context context) {
		this.mContext = context;
	}

	@Override
	public void getData(String message, final OnLoadImageListListener listener) {
//		try {
//			URL url = new URL("http://www.tuling123.com/openapi/api");
//			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
//			httpURLConnection.setRequestMethod("POST");
//			httpURLConnection.setConnectTimeout(30000);
//			httpURLConnection.setReadTimeout(30000);
//			httpURLConnection.setDoInput(true);
//			httpURLConnection.setDoOutput(true);
//
//			JSONObject jsonObject = new JSONObject();
//			jsonObject.put("key", "6bd9a45238754df0beabb38de0164ed3");
//			jsonObject.put("info", message);
//
//
//
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (JSONException e) {
//			e.printStackTrace();
//		}
		RequestQueue requestQueue = Volley.newRequestQueue(mContext);
		String requestBody = "{\"key\": \"6bd9a45238754df0beabb38de0164ed3\", \"info\":\"" + message + "\"}";
		JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
				Request.Method.POST, requestBody, "http://www.tuling123.com/openapi/api", new Response.Listener<JSONObject>() {
			@Override
			public void onResponse(JSONObject response) {
				JSONObject jsonObject = response;
				try {
					if ("100000".equals(jsonObject.getString("code"))) {
						String message = jsonObject.getString("text");
						List<MessageBean> list = new ArrayList<>();
						MessageBean messageBean = new MessageBean(message, 2);
						list.add(messageBean);
						listener.onSuccess(list);
					}
				} catch (JSONException e) {
					e.printStackTrace();
				}
			}
		}, new Response.ErrorListener() {
			@Override
			public void onErrorResponse(VolleyError error) {

			}
		});

	}

	public interface OnLoadImageListListener {
		void onSuccess(List<MessageBean> list);
		void onFailure(String msg, Exception e);
	}
}
