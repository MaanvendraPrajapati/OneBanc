package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class SouthIndian extends AppCompatActivity {

    ArrayList<String> personNames = new ArrayList<>(Arrays.asList("Masala Dosa", "Vada", "Idli", "Sambhar", "Appam","Upma Khichdi"));
    ArrayList<Integer> personImages = new ArrayList<>(Arrays.asList(R.drawable.dosa, R.drawable.vada, R.drawable.idli, R.drawable.sambhar, R.drawable.appam, R.drawable.upma_khichdi));
    ArrayList<String> personRate = new ArrayList<>(Arrays.asList("50", "15", "10", "20", "35","40"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_south_indian);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        // set a LinearLayoutManager with default horizontal orientation and false value for reverseLayout to show the items from start to end
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        CustomAdapter1 customAdapter = new CustomAdapter1(SouthIndian.this, personNames,personImages,personRate);
        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView
    }
}