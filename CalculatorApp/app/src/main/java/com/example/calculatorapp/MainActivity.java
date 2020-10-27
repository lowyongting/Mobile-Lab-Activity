package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bClear,bPlus,bMinus,bMul,bDiv,bEqual,bDot;
    EditText txtInput;
    boolean plus = false;
    boolean minus = false;
    boolean mul = false;
    boolean div = false;
    double v1,v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtInput = findViewById(R.id.editTextNumber);

        b0 = findViewById(R.id.buttonNum0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtInput.setText(txtInput.getText() + "0");
            }
        });

        b1 = findViewById(R.id.buttonNum1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtInput.setText(txtInput.getText() + "1");
            }
        });

        b2 = findViewById(R.id.buttonNum2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtInput.setText(txtInput.getText() + "2");
            }
        });

        b3 = findViewById(R.id.buttonNum3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtInput.setText(txtInput.getText() + "3");
            }
        });

        b4 = findViewById(R.id.buttonNum4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtInput.setText(txtInput.getText() + "4");
            }
        });

        b5 = findViewById(R.id.buttonNum5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtInput.setText(txtInput.getText() + "5");
            }
        });

        b6 = findViewById(R.id.buttonNum6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtInput.setText(txtInput.getText() + "6");
            }
        });

        b7= findViewById(R.id.buttonNum7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtInput.setText(txtInput.getText() + "7");
            }
        });

        b8 = findViewById(R.id.buttonNum8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtInput.setText(txtInput.getText() + "8");
            }
        });

        b9 = findViewById(R.id.buttonNum9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtInput.setText(txtInput.getText() + "9");
            }
        });

        bClear = findViewById(R.id.buttonClear);
        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtInput.setText("");
            }
        });

        bPlus = findViewById(R.id.buttonPlus);
        bPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(txtInput.getText().toString().isEmpty())) {
                    v1 = Double.parseDouble(txtInput.getText()+"");
                    plus = true; minus = false; mul = false; div =false;
                    txtInput.setText("");
                }
            }
        });

        bMinus = findViewById(R.id.buttonMinus);
        bMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(txtInput.getText().toString().isEmpty())) {
                    v1 = Double.parseDouble(txtInput.getText()+"");
                    plus = false; minus = true; mul = false; div =false;
                    txtInput.setText("");
                }
            }
        });

        bMul = findViewById(R.id.buttonMultiply);
        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(txtInput.getText().toString().isEmpty())) {
                    v1 = Double.parseDouble(txtInput.getText()+"");
                    plus = false; minus = false; mul = true; div =false;
                    txtInput.setText("");
                }
            }
        });

        bDiv = findViewById(R.id.buttonDivision);
        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(txtInput.getText().toString().isEmpty())) {
                    v1 = Double.parseDouble(txtInput.getText()+"");
                    plus = false; minus = false; mul = false; div =true;
                    txtInput.setText("");
                }
            }
        });

        bEqual = findViewById(R.id.buttonEqual);
        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v2 = Double.parseDouble(txtInput.getText()+"");
                if(plus == true) {
                    txtInput.setText(v1+v2+"");
                    plus = false;
                }
                if(minus == true) {
                    txtInput.setText(v1-v2+"");
                    minus = false;
                }
                if(mul == true) {
                    txtInput.setText(v1*v2+"");
                    mul = false;
                }
                if(div == true) {
                    txtInput.setText(v1/v2+"");
                    div = false;
                }
            }
        });

        bDot = findViewById(R.id.buttonDot);
        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtInput.setText(txtInput.getText() + ".");
            }
        });

    }
}