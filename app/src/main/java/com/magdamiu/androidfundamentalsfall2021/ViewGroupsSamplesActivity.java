package com.magdamiu.androidfundamentalsfall2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ViewGroupsSamplesActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private static final String ANDROID_URL = "https://developer.android.com/";

    private WebView webView;
    private Spinner spinnerAndroidVersions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_sample);

/*        webView = findViewById(R.id.firstWebView);
        webView.loadUrl(ANDROID_URL);*/

        setupSpinner();
    }

    // step 1: data source
    private List<String> getAndroidVersions() {
        List<String> androidVersions = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            androidVersions.add("Android Version " + i);
        }
        return androidVersions;
    }

    // step 2: setup adapter (default adapter)
    private ArrayAdapter<String> getArrayAdapter(List<String> androidVersions) {
        return new ArrayAdapter<>(ViewGroupsSamplesActivity.this, android.R.layout.simple_list_item_1, androidVersions);
    }

    // step 3: combine the "puzzle pieces"
    private void setupSpinner() {
        spinnerAndroidVersions = findViewById(R.id.spinnerAndroidVersions);
        ArrayAdapter<String> spinnerAdapter = getArrayAdapter(getAndroidVersions());
        spinnerAndroidVersions.setAdapter(spinnerAdapter);

        spinnerAndroidVersions.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        List<String> androidVersions = getAndroidVersions();
        if(!androidVersions.isEmpty()) {
            String selectedItem = androidVersions.get(i);
            Toast.makeText(ViewGroupsSamplesActivity.this, "Selected item is: " + selectedItem, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}