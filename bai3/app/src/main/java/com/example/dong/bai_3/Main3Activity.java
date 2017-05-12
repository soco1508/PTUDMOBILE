package com.example.dong.bai_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    private WebView webV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        webV = (WebView) findViewById(R.id.webV);

        Intent i = getIntent();
        String url = i.getStringExtra("LINK");

        webV.getSettings().setJavaScriptEnabled(true);
        webV.loadUrl(url);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
