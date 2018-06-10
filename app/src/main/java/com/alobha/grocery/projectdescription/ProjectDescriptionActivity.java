package com.alobha.grocery.projectdescription;
import com.alobha.grocery.product.ProductDetailActivity;
import com.alobha.grocery.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class ProjectDescriptionActivity extends Activity {
	
	private ImageView imv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.productdescription);
		imv=(ImageView)findViewById(R.id.imvBack);
		imv.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent inten = new Intent(ProjectDescriptionActivity.this, ProductDetailActivity.class);
				startActivity(inten);
				
			}
		});
		//setContentView(R.layout.product_add_cart);
	}

}
