package com.alobha.grocery.auth;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alobha.grocery.R;
import com.alobha.grocery.dashboard.HomescreenActivity;
import com.alobha.grocery.zip.CheckZipCodeActivity;
import com.alobha.grocery.forgetpassword.ForgotPasswordActivity;
public class LoginActivity extends Activity implements OnClickListener {
	
	private LinearLayout ll,ll1;
	private TextView tvfpass;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_activity);
		
		getId();
		tvfpass=(TextView)findViewById(R.id.tv_fpassword);
		tvfpass.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(LoginActivity.this,ForgotPasswordActivity.class );

				startActivity(i);
				Log.e("+++++++","++++++++++++");
			}
		});
		//9540031616
		//98999894907

	}

	public void getId() {
		ll = (LinearLayout) findViewById(R.id.ll_btlogin);
		
		ll.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(LoginActivity.this,
						HomescreenActivity.class);
					startActivity(intent);
			}
		});
		
		//9650388848
		
		ll1=(LinearLayout)findViewById(R.id.ll_btloginnew);

		ll1.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {

		case R.id.ll_btloginnew:
			Intent intent = new Intent(LoginActivity.this,CheckZipCodeActivity.class);
			startActivity(intent);

			break;

		}
	}
}
