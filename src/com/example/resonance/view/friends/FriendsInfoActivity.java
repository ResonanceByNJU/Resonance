package com.example.resonance.view.friends;

import com.example.resonance.vo.FriendVO;

import android.app.Activity;
import android.os.Bundle;

/**
 *Class <code>FriendsInfoActivity.java</code> ��������ҳ��.
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
   	    //��ȡ���ݹ���������.
    	Bundle bundle = getIntent().getExtras();
   	    friendVO = (FriendVO) bundle.getSerializable("friendVO");
   	    
   	    initView();
   }
   
   /**
   *  ��ʼ������.
    */
   private void initView() {
   	
   }
}
