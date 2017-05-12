package com.example.dong.bai52;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DONG on 3/9/2017.
 */

public class AdapterItem extends ArrayAdapter<Item> {

    Activity context;
    int resource;
    List<Item> objects;

    public AdapterItem(@NonNull Activity context, @LayoutRes int resource, @NonNull List<Item> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View data = inflater.inflate(this.resource,null);

        TextView txtItem = (TextView) data.findViewById(R.id.txtItem);
        Item item = this.objects.get(position);
        txtItem.setText(item.getName());

        return data;
    }



}
