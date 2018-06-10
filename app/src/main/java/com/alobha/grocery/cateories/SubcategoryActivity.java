package com.alobha.grocery.cateories;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import com.alobha.grocery.cateories.CategoryActivity;
import com.alobha.grocery.R;
import com.alobha.grocery.adapter.Poduct;
import com.alobha.grocery.adapter.SubcategoryAdapter;
//import com.alobha.grocery.product.ProductActivity;
import com.alobha.grocery.product.ProductOneActivtiy;

public class SubcategoryActivity extends Activity {
	
	  String[] web = {
			    "Fruit",
			      "Vegetable",
			      "Seafood",
			      "meat",
			      "Itunes",
			      "Wordpress",
			      "Drupal",
			      "Fruit",
			      "Vegetable",
			      "Seafood",
			      "meat",
			      "Itunes",
			      "Wordpress",
			      "Drupal"
			  } ;
			  Integer[] imageId = {
			      R.drawable.fruit_img,
			      R.drawable.vegetable_img,
			      R.drawable.seafood_img,
			      R.drawable.meat_img,
			      R.drawable.deli_img,
			      R.drawable.fruit_img,
			      R.drawable.fruit_img,
			      R.drawable.fruit_img,
			      R.drawable.vegetable_img,
			      R.drawable.seafood_img,
			      R.drawable.meat_img,
			      R.drawable.deli_img,
			      R.drawable.fruit_img,
			      R.drawable.fruit_img,};
			  ImageView imv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.subcategory_activity);
		imv= (ImageView)findViewById(R.id.ivshop_btn);
		imv.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent inten= new Intent(SubcategoryActivity.this,CategoryActivity.class );
				startActivity(inten);
			}
		});
		
		ListView lv = (ListView) findViewById(R.id.listsubcatagory);

		ArrayList<Poduct> Poducts = new ArrayList<Poduct>();

		for (int i = 0; i < 12; i++) {
			Poduct obj = new Poduct();
			//obj.setProductname("Robin Raszaka" );
			

			Poducts.add(obj);
		}
	
		SubcategoryAdapter adapter = new SubcategoryAdapter(SubcategoryActivity.this,
				web,imageId);

		lv.setAdapter(adapter);

		
		lv.setOnItemClickListener(new OnItemClickListener() {
		 
		  @Override
		  public void onItemClick(AdapterView<?> arg0, View arg1,
		  int arg2, long arg3) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(SubcategoryActivity.this,
						ProductOneActivtiy.class);
					startActivity(intent);
		  }
		  
		  
		  
		  });
	
		 

	}


	}

