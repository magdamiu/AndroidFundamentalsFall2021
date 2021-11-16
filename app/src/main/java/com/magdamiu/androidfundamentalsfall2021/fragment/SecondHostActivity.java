package com.magdamiu.androidfundamentalsfall2021.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.magdamiu.androidfundamentalsfall2021.R;

public class SecondHostActivity extends AppCompatActivity {
    static final String NAME = "name";
    static final String VALUE = "value";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_host);
    }

    private void insertFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.framePlaceholder, fragment);
        fragmentTransaction.commit();
    }

    public void sendDataOnClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putString(NAME, "android");
        bundle.putInt(VALUE, 2021);
        BlankFragment blankFragment = new BlankFragment();
        blankFragment.setArguments(bundle);
        insertFragment(blankFragment);
    }
}