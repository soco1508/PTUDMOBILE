package com.example.dong.bai52;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends AppCompatActivity {

    private GoogleMap mMap;
    ProgressDialog progressDialog;
    Intent intent;
    double x = 0.0;
    double y = 0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        addControls();
        addEvents();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
    private void addEvents() {

    }

    private void addControls() {
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                mMap = googleMap;
                intent = getIntent();
                x = intent.getDoubleExtra("X",0);
                y = intent.getDoubleExtra("Y",0);
                LatLng latLng = new LatLng(x, y);
                mMap.addMarker(new
                        MarkerOptions()
                        .position(latLng)
                );
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng,13));
            }
        });


    }
}
