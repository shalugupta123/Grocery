package com.alobha.grocery.checkoutstep;

import com.alobha.grocery.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.RelativeLayout;
import android.widget.TextView;

public class AddNewPaymentActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {

	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_addnewpayment);
	RelativeLayout imv=(RelativeLayout)findViewById(R.id.rr_Addnewpay);
	imv.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
		Intent intent =new Intent(AddNewPaymentActivity.this,CreditCardActivity.class);	
			startActivity(intent);
		}
	});
		
	TextView im=(TextView)findViewById(R.id.imv_Step3);
	im.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
		Intent i = new Intent( AddNewPaymentActivity.this, CheckoutStepThreeActivity.class);
		startActivity(i);
		}
	});
	//imv_Step3
	//imv_arrow
	}
}

