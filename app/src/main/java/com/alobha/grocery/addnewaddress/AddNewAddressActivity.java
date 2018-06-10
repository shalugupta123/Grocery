package com.alobha.grocery.addnewaddress;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.alobha.grocery.R;

import com.alobha.grocery.checkoutstep.CheckOutStepOneActivity;
import com.alobha.grocery.zip.HomeCorportaDeliveryActivity;

public class AddNewAddressActivity extends Activity {
	ImageView im;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_addnewadres);
		ImageView imv=(ImageView)findViewById(R.id.imageView1);
		imv.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				
				Intent t=new Intent(AddNewAddressActivity.this, HomeCorportaDeliveryActivity.class);
					startActivity(t);
			}
		});
		 im=(ImageView)findViewById(R.id.adrrrow);
		im.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				
				Intent t=new Intent(AddNewAddressActivity.this, YesNoActivity.class);
					startActivity(t);
			}
		});
		
		TextView i=(TextView)findViewById(R.id.imv_EditZip);
		i.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
			
				Intent t=new Intent(AddNewAddressActivity.this, CheckOutStepOneActivity.class);
					startActivity(t);
			}
		});
	}

}
