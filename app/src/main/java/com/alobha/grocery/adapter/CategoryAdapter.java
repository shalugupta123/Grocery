package com.alobha.grocery.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.alobha.grocery.R;


public class CategoryAdapter extends BaseAdapter {
	private LayoutInflater mInflater;
	private Activity mcontext;
	 Context context;
	 String[] web ;
	  Integer[] imageId;
	    LayoutInflater inflater;
	 

	public CategoryAdapter(Activity mcontext,
			 String[] web ,  Integer[] imageId) {
		this.web = web;
		this.imageId = imageId;
		mInflater = (LayoutInflater) mcontext
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

	}

	


	@Override
	public int getCount() {
		return web.length;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public Object getItem(int position) {

		return position;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		final ViewHolder holder;
		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.categry_datarow, null);
			holder = new ViewHolder();

			holder.imgSelection = (ImageView) convertView.findViewById(R.id.ivItem);
			holder.imgSelection.setImageResource(imageId[position]);
			holder.tvName = (TextView) convertView.findViewById(R.id.tvIteminfo);
			holder.tvName.setText(web[position]);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		
		
		return convertView;
	}

	public class ViewHolder {
		TextView tvName;
		ImageView imgSelection;
	}
}

