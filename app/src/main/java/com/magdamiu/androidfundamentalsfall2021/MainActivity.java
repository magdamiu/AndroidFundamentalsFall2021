package com.magdamiu.androidfundamentalsfall2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String MAIN_ACTIVITY = "MainActivity";

    //TODO new element to be added
    private int newElement = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.samples);

        // tag and message
        Log.e(MAIN_ACTIVITY, "this is my first error log");
        Log.w(MAIN_ACTIVITY, "this is my first warning log");
    }
}