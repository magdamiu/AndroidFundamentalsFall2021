package com.magdamiu.androidfundamentalsfall2021;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class LearnActivity extends AppCompatActivity {
    public static final String MESSAGE = "message";
    public static final String COUNT = "count";
    public static final String MESSAGE_FOR_RESULT = "result";
    private static final String LEARN_ACTIVITY = "LearnActivity";
    private ActivityResultLauncher<Intent> startForResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent intent = result.getData();
                        String messageReceivedAsResult = intent.getStringExtra(CakesActivity.RESULT);
                        Toast.makeText(LearnActivity.this, messageReceivedAsResult, Toast.LENGTH_LONG).show();
                    }
                }
            });

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
        cakesActivity.putExtra(COUNT, 27);
        startActivity(cakesActivity);
    }


    public void openCallActivityOnClick(View view) {
        // implicit intent => starts an activity defined in the system
        Intent callActivity = new Intent(Intent.ACTION_DIAL);
        if (callActivity.resolveActivity(getPackageManager()) != null) {
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


    public void startForResultOnClick(View view) {
        Intent intentForResult = new Intent(LearnActivity.this, CakesActivity.class);
        intentForResult.putExtra(MESSAGE_FOR_RESULT, "Are you there?");
        startForResult.launch(intentForResult);
    }
}