package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class Italian extends AppCompatActivity {

    ArrayList<String> personNames = new ArrayList<>(Arrays.asList("Pizza", "Focaccia", "Fiorentina Steak", "Lasagna", "Risotto","Truffles"));
    ArrayList<Integer> personImages = new ArrayList<>(Arrays.asList(R.drawable.pizza, R.drawable.focaccia, R.drawable.fiorentina_steak, R.drawable.lasagna, R.drawable.risotto, R.drawable.truffles));
    ArrayList<String> personRate = new ArrayList<>(Arrays.asList("85", "90", "60", "95", "65","40"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        // set a LinearLayoutManager with default horizontal orientation and false value for reverseLayout to show the items from start to end
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        CustomAdapter1 customAdapter = new CustomAdapter1(Italian.this, personNames,personImages,personRate);
        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView
    }
}