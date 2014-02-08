package com.example.resonance.view.search;

import com.example.resonance.utils.PrintHelper;

import android.app.Activity;
import android.os.Bundle;

/**
 *Class <code>GroupChatActivity.java</code> 群聊聊天页面.
 *
 * @author never
 * @date 2014-1-26
 */
public class GroupChatActivity extends Activity{
	private String chat_room_name = null;
    /* (non-Javadoc)
    * @see android.app.Activity#onCreate(android.os.Bundle)
    */
   @Override
   protected void onCreate(Bundle savedInstanceState) {
   	// TODO Auto-generated method stub
   	super.onCreate(savedInstanceState);
   	Bundle bundle = getIntent().getExtras();
   	chat_room_name = bundle.getString("chat_room_name");
   	
   	PrintHelper.Print(getClass().getName(), chat_room_name);
   	
   	initView();
   }
   
   /**
   *  初始化界面.
    */
   private void initView() {
   	
   }
}
