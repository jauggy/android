package com.example.eclipsesucks;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;

import java.sql.Connection;
import java.sql.DriverManager;

import org.apache.cordova.DroidGap;



import android.os.Bundle;
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;


	public class MainActivity extends DroidGap {
		//private JSInterface mc;
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        super.init();
	        
	        super.loadUrl("file:///android_asset/www/index.html");
	        
	       /* mc = new MyClass(this, appView);
	        appView.addJavascriptInterface(mc, "MyCls");
	        
	       
	       
	        DictionaryOpenHelper dbHelper = new DictionaryOpenHelper(this);
	        SQLiteDatabase db = dbHelper.getWritableDatabase();
	        Cursor cur = db.rawQuery("SELECT * FROM android_metadata", null);
	        Log.v("Tag",cur.getColumnName(0));
	        while(cur.moveToNext()){
	        	
	        	Log.v("Tag",cur.getString(0));
	        }
	        if(!cur.isClosed())
	        	cur.close();
	        if(db.isOpen())
	        	db.close();*/
	        
	    }
	    
	    
	    private void Test() throws Exception
	    {
	    //	System.setProperty("sqlite.purejava", "true");
	    	Class.forName("org.sqlite.JDBC");
	        Connection conn =
	          DriverManager.getConnection("jdbc:sqlite:testdb.db");
	    }
	}


    


