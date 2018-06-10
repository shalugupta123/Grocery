package com.alobha.grocery.mobleapp;
import com.alobha.grocery.sendusamesage.SendUsaMessageActivity;
import com.alobha.grocery.R;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ThanksActivity extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_thanks);
		TextView tv=(TextView)findViewById(R.id.tv_Ok);
		tv.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(ThanksActivity.this, SendUsaMessageActivity.class);
			startActivity(i);
			}
		});
		//txt=(TextView)findViewById(R.id.faqhelp);

}
}
