package com.example.resonance.view.search;

import com.example.resonance.R;
import com.example.resonance.view.login.TestHeartActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 *Class <code>SearchPage.java</code> ������ҳ��.
 *
 * @author never
 * @date 2014-1-26
 */
public class SearchPage extends Fragment{
    private View searchView = null;
    private TextView head_textView = null;
    private Button search_heart_btn,search_strategy_btn,search_chatroom_btn,search_questions_btn;
	
	/* (non-Javadoc)
	 * Title: onCreateView
	 * @see android.support.v4.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
        searchView = inflater.inflate(R.layout.search, container, false);
        
		initView();
		
		return searchView;
	}
	
	/**
	 * Title: initView��
	 * Description: ��ʼ��ҳ�档
	 */
	private void initView() {
		//��ʼ������
		head_textView = (TextView) searchView.findViewById(R.id.head_textView);
		head_textView.setText(R.string.main_search);
		
		//��ʼ����ť
		search_heart_btn = (Button) searchView.findViewById(R.id.search_heart_btn);
		search_heart_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//��ת����������ҳ��.
				Intent intent = new Intent(getActivity(),TestHeartActivity.class);
				startActivity(intent);
			}
		});
		
		search_strategy_btn = (Button) searchView.findViewById(R.id.search_strategy_btn);
		search_strategy_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//��ת�������ؼ�ҳ��.
				Intent intent = new Intent(getActivity(),StrategyActivity.class);
				startActivity(intent);
			}
		});
	
		search_chatroom_btn = (Button) searchView.findViewById(R.id.search_chatroom_btn);
		search_chatroom_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//��ת��Ⱥ�����б�ҳ��.
				Intent intent = new Intent(getActivity(),GroupChatRoomsActivity.class);
				startActivity(intent);
			}
		});
		search_questions_btn = (Button) searchView.findViewById(R.id.search_questions_btn);
		search_questions_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//��ת��ϵͳ����ҳ�桾������ĸ����.
				Intent intent = new Intent(getActivity(),QuestionsByAlpActivity.class);
				startActivity(intent);
			}
		});
	}
}
