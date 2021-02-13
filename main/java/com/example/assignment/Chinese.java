package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class Chinese extends AppCompatActivity {

    ArrayList<String> personNames = new ArrayList<>(Arrays.asList("Momos", "ChowMein", "Manchurian", "Fried Rice", "Noodle Soup","Soya Egg"));
    ArrayList<Integer> personImages = new ArrayList<>(Arrays.asList(R.drawable.momos, R.drawable.chow_mein, R.drawable.manchurian, R.drawable.fried_rice, R.drawable.noodle_soup, R.drawable.soya_egg));
    ArrayList<String> personRate = new ArrayList<>(Arrays.asList("50", "40", "40", "60", "60","50"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        // set a LinearLayoutManager with default horizontal orientation and false value for reverseLayout to show the items from start to end
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        CustomAdapter1 customAdapter = new CustomAdapter1(Chinese.this, personNames,personImages,personRate);
        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView
    }
}