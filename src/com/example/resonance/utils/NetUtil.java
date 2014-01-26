package com.example.resonance.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 *Class <code>NetUtil.java</code> 和网络有关的帮助类.
 *
 * @author never
 * @date 2014-1-26
 */
public class NetUtil {
	
	/**
	 * Title: isNetworkAvailable
	 * Description:判断当前网络是否可用.
	 * @param context 
	 * @return 网络可用返回true;网络未开启返回false.
	 */
    public static boolean isNetworkAvailable(Context context) {
	   ConnectivityManager mgr = (ConnectivityManager) context.getApplicationContext()
				.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo[] info = mgr.getAllNetworkInfo();
		if (info != null) {
			for (int i = 0; i < info.length; i++) {
				if (info[i].getState() == NetworkInfo.State.CONNECTED) {
					return true;
				}
			}
		}
		return false;
    }
}
