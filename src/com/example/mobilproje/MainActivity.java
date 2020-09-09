package com.example.mobilproje;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ImageButton imgbtn1 = (ImageButton)findViewById(R.id.imageButton1);
		ImageButton imgbtn2 = (ImageButton)findViewById(R.id.imageButton2);
		ImageButton imgbtn3 = (ImageButton)findViewById(R.id.imageButton3);
		ImageButton imgbtn4 = (ImageButton)findViewById(R.id.imageButton4);
		ImageButton imgbtn5 = (ImageButton)findViewById(R.id.imageButton5);
		ImageButton imgbtn6 = (ImageButton)findViewById(R.id.imageButton6);
		ImageButton imgbtn7 = (ImageButton)findViewById(R.id.imageButton7);
		ImageButton imgbtn8 = (ImageButton)findViewById(R.id.imageButton8);
		ImageButton imgbtn9 = (ImageButton)findViewById(R.id.imageButton9);
		ImageButton imgbtn10 = (ImageButton)findViewById(R.id.imageButton10);
		
		imgbtn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, KolajBir.class);
				startActivity(i);
			}
		});
		imgbtn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, KolajIki.class);
				startActivity(i);
			}
		});
		imgbtn3.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i = new Intent(MainActivity.this, KolajUc.class);
		startActivity(i);
		}
		});
		imgbtn4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i = new Intent(MainActivity.this, KolajDort.class);
		startActivity(i);
	}
});
imgbtn5.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i = new Intent(MainActivity.this, KolajBes.class);
		startActivity(i);
	}
});
imgbtn6.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i = new Intent(MainActivity.this, KolajAlti.class);
		startActivity(i);
	}
});
imgbtn7.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i = new Intent(MainActivity.this, KolajYedi.class);
		startActivity(i);
	}
});
imgbtn8.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i = new Intent(MainActivity.this, KolajSekiz.class);
		startActivity(i);
	}
});
imgbtn9.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i = new Intent(MainActivity.this, KolajDokuz.class);
		startActivity(i);
	}
});
imgbtn10.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i = new Intent(MainActivity.this, KolajOn.class);
		startActivity(i);
	}
});
	}
}
