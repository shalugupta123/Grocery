package com.alobha.grocery.sendusamesage;
import com.alobha.grocery.adapter.SelectSubjectAdapter;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

import com.alobha.grocery.R;

public class SelectSubjectActivity extends Activity {
	//imv_sendrea
	SelectSubjectAdapter sadp;
	ListView lv;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_selectsubject);
		String[] arr=getResources().getStringArray(R.array.subject);
		lv=(ListView)findViewById(R.id.lvsel);
		sadp=new SelectSubjectAdapter(this, arr);
		lv.setAdapter(sadp);
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				
				Intent i= new Intent(SelectSubjectActivity.this, SendUsaMessageActivity.class );
				startActivity(i);
			}
		});
		ImageView imvv=(ImageView)findViewById(R.id.imv_sendrea);
		imvv.setOnClickListener(new OnClickListener()
				{
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent n=new Intent(SelectSubjectActivity.this, SendUsaMessageActivity.class); 
				startActivity(n);
			}
				});
		
}
}
