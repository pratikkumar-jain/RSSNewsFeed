package com.example.rssnewsfeed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Newspage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_newspage);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.newspage, menu);
		return true;
	}

	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
	case R.id.home:
		Intent ihpg = new Intent(Newspage.this, Homepage.class);
		startActivity(ihpg);
		finish();
		return true;
	case R.id.set:
		Intent iset = new Intent(Newspage.this, Settings.class);
		startActivity(iset);
		finish();
		return true;
	default:
		finish();
		return false;	
	}
		}
}
