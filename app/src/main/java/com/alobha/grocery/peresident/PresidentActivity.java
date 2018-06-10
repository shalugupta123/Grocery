package com.alobha.grocery.peresident;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.alobha.grocery.R;
import com.alobha.grocery.adapter.PresidentAdapter;
import com.alobha.grocery.adapter.Presidentuserdata;
import com.alobha.grocery.product.ProductDetailActivity;

public class PresidentActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.productscreen);
		
		
		ListView lv = (ListView) findViewById(R.id.listview);
		
		
		ArrayList<Presidentuserdata> userdatas = new ArrayList<Presidentuserdata>();

		for (int i = 0; i < 10; i++) {
			Presidentuserdata obj = new Presidentuserdata();

			obj.setfruitdetail("Red Jacket Orchard" + i);
			obj.setfruitname("CSA with Fruit,cheese and juice" + i);
			obj.setfruitprice("$29.99/ea" + i);

			userdatas.add(obj);

			PresidentAdapter adapter = new PresidentAdapter(PresidentActivity.this,
					userdatas);

			lv.setAdapter(adapter);

			lv.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					Intent intent = new Intent(PresidentActivity.this,
							ProductDetailActivity.class);
						startActivity(intent);
				}
			});
		}
	}
}
