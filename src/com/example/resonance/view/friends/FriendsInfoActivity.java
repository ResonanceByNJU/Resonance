package com.example.resonance.view.friends;

import com.example.resonance.R;
import com.example.resonance.stub.TestVOs;
import com.example.resonance.view.message.ChatActivity;
import com.example.resonance.vo.FriendVO;
import com.example.resonance.vo.MessageVO;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 *Class <code>FriendsInfoActivity.java</code> 好友资料页面.
 *
 * @author never
 * @date 2014-1-26
 */
public class FriendsInfoActivity extends Activity{
	private static FriendVO friendVO = null;
	
	private TextView title_textView,name_textView,id_textView,content_textView;
	private Button ret_button,send_button;
	private ImageView icon_imageView,first_interest_imageView,second_interest_imageView,more_interest_imageView;
    /* (non-Javadoc)
    * @see android.app.Activity#onCreate(android.os.Bundle)
    */
   @Override
   protected void onCreate(Bundle savedInstanceState) {
   	    super.onCreate(savedInstanceState);
   	    setContentView(R.layout.friend_info);
   	    //获取传递过来的数据.
    	Bundle bundle = getIntent().getExtras();
   	    friendVO = (FriendVO) bundle.getSerializable("friendVO");
   	    
   	    System.out.println("11" + friendVO.getUsername() + friendVO.getMakeFriendContent());
   	    
   	    initView();
   }
   
   /**
   *  初始化界面.
    */
   private void initView() {
   	    title_textView = (TextView) findViewById(R.id.head_ret_textview);
   	    title_textView.setText(R.string.friend_info);
   	    
   	    name_textView = (TextView) findViewById(R.id.friend_info_name_textview);
   	    name_textView.setText(friendVO.getUsername());
   	    
   	    //TODO 获取用户ID
   	    id_textView = (TextView) findViewById(R.id.friend_info_id_textview);
   	    id_textView.setText("好友ID: " + friendVO.getBeginWord());
   	    
   	    content_textView = (TextView) findViewById(R.id.friend_info_content_textview);
   	    content_textView.setText(friendVO.getMakeFriendContent());
   	    
   	    icon_imageView = (ImageView) findViewById(R.id.friend_info_icon_imageview);
   	    icon_imageView.setImageResource(R.drawable.usericon);  //TODO 用户头像
   	    
   	    first_interest_imageView = (ImageView) findViewById(R.id.friend_info_first_interest);
   	    first_interest_imageView.setImageResource(R.drawable.usericon);  //TODO 第一次兴趣爱好
   	    
   	    second_interest_imageView = (ImageView) findViewById(R.id.friend_info_second_interest);
	    second_interest_imageView.setImageResource(R.drawable.usericon);  //TODO 第二次兴趣爱好
	    
	    more_interest_imageView = (ImageView) findViewById(R.id.friend_info_more_interest);
        more_interest_imageView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 跳转到更多兴趣页面
				
			}
		});
        
        ret_button = (Button) findViewById(R.id.head_btn_back);
        ret_button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				FriendsInfoActivity.this.finish();
			}
		});
        
        send_button = (Button) findViewById(R.id.friend_info_send);
        send_button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 跳转到聊天页面
				MessageVO messageVO = new MessageVO(1, 1001, 1 + ":00", "message" + 1);
				Bundle bundle = new Bundle();
				bundle.putSerializable("messageVO", messageVO);
				
				Intent intent = new Intent(FriendsInfoActivity.this,ChatActivity.class);
				intent.putExtras(bundle);
				startActivity(intent);
			}
		});
   }
}
