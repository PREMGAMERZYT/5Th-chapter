package com.example.a5thchapter;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    //this array is data source
    String Arr[] = {"Prem","hello","chetan","Spoorthi","sister"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.ListView);
        //using out in built adpater
        // ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
        // listView.setAdapter(ad);


        //using our custome adpater
    }
}