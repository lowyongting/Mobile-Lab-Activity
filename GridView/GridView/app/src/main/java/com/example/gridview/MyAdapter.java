package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class MyAdapter extends ArrayAdapter {
    private int[] images = new int[] {};
    private String[] names = new String[] {};

    // Constructor
    public MyAdapter(@NonNull Context context, int resource, int[] images, String[] names) {
        super (context, resource);
        this.images = images;
        this.names = names;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.activity_grid_item, null);
        TextView textView = (TextView) v.findViewById(R.id.textView);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView2);
        textView.setText(names[position]);
        imageView.setImageResource(images[position]);
        return v;
    }
}
