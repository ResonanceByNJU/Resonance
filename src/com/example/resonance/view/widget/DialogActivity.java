package com.example.resonance.view.widget;

import com.example.resonance.R;

import android.app.Activity;
import android.os.Bundle;

/**
 *Class <code>DialogActivity.java</code> 通过activity自定义的Dialog。
 *
 * @author never
 * @date 2014-2-9
 */
public class DialogActivity extends Activity{
	/* (non-Javadoc)
	 * Title: onCreate
	 * Description:
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exit_dialog);
	}
}
