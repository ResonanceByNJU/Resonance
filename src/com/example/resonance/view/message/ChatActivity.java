package com.example.resonance.view.message;

import java.util.ArrayList;

import com.example.resonance.R;
import com.example.resonance.adapter.ChatAdapter;
import com.example.resonance.stub.TestVOs;
import com.example.resonance.utils.DateHelper;
import com.example.resonance.utils.PrintHelper;
import com.example.resonance.view.friends.FriendsInfoActivity;
import com.example.resonance.view.widget.CustomDialog;
import com.example.resonance.view.widget.CustomDialog.Builder;
import com.example.resonance.view.widget.DialogActivity;
import com.example.resonance.vo.ChatVO;
import com.example.resonance.vo.FriendVO;
import com.example.resonance.vo.MessageVO;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

/**
 *Class <code>ChatActivity.java</code> ��������ҳ��.
 *
 * @author never
 * @date 2014-1-26
 */
public class ChatActivity extends Activity{
	private MessageVO messageVO = null;
	private ChatVO chatVO = null;   //TODO
	private ChatAdapter chatAdapter = null;
	
	private ListView chat_listView= null;
	private Button ret_btn = null;
	private TextView head_textView= null;
	private ImageButton info_btn = null;
	private EditText send_editText = null;
	private Button send_btn = null;
	
	/* (non-Javadoc)
	 * Title: onCreate
	 * Description:
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Bundle bundle = getIntent().getExtras();
		messageVO = (MessageVO) bundle.getSerializable("messageVO");
		PrintHelper.Print(getClass().getName(), messageVO.getMessage());
		setContentView(R.layout.chat);
		
		initAdapter();
		
		initView();
	}
	
	/**
	 * Title: initView��
	 * Description: ��ʼ��ҳ�档
	 */
	private void initView() {
		//��ʼ���������
		head_textView = (TextView) findViewById(R.id.head_btn_textview);
		head_textView.setText(chatVO.getChatFriendName());
		
		ret_btn = (Button) findViewById(R.id.head_btn_back);
		ret_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// ������һҳ��.
				ChatActivity.this.finish();
			}
		});
		
		info_btn = (ImageButton) findViewById(R.id.head_right_btn);
		info_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//TODO ��ת��������Ϣҳ��.
				FriendVO friendVO = new TestVOs().friendVOs.get(0);
				
				Intent intent = new Intent(ChatActivity.this,FriendsInfoActivity.class);
				Bundle bundle = new Bundle();
				bundle.putSerializable("friendVO", friendVO);
				intent.putExtras(bundle);
				startActivity(intent);
			}
		});
		
		//��ʼ���ײ����
		send_editText = (EditText) findViewById(R.id.chat_sendmessage_edittext);
		
		send_btn = (Button) findViewById(R.id.chat_send_btn);
		send_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String chat_message = send_editText.getText().toString();
				//�ж������Ƿ�Ϊ��.
				if(chat_message.equals("")) {
			//		Intent intent = new Intent(ChatActivity.this,DialogActivity.class);
				//	startActivity(intent);
				
					
					CustomDialog.Builder builder = new CustomDialog.Builder(ChatActivity.this);
					builder.setMessage("this is a test");
					builder.setTitle("TEST");
					builder.setNegativeButton(R.string.chat_send,new DialogInterface.OnClickListener() {


						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							
						}
					});
					builder.setPositiveButton(R.string.chat_send, new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							
						}
					});
					
					builder.create().show();
				} else {
					MessageVO messageVO = new MessageVO(2, 1, DateHelper.getDate(), chat_message);
				    chatAdapter.addItem(messageVO);
				    chatAdapter.notifyDataSetChanged();
				  
				    //��������.
				    send_editText.setText("");
				    chat_listView.setSelection(chat_listView.getCount() - 1);
				}
			}
		});
		
		//��ʼ��ListView
		chat_listView = (ListView) findViewById(R.id.chat_listview);
		chat_listView.setAdapter(chatAdapter);
		
	}
	
	/**
	 * Title: initAdapter
	 * Description: ��ʼ������������.
	 */
	private void initAdapter() {
		ArrayList<MessageVO> messageVOs = new ArrayList<MessageVO>();
		for(int i = 0; i < 25; i++) {
			if((i % 3) == 0) {
				MessageVO m = new MessageVO(1, 1, i + ":00", "messageΪʲôÿһ��Item����ô�ߡ�����" + i);
				messageVOs.add(m);
			} else {
				MessageVO m = new MessageVO(2, 2, i + ":00", "message" + i);
				messageVOs.add(m);
			}
		}
		chatVO = new ChatVO("Never", "", messageVOs.get(messageVOs.size()-1).getSendTime(),
				messageVOs.get(messageVOs.size()-1).getMessage(), 
				messageVOs, null, null, null);
		
		chatAdapter = new ChatAdapter(this, chatVO);
	}
}
