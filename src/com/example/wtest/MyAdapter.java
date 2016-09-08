package com.example.wtest;

import java.util.List;
import java.util.zip.Inflater;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter{

	private static final String TAG=MyAdapter.class.getSimpleName();
	private List<String> data;
	private Context context;
	
	private LayoutInflater infalter;
	public MyAdapter(Context cont,List<String> str)
	{
		this.context=cont;
		this.data = str;
		
		infalter = LayoutInflater.from(cont);
	}
	
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return data.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Log.d(TAG, "¡¾getView¡¿"+position);
		Holder holder = null;
		if(convertView==null)
		{
			convertView = infalter.inflate(R.layout.item, null);
			
			holder = new Holder();
			
			holder.iv = (ImageView) convertView.findViewById(R.id.iv);
			
			holder.tv = (TextView)convertView.findViewById(R.id.tv);
			
			convertView.setTag(holder);
		}else
		{
			holder = (Holder) convertView.getTag();
		}
		
		holder.tv.setText(data.get(position));
		
		return convertView;
	}
	
	
	class Holder{
		public ImageView iv;
		public TextView tv;
	}

}
