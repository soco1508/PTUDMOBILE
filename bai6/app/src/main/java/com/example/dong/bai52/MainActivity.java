package com.example.dong.bai52;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvItem;
    ArrayList<Item> ds;
    AdapterItem adapterItem;
    private static int itemIndex;
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
        ds = new ArrayList<>();
        ds.add(new Item(0,"1. Cleveland Tower City"));
        ds.add(new Item(1,"2. Browns Football Field"));
        ds.add(new Item(2,"3. Cleveland State University"));
        ds.add(new Item(3,"4. Playhouse Square"));
        ds.add(new Item(4,"5. Art Museum"));
        adapterItem = new AdapterItem(MainActivity.this,R.layout.item,ds);
        lvItem.setAdapter(adapterItem);
        registerForContextMenu(lvItem);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu,menu);
        if(v.getId()==R.id.lvItem){
            lvItem = (ListView) v;
            AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) menuInfo;
            Item item = (Item) lvItem.getItemAtPosition(info.position);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()){
            case R.id.btnM:
                if(info.position == 0){
                    Intent intent = new Intent(MainActivity.this,MapActivity.class);
                    intent.putExtra("X",41.497569);
                    intent.putExtra("Y",-81.693999);
                    startActivity(intent);
                    break;
                }
                else if(info.position == 1){
                    Intent intent = new Intent(MainActivity.this,MapActivity.class);
                    intent.putExtra("X",41.506037);
                    intent.putExtra("Y", -81.699548);
                    startActivity(intent);
                    break;
                }
                else if(info.position == 2){
                    Intent intent = new Intent(MainActivity.this,MapActivity.class);
                    intent.putExtra("X",41.502498);
                    intent.putExtra("Y", -81.674726);
                    startActivity(intent);
                    break;
                }
                else if(info.position == 3){
                    Intent intent = new Intent(MainActivity.this,MapActivity.class);
                    intent.putExtra("X",41.501276);
                    intent.putExtra("Y", -81.680686);
                    startActivity(intent);
                    break;
                }
                else if(info.position == 4){
                    Intent intent = new Intent(MainActivity.this,MapActivity.class);
                    intent.putExtra("X",41.508917);
                    intent.putExtra("Y", -81.604638);
                    startActivity(intent);
                    break;
                }
           

            case R.id.btnM1:
                if(info.position == 0){
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.towercitycenter.com"));
                    startActivity(intent1);
                    break;
                }
                else if(info.position == 1){
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.firstenergystadium.com"));
                    startActivity(intent1);
                    break;
                }
                else if(info.position == 2){
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.schoolapply.com/"));
                    startActivity(intent1);
                    break;
                }
                else if(info.position == 3){
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.playhousesquare.com"));
                    startActivity(intent1);
                    break;
                }
                else if(info.position == 4){
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.clevelandart.org"));
                    startActivity(intent1);
                    break;
                }
        }
        return super.onContextItemSelected(item);
    }
}
