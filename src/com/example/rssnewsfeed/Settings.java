package com.example.rssnewsfeed;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class Settings extends Activity {
	Button btn1;
	RadioGroup r;
	String str;
	int id;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
		btn1=(Button)findViewById(R.id.btn);
btn1.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		RadioGroup rg = (RadioGroup) findViewById(R.id.rg1);
		id=rg.getCheckedRadioButtonId();
		if(id==R.id.r1){str="1";}
		else if(id==R.id.r2){str="2";}
		else if(id==R.id.r3){str="3";}
		else if(id==R.id.r3){str="4";}
		else str="";
    	try
        {
	        //---Opens a file for writing ---
	        FileOutputStream fOut =
	        openFileOutput("mydata.txt", MODE_PRIVATE); // File creation mode: allow all other applications to have read access to the created file.
	        OutputStreamWriter osw = new OutputStreamWriter(fOut);
        
	        //---write the string to the file---
	        osw.write(str);
	        osw.flush();
	        osw.close();
        
	        Toast.makeText(getBaseContext(), "File saved successfully!", Toast.LENGTH_SHORT).show();
        
	        Toast.makeText(getBaseContext(), "file path" + getFileStreamPath ("mydata.txt"), Toast.LENGTH_LONG).show(); 
	       
        }

        catch (IOException ioe) 
        {
        	ioe.printStackTrace();
        }
	}
});
		
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.settings, menu);
		return true;
	}
	public void next(View V){
		Intent i= new Intent(Settings.this, Newspage.class);
				startActivity(i);
}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.home:
			Intent ihpg = new Intent(Settings.this, Homepage.class);
			startActivity(ihpg);
			finish();
			return true;
		default:
			finish();
			return false;	
		}
}}
