package com.alobha.grocery.checkoutstep;

import com.alobha.grocery.R;
import com.alobha.grocery.addnewaddress.AddNewAddressActivity;
import com.alobha.grocery.zip.HomeCorportaDeliveryActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class CheckOutStepOneActivity extends Activity{
	
//plus
	//rl_deladdr
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_checkoutstepone);
		ImageView imv=(ImageView)findViewById(R.id.plus);
		imv.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent t=new Intent(CheckOutStepOneActivity.this, AddNewAddressActivity.class);
					startActivity(t);
			}
		});
		RelativeLayout rl=(RelativeLayout)findViewById(R.id.rl_deladdr);
		rl.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent t=new Intent(CheckOutStepOneActivity.this, AddNewAddressActivity.class);
					startActivity(t);
			}
		});
		
		RelativeLayout rl1=(RelativeLayout)findViewById(R.id.rl_add);
		rl1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent t=new Intent(CheckOutStepOneActivity.this, CheckOutStepTwoActivity.class);
					startActivity(t);
			}
		});
		
}
}