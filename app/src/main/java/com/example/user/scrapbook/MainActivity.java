package com.example.user.scrapbook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvPlaces;
    CustomAdapter adapter;

    ArrayList<Integer> places = new ArrayList<>();
    ArrayList<Integer> placeImage = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvPlaces = (ListView)findViewById(R.id.lvPlaces);
        addPlaces();
        addPlacesImages();
        adapter = new CustomAdapter(MainActivity.this,placeImage,places);
        lvPlaces.setAdapter(adapter);
    }

    private void addPlacesImages() {
        placeImage.add(R.drawable.light_house);
        placeImage.add(R.drawable.mahal_alwar);
        placeImage.add(R.drawable.twin_tower);
    }

    private void addPlaces() {
        places.add(R.string.lighthouse);
        places.add(R.string.alwarmahal);
        places.add(R.string.twintower);
    }
}
