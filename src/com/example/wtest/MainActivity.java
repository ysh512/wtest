package com.example.wtest;

import java.util.ArrayList;
import java.util.List;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

	private FixedListView flv;
	
	private FixedListView flv2;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        flv = (FixedListView)findViewById(R.id.flv);
        
        List<String> data = new ArrayList<String>();
        for(int i=0;i<20;i++)
        {
        	data.add("the "+i+" episo");
        }
        
        flv.setAdapter(new MyAdapter(this,data));
        
        
        flv2 = (FixedListView)findViewById(R.id.flv2);
        
        List<String> data2 = new ArrayList<String>();
        for(int i=0;i<20;i++)
        {
        	data.add("222the "+i+" episo");
        }
        
        flv2.setAdapter(new MyAdapter(this,data));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
