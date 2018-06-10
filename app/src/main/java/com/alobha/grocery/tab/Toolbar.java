package com.alobha.grocery.tab;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alobha.grocery.R;
import com.alobha.grocery.addtocart.CartScreensActivity;
import com.alobha.grocery.cateories.CategoryActivity;
import com.alobha.grocery.dashboard.HomescreenActivity;
import com.alobha.grocery.more.MoreActivity;
import com.alobha.grocery.reserve.delivery.ReserveDeliveryActivity;


public class Toolbar extends LinearLayout {

	public Toolbar(final Context context) {
		super(context);
	}
	
	public Toolbar(final Context con, AttributeSet attrs) {
		super(con,attrs);		
		setOrientation(HORIZONTAL);
		setBackgroundColor(getResources().
				getColor(android.R.color.transparent));

		LayoutInflater inflater = (LayoutInflater) 
		con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		inflater.inflate(R.layout.activity_footer, this);
		
		TypedArray a = con.obtainStyledAttributes(attrs, 
				R.styleable.Toolbar);
		String option = a.getString(R.styleable.Toolbar_tab_id);
		
		String resourceId = "com.alobha.grocery:id/"+option;
		int optionId = getResources().getIdentifier(resourceId,null,null);        		
		TextView currentOption = (TextView) findViewById(optionId);
		currentOption.setBackgroundColor(getResources().getColor(android.R.color.black));
		
		currentOption.setTextColor(getResources().
		getColor(android.R.color.black));
		currentOption.requestFocus(optionId);
		currentOption.setFocusable(false);
		currentOption.setClickable(false);
		TextView tab3=(TextView)findViewById(R.id.hometab);
		tab3.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(con, HomescreenActivity.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
				con.startActivity(intent);
			}
		});
		TextView tab4=(TextView)findViewById(R.id.spoontab);
		tab4.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(con, CategoryActivity.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
				con.startActivity(intent);
			}
		});
		TextView tab2=(TextView)findViewById(R.id.carttab);
		tab2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(con, CartScreensActivity.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
				con.startActivity(intent);
			}
		});
		TextView tab5=(TextView)findViewById(R.id.trucktab);
		tab5.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(con, ReserveDeliveryActivity.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
				con.startActivity(intent);
			}
		});		
		TextView tab1=(TextView)findViewById(R.id.icontab);
		tab1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(con, MoreActivity.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
				con.startActivity(intent);
			}//FLAG_ACTIVITY_CLEAR_TOP
		});
	}
}





