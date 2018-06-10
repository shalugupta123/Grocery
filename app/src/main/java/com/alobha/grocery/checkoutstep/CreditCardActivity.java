package com.alobha.grocery.checkoutstep;
import com.alobha.grocery.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.view.View.OnClickListener;
import android.widget.ImageView;

import android.widget.TextView;
public class CreditCardActivity extends Activity{
//back
	//imvsave
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_creditcard);
		TextView tx=(TextView)findViewById(R.id.tv_Creditback);
		tx.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i = new Intent( CreditCardActivity.this, AddNewPaymentActivity.class);
			startActivity(i);
			}
		});
		ImageView imcxv=(ImageView)findViewById(R.id.imv_Creditsave);
		imcxv.setOnClickListener(new OnClickListener() {
		//tvback
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i = new Intent( CreditCardActivity.this, CreditCardActivity.class);
			startActivity(i);
			}
		});
		
		
		ImageView imvamex=(ImageView)findViewById(R.id.imv_Amex);
		imvamex.setOnClickListener(new OnClickListener() {
		@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i = new Intent( CreditCardActivity.this, SubCreditActivity.class);
			startActivity(i);
			}
		});
		TextView tvv=(TextView)findViewById(R.id.tv_Creditterms);
		tvv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i = new Intent( CreditCardActivity.this, WebViewStepActivity.class);
			startActivity(i);
			}
		});
}
}