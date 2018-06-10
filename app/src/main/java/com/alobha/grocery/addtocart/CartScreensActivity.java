package com.alobha.grocery.addtocart;
import com.alobha.grocery.checkoutstep.CheckOutStepOneActivity;
import com.alobha.grocery.customermnt.CustomerAgrmentActivity;
import com.alobha.grocery.R;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CartScreensActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.addcart_screens);
		ImageView iv=(ImageView)findViewById(R.id.imv_edit);
			iv.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i = new Intent(CartScreensActivity.this, CartEditDoneActivity.class);
					startActivity(i);
				}
			});
			//imvarro
			ImageView i=(ImageView)findViewById(R.id.imvarro);
			i.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i = new Intent(CartScreensActivity.this, CartEditDoneActivity.class);
					startActivity(i);
				}
			});
			//imageView4
			ImageView imv=(ImageView)findViewById(R.id.imageView4);
			imv.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i = new Intent(CartScreensActivity.this, CustomerAgrmentActivity.class);
					startActivity(i);
				}
			});
			//checktoconti
			ImageView ivv=(ImageView)findViewById(R.id.checktoconti);
			ivv.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i = new Intent(CartScreensActivity.this, CheckOutStepOneActivity.class);
					startActivity(i);
				}
			});
	}
	
}
