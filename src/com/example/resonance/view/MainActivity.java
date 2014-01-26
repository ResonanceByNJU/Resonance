package com.example.resonance.view;

import com.example.resonance.R;
import com.example.resonance.view.friends.FriendsActivity;
import com.example.resonance.view.homepage.HomePageActivity;
import com.example.resonance.view.message.MessageActivity;
import com.example.resonance.view.search.SearchActivity;

import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.Display;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
/**
 * Resonance的主界面.
 * @author never
 * @date 2014-1-25
 */
public class MainActivity extends TabActivity{
    private static final String TAB_MESSAGE = "消息";
	private static final String TAB_FRIENDS = "好友";
	private static final String TAB_SEARCH = "发现";
	private static final String TAB_HOMEPAGE = "主页";
	
	
    private TabHost tabHost = null;
	
	
 	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	    initView();
 	}
 	
 	
 	/**
 	 * 初始化界面
 	 */
 	private void initView() {
        tabHost = this.getTabHost();
        
        TabSpec spec_message = tabHost.newTabSpec(TAB_MESSAGE).setIndicator(TAB_MESSAGE).setContent(new Intent(this,MessageActivity.class));
 	    TabSpec spec_friends = tabHost.newTabSpec(TAB_FRIENDS).setIndicator(TAB_FRIENDS).setContent(new Intent(this,FriendsActivity.class));
 	    TabSpec spec_search = tabHost.newTabSpec(TAB_SEARCH).setIndicator(TAB_SEARCH).setContent(new Intent(this,SearchActivity.class));
 	    TabSpec spec_homepage = tabHost.newTabSpec(TAB_HOMEPAGE).setIndicator(TAB_HOMEPAGE).setContent(new Intent(this,HomePageActivity.class));
 	    
 	    tabHost.addTab(spec_message);
 	    tabHost.addTab(spec_friends);
 	    tabHost.addTab(spec_search);
 	    tabHost.addTab(spec_homepage);
 	    
 	    
 	    RadioGroup radioGroup = (RadioGroup) findViewById(R.id.main_radiogroup);
 	    radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.main_message:
					tabHost.setCurrentTabByTag(TAB_MESSAGE);
					break;

				case R.id.main_friends:
					tabHost.setCurrentTabByTag(TAB_FRIENDS);
					break;
				case R.id.main_search:
				    tabHost.setCurrentTabByTag(TAB_SEARCH);
				    break;
				case R.id.main_homepage:
					tabHost.setCurrentTabByTag(TAB_HOMEPAGE);
					break;
				default:
					break;
				}
			}
		});
 	}



}
