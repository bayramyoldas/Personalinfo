package com.bayram.yoldas.personalinfo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends ActionBarActivity {

    public final static String EXTRA_MESSAGE = "com.yoldas.bayram.learning.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void sendMessage (View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editName    = (EditText) findViewById(R.id.name_txt); // R is a system call
        EditText editCountry = (EditText) findViewById(R.id.country_txt); // R is a system call
        EditText editCity    = (EditText) findViewById(R.id.city_txt); // R is a system call
        String name = editName.getText().toString();
        String country = editCountry.getText().toString();
        String city = editCity.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, "Dear" + name + ", so, you are from " + country + ". Also from " + city + ". Very nice!");
        startActivity(intent);
    }
}
