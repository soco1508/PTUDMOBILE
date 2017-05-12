package com.example.dong.bai_3;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Item1> arrItem;
    Item1Adapter itemAdapter;
    ListView lvItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {

    }

    private void addControls() {
        lvItem = (ListView) findViewById(R.id.lvItem);

        arrItem = new ArrayList<>();
        arrItem.add(new Item1(R.drawable.focaccia,"ROSEMARY FOCACCIA BREAD"));
        arrItem.add(new Item1(R.drawable.redposolerojosoup,"POZOLE ROJO"));
        arrItem.add(new Item1(R.drawable.basilchicken,"20-MINUTE THAI BASIL CHICKEN"));
        arrItem.add(new Item1(R.drawable.pizza,"PIZZA PASTA SALAD"));
        arrItem.add(new Item1(R.drawable.spinachsoup,"ITALIAN ORZO SPINACH SOUP"));
        arrItem.add(new Item1(R.drawable.soursoup,"HOT AND SOUR SOUP"));
        arrItem.add(new Item1(R.drawable.salad,"ZESTY LENTIL SPINACH SALAD"));
        arrItem.add(new Item1(R.drawable.chickennoodle,"ROSEMARY FOCACCIA BREAD"));
        itemAdapter = new Item1Adapter(MainActivity.this,R.layout.item1,arrItem);
        lvItem.setAdapter(itemAdapter);

    }

}
