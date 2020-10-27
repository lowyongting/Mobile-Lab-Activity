package com.example.lab_one;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnShow1, btnShow2;
    TextView txt1, txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RatingBar rb1 = (RatingBar) findViewById(R.id.ratingBar1);
        final RatingBar rb2 = (RatingBar) findViewById(R.id.ratingBar2);

       txt1 = findViewById(R.id.textView1);
       btnShow1 = findViewById(R.id.btn1);
       btnShow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rating = "Rating: " +rb1.getRating();
                txt1.setText(rating);
            }
        });

        txt2 = findViewById(R.id.textView2);
        btnShow2 = findViewById(R.id.btn2);
        btnShow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rating = "Rating: " +rb2.getRating();
                txt2.setText(rating);
            }
        });
    }
}