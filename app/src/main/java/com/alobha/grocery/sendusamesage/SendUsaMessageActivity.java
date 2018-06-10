package com.alobha.grocery.sendusamesage;

import com.alobha.grocery.R;
import com.alobha.grocery.mobleapp.ThanksActivity;
import com.alobha.grocery.more.ContactUsActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.alobha.grocery.more.ContactUsActivity;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class SendUsaMessageActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_send_us_a_message);
	TextView tv=(TextView)findViewById(R.id.tv_sendSms);
		 tv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent n=new Intent(SendUsaMessageActivity.this, ThanksActivity.class);
				startActivity(n);
			}
		});   
	ImageView imvv=(ImageView)findViewById(R.id.imv_arrow);
	imvv.setOnClickListener(new OnClickListener()
			{
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent n=new Intent(SendUsaMessageActivity.this, SelectSubjectActivity.class);
			startActivity(n);
		}
			});
	ImageView imv =(ImageView)findViewById(R.id.contact);
	imv.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent n=new Intent(SendUsaMessageActivity.this, ContactUsActivity.class);
			startActivity(n);
		}
	});


}
}