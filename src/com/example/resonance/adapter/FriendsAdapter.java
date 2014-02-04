package com.example.resonance.adapter;

import com.example.resonance.R;
import com.example.resonance.utils.PinyinUtils;
import com.example.resonance.vo.FriendListVO;
import com.example.resonance.vo.FriendVO;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 *Class <code>FriendsAdapter.java</code> 好友列表的适配器.
 *
 * @author never
 * @date 2014-2-4
 */
public class FriendsAdapter extends BaseAdapter{
    private Context context;
    private FriendListVO friendListVO;
    
    public FriendsAdapter(Context context,FriendListVO friendListVO) {
    	this.context = context;
    	this.friendListVO = friendListVO;
    }
	
    public int getCount() {
    	if(friendListVO == null) {
    		return 0;
    	}
    	
		if(friendListVO.getFriendList() == null) {
			return 0;
		}
		
		return friendListVO.getFriendList().size();
	}

	public Object getItem(int position) {
		return friendListVO.getFriendList().get(position);
	}

	public long getItemId(int position) {
		return position;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder = null;
		
		if(convertView == null) {
			holder = new ViewHolder();
			convertView = LayoutInflater.from(context).inflate(R.layout.friends_list_item, null);
			
			holder.icon_imageView = (ImageView) convertView.findViewById(R.id.friends_list_imageview);
			holder.name_textView = (TextView) convertView.findViewById(R.id.friends_list_name);
			holder.content_textView = (TextView) convertView.findViewById(R.id.friends_list_content);
			holder.letter_textView = (TextView) convertView.findViewById(R.id.friends_letter);
			
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		
		FriendVO friendVO = friendListVO.getFriendList().get(position);
		
		
		String letter = PinyinUtils.converterToFirstSpell(friendVO.getUsername() +"").substring(0, 1);
		if(position == 0) {
			holder.letter_textView.setVisibility(View.VISIBLE);
			holder.letter_textView.setText(letter);
		} else {
			String lastletter = PinyinUtils.converterToFirstSpell(
					friendListVO.getFriendList().get(position-1).getUsername() +"").substring(0, 1);
			if (letter.equals(lastletter)) {
				holder.letter_textView.setVisibility(View.GONE);
			} else {
				holder.letter_textView.setVisibility(View.VISIBLE);
				holder.letter_textView.setText(letter);
			}
		}
		
		holder.name_textView.setText(friendVO.getUsername());
		holder.content_textView.setText(friendVO.getMakeFriendContent());
		//holder.icon_imageView.setImageBitmap(BitmapFactory.decodeFile(friendVO.getImagePath()));
		holder.icon_imageView.setImageResource(R.drawable.usericon);
		return convertView;
	}
	
	public final class ViewHolder {
		public ImageView icon_imageView;
		public TextView name_textView;
		public TextView content_textView;
		public TextView letter_textView;
	}

}
