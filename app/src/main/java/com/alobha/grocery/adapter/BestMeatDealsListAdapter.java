package com.alobha.grocery.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.alobha.grocery.R;


public class BestMeatDealsListAdapter extends BaseAdapter{
	
	Context context;
	int img[];
	String ItemArray[];
	private LayoutInflater inflater;

public BestMeatDealsListAdapter(Context context, int img[], String ItemArray[]) {
	// TODO Auto-generated constructor stub
	this.context=context;
	this.ItemArray=ItemArray;
	this.img=img;
}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return ItemArray.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	
	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub

 ViewHolder holder;
		if (convertView == null) {
			inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater
					.inflate(R.layout.bestmeatdealslistow, null);
			holder = new ViewHolder();

			
			
			
			holder.ivName=(ImageView)convertView.findViewById(R.id.ivHomeImage);
			holder.textView=(TextView)convertView.findViewById(R.id.tvFruitDetail);
			
			
			
			
			
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		
		holder.ivName.setImageResource(img[position]);
		holder.textView.setText(ItemArray[position]);
		

		return convertView;
		
	}
	public class ViewHolder {
		ImageView ivName;
		TextView textView;
		
		
		
			}
}

