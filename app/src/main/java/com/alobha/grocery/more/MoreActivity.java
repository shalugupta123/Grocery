package com.alobha.grocery.more;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.alobha.grocery.auth.LoginActivity;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.RelativeLayout;

import com.alobha.grocery.R;

public class MoreActivity extends Activity {
	//ImageView imv;
	RelativeLayout rlcon,order,help,about,logout;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_more);
		logout=(RelativeLayout)findViewById(R.id.rl_Logout);
		logout.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent iten=new Intent(MoreActivity.this, LoginActivity.class);
				startActivity(iten);
			}
		});
		rlcon=(RelativeLayout)findViewById(R.id.ll_contact);
		rlcon.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent inten=new Intent(MoreActivity.this, ContactUsActivity.class);
				startActivity(inten);
			}
		});
		
		order=(RelativeLayout)findViewById(R.id.rl_YourOrder);
		order.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent inten=new Intent(MoreActivity.this, YourOrderActivity.class);
				startActivity(inten);
			}
		});
		help=(RelativeLayout)findViewById(R.id.rl_Help);
		help.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent inten=new Intent(MoreActivity.this, HelpActivity.class);
				startActivity(inten);
			}
		});
		about=(RelativeLayout)findViewById(R.id.rl_About);
		about.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent inten=new Intent(MoreActivity.this, AboutActivity.class);
				startActivity(inten);
			}
		});
		


}
}
