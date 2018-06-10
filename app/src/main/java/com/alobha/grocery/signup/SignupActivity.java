package com.alobha.grocery.signup;
import com.alobha.grocery.dashboard.HomescreenActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.alobha.grocery.zip.CheckZipCodeActivity;

import com.alobha.grocery.R;

public class SignupActivity extends Activity {
	ImageView imv;
	TextView tvshop;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signup);
		imv=(ImageView)findViewById(R.id.imv_EditZip);
		imv.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent inten=new Intent(SignupActivity.this, CheckZipCodeActivity.class );
				startActivity(inten);
			}
		});
		tvshop=(TextView)findViewById(R.id.tvstartshop);
		tvshop.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent inten=new Intent(SignupActivity.this, HomescreenActivity.class);
				startActivity(inten);
			}
		});

}
}
