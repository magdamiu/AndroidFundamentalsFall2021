package com.magdamiu.androidfundamentalsfall2021.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.magdamiu.androidfundamentalsfall2021.R;

public class SecondHostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_host);

        insertFragment(new BlankFragment());
    }

    private void insertFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.framePlacholder, fragment);
        fragmentTransaction.commit();
    }
}