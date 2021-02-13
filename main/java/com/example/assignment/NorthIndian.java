package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class NorthIndian extends AppCompatActivity {

    ArrayList<String> personNames = new ArrayList<>(Arrays.asList("Aaloo Chat", "Aaloo Gobhi", "Aaloo Paratha", "Baigan Bharta", "Kadhai Paneer","Naan"));
    ArrayList<Integer> personImages = new ArrayList<>(Arrays.asList(R.drawable.aaloo_chat, R.drawable.aaloo_gobhi, R.drawable.aaloo_paratha, R.drawable.baigan_bharta, R.drawable.paneer, R.drawable.naan));
    ArrayList<String> personRate = new ArrayList<>(Arrays.asList("40", "50", "20", "40", "90","20"));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_indian);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        // set a LinearLayoutManager with default horizontal orientation and false value for reverseLayout to show the items from start to end
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        CustomAdapter1 customAdapter = new CustomAdapter1(NorthIndian.this, personNames,personImages,personRate);
        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView
    }
}