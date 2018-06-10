package com.alobha.grocery.adapter;

import com.alobha.grocery.R;
import com.alobha.grocery.adapter.HelpAdapter.ViewHolder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MobileAdapter extends BaseAdapter{

	Context context;
	//int img[];
	String Item[];
	private LayoutInflater inflater;
	public MobileAdapter(Context context, String Item[])
	{
		this.context=context;
		this.Item=Item;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return Item.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if(convertView==null)
		{
			inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
		convertView = inflater
				.inflate(R.layout.activity_datamobileapp, null);
		holder = new ViewHolder();
		holder.txt=(TextView)convertView.findViewById(R.id.tv_data);
		//holder.ivName=(ImageView)convertView.findViewById(R.id.imv_orangeArro);
		convertView.setTag(holder);
	} 
	else 
	{
		
		holder = (ViewHolder) convertView.getTag();
	}
	//holder.ivName.setImageResource(img[position]);
	holder.txt.setText( Item[position]);
return convertView;
}
public class ViewHolder {
	//ImageView ivName;
	TextView txt;
	}
}
