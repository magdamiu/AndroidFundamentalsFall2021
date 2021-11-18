package com.magdamiu.androidfundamentalsfall2021.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.magdamiu.androidfundamentalsfall2021.R;

public class SecondHostActivity extends AppCompatActivity implements HostListener {
    static final String NAME = "name";
    static final String VALUE = "value";

    private TextView resultFromReceivedNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_host);

        resultFromReceivedNumbers = findViewById(R.id.result);

        insertFragment(new SumFragment());
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

    public void sendDataWithMethodOnClick(View view) {
        BlankFragment blankFragment = new BlankFragment();
        blankFragment.setMessage("hello from Activity");
    }

    @Override
    public void addTwoNumbers(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        resultFromReceivedNumbers.setText(String.format("%d", sum));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Toast.makeText(SecondHostActivity.this, "you pressed the back button", Toast.LENGTH_LONG).show();
    }
}