package com.example.dong.bai_3;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    ImageView imgView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        addControls();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void addControls() {
        imgView1 = (ImageView) findViewById(R.id.imgView1);
        Intent intent = getIntent();
        int i = intent.getIntExtra("PHOTO",0);
        imgView1.setImageResource(i);
    }

}
