package com.example.dong.bai_3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by DONG on 5/12/2017.
 */

public class Item1Adapter extends ArrayAdapter<Item1> {
    Activity context;
    int resource;
    List<Item1> objects;
    public Item1Adapter(Activity context, int resource, List<Item1> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }
    @NonNull
    @Override
    public View getView(final int position, final View convertView, ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        final View row = inflater.inflate(this.resource,null);

        Item1 i = this.objects.get(position);
        ImageView imgPhoto1 = (ImageView) row.findViewById(R.id.imgPhoto1);
        final TextView txtName2 = (TextView) row.findViewById(R.id.txtName2);
        final ImageButton btnView1 = (ImageButton) row.findViewById(R.id.btnView1);
        final ListView listView = (ListView) row.findViewById(R.id.lvItem);
        txtName2.setText(i.getName());
        imgPhoto1.setImageResource(i.getPhoto());
        btnView1.setTag(position);
        btnView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,Main2Activity.class);
                int i = (int) btnView1.getTag();
                if(i == 0){
                    intent.putExtra("PHOTO",R.drawable.focacciabig);
                }
                if(i == 1){
                    intent.putExtra("PHOTO",R.drawable.redposolerojosoupbig);
                }
                if(i == 2){
                    intent.putExtra("PHOTO",R.drawable.basilchickenbig);
                }
                if(i == 3){
                    intent.putExtra("PHOTO",R.drawable.pizzabig);
                }
                if(i == 4){
                    intent.putExtra("PHOTO",R.drawable.spinachsoupbig);
                }
                if(i == 5){
                    intent.putExtra("PHOTO",R.drawable.soursoupbig);
                }
                if(i == 6){
                    intent.putExtra("PHOTO",R.drawable.saladbig);
                }
                if(i == 7){
                    intent.putExtra("PHOTO",R.drawable.chickennoodlebig);
                }
                context.startActivity(intent);
            }
        });
        txtName2.setTag(position);
        txtName2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Main3Activity.class);
                int i = (int) txtName2.getTag();
                if(i == 0){
                    intent.putExtra("LINK","https://www.gimmesomeoven.com/rosemary-focaccia-bread/");
                }
                if(i == 1){
                    intent.putExtra("LINK","https://www.gimmesomeoven.com/pozole-rojo/");
                }
                if(i == 2){
                    intent.putExtra("LINK","https://www.gimmesomeoven.com/20-minute-thai-basil-chicken/");
                }
                if(i == 3){
                    intent.putExtra("LINK","https://www.gimmesomeoven.com/brussels-sprouts-and-bacon-flatbread/");
                }
                if(i == 4){
                    intent.putExtra("LINK","https://www.gimmesomeoven.com/italian-orzo-spinach-soup-recipe/");
                }
                if(i == 5){
                    intent.putExtra("LINK","https://www.gimmesomeoven.com/hot-and-sour-soup-recipe/");
                }
                if(i == 6){
                    intent.putExtra("LINK","https://www.gimmesomeoven.com/zesty-lentil-spinach-salad-recipe/");
                }
                if(i == 7){
                    intent.putExtra("LINK","https://www.gimmesomeoven.com/rosemary-chicken-noodle-soup-recipe/");
                }
                context.startActivity(intent);
            }
        });
        return row;
    }
}
