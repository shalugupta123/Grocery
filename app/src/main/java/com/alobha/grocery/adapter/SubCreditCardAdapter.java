package com.alobha.grocery.adapter;

import com.alobha.grocery.R;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

public class SubCreditCardAdapter extends BaseAdapter {

	Context ctx;
	String[] a;
	LayoutInflater inflater;
	public SubCreditCardAdapter(Context ctx, String[] a){
		this.ctx =ctx;
		this.a=a;
	}
	@Override
	
	public int getCount() {
		// TODO Auto-generated method stub
		return a.length;
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
			inflater=(LayoutInflater)ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);
		convertView = inflater
				.inflate(R.layout.activity_datasubcreditcard, null);
		holder = new ViewHolder();
		holder.txt=(TextView)convertView.findViewById(R.id.tvt);
		holder.cbox=(CheckBox)convertView.findViewById(R.id.chbox);
		
		//holder.ivName=(ImageView)convertView.findViewById(R.id.imv_orangeArro);
		convertView.setTag(holder);
	} 
	else 
	{
		
		holder = (ViewHolder) convertView.getTag();
	}
	//holder.ivName.setImageResource(img[position]);
	holder.txt.setText( a[position]);
	//holder.tx.setText( Item[position]);
return convertView;
}
public class ViewHolder {
	//ImageView ivName;
	TextView txt;

	CheckBox cbox;
	}
}
