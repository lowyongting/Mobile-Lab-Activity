package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    private int[] images = new int[] {
            R.drawable.hb1, R.drawable.hb2, R.drawable.hb3, R.drawable.hb4,
            R.drawable.hb5, R.drawable.hb6
    };
    private String[] names = new String[] {
            "Handbag 1", "Handbag 2", "Handbag 3", "Handbag 4",
            "Handbag 5", "Handbag 6"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.mygridview);
        MyAdapter gridArrayAdapter = new MyAdapter(this, R.layout.activity_grid_item, images, names);
        gridView.setAdapter(gridArrayAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, names[position] + " Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}