package com.example.resonance.view.message;

import java.util.ArrayList;

import com.example.resonance.R;
import com.example.resonance.adapter.MessageAdapter;
import com.example.resonance.vo.MessageVO;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

/**
 *Class <code>MessagePage.java</code> 信息主页面.
 *
 * @author never
 * @date 2014-1-26
 */
public class MessagePage extends Fragment{
	private View messageView = null;
	private TextView head_textView = null;
	private ListView message_listview = null;
	
	private ArrayList<MessageVO> messageVO_list = null;
	private MessageAdapter messageAdapter = null;
	/* (non-Javadoc)
	 * Title: onCreateView
	 * @see android.support.v4.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		messageView = inflater.inflate(R.layout.message, container, false);
		initView();
		return messageView;
	}
	
	/**
	 * Title: initView。
	 * Description: 初始化页面。
	 */
	private void initView() {
		head_textView = (TextView) messageView.findViewById(R.id.head_textView);
		head_textView.setText(R.string.main_message);
		
		message_listview = (ListView) messageView.findViewById(R.id.message_listview);
		initAdapter();
		message_listview.setAdapter(messageAdapter);
		message_listview.setClickable(true);
		message_listview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				MessageVO messageVO = (MessageVO) arg0.getItemAtPosition(arg2);
				
				Bundle bundle = new Bundle();
				bundle.putSerializable("messageVO", messageVO);
				Intent intent = new Intent(getActivity(), ChatActivity.class);
				intent.putExtras(bundle);
				startActivity(intent);
			}
		});
	}
	
	/**
	 * Title: initAdapter
	 * Description: 初始化message列表的适配器.
	 */
	private void initAdapter() {
		//TODO wait for rewrite
		messageVO_list = new ArrayList<MessageVO>();
		
		for(int i = 0; i < 20; i++) {
			MessageVO messageVO = new MessageVO(i, i+1000, i + ":00", "message" + i);
			messageVO_list.add(messageVO);
		}
		
		messageAdapter = new MessageAdapter(getActivity(), messageVO_list);
	}
}
