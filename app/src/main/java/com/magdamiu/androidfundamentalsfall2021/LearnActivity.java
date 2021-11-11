package com.magdamiu.androidfundamentalsfall2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class LearnActivity extends AppCompatActivity {
    public static final String MESSAGE = "message";
    private static final String LEARN_ACTIVITY = "LearnActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        Log.e(LEARN_ACTIVITY, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(LEARN_ACTIVITY, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(LEARN_ACTIVITY, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(LEARN_ACTIVITY, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(LEARN_ACTIVITY, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(LEARN_ACTIVITY, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(LEARN_ACTIVITY, "onDestroy");
    }

    public void openActivityOnClick(View view) {
        // explicit intent => starts an activity defined by us, the developers
        Intent cakesActivity = new Intent(LearnActivity.this, CakesActivity.class);
        cakesActivity.putExtra(MESSAGE, "Hello from LearnActivity");
        startActivity(cakesActivity);
    }


    public void openCallActivityOnClick(View view) {
        // implicit intent => starts an activity defined in the system
        Intent callActivity = new Intent(Intent.ACTION_DIAL);
        if(callActivity.resolveActivity(getPackageManager()) != null) {
            callActivity.setData(Uri.parse("tel:077777777"));
            startActivity(callActivity);
        } else {
            Toast.makeText(LearnActivity.this, "This action in not available on this device", Toast.LENGTH_LONG).show();
        }
    }


    public void openWebPageOnClick(View view) {
        // implicit intent => starts an activity defined in the system
        Intent openWebPage = new Intent(Intent.ACTION_VIEW);
        openWebPage.setData(Uri.parse("https://developer.android.com/guide/components/intents-common#Email"));
        startActivity(openWebPage);
    }
}