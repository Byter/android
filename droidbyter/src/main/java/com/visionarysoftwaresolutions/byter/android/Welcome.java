package com.visionarysoftwaresolutions.byter.android;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Toast;


public class Welcome extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.welcome, menu);
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

    public void dispatchToUpdateInfo(final View clicked) {
        Intent updateInfo = new Intent(this, UpdateInfo.class);
        startActivity(updateInfo);
    }

    public void dispatchToLogMeal(final View clicked) {
        final String message = "Clicked by" + clicked.getId();
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void dispatchToViewMeals(final View clicked) {
        final String message = "Clicked by" + clicked.getId();
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void dispatchToPlanMeals(final View clicked) {
        final String message = "Clicked by" + clicked.getId();
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void dispatchToMealGoals(final View clicked) {
        final String message = "Clicked by" + clicked.getId();
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
