package com.alobha.grocery.checkoutstep;

import com.alobha.grocery.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class CheckOutStepTwoActivity extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.fragement_checkoutsteptwo);
		RelativeLayout rl=(RelativeLayout)findViewById(R.id.rl_deladdr);
		ImageView imv=(ImageView)findViewById(R.id.imgStepbtn);
		imv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent it=new Intent(CheckOutStepTwoActivity.this, CheckOutStepOneActivity.class);
				startActivity(it);
			}
		});
		TextView tv=(TextView)findViewById(R.id.tvOrderBy);
		tv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent it=new Intent(CheckOutStepTwoActivity.this, CheckoutStepThreeActivity.class);
				startActivity(it);
			}
		});
	}
}