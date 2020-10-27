package com.example.firebaseapp01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    Button btnAdd, btnView;
    EditText name, phone;
    TextView textView;
    public static final String firebase_server_url = "https://keen-metric-245307.firebaseio.com/";
    Firebase firebase;
    String nameholder, numberholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Firebase.setAndroidContext(MainActivity.this);
        firebase = new Firebase(firebase_server_url);

        name = findViewById(R.id.editTextPersonName);
        phone = findViewById(R.id.editTextPhone);
        btnAdd = findViewById(R.id.buttonAddData);
        btnView = findViewById(R.id.buttonViewData);
        textView = findViewById(R.id.textViewShow);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Student student = new Student();
                getData();
                student.setName(nameholder);
                student.setPhone(numberholder);
                firebase.child("Student").setValue(student);
                Toast.makeText(MainActivity.this,"Data inserted successfully", Toast.LENGTH_LONG).show();
                name.setText("");
                phone.setText("");
            }
        });

        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebase.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        for(DataSnapshot Subsnapshot: dataSnapshot.getChildren()) {
                            Student student = Subsnapshot.getValue(Student.class);
                            String data = "Name : " + student.getName() + "\nPhone number: " + student.getPhone() + "\n\n";
                            textView.setText(data);
                        }
                    }

                    @Override
                    public void onCancelled(FirebaseError firebaseError) {
                        System.out.println(firebaseError.getMessage());
                    }
                });
            }
        });
    }

    public void getData() {
        nameholder = name.getText().toString().trim();
        numberholder = phone.getText().toString().trim();
    }
}