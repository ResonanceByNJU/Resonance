package com.example.resonance.view.friends;

import com.example.resonance.R;
import com.example.resonance.adapter.FriendsAdapter;
import com.example.resonance.stub.FellowService_Stub;
import com.example.resonance.view.helper.AlphabetScrollBar;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

/** 
 * ������ҳ��.
 * @author never
 * @date 2014-1-26
 */
public class FriendsPage extends Fragment{
	private FellowService_Stub fellowService = new FellowService_Stub();
	
	private FriendsAdapter adapter = null;
    //�����б�ҳ��
	private View friendsView = null;
	//��Ӻ��Ѱ�ť
	private ImageButton friends_add_button = null;
	//��ʾ�����б�
	private ListView friends_listView = null;
	//��ĸ����ͼView
	private AlphabetScrollBar friends_alphabetScrollBar = null;
	//��ʾѡ�е���ĸ
	private TextView friends_letter_textView = null;
	//����������ϵ�˵ı༭��EditText
    private EditText friends_search_editText = null;
    //�������Ϊ��ʱ��ʾ��ʾ
    private TextView friends_search_fail_textView = null;
    //�����б���layout
    private FrameLayout friends_top_layout = null;
	/* (non-Javadoc)
	 * Title: onCreateView
	 * @see android.support.v4.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		friendsView = inflater.inflate(R.layout.friends, container, false);
		
		initView();
		
		return friendsView;
	}	


    
    /**
    *  ��ʼ������
     */
    private void initView() {
    	//��ʼ����Ӻ��Ѱ�ť
    	friends_add_button = (ImageButton) friendsView.findViewById(R.id.friends_add);
		friends_add_button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getActivity(),AddFriendActivity.class);
				startActivity(intent);
			}
		});
		
		//��ʼ��ListView������.
		adapter = new FriendsAdapter(getActivity(),fellowService.searchFriend("key"));
		
		//��ʼ�������б�
		friends_listView = (ListView) friendsView.findViewById(R.id.friends_listvew);
		friends_listView.setAdapter(adapter);
		friends_listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				new AlertDialog.Builder(getActivity()).setMessage("click").create().show();
			}
		});
		
		//��ʼ��������ͼ
		friends_top_layout = (FrameLayout) friendsView.findViewById(R.id.friends_top_layout);
		
		//��ʼ��������
		friends_search_editText = (EditText) friendsView.findViewById(R.id.friends_search_edit);
		friends_search_editText.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				if(s.toString().trim().equals("")) {
					friends_alphabetScrollBar.setVisibility(View.VISIBLE);
					friends_top_layout.setVisibility(View.VISIBLE);
				} else {
					friends_alphabetScrollBar.setVisibility(View.GONE);
					friends_top_layout.setVisibility(View.GONE);
				}
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				
			}
		});

		
		//��ʼ������ʧ����ʾ��ͼ
		friends_search_fail_textView = (TextView) friendsView.findViewById(R.id.friends_search_fail_textview);
		
		//��ʼ����ʾѡ����ĸ��ͼ
		friends_letter_textView = (TextView) friendsView.findViewById(R.id.friends_letter_notice);
		
		//��ʼ����ĸ����ͼ
		friends_alphabetScrollBar = (AlphabetScrollBar) friendsView.findViewById(R.id.friends_alphabetscrollbar);
		friends_alphabetScrollBar.setTextView(friends_letter_textView);
    	
    }
}
