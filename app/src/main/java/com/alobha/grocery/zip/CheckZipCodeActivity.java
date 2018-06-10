package com.alobha.grocery.zip;
import com.alobha.grocery.auth.LoginActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;

import com.alobha.grocery.R;

public class CheckZipCodeActivity extends Activity {
	
	private TextView btCheckZip;
	private ImageButton imvb;
	FrameLayout ff;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.check_zipcode_activity);
		ff=(FrameLayout)findViewById(R.id.ffff);
		ff.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent t=new Intent(CheckZipCodeActivity.this, HomeCorportaDeliveryActivity.class );
				startActivity(t);
				
			}
		});

		imvb=(ImageButton)findViewById(R.id.iv_header);
		imvb.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent inten = new Intent(CheckZipCodeActivity.this,LoginActivity.class);
				startActivity(inten);
			}
		});
		btCheckZip= (TextView)findViewById(R.id.iv_checkzip);
		btCheckZip.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent = new Intent(CheckZipCodeActivity.this,ZipCodeNotifyActivity.class);
				startActivity(intent);
				
			}
		});
	}
}

