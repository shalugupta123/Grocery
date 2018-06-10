package com.alobha.grocery.customermnt;

import com.alobha.grocery.R;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.alobha.grocery.helpdone.HelpDoneActivity;
public class CustomerAgrmentActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_customeragreement);
		ImageView imv=(ImageView)findViewById(R.id.addAddress);
		imv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(CustomerAgrmentActivity.this, HelpDoneActivity.class);
				startActivity(i);
				
			}
		});

		}
	}
