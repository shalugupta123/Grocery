package com.alobha.grocery.addnewaddress;

import com.alobha.grocery.R;
import com.alobha.grocery.zip.HomeCorportaDeliveryActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class YesNoActivity extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_yesno);
		ImageView imv=(ImageView)findViewById(R.id.imageView1);
		imv.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent t=new Intent(YesNoActivity.this, AddNewAddressActivity.class);
					startActivity(t);
			}
		});
		TextView txt=(TextView)findViewById(R.id.tvt);
		txt.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent t=new Intent(YesNoActivity.this, AddNewAddressActivity.class);
					startActivity(t);
			}
		});
		TextView tx=(TextView)findViewById(R.id.tvtno);
		tx.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent t=new Intent(YesNoActivity.this, AddNewAddressActivity.class);
					startActivity(t);
			}
		});
}
}
