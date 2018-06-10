package com.alobha.grocery.addtocart;
import com.alobha.grocery.zip.CheckZipCodeActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
//import com.alobha.grocery.product.ProductDetailActivity;
import com.alobha.grocery.R;
import com.alobha.grocery.adapter.AddproductCartSecondAdapter;
import com.alobha.grocery.adapter.AddproductCartpagerAdpter;

public class AddToCartActivity extends Activity{
	ViewPager pager;
	private ImageView imv;
	ViewPager pagersec;
	AddproductCartpagerAdpter addproductCartpagerAdpter;
	AddproductCartSecondAdapter addproductCartSecondAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.product_add_cart);
		imv =(ImageView)findViewById(R.id.imvEditZip);
		imv.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent inten = new Intent(AddToCartActivity.this, CheckZipCodeActivity.class);
				startActivity(inten);
			}
		});
		
		
		
		
		String[] ItemArray = getResources().getStringArray(R.array.AddcartItems);
		
		int[] fav_img = {R.drawable.image,R.drawable.image_s,R.drawable.image_r};
		
		pager=(ViewPager)findViewById(R.id.view);
		addproductCartpagerAdpter=new AddproductCartpagerAdpter(this,ItemArray,fav_img);
		pager.setAdapter(addproductCartpagerAdpter);
		
		pagersec=(ViewPager)findViewById(R.id.viewsec);
		addproductCartSecondAdapter=new AddproductCartSecondAdapter(this,ItemArray,fav_img);
		pagersec.setAdapter(addproductCartSecondAdapter);
		
		
	}

}
