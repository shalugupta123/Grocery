package com.alobha.grocery.mobleapp;
import com.alobha.grocery.R;
import com.alobha.grocery.faqsupport.FaqSupportActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import com.alobha.grocery.adapter.MobileAdapter;
import android.widget.AdapterView;

import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class MobileAppActivity extends Activity{
	MobileAdapter madpt;
	ListView lv;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mobileapphelp);
		//txt=(TextView)findViewById(R.id.faqhelp);
		TextView imv=(TextView)findViewById(R.id.mobilefaqhelp);
		imv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent n=new Intent(MobileAppActivity.this, FaqSupportActivity.class);
			startActivity(n);
			}
		});
		String[] arr=getResources().getStringArray(R.array.mobileapp);
		lv=(ListView)findViewById(R.id.lv_mobileappfaqhelp);
		madpt=new MobileAdapter(this, arr);
		lv.setAdapter(madpt);
		
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				Intent intent = new Intent(MobileAppActivity.this, MobileAppUnderActivity.class);
					startActivity(intent);
			}
		});
}
}
