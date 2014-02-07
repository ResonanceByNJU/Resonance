package com.example.resonance.view.friends;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.resonance.R;
import com.example.resonance.adapter.FilterFriendsAdapter;
import com.example.resonance.adapter.FriendsAdapter;
import com.example.resonance.stub.FellowService_Stub;
import com.example.resonance.utils.PinyinComparator;
import com.example.resonance.utils.PinyinUtils;
import com.example.resonance.view.widget.AlphabetScrollBar;
import com.example.resonance.view.widget.AlphabetScrollBar.OnTouchingLetterChangedListener;
import com.example.resonance.vo.FriendVO;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
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
 * 好友主页面.
 * @author never
 * @date 2014-1-26
 */
public class FriendsPage extends Fragment{
	private FellowService_Stub fellowService = new FellowService_Stub();
	private List<Map<String, Object>> friends_mapList = null;
	//所有好友列表.
	private ArrayList<FriendVO> friendList = null;
	
	//好友列表的适配器
	private FriendsAdapter friendsAdapter = null;
	//搜索好友成功之后列表的适配器
	private FilterFriendsAdapter filterFriendsAdapter = null;
    //好友列表页面
	private View friendsView = null;
	//添加好友按钮
	private ImageButton friends_add_button = null;
	//显示好友列表
	private ListView friends_listView = null;
	//字母列视图View
	private AlphabetScrollBar friends_alphabetScrollBar = null;
	//显示选中的字母
	private TextView friends_letter_textView = null;
	//搜索过滤联系人的编辑框EditText
    private EditText friends_search_editText = null;
    //搜索结果为空时显示提示
    private TextView friends_search_fail_textView = null;
    //好友列表顶部layout
    private FrameLayout friends_top_layout = null;
    
    private Handler handler = new Handler();
    
	/* (non-Javadoc)
	 * Title: onCreateView
	 * @see android.support.v4.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle).
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		friendsView = inflater.inflate(R.layout.friends, container, false);
		
		initAdapter();
		
		initView();
		
		return friendsView;
	}	


    
    /**
    *  初始化界面
     */
    private void initView() {
    	//初始化添加好友按钮
    	friends_add_button = (ImageButton) friendsView.findViewById(R.id.friends_add);
		friends_add_button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getActivity(),AddFriendActivity.class);
				startActivity(intent);
			}
		});
		
		
		
		//初始化好友列表
		friends_listView = (ListView) friendsView.findViewById(R.id.friends_listvew);
		friends_listView.setAdapter(friendsAdapter);
		friends_listView.setOnItemClickListener(new OnItemClickListener() {

			@SuppressWarnings("unchecked")
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				//获取点击选择的好友.
				Map<String, Object> map = (Map<String, Object>) arg0.getItemAtPosition(arg2);
				FriendVO friendVO = new FriendVO((String)map.get("beginword"), (Integer)map.get("icon") + "", 
						(String)map.get("name"), (String)map.get("content"));
				
				//跳转到好友信息页面.
				Intent intent = new Intent(getActivity(),FriendsInfoActivity.class);
				Bundle bundle = new Bundle();
				bundle.putSerializable("friendVO", friendVO);
				intent.putExtras(bundle);
				startActivity(intent);
				
			}
		});
		
		//初始化顶部视图
		friends_top_layout = (FrameLayout) friendsView.findViewById(R.id.friends_top_layout);
		
		//初始化搜索框
		friends_search_editText = (EditText) friendsView.findViewById(R.id.friends_search_edit);
		friends_search_editText.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				if(s.toString().trim().equals("")) {
				
					friends_listView.setAdapter(friendsAdapter);
					
					friends_alphabetScrollBar.setVisibility(View.VISIBLE);
					friends_top_layout.setVisibility(View.VISIBLE);
				} else {
					ArrayList<Map<String, Object>> filterList = FilterSearch(s.toString().trim());
					
					if (filterList.size() == 0) {
						friends_search_fail_textView.setVisibility(View.VISIBLE);
						friends_alphabetScrollBar.setVisibility(View.VISIBLE);
					} else {
						friends_search_fail_textView.setVisibility(View.GONE);
						friends_alphabetScrollBar.setVisibility(View.GONE);
					}
					
					filterFriendsAdapter = new FilterFriendsAdapter(getActivity(),filterList);
					friends_listView.setAdapter(filterFriendsAdapter);
					
					friends_alphabetScrollBar.setVisibility(View.GONE);
					friends_top_layout.setVisibility(View.GONE);
				}
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				
			}
		});

		
		//初始化搜索失败提示视图
		friends_search_fail_textView = (TextView) friendsView.findViewById(R.id.friends_search_fail_textview);
		
		//初始化显示选定字母视图
		friends_letter_textView = (TextView) friendsView.findViewById(R.id.friends_letter_notice);
		
		//初始化字母列视图
		friends_alphabetScrollBar = (AlphabetScrollBar) friendsView.findViewById(R.id.friends_alphabetscrollbar);
	//	friends_alphabetScrollBar.setTextView(friends_letter_textView);
    	
		friends_alphabetScrollBar.setOnTouchingLetterChangedListener(new OnTouchingLetterChangedListener() {
			
			@Override
			public void onTouchingLetterChanged(String s) {
				friends_letter_textView.setText(s);
				friends_letter_textView.setVisibility(View.VISIBLE);
				
				handler.removeCallbacks(letterThred);
				handler.postDelayed(letterThred, 1000);
				
				if (alphaIndexer(s) > 0) {
					int position = alphaIndexer(s);
					friends_listView.setSelection(position);
				}
			}
		});
    }
    

    
    //显示字母的TextView的线程，控制不可见.
    private Runnable letterThred = new Runnable() {
		
		@Override
		public void run() {
			friends_letter_textView.setVisibility(View.GONE);
			
		}
	};
    
    /**
     * Title: initAdapter
     * Description: 初始化适配器.
     */
    @SuppressWarnings("unchecked")
	private void initAdapter() {
    	friends_mapList = new ArrayList<Map<String,Object>>();
    	friendList = fellowService.searchFriend("key").getFriendList();
    	
    	//排序
    	Collections.sort(friendList, new PinyinComparator());
    	
    	for(FriendVO friendVO:friendList) {
    		Map<String, Object> map = new HashMap<String, Object>();
    		map.put("name", friendVO.getUsername());
    		map.put("content", friendVO.getMakeFriendContent());
    		map.put("icon", R.drawable.usericon);  //TODO
    		map.put("beginword", friendVO.getBeginWord());
    		friends_mapList.add(map);
    	}
    	//初始话ListView适配器.
    	friendsAdapter = new FriendsAdapter(getActivity(),friends_mapList);
    }
    
    /**
     * Title: alphaIndexer
     * Description:查询侧边字母咧中的字母在listView中的位置.
     * @param s 侧边字幕列对应的字母.
     * @return int 对应字母在listView中的位置。
     */
    private int alphaIndexer(String s) {
		int position = 0;
		for (int i = 0; i < friends_mapList.size(); i++) {

			String py = (String) friends_mapList.get(i).get("beginword");
			if (py.startsWith(s)) {
				position = i;
				break;
			}
		}
		return position;
	}
   
    /**
     * Title: FilterSearch
     * Description: 根据关键字过滤好友列表.
     * @param keyword 想要搜索的关键字.
     * @return ArrayList<Map<String, Object>>
     */
    private ArrayList<Map<String, Object>> FilterSearch(String keyword) {
		ArrayList<Map<String, Object>> friendVOs= new ArrayList<Map<String,Object>>();
      
		
		//遍历friendList  
        for (int i = 0; i < friendList.size(); i++) {  
            //如果遍历到List包含所输入字符串  
            if (isStrInString(PinyinUtils.getPingYin(friendList.get(i).getUsername()),keyword)
            		|| friendList.get(i).getUsername().contains(keyword)
            		||isStrInString(friendList.get(i).getBeginWord(),keyword)){      
    			Map<String, Object> map = new HashMap<String, Object>();
    			map.put("name", friendList.get(i).getUsername());
    			map.put("content", friendList.get(i).getMakeFriendContent());
    			map.put("icon", R.drawable.usericon);    //TODO
    			map.put("beginword", friendList.get(i).getBeginWord());
    			friendVOs.add(map);
            }  
        }  
        	return friendVOs;
	}
    
    /**
     * Title: isStrInString
     * Description: 判断smallStr是否是bigStr的一部分.
     * @param bigStr 长度长的字符串.
     * @param smallStr 短的字符串.
     * @return boolean:是一部分返回true,否则返回false.
     */
	private boolean isStrInString(String bigStr,String smallStr){
		  if(bigStr.toUpperCase().indexOf(smallStr.toUpperCase())>-1){
			  return true;
		  }else{
			  return false;
		  }
	} 
}
