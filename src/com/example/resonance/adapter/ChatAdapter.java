package com.example.resonance.adapter;


import java.util.ArrayList;

import com.example.resonance.R;
import com.example.resonance.vo.ChatVO;
import com.example.resonance.vo.MessageVO;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 *Class <code>ChatAdapter.java</code> 聊天页面的适配器.
 *
 * @author never
 * @date 2014-2-9
 */
//TODO listView会不断刷新。。。
public class ChatAdapter extends BaseAdapter{
    private Context context;
    private ChatVO chatVO = null;
    private ArrayList<MessageVO> message_list = null;

    public ChatAdapter(Context context,ChatVO chatVO) {
    	this.chatVO = chatVO;
    	this.context = context;
    	message_list = this.chatVO.getMessageList();
    }
	@Override
	public int getCount() {
		return message_list.size();
	}

	
	@Override
	public Object getItem(int position) {
		return message_list.get(position);
	}

	
	@Override
	public long getItemId(int position) {
		return position;
	}
	
	public void addItem(MessageVO messageVO) {
		message_list.add(messageVO);
	}

	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder = null;
		LayoutInflater inflater = LayoutInflater.from(context);
		MessageVO messageVO = message_list.get(position);
		
		if(convertView == null) {
			holder = new ViewHolder();
			//TODO 判断信息时发送的还是接受.
			if(messageVO.getReceiveID() == 1) {
				convertView = inflater.inflate(R.layout.chatting_item_msg_text_right, null);
			} else {
				convertView = inflater.inflate(R.layout.chatting_item_msg_text_left, null);
			}
			
			holder.icon = (ImageView) convertView.findViewById(R.id.chat_icon_imageview);
			holder.name = (TextView) convertView.findViewById(R.id.chat_name_textview);
			holder.content = (TextView) convertView.findViewById(R.id.chat_content_textview);
			holder.time = (TextView) convertView.findViewById(R.id.chat_sendtime_textview);
			
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		
		holder.icon.setImageResource(R.drawable.usericon);   //TODO
		holder.name.setText(messageVO.getSendID() + "");                          //TODO
		holder.time.setText(messageVO.getSendTime());
		holder.content.setText(messageVO.getMessage());
		
		return convertView;
	}
	
	public final class ViewHolder{
		public ImageView icon;
		public TextView time;
		public TextView name;
		public TextView content;
	}

}
