package com.alobha.grocery.helpdone;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import com.alobha.grocery.faqsupport.FaqSupportActivity;
import android.widget.AdapterView.OnItemClickListener;
import com.alobha.grocery.adapter.HelpDoneAdapter;
import com.alobha.grocery.addtocart.CartScreensActivity;
import com.alobha.grocery.R;
public class HelpDoneActivity extends Activity{
		ImageView imv;
		HelpDoneAdapter helpadp;
		ListView lv;
		protected void onCreate(Bundle savedInstanceState) {
			
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_helpdone);
			
			String[] Item = getResources().getStringArray(R.array.help);
			lv=(ListView)findViewById(R.id.lv_help);
			helpadp=new HelpDoneAdapter(this,Item);
			lv.setAdapter(helpadp);
			lv.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
						long arg3) {
					// TODO Auto-generated method stub
					
					Intent i= new Intent(HelpDoneActivity.this, FaqSupportActivity.class );
					startActivity(i);
				}
			});
			ImageView imv=(ImageView)findViewById(R.id.done);
			imv.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i = new Intent(HelpDoneActivity.this, CartScreensActivity.class);
					startActivity(i);
					
				}
			});
			//done
			
			}
}
