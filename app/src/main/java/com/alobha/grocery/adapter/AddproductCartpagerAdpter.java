package com.alobha.grocery.adapter;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.alobha.grocery.R;

public class AddproductCartpagerAdpter extends PagerAdapter  {
	Context context;
	String[] ItemArray;
	int[] fav_img;
	private LayoutInflater inflater; 
	
	public AddproductCartpagerAdpter(Context context, String[] ItemArray, int[] fav_img) {
		// TODO Auto-generated constructor stub
		this.context=context;
		this.ItemArray=ItemArray;
		this.fav_img=fav_img;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return fav_img.length;
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		// TODO Auto-generated method stub
		return (arg0==arg1);
	}
	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		// TODO Auto-generated method stub
		
		 inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
		View view=inflater.inflate(R.layout.addcart_pager_row, null);
		
		TextView textView=(TextView)view.findViewById(R.id.tv_organic);
		ImageView imageView=(ImageView)view.findViewById(R.id.img_home3);
		
		imageView.setImageResource(fav_img[position]);
		textView.setText(ItemArray[position]);
		 container.addView(view);
		return view;
	}
	
	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		// TODO Auto-generated method stub
		 container.removeView((View) object);
}
}