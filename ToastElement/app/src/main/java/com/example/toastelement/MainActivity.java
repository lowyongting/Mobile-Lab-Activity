package com.example.toastelement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    ImageView twoKitten, catsInBkt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        twoKitten = findViewById(R.id.imageViewTwoCats);
        twoKitten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "2 cute kittens", Toast.LENGTH_LONG).show();
            }
        });

        catsInBkt = findViewById(R.id.imageViewKitten);
        catsInBkt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Kittens inside basket", Toast.LENGTH_LONG).show();
            }
        });
    }
}