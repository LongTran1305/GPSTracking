package com.longtran.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Location;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ShowLocationList extends AppCompatActivity {

    ListView lv_savedLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_location_list);

        lv_savedLocation = findViewById(R.id.lv_wayPoint);

        MyApplication myApplication = (MyApplication) getApplicationContext();
        List<Location> savedLocation = myApplication.getMyLocation();

        lv_savedLocation.setAdapter(new ArrayAdapter<Location>(this, android.R.layout.simple_list_item_1,savedLocation));
    }
}