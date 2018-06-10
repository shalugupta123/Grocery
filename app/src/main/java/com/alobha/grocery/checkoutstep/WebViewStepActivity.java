package com.alobha.grocery.checkoutstep;
import com.alobha.grocery.addtocart.CartScreensActivity;

import com.alobha.grocery.R;

import android.app.Activity;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class WebViewStepActivity extends Activity{
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_termwebview);
		ImageView imv=(ImageView)findViewById(R.id.imv_step2);
		imv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent o = new Intent(WebViewStepActivity.this,CartScreensActivity.class);
				startActivity(o);
				
			}
		});

}
}
