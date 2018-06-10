package com.alobha.grocery.more;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ListView;

import com.alobha.grocery.R;
import com.alobha.grocery.adapter.AboutAdapter;



public class AboutActivity extends Activity {
	ImageView imv;
	AboutAdapter helpadp;
	ListView lv;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		String[] Item = getResources().getStringArray(R.array.about);
		lv=(ListView)findViewById(R.id.lv_about);
		helpadp=new AboutAdapter(this,Item);
		lv.setAdapter(helpadp);
		imv=(ImageView)findViewById(R.id.more);
		imv.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent inten=new Intent(AboutActivity.this, MoreActivity.class);
				startActivity(inten);
			}
		});

}
}
