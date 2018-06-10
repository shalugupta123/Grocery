package com.alobha.grocery.forgetpassword;

import com.alobha.grocery.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.alobha.grocery.auth.LoginActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class ForgotPasswordActivity extends Activity{
	ImageView imv;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_forgetpassword);
		imv=(ImageView)findViewById(R.id.imv_login);
		imv.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent iten=new Intent(ForgotPasswordActivity.this, LoginActivity.class);
				// TODO Auto-generated method stub
				startActivity(iten);
				
			}
		});

}
}
