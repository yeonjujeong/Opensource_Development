package com.example.myfirstapp;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = (WebView) findViewById(R.id.webvw);
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings= webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.loadUrl("https://yeonjujeong.github.io/");
    }



}
