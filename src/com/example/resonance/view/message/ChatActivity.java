package com.example.resonance.view.message;

import com.example.resonance.R;
import com.example.resonance.utils.PrintHelper;
import com.example.resonance.vo.MessageVO;

import android.app.Activity;
import android.os.Bundle;

/**
 *Class <code>ChatActivity.java</code> ��������ҳ��.
 *
 * @author never
 * @date 2014-1-26
 */
public class ChatActivity extends Activity{
	private MessageVO messageVO = null;
	/* (non-Javadoc)
	 * Title: onCreate
	 * Description:
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Bundle bundle = getIntent().getExtras();
		messageVO = (MessageVO) bundle.getSerializable("messageVO");
		PrintHelper.Print(getClass().getName(), messageVO.getMessage());
		setContentView(R.layout.chat);
		
		initView();
	}
	
	/**
	 * Title: initView��
	 * Description: ��ʼ��ҳ�档
	 */
	private void initView() {
		
	}
}
