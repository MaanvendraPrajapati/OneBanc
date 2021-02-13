package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class Maxican extends AppCompatActivity {

    ArrayList<String> personNames = new ArrayList<>(Arrays.asList("Mole Chicken Cury", "Jamoncillos", "Salsas", "Tamales", "Tostadas"));
    ArrayList<Integer> personImages = new ArrayList<>(Arrays.asList(R.drawable.mole_chicken_curry, R.drawable.jamoncillos, R.drawable.salsas, R.drawable.tamales, R.drawable.tostadas));
    ArrayList<String> personRate = new ArrayList<>(Arrays.asList("70", "90", "70", "65", "90"));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maxican);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        // set a LinearLayoutManager with default horizontal orientation and false value for reverseLayout to show the items from start to end
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        CustomAdapter1 customAdapter = new CustomAdapter1(Maxican.this, personNames,personImages,personRate);
        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView
    }
}