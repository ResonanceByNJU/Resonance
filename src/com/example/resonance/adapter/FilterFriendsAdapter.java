package com.example.resonance.adapter;

import java.util.List;
import java.util.Map;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.resonance.R;

/**
 *Class <code>FilterFriendsAdapter.java</code> 搜索好友成功时显示的列表.
 *
 * @author never
 * @date 2014-2-7
 */
public class FilterFriendsAdapter extends BaseAdapter{
	 private Context context;
	    private List<Map<String, Object>> list;
	    
	    public FilterFriendsAdapter(Context context,List<Map<String, Object>> list) {
	    	this.context = context;
	    	this.list = list;
	    }
		
	    public int getCount() {
	    	return list == null ? 0 : list.size(); 
		}

		public Object getItem(int position) {
			return list.get(position);
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
				
				convertView.setTag(holder);
			} else {
				holder = (ViewHolder) convertView.getTag();
			}
			
			Map<String,Object> map = list.get(position);
			
			
			
			
			holder.name_textView.setText((String)map.get("name"));
			holder.content_textView.setText((String)map.get("content"));
			holder.icon_imageView.setImageResource((Integer)map.get("icon"));
			return convertView;
		}
		
		public final class ViewHolder {
			public ImageView icon_imageView;
			public TextView name_textView;
			public TextView content_textView;
		}

}
