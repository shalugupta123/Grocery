package com.alobha.grocery.product;
import com.alobha.grocery.zip.CheckZipCodeActivity;
import com.alobha.grocery.R;
import com.alobha.grocery.addtocart.AddToCartActivity;
import com.alobha.grocery.projectdescription.ProjectDescriptionActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ProductDetailActivity extends Activity {
	LinearLayout mproductdetail;
    TextView mivAddtocartbtn;
   // ImageView imv;v
    private ImageView imv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.products_details_creen);
		imv=(ImageView)findViewById(R.id.ivlogologin);
		imv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Intent inten=new Intent(ProductDetailActivity.this, CheckZipCodeActivity.class);
			startActivity(inten);
			}
		});
		mivAddtocartbtn=(TextView)findViewById(R.id.ivAddtocartbtn);
		mivAddtocartbtn.setOnClickListener(new OnClickListener() {
			
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ProductDetailActivity.this,
						AddToCartActivity.class);
					startActivity(intent);
			}
		});

		mproductdetail=(LinearLayout)findViewById(R.id.productdetail);
		mproductdetail.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ProductDetailActivity.this,
						ProjectDescriptionActivity.class);
					startActivity(intent);
			}
		});

	}

}
