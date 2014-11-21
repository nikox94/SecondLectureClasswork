package com.example.student10.secondlectureclasswork;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Activity1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);
    }

    public void br(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }

    public void b1(View v){
        Intent i = new Intent(this, Activity1.class);
        startActivity(i);
        finish();
    }

    public void b2(View v){
        Intent i = new Intent(this, Activity2.class);
        startActivity(i);
        finish();
    }

    public void b3(View v){
        Intent i = new Intent(this, Activity3.class);
        startActivity(i);
        finish();
    }

    public void b4(View v){
        Intent i = new Intent(this, Activity4.class);
        startActivity(i);
        finish();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
