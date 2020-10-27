package com.example.compilation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class ChangePicture extends AppCompatActivity {

    Button btnChange;
    TextView txt;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_pic);

        btnChange = findViewById(R.id.btnChange);
        txt = findViewById(R.id.txtView);
        img = findViewById(R.id.imgView);
        img.setTag(R.drawable.butterfly);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((int)img.getTag() == (R.drawable.butterfly)) {
                    txt.setText("This is a waterlily! ");
                    img.setImageResource(R.drawable.waterlily);
                    img.setTag(R.drawable.waterlily);
                }
                else {
                    txt.setText("This is a butterfly! ");
                    img.setImageResource(R.drawable.butterfly);
                    img.setTag(R.drawable.butterfly);
                }
            }
        });
    }
}
