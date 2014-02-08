package com.example.resonance.adapter;

import java.util.ArrayList;

import com.example.resonance.R;
import com.example.resonance.vo.MessageVO;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 *Class <code>MessageAdapter.java</code> 信息列表的适配器.
 *
 * @author never
 * @date 2014-2-8
 */
public class MessageAdapter extends BaseAdapter{
    private Context context;
    private ArrayList<MessageVO> list;

    public MessageAdapter(Context context,ArrayList<MessageVO> list) {
    	this.context = context;
    	this.list = list;
    }
	@Override
	public int getCount() {
		return list.size();
	}


	@Override
	public Object getItem(int position) {
		return list.get(position);
	}

	
	@Override
	public long getItemId(int position) {
		return position;
	}

	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder = null;
		
		if(convertView == null) {
			holder = new ViewHolder();
			
			convertView = LayoutInflater.from(context).inflate(R.layout.message_item, null);
			holder.icon = (ImageView) convertView.findViewById(R.id.message_icon_imageview);
			holder.name = (TextView) convertView.findViewById(R.id.message_name_textview);
			holder.time = (TextView) convertView.findViewById(R.id.message_time_textview);
			holder.message = (TextView) convertView.findViewById(R.id.message_message_textview);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		
		MessageVO messageVO = list.get(position);
		holder.icon.setImageResource(R.drawable.usericon);   //TODO  sender's icon
		holder.name.setText(messageVO.getSendID() + "");    //TODO  sender's name
		holder.time.setText(messageVO.getSendTime());
		holder.message.setText(messageVO.getMessage());
		
		return convertView;
	}

	public final class ViewHolder {
		public ImageView icon;
		public TextView name;
		public TextView time;
		public TextView message;
	}
}
