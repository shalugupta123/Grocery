package com.alobha.grocery.more;
import com.alobha.grocery.sendusamesage.SendUsaMessageActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.alobha.grocery.R;

public class ContactUsActivity extends Activity{
	ImageView imv;
	LinearLayout llsms;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contactus);
		llsms=(LinearLayout)findViewById(R.id.ll_sendSms);
		llsms.setOnClickListener(new OnClickListener() {
		@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent iten=new Intent( ContactUsActivity.this, SendUsaMessageActivity.class);
				startActivity(iten);
			}
		});
		imv=(ImageView)findViewById(R.id.imv_More);
		imv.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent inten=new Intent(ContactUsActivity.this, MoreActivity.class);
				startActivity(inten);
			}
		});

}

}
