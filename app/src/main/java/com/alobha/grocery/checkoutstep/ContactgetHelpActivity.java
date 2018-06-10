package com.alobha.grocery.checkoutstep;

import com.alobha.grocery.R;

import android.app.Activity;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class ContactgetHelpActivity extends Activity {
	//imv_Done
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_contactgethelp);
		ImageView imv=(ImageView)findViewById(R.id.imv_Done);
		imv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i = new Intent(ContactgetHelpActivity.this,CheckOutStepOneActivity.class);
			startActivity(i);
				
			}
		});
	}

}
