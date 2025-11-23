package com.example.twojadrogadowolnoci;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        WebView webView = (WebView) findViewById(R.id.webView);


        WebSettings webSettings = webView.getSettings();


        webSettings.setJavaScriptEnabled(true);


        webSettings.setDomStorageEnabled(true);


        webSettings.setGeolocationEnabled(true);


        webView.setWebViewClient(new WebViewClient());



       // wczytywanie pliku wybor jego !!!!!!!
        webView.loadUrl("file:///android_asset/index (6).html");
    }
}
