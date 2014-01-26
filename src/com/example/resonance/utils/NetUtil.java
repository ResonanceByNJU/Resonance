package com.example.resonance.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 *Class <code>NetUtil.java</code> �������йصİ�����.
 *
 * @author never
 * @date 2014-1-26
 */
public class NetUtil {
	
	/**
	 * Title: isNetworkAvailable
	 * Description:�жϵ�ǰ�����Ƿ����.
	 * @param context 
	 * @return ������÷���true;����δ��������false.
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
