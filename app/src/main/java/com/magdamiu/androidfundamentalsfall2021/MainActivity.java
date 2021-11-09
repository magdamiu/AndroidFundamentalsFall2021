package com.magdamiu.androidfundamentalsfall2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String MAIN_ACTIVITY = "MainActivity";

    private EditText usernameEditText, passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.login);

        // tag and message
        Log.e(MAIN_ACTIVITY, "this is my first error log");
        Log.w(MAIN_ACTIVITY, "this is my first warning log");

        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
    }

    // handling click on login button
    public void loginOnClick(View view) {
        if (usernameEditText != null & passwordEditText != null) {
            String usernameValue = usernameEditText.getText().toString();
            String passwordValue = passwordEditText.getText().toString();
            if(passwordValue.length() == 0) {
                passwordEditText.setError("Please add your password");
            } else {
                Toast.makeText(MainActivity.this, usernameValue + " " + passwordValue, Toast.LENGTH_LONG).show();
                openNewActivity();
            }
        } else {
            Toast.makeText(MainActivity.this, "please try again later", Toast.LENGTH_LONG).show();
        }
    }

    private void openNewActivity() {
        Intent startNewActivity = new Intent(MainActivity.this, CakesActivity.class);
        startActivity(startNewActivity);
    }
}