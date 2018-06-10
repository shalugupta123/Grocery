package com.alobha.grocery.greatrightnowproduce;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

import com.alobha.grocery.R;
import com.alobha.grocery.adapter.GreatrightNowproduceListAdapter;
//import com.alobha.grocery.peresident.PresidentActivity;
import com.alobha.grocery.product.ProductDetailActivity;



public class GreatRightNowProduceActivity extends Activity {
	ListView listView;
	GreatrightNowproduceListAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_greatrightnowproduce);
		int img[]={R.drawable.item1,R.drawable.item2,R.drawable.item3,R.drawable.item4,R.drawable.item1,R.drawable.item2,R.drawable.item3,R.drawable.item4};
		String[] ItemArray = getResources().getStringArray(R.array.Items);

		
		listView=(ListView)findViewById(R.id.lvGreatRight);
		adapter=new GreatrightNowproduceListAdapter(this,img,ItemArray);
		listView.setAdapter(adapter);
		
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				Intent intent = new Intent(GreatRightNowProduceActivity.this,
						ProductDetailActivity.class);
					startActivity(intent);
			}
		});
	}

	
	}

	
