package com.example.user.scrapbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by USER on 24-05-2016.
 */
public class CustomAdapter extends BaseAdapter {
    Context context;
    ArrayList<Integer> placeImage;
    ArrayList<Integer> places;
    public CustomAdapter(Context context, ArrayList<Integer> placeImage, ArrayList<Integer> places) {
        this.context = context;
        this.placeImage = placeImage;
        this.places = places;
    }

    @Override
    public int getCount() {
        return placeImage.size();
    }

    @Override
    public Object getItem(int position) {
        return placeImage.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View turnView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(turnView == null) {
            turnView = inflater.inflate(R.layout.place_item, null, true);
        }

        ImageView ivPlaceImage = (ImageView)turnView.findViewById(R.id.ivPlaceImage);
        TextView tvPlaceName = (TextView)turnView.findViewById(R.id.tvPlaceName);
        ivPlaceImage.setImageResource(placeImage.get(position));
        tvPlaceName.setText(places.get(position));

        return turnView;

    }
}
