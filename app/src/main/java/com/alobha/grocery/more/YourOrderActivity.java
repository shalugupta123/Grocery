package com.alobha.grocery.more;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.alobha.grocery.R;

public class YourOrderActivity extends Activity {
	ImageView imv;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_order);
		imv=(ImageView)findViewById(R.id.more);
		imv.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent inten=new Intent(YourOrderActivity.this, MoreActivity.class);
				startActivity(inten);
			}
		});

}

}
