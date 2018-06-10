package com.alobha.grocery.faverties;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.alobha.grocery.R;
import com.alobha.grocery.adapter.FavertiesAdapeter;
import com.alobha.grocery.adapter.userdata;
import com.alobha.grocery.product.ProductDetailActivity;

public class FavertiesActivity extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		FavertiesAdapeter adapter ;
		setContentView(R.layout.faverties_activity);
		
		
		ListView lv = (ListView) findViewById(R.id.listviewfav);
		
		
		ArrayList<userdata> userdatas = new ArrayList<userdata>();

		for (int i = 0; i < 10; i++) {
			userdata obj = new userdata();

			obj.setfruitdetail("Red Jacket Orchard" + i);
			obj.setfruitname("CSA with Fruit,cheese and juice" + i);
			obj.setfruitprice("$29.99/ea" + i);

			userdatas.add(obj);

			 adapter = new FavertiesAdapeter(FavertiesActivity.this,
					userdatas);

			lv.setAdapter(adapter);

			lv.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					Intent intent = new Intent(FavertiesActivity.this,
							ProductDetailActivity.class);
						startActivity(intent);
				}
			});
		}
	}
}


