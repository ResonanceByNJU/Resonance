package com.example.resonance.view.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.resonance.R;
import com.example.resonance.vo.MCRoomListVO;
import com.example.resonance.vo.MCRoomVO;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

/**
 *Class <code>GroupChatRoomsActivity.java</code> 群聊室列表页面.
 *
 * @author never
 * @date 2014-1-26
 */
public class GroupChatRoomsActivity extends Activity{
	private Button ret_btn = null;
	private TextView head_textView = null;
	private GridView chat_room_gridView = null;
	
	private MCRoomListVO mcRoomListVO = null;
	private ArrayList<Map<String, Object>> chat_room_list = null;
	private SimpleAdapter chat_room_adapter = null;
	
    /* (non-Javadoc)
    * @see android.app.Activity#onCreate(android.os.Bundle)
    */
   @Override
   protected void onCreate(Bundle savedInstanceState) {
   	super.onCreate(savedInstanceState);
   	setContentView(R.layout.group_chat_room);
   	
   	initView();
   }
   
   /**
   *  初始化界面.
    */
   private void initView() {
	   ret_btn = (Button) findViewById(R.id.head_btn_back);
   	   ret_btn.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				// 返回上个页面
				GroupChatRoomsActivity.this.finish();
			}
		});
   	   
   	   head_textView = (TextView) findViewById(R.id.head_ret_textview);
   	   head_textView.setText(R.string.group_chat_rooms);
   	   
   	   chat_room_gridView = (GridView) findViewById(R.id.chat_room_gridview);
   	   initAdapter();
   	   chat_room_gridView.setAdapter(chat_room_adapter);
   	   chat_room_gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Intent intent = new Intent(GroupChatRoomsActivity.this,GroupChatActivity.class);
				@SuppressWarnings("unchecked")
				HashMap<String, Object> selected_item = (HashMap<String, Object>) arg0.getItemAtPosition(arg2);
				Bundle bundle = new Bundle();
				bundle.putString("chat_room_name", (String)selected_item.get("chat_room_name"));
				intent.putExtras(bundle);
				startActivity(intent);
			}
	   });
   }
   
   private void initAdapter() {
	   ArrayList<MCRoomVO> mcRoomVOs = new ArrayList<MCRoomVO>();
	   for (int i = 0; i < 40; i++) {
		   MCRoomVO mcRoomVO = new MCRoomVO("群聊室" + i, "");
		   mcRoomVOs.add(mcRoomVO);
	   }
	   
	   mcRoomListVO = new MCRoomListVO(mcRoomVOs);
	   
	   chat_room_list = new ArrayList<Map<String,Object>>();
	   for(MCRoomVO m:mcRoomListVO.getGroupChatRomList()) {
		   HashMap<String, Object> map = new HashMap<String, Object>();
		   map.put("chat_room_logo", R.drawable.usericon);   //TODO
		   map.put("chat_room_name", m.getChatName());
		   chat_room_list.add(map);
	   }
	   
	   chat_room_adapter = new SimpleAdapter(this,chat_room_list,R.layout.chat_room_item,
			   new String[]{"chat_room_logo","chat_room_name"},new int[]{R.id.chat_room_logo,R.id.chat_room_name});
	   
   }
}
