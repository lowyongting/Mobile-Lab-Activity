package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Array of Strings
        ListView simpleList;
        String countryList[] = {"Philiphine", "Cambodia", "Singapore", "India", "China",
            "Australia", "Malaysia", "Vietnam", "New Zealand"};
        int flags[] = {R.drawable.flag1, R.drawable.flag2, R.drawable.flag3, R.drawable.flag4,
                R.drawable.flag5, R.drawable.flag6, R.drawable.flag7, R.drawable.flag8, R.drawable.flag9};
        simpleList = (ListView) findViewById(R.id.mylist);
        CustomAdapter customAdapter = new CustomAdapter (getApplicationContext(), countryList, flags);
        simpleList.setAdapter(customAdapter);

    }
}