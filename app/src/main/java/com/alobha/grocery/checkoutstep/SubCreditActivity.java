package com.alobha.grocery.checkoutstep;
import com.alobha.grocery.adapter.SubCreditCardAdapter;
import android.widget.ListView;
import com.alobha.grocery.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
public class SubCreditActivity extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		SubCreditCardAdapter scca;
		ListView lv;
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_subcreditcard);
		ImageView imvc=(ImageView)findViewById(R.id.imv_subCreditButton);
		imvc.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i = new Intent( SubCreditActivity.this, CreditCardActivity.class);
			startActivity(i);
			}
		});
		lv=(ListView)findViewById(R.id.lv_subCredit);
				String[] arrr=getResources().getStringArray(R.array.subcrd);
			 scca=new SubCreditCardAdapter(this, arrr);
				lv.setAdapter(scca);
				lv.setOnClickListener(new OnClickListener(
						) {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent intent=new Intent(SubCreditActivity.this,CreditCardActivity.class);
						startActivity(intent);
					}
				});
	}
}

