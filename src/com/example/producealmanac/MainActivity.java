package com.example.producealmanac;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

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
			Item.populateMap();
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
