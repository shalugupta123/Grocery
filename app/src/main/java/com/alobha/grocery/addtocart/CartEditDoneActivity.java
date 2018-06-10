package com.alobha.grocery.addtocart;

import com.alobha.grocery.R;
import com.alobha.grocery.customermnt.CustomerAgrmentActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class CartEditDoneActivity extends Activity

//imageView6
{
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cartdoneedit);
		ImageView iv=(ImageView)findViewById(R.id.imageView6);
		iv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(CartEditDoneActivity .this, CartScreensActivity.class);
				startActivity(i);
			}
		});
		ImageView imv=(ImageView)findViewById(R.id.imageView4);
		imv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(CartEditDoneActivity.this, CustomerAgrmentActivity.class);
				startActivity(i);
			}
		});
	}
}
