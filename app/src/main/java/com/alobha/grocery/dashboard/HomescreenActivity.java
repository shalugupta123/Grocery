package com.alobha.grocery.dashboard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.alobha.grocery.R;
import com.alobha.grocery.adapter.DealsAdapter;
import com.alobha.grocery.adapter.ItemAdapter;
import com.alobha.grocery.bestdeals.BestMeatDealsActivity;
import com.alobha.grocery.cateories.CategoryActivity;
import com.alobha.grocery.faverties.FavertiesActivity;
import com.alobha.grocery.greatrightnowproduce.GreatRightNowProduceActivity;
import com.alobha.grocery.peresident.PresidentActivity;
import com.alobha.grocery.projectdescription.ProjectDescriptionActivity;

public class HomescreenActivity extends Activity {
	
	ViewPager pager;
	ItemAdapter adapter;
	 int[] flag;
	 String[] name;
	 ListView listView;
	 DealsAdapter listviewAdapter;
	 String[] name1;
	 RelativeLayout mRelBrowseStore;
	 RelativeLayout  mRlGroceryFaverties;
	 
	 
	 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
        String[] ItemArray = getResources().getStringArray(R.array.Items);
        int[] ImageArray = {R.drawable.home_img3,R.drawable.home_img2,R.drawable.home_img1,R.drawable.home_img3,R.drawable.home_img2,R.drawable.home_img1,R.drawable.home_img3,R.drawable.home_img2};
        

        mRlGroceryFaverties=(RelativeLayout)findViewById(R.id.RlGroceryFaverties);
        mRlGroceryFaverties.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(HomescreenActivity.this,
						FavertiesActivity.class);
					startActivity(intent);
			}
		});
        
        mRelBrowseStore=(RelativeLayout)findViewById(R.id.RelBrowseStore);

        mRelBrowseStore.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(HomescreenActivity.this,
						CategoryActivity.class);
					startActivity(intent);
			}
		});


        
        
        
        
        
    pager=(ViewPager)findViewById(R.id.view);
    adapter=new ItemAdapter(this, ItemArray, ImageArray);
    pager.setAdapter(adapter);
    
    
    
    String[] testArray = getResources().getStringArray(R.array.Deals);
    listView=(ListView)findViewById(R.id.lVDeals);
    
    System.out.println(testArray.length);
    listviewAdapter=new DealsAdapter(this,testArray);
    listView.setAdapter(listviewAdapter);
    listView.setOnItemClickListener(new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int position,
				long arg3) {
			// TODO Auto-generated method stub
		if (position==0) {
				Intent intent = new Intent(HomescreenActivity.this,
						PresidentActivity.class);
					startActivity(intent);
					
					
			}
			if (position==1) {
				Intent intent = new Intent(HomescreenActivity.this,
						GreatRightNowProduceActivity.class);
					startActivity(intent);
					
					
			}
		
			else if (position==2) {
				Intent intent = new Intent(HomescreenActivity.this,
						BestMeatDealsActivity.class);
					startActivity(intent);
					
					
			}
			
			if (position==3) {
				Intent intent = new Intent(HomescreenActivity.this,
						ProjectDescriptionActivity.class);
					startActivity(intent);
					
					
			}
		}
	});
  
   
}}
