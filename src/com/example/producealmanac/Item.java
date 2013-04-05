package com.example.producealmanac;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Item {
	String name;
	String description;
	String storage;
	Bitmap picture;
	/*
	HOW TO LOAD A PICTURE FROM THE DRAWABLE FOLDER
	Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.name_of_file);
	someImageView.setImageBitmap(bitmap);
		*/
}
