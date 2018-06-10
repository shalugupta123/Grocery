package com.alobha.grocery.more;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import com.alobha.grocery.faqsupport.FaqSupportActivity;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import com.alobha.grocery.adapter.HelpAdapter;
import com.alobha.grocery.R;
public class HelpActivity extends Activity{
	ImageView imv;
	HelpAdapter helpadp;
	ListView lv;
	//
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		// 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_help);
		//int img[]={R.drawable.item1,R.drawable.item2,R.drawable.item3,};
		String[] Item = getResources().getStringArray(R.array.help);
		lv=(ListView)findViewById(R.id.lv_help);
		helpadp=new HelpAdapter(this,Item);
		lv.setAdapter(helpadp);
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				
				Intent i= new Intent(HelpActivity.this, FaqSupportActivity.class );
				startActivity(i);
			}
		});		
		
		imv=(ImageView)findViewById(R.id.more);
		imv.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent inten=new Intent(HelpActivity.this, MoreActivity.class);
				startActivity(inten);
			}
		});
		

}

}
