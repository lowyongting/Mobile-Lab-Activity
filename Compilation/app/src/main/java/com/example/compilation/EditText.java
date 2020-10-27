package com.example.compilation;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

import androidx.appcompat.app.AppCompatActivity;

public class EditText extends AppCompatActivity {

    android.widget.EditText txtName, txtPass, txtEmail, txtPhone, txtTime;
    Button btnSubmit;
    TimePickerDialog picker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_edit);

        txtName = findViewById(R.id.editTextName);
        txtPass = findViewById(R.id.editTextPassword);
        txtEmail = findViewById(R.id.editTextEmail);
        txtPhone = findViewById(R.id.editTextPhone);
        txtTime = findViewById(R.id.editTextTime);
        txtTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar cldr = Calendar.getInstance();
                int hour = cldr.get(Calendar.HOUR_OF_DAY);
                int minutes = cldr.get(Calendar.MINUTE);
                // time picker dialog
                picker = new TimePickerDialog(EditText.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker tp, int sHour, int sMinute) {
                                txtTime.setText(sHour + ":" + sMinute);
                            }
                        }, hour, minutes, true);
                picker.show();
            }
        });

        btnSubmit = findViewById(R.id.button_Submit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtName.getText().toString().equals("") || txtPass.getText().toString().equals("") || txtEmail.getText().toString().equals("") ||
                        txtPhone.getText().toString().equals("") || txtTime.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "You didn't key in all the information required.", Toast.LENGTH_LONG).show();
                }
                else {
                    String print = "Name: " + txtName.getText() +"\nEmail: " + txtEmail.getText() + "\nPhone: " + txtPhone.getText() +
                            "\nTime: " + txtTime.getText();
                    Toast.makeText(getApplicationContext(), print, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
