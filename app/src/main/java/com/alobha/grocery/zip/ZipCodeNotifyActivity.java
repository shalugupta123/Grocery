package com.alobha.grocery.zip;
import com.alobha.grocery.signup.SignupActivity;


import com.alobha.grocery.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import android.widget.TextView;

public class ZipCodeNotifyActivity extends Activity {
		ImageButton imvbut;
		TextView imv;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.zip_code_notify_activity);
		
		imv=(TextView)findViewById(R.id.iv_start);
		
		imv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent inten=new Intent(ZipCodeNotifyActivity.this, SignupActivity.class);
				startActivity(inten);
			}
		});
		imvbut=(ImageButton)findViewById(R.id.iv_header);
        imvbut.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent = new Intent(ZipCodeNotifyActivity.this, CheckZipCodeActivity.class);
				startActivity(intent);
				
			}
		});
	}
}