package com.magdamiu.androidfundamentalsfall2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ViewGroupsSamplesActivity extends AppCompatActivity {
    private static final String ANDROID_URL = "https://developer.android.com/";

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view_sample);

        webView = findViewById(R.id.firstWebView);
        webView.loadUrl(ANDROID_URL);
    }
}