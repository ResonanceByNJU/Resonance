package com.example.resonance.view;

import com.example.resonance.R;
import com.example.resonance.view.friends.FriendsPage;
import com.example.resonance.view.homepage.HomePagePage;
import com.example.resonance.view.message.MessagePage;
import com.example.resonance.view.search.SearchPage;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TabHost.TabSpec;
/**
 * Resonance的主界面.
 * @author never
 * @date 2014-1-25
 */
public class MainActivity extends FragmentActivity{
    private static final String TAB_MESSAGE = "消息";
	private static final String TAB_FRIENDS = "好友";
	private static final String TAB_SEARCH = "发现";
	private static final String TAB_HOMEPAGE = "主页";
	
	
	//定义FragmentTabHost对象
	private FragmentTabHost mTabHost;
	
	//定义一个布局
	private LayoutInflater layoutInflater;
		
	//定义数组来存放Fragment界面
	@SuppressWarnings("rawtypes")
	private Class fragmentArray[] = {MessagePage.class,FriendsPage.class,SearchPage.class,HomePagePage.class};
	
	//定义数组来存放按钮图片
	private int mImageViewArray[] = {R.drawable.tab_message_btn,R.drawable.tab_friends_btn,R.drawable.tab_search_btn,
									 R.drawable.tab_homepage_btn};
	
	//Tab选项卡的文字
	private String mTextviewArray[] = {TAB_MESSAGE, TAB_FRIENDS, TAB_SEARCH, TAB_HOMEPAGE};

	
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
 		//实例化布局对象
		layoutInflater = LayoutInflater.from(this);
				
		//实例化TabHost对象，得到TabHost
		mTabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
		mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);	
		
		//得到fragment的个数
		int count = fragmentArray.length;	
				
		for(int i = 0; i < count; i++){	
			//为每一个Tab按钮设置图标、文字和内容
			TabSpec tabSpec = mTabHost.newTabSpec(mTextviewArray[i]).setIndicator(getTabItemView(i));
			//将Tab按钮添加进Tab选项卡中
			mTabHost.addTab(tabSpec, fragmentArray[i], null);
			//设置Tab按钮的背景
			mTabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.selector_tab_background);
		}
 	    
 	}
 	
	/**
	 * 给Tab按钮设置图标和文字
	 */
	private View getTabItemView(int index){
		View view = layoutInflater.inflate(R.layout.tab_item_view, null);
	
		ImageView imageView = (ImageView) view.findViewById(R.id.imageview);
		imageView.setImageResource(mImageViewArray[index]);
		
		TextView textView = (TextView) view.findViewById(R.id.textview);		
		textView.setText(mTextviewArray[index]);

	
		return view;
	}



}
