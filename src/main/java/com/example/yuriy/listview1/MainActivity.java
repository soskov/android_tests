package com.example.yuriy.listview1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

private WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web = (WebView)findViewById(R.id.webView);
        WebSettings webs = web.getSettings();
        webs.setJavaScriptEnabled(true);
        web.loadUrl("https://google.com");
        web.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (web.canGoBack())
            web.goBack();
        else
            super.onBackPressed();
    }
}
