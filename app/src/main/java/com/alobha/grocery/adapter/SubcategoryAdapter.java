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

public class SubcategoryAdapter extends BaseAdapter{
	private LayoutInflater mInflater;
	private Activity mcontext;
	 Context context;
	 String[] web ;
	  Integer[] imageId;
	    LayoutInflater inflater;
	 

	public SubcategoryAdapter(Activity mcontext,
			 String[] web ,  Integer[] imageId) {
		this.web = web;
		this.imageId = imageId;
		mInflater = (LayoutInflater) mcontext
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

	}

	


	@Override
	public int getCount() {
		return 6;
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
			convertView = mInflater.inflate(R.layout.subcategoryrow, null);
			holder = new ViewHolder();

			holder.imgSelection = (ImageView) convertView.findViewById(R.id.ivproduct);
			holder.imgSelection.setImageResource(imageId[position]);
			holder.tvName = (TextView) convertView.findViewById(R.id.tvproductsub);
			holder.tvName.setText(web[position]);
			convertView.setTag(holder);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		//holder.tvName.setText(Poducts.get(position).getProductname());
		
		return convertView;
	}

	public class ViewHolder {
		TextView tvName;
		ImageView imgSelection;
	}
}





