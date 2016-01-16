package com.weixin.test;


import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.test.R;

public class TestActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		final Context context;
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_main);

		context = this;
		Button btn = (Button) this.findViewById(R.id.btn1);
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				testWxLogin(context);
				
			}
		});

		Button btn2 = (Button) this.findViewById(R.id.btn2);
		btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				testWxTongxulu(context);
				
			}
		});
		
		Button btn3 = (Button) this.findViewById(R.id.btn3);
		btn3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				testWxFaxian(context);
				
			}
		});
		
		Button btn4 = (Button) this.findViewById(R.id.btn4);
		btn4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				testWxAll(context);
				
			}
		});
	}

	public static void testWxLogin(Context c){
		try {
			Bundle bundle = new Bundle();
			bundle.putString("class","com.weixin.test.TestWxLogin#testCase1");
			bundle.putString("data_suffix","/.1");
			ComponentName cn = new ComponentName("com.example.test","android.test.InstrumentationTestRunner");

			c.startInstrumentation(cn, null, bundle);
		} catch (Exception e) {
			Log.e("", "Exception e:"+e.getMessage());
			return;
		}
	}
	
	public static void testWxTongxulu(Context c){
		try {
			Bundle bundle = new Bundle();
			//bundle.putString("class","com.weixin.test.TestWxTongxunlu#testCase1");
			bundle.putString("class","com.weixin.command.TestTongxunlu#testBase");
			bundle.putString("data_suffix","/.1");
			ComponentName cn = new ComponentName("com.example.test","android.test.InstrumentationTestRunner");

			c.startInstrumentation(cn, null, bundle);
		} catch (Exception e) {
			Log.e("", "Exception e:"+e.getMessage());
			return;
		}
	}
	
	public static void testWxFaxian(Context c){
		try {
			Bundle bundle = new Bundle();
			//bundle.putString("class","com.weixin.test.TestWxFaxian#testCase1");
			bundle.putString("class","com.weixin.command.TestFaxian#testBase");
			bundle.putString("data_suffix","/.1");
			ComponentName cn = new ComponentName("com.example.test","android.test.InstrumentationTestRunner");

			c.startInstrumentation(cn, null, bundle);
		} catch (Exception e) {
			Log.e("", "Exception e:"+e.getMessage());
			return;
		}
	}
	
	public static void testWxAll(Context c){
		try {
			Bundle bundle = new Bundle();
			//bundle.putString("class","com.weixin.test.TestWxFaxian#testCase1");
			bundle.putString("class","com.weixin.command.TestAll#testBase");
			bundle.putString("data_suffix","/.1");
			ComponentName cn = new ComponentName("com.example.test","android.test.InstrumentationTestRunner");

			c.startInstrumentation(cn, null, bundle);
		} catch (Exception e) {
			Log.e("", "Exception e:"+e.getMessage());
			return;
		}
	}
}
