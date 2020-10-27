package com.example.compilation;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ToastElement extends AppCompatActivity {

    ImageView twoKitten, catsInBkt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toast_element);

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
