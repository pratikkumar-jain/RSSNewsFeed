package com.example.rssnewsfeed;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Homepage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_homepage);
		File f = getBaseContext().getFileStreamPath("mydata.txt"); 
		if(f.exists()) {
			try {	
			
			FileInputStream fis = openFileInput("mydata.txt");
			int c;
			String temp = "";
			while( (c = fis.read()) >0){
			temp += Character.toString((char) c);
			}
			Intent i;
			if(temp.equals("1"))
			{		i = new Intent(getBaseContext() , Sports.class);
			startActivity(i);
			}else if(temp.equals("2"))
			{	i = new Intent(getBaseContext() , Entertainment.class); 
			startActivity(i);
			}else if(temp.equals("3"))
			{	i = new Intent(getBaseContext() , Technology.class); 
			startActivity(i);
			}else if(temp.equals("4"))
			{	i = new Intent(getBaseContext() , Politics.class);
			startActivity(i);
			}else 
				Toast.makeText(getBaseContext(), "Homepage", Toast.LENGTH_LONG).show();
			
				}
			catch (FileNotFoundException e) 
			{ e.printStackTrace();	}
			catch (IOException e)
			{ e.printStackTrace();	}
			}
}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.homepage, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.sports:
			Intent isports = new Intent(Homepage.this, Sports.class);
			startActivity(isports);
			finish();
			return true;
		case R.id.ent:
			Intent ient = new Intent(Homepage.this, Entertainment.class);
			startActivity(ient);
			finish();
			return true;
		case R.id.tech:
			Intent itech = new Intent(Homepage.this, Technology.class);
			startActivity(itech);
			finish();
			return true;
		case R.id.pol:
			Intent ipol = new Intent(Homepage.this, Politics.class);
			startActivity(ipol);
			finish();
			return true;
		case R.id.set:
			Intent iset = new Intent(Homepage.this, Settings.class);
			startActivity(iset);
			finish();
			return true;
		default:
			finish();
			System.exit(1);
			return false;
		}
	}
	public void next(View V){
		Intent i= new Intent(Homepage.this, Newspage.class);
				startActivity(i);
}
}
