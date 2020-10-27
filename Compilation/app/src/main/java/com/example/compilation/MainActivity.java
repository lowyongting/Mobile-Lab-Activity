package com.example.compilation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnChangePic, btnRating, btnSpinner, btnEditText, btnToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnChangePic = findViewById(R.id.buttonChangePic);
        btnChangePic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(MainActivity.this, ChangePicture.class);
                startActivity(i1);
            }
        });

        btnRating = findViewById(R.id.buttonRating);
        btnRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(MainActivity.this, RatingApp.class);
                startActivity(i2);
            }
        });

        btnSpinner = findViewById(R.id.buttonSpinner);
        btnSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(MainActivity.this, SpinnerApp.class);
                startActivity(i3);
            }
        });

        btnEditText = findViewById(R.id.buttonEdittext);
        btnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(MainActivity.this, EditText.class);
                startActivity(i4);
            }
        });

        btnToast = findViewById(R.id.buttonToastElement);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(MainActivity.this, ToastElement.class);
                startActivity(i5);
            }
        });
    }
}