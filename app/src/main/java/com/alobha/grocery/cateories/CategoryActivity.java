package com.alobha.grocery.cateories;

import java.util.ArrayList;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.alobha.grocery.R;
import com.alobha.grocery.adapter.CategoryAdapter;
import com.alobha.grocery.adapter.Poduct;



public class CategoryActivity extends Activity{

	  String[] web = {
			    "Fruit",
			      "Vegetable",
			      "Seafood",
			      "meat",
			      "Itunes",
			      "Fruit",
			      "Vegetable",
			      "Seafood",
			      "meat",
			      "Itunes"
			  } ;
			  Integer[] imageId = {
			      R.drawable.fruit_img,
			      R.drawable.vegetable_img,
			      R.drawable.seafood_img,
			      R.drawable.meat_img,
			      R.drawable.deli_img,
			      R.drawable.fruit_img,
			      R.drawable.vegetable_img,
			      R.drawable.seafood_img,
			      R.drawable.meat_img,
			      R.drawable.deli_img,
			      };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.category_activity);
		
	
		
		
		ListView lv = (ListView) findViewById(R.id.listView1);

		ArrayList<Poduct> Poducts = new ArrayList<Poduct>();

		for (int i = 0; i < 9; i++) {
			Poduct obj = new Poduct();
			

			Poducts.add(obj);
		}
	
		CategoryAdapter adapter = new CategoryAdapter(CategoryActivity.this,
				web,imageId);

		lv.setAdapter(adapter);

		
		lv.setOnItemClickListener(new OnItemClickListener() {
		 
		  @Override
		  public void onItemClick(AdapterView<?> arg0, View arg1,
		  int arg2, long arg3) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(CategoryActivity.this,
						SubcategoryActivity.class);
					startActivity(intent);
		  }
		  
		  
		  
		  });
	
		 

	}


	}


