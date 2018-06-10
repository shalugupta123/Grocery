package com.alobha.grocery.zip;

import com.alobha.grocery.R;
import com.alobha.grocery.addnewaddress.AddNewAddressActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeCorportaDeliveryActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_addnewaddresss);
		ImageView imv=(ImageView)findViewById(R.id.addAddress);
		imv.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent t=new Intent(HomeCorportaDeliveryActivity.this, AddNewAddressActivity.class);
					startActivity(t);
			}
		});
		TextView tv=(TextView)findViewById(R.id.tvt);
		tv.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent t=new Intent(HomeCorportaDeliveryActivity.this, AddNewAddressActivity.class);
					startActivity(t);
			}
		});
		TextView t=(TextView)findViewById(R.id.tvtcor);
		t.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent tt=new Intent(HomeCorportaDeliveryActivity.this, AddNewAddressActivity.class);
				startActivity(tt);
			}
		});
			

}
}