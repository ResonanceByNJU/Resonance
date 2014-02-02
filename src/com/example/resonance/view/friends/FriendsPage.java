package com.example.resonance.view.friends;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/** 
 * 好友主页面.
 * @author never
 * @date 2014-1-26
 */
public class FriendsPage extends Fragment{
   
	/* (non-Javadoc)
	 * Title: onCreateView
	 * @see android.support.v4.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		initView();
		return super.onCreateView(inflater, container, savedInstanceState);
	}
    
    /**
    *  初始化界面.
     */
    private void initView() {
    	
    }
}
