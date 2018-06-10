package com.alobha.grocery.faqsupport;
import com.alobha.grocery.mobleapp.MobileAppActivity;
import com.alobha.grocery.R;
import com.alobha.grocery.more.HelpActivity;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.alobha.grocery.adapter.FaqAdapter;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

public class FaqSupportActivity extends Activity{
	ListView lv;
	FaqAdapter fadpt;
	TextView txt;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_faqsuport);
		txt=(TextView)findViewById(R.id.faqhelp);
		txt.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent t=new Intent(FaqSupportActivity.this,HelpActivity.class);
				startActivity(t);
			};
		});
		//int img[]={R.drawable.item1,R.drawable.item2,R.drawable.item3,R.drawable.item4,R.drawable.item4,R.drawable.item5,R.drawable.item6,R.drawable.item1,R.drawable.item1,R.drawable.item1,R.drawable.item1,R.drawable.item1,R.drawable.item1};
		String[] Item = getResources().getStringArray(R.array.faq);
		lv=(ListView)findViewById(R.id.lv_faqhelp);
		fadpt=new FaqAdapter(this, Item);
		lv.setAdapter(fadpt);
		
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				Intent intent = new Intent(FaqSupportActivity.this, MobileAppActivity.class);
					startActivity(intent);
			}
		});

		
}
}
