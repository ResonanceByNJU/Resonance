package com.example.resonance.view.friends;

import com.example.resonance.vo.FriendVO;

import android.app.Activity;
import android.os.Bundle;

/**
 *Class <code>FriendsInfoActivity.java</code> 好友资料页面.
 *
 * @author never
 * @date 2014-1-26
 */
public class FriendsInfoActivity extends Activity{
	private static FriendVO friendVO = null;
    /* (non-Javadoc)
    * @see android.app.Activity#onCreate(android.os.Bundle)
    */
   @Override
   protected void onCreate(Bundle savedInstanceState) {
   	    // TODO Auto-generated method stub
   	    super.onCreate(savedInstanceState);
   	    //获取传递过来的数据.
    	Bundle bundle = getIntent().getExtras();
   	    friendVO = (FriendVO) bundle.getSerializable("friendVO");
   	    
   	    initView();
   }
   
   /**
   *  初始化界面.
    */
   private void initView() {
   	
   }
}
