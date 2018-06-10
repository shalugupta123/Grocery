package com.alobha.grocery.mobleapp;

import com.alobha.grocery.R;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MobileAppUnderActivity extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mobilehelp);
		//txt=(TextView)findViewById(R.id.faqhelp);
		TextView tv=(TextView)findViewById(R.id.tv_help);
		tv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent iten=new Intent(MobileAppUnderActivity.this, MobileAppActivity.class);
				startActivity(iten);
				
			}
		});
	}
	

}
