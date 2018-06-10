package com.alobha.grocery.bestdeals;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.alobha.grocery.R;
import com.alobha.grocery.adapter.BestMeatDealsListAdapter;

public class BestMeatDealsActivity extends Activity{
	ListView listView;
	BestMeatDealsListAdapter adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bestmealsdeal);
		
		int img[]={R.drawable.item1,R.drawable.item2,R.drawable.item3,R.drawable.item4,R.drawable.item1,R.drawable.item2,R.drawable.item3,R.drawable.item4};
		String[] ItemArray = getResources().getStringArray(R.array.Items);

		
		listView=(ListView)findViewById(R.id.lvGreatRight);
		adapter=new BestMeatDealsListAdapter(this,img,ItemArray);
		listView.setAdapter(adapter);
	}

}
