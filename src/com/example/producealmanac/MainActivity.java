package com.example.producealmanac;

import java.util.ArrayList;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	//currentItems will be the items currently in season, use a hashmap with key=time of year
	ArrayList<Item> currentItems;
	boolean populated=false;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//add all current items to the ArrayList
		currentItems = new ArrayList<Item>();
		currentItems.add(new Item("apple"));
		currentItems.add(new Item("potato"));
		currentItems.add(new Item("strawberries"));
		//etc etc
		
		if(!populated){
			populated=true;
			populateMap();
		}
	}
	
	public void populateMap(){
		
		Bitmap bitmapple = BitmapFactory.decodeResource(getResources(), R.drawable.apple);
		ImageView appleView =  new ImageView(this);
		appleView.setImageBitmap(bitmapple);
		Object[] info = {"apples grow on trees", "counter", bitmapple };
		Item.infoMap.put("apple",info);
		
		Bitmap bitmapotato = BitmapFactory.decodeResource(getResources(), R.drawable.potato);
		ImageView potatoView = new ImageView(this);
		potatoView.setImageBitmap(bitmapotato);		
		Object[] info2 = {"potatoes grow in the earth", "counter", bitmapotato};
		Item.infoMap.put("potato",info2);
		
		Bitmap bitmapberry = BitmapFactory.decodeResource(getResources(), R.drawable.strawberry);
		ImageView strawberryView = new ImageView(this);
		strawberryView.setImageBitmap(bitmapberry);		
		Object[] info3 = {"strawberries are good", "refrigerator", bitmapberry};
		Item.infoMap.put("strawberries", info3);
	}
		

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
