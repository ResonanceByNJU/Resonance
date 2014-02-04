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
 * Resonance��������.
 * @author never
 * @date 2014-1-25
 */
public class MainActivity extends FragmentActivity{
    private static final String TAB_MESSAGE = "��Ϣ";
	private static final String TAB_FRIENDS = "����";
	private static final String TAB_SEARCH = "����";
	private static final String TAB_HOMEPAGE = "��ҳ";
	
	
	//����FragmentTabHost����
	private FragmentTabHost mTabHost;
	
	//����һ������
	private LayoutInflater layoutInflater;
		
	//�������������Fragment����
	@SuppressWarnings("rawtypes")
	private Class fragmentArray[] = {MessagePage.class,FriendsPage.class,SearchPage.class,HomePagePage.class};
	
	//������������Ű�ťͼƬ
	private int mImageViewArray[] = {R.drawable.tab_message_btn,R.drawable.tab_friends_btn,R.drawable.tab_search_btn,
									 R.drawable.tab_homepage_btn};
	
	//Tabѡ�������
	private String mTextviewArray[] = {TAB_MESSAGE, TAB_FRIENDS, TAB_SEARCH, TAB_HOMEPAGE};

	
 	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	    initView();
 	}
 	
 	
 	/**
 	 * ��ʼ������
 	 */
 	private void initView() {
 		//ʵ�������ֶ���
		layoutInflater = LayoutInflater.from(this);
				
		//ʵ����TabHost���󣬵õ�TabHost
		mTabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
		mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);	
		
		//�õ�fragment�ĸ���
		int count = fragmentArray.length;	
				
		for(int i = 0; i < count; i++){	
			//Ϊÿһ��Tab��ť����ͼ�ꡢ���ֺ�����
			TabSpec tabSpec = mTabHost.newTabSpec(mTextviewArray[i]).setIndicator(getTabItemView(i));
			//��Tab��ť��ӽ�Tabѡ���
			mTabHost.addTab(tabSpec, fragmentArray[i], null);
			//����Tab��ť�ı���
			mTabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.selector_tab_background);
		}
 	    
 	}
 	
	/**
	 * ��Tab��ť����ͼ�������
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
