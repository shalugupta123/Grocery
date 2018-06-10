package com.alobha.grocery.adapter;

import com.alobha.grocery.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;




public class DealsAdapter extends BaseAdapter{
	Context context;
	String[] testArray;
	private LayoutInflater inflater;
	
	public DealsAdapter(Context context, String[] testArray) {
		// TODO Auto-generated constructor stub
		this.context=context;
		this.testArray=testArray;
		inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return testArray.length;
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
		final ViewHolder holder;
		if (convertView == null) {
			convertView = inflater
					.inflate(R.layout.list_row, null);
			holder = new ViewHolder();

			
			
			
			holder.tvName=(TextView)convertView.findViewById(R.id.tv_grocery);
			
			
			
			
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		
		holder.tvName.setText(testArray[position]);
		

		return convertView;
		
	}
	public class ViewHolder {
		TextView tvName;
			}
}


