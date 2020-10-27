package com.example.multiplechoiceapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        Intent intent = getIntent();
        int t_s = intent.getIntExtra("TOTAL_SCORE",0);
        int correct = intent.getIntExtra("CORRECT",0);
        int wrong = intent.getIntExtra("WRONG",0);

        TextView txtScore = findViewById(R.id.textViewScore);
        txtScore.setText(String.valueOf(t_s));

        TextView txtCorrect = findViewById(R.id.textViewCorrect);
        txtCorrect.setText(String.valueOf(correct));

        TextView txtWrong = findViewById(R.id.textViewWrong);
        txtWrong.setText(String.valueOf(wrong));
    }
}
