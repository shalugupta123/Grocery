package com.alobha.grocery.checkoutstep;

import com.alobha.grocery.R;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CheckoutStepThreeActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chekoutstep3);
		//ImageView imvc=(ImageView)findViewById(R.id.cirplus);
		ImageView imvc=(ImageView)findViewById(R.id.plus);
		TextView tv=(TextView)findViewById(R.id.imv_EditZip);
		tv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(CheckoutStepThreeActivity.this,CheckOutStepTwoActivity.class);
				startActivity(i);
			}
		});
		imvc.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i = new Intent(CheckoutStepThreeActivity.this,AddNewPaymentActivity.class);
		startActivity(i);
			}
		});
		RelativeLayout imvp=(RelativeLayout)findViewById(R.id.rrrrrr);
		imvp.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i = new Intent(CheckoutStepThreeActivity.this,AddNewPaymentActivity.class);
			startActivity(i);
			}
		});
		
}
}
