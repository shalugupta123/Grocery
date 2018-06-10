package com.alobha.grocery.adapter;

import com.alobha.grocery.R;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class ItemAdapter extends PagerAdapter{
	Context context;
	String[] ItemArray;
	 int[] ImageArray;
	 private LayoutInflater inflater; 
	
	public ItemAdapter(Context context, String[] ItemArray, int[] ImageArray) {
		// TODO Auto-generated constructor stub
		this.context=context;
		this.ItemArray=ItemArray;
		this.ImageArray=ImageArray;
		
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return ItemArray.length;
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
		View iteView=inflater.inflate(R.layout.pager_row, null);
		
		TextView textView=(TextView)iteView.findViewById(R.id.tv_organic);
		ImageView imageView=(ImageView)iteView.findViewById(R.id.img_home3);
		
		imageView.setImageResource(ImageArray[position]);
		textView.setText(ItemArray[position]);
		 container.addView(iteView);
		return iteView;
	}
	
	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		// TODO Auto-generated method stub
		  container.removeView((View) object);
		
	}
	
}
