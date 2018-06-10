package com.alobha.grocery.adapter;

import com.alobha.grocery.R;
import com.alobha.grocery.adapter.HelpAdapter.ViewHolder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class SelectSubjectAdapter  extends BaseAdapter {
	Context context;
	String[] arr;
	LayoutInflater inflater;
	public SelectSubjectAdapter(Context context, String[] arr){
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
		ViewHolder holder;
		if(convertView==null)
		{
			inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
		convertView = inflater
				.inflate(R.layout.activity_dataselctsubject, null);
		holder = new ViewHolder();
		holder.txt=(TextView)convertView.findViewById(R.id.tv_selSubject);
		//holder.ivName=(ImageView)convertView.findViewById(R.id.imv_orangeArro);
		convertView.setTag(holder);
	} 
	else 
	{
		
		holder = (ViewHolder) convertView.getTag();
	}
	//holder.ivName.setImageResource(img[position]);
	holder.txt.setText( arr[position]);
return convertView;
}
public class ViewHolder {
	//ImageView ivName;
	TextView txt;
	}
}