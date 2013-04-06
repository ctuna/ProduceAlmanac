package com.example.producealmanac;

import java.util.HashMap;

import android.graphics.Bitmap;

public class Item {
	
	static HashMap<String,Object[]> infoMap = new HashMap<String, Object[]>();
	
	String name;
	String description;
	String storage;
	Bitmap picture;
	/*
	HOW TO LOAD A PICTURE FROM THE DRAWABLE FOLDER
	Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.name_of_file);
	someImageView.setImageBitmap(bitmap);
	*/
	
	public Item(String name){
		this.name = name;
		this.description = (String) infoMap.get(name)[0];
		this.storage = (String) infoMap.get(name)[1];
		this.picture = (Bitmap) infoMap.get(name)[2];
	}
	

		
}
