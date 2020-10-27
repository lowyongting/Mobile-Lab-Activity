package com.example.multiplechoiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    QuestionLibrary qLbry = new QuestionLibrary();
    TextView txtScore, txtQuestion;
    Button btnChoice1, btnChoice2, btnChoice3;

    int qNo = 0;
    int totalScore = 0, correct = 0, wrong = 0;
    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtScore = findViewById(R.id.textViewScore);
        txtQuestion = findViewById(R.id.textViewQuestion);

        btnChoice1 =findViewById(R.id.buttonChoice1);
        btnChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnChoice1.getText() == answer) {
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_LONG).show();
                    totalScore += 10;
                    txtScore.setText(""+totalScore);
                    qNo++;correct++;
                    updateQuestion();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_LONG).show();
                    qNo++;wrong++;
                    updateQuestion();
                }
            }
        });

        btnChoice2 =findViewById(R.id.buttonChoice2);
        btnChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnChoice2.getText() == answer) {
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_LONG).show();
                    totalScore += 10;
                    txtScore.setText(""+totalScore);
                    qNo++;correct++;
                    updateQuestion();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_LONG).show();
                    qNo++;wrong++;
                    updateQuestion();
                }
            }
        });

        btnChoice3 =findViewById(R.id.buttonChoice3);
        btnChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnChoice3.getText() == answer) {
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_LONG).show();
                    totalScore += 10;
                    txtScore.setText(""+totalScore);
                    qNo++;correct++;
                    updateQuestion();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_LONG).show();
                    qNo++;wrong++;
                    updateQuestion();
                }
            }
        });

        updateQuestion();
    }

    public void updateQuestion() {
        if (qNo < 5) {
            txtQuestion.setText(qLbry.getQuestion(qNo));
            btnChoice1.setText(qLbry.getOption1(qNo));
            btnChoice2.setText(qLbry.getOption2(qNo));
            btnChoice3.setText(qLbry.getOption3(qNo));
            answer = qLbry.getAnswer(qNo);
        }
        else {
            Intent intent = new Intent(MainActivity.this, Result.class);
            intent.putExtra("TOTAL_SCORE", totalScore);
            intent.putExtra("CORRECT", correct);
            intent.putExtra("WRONG", wrong);
            startActivity(intent);
        }
    }
}