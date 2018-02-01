package com.example.rssnewsfeed;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		Thread background = new Thread() {// Create Thread that will sleep for 5 seconds  
            public void run() {
                 
                try {
                    // Thread will sleep for 5 seconds
                    sleep(4*1000);
                     
                    // After 5 seconds redirect to another intent
                    Intent i=new Intent(getBaseContext(),Homepage.class);
                    startActivity(i);
                     
                    //Remove activity
                    finish();
                     
                } catch (Exception e) {
                 
                }
            }
        };
         
        // start thread
        background.start();
	  }
    
    @Override
    protected void onDestroy() {
         
        super.onDestroy();
         
    }
	
	
	
	}

	
