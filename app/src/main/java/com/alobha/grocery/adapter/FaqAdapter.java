package com.alobha.grocery.adapter;

import java.util.zip.Inflater;

import com.alobha.grocery.R;
import com.alobha.grocery.adapter.BestMeatDealsListAdapter.ViewHolder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class FaqAdapter extends BaseAdapter {
	Context context;
	String arr[];
	//int img[];
	private LayoutInflater inflater;
	public FaqAdapter(final Context context, String arr[])
	{
		this.context=context;
		
		this.arr=arr;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return arr.length;
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
		ViewHolder vhold;
		if(convertView==null)
		{
			inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.activity_datafaqsupport, null);
		vhold = new ViewHolder();
		vhold.txt=(TextView)convertView.findViewById(R.id.tv_text);
		//vhold.ivName=(ImageView)convertView.findViewById(R.id.arrow);
		convertView.setTag(vhold);
	} 
	else 
	{
		
		vhold = (ViewHolder) convertView.getTag();
	}
	//vhold.ivName.setImageResource(img[position]);
	vhold.txt.setText( arr[position]);
return convertView;
}
public class ViewHolder {
	//ImageView ivName;
	TextView txt;
	}
}
