package com.example.a1508027853.audbucketlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    // Declare RecyclerView and its Layout Manager
    private RecyclerView myRecyclerView;
    private ArrayList<ListItems> listItems = new ArrayList<>();
    private RecyclerAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        //Allocate memory for the RecyclerView and the Layout Manager
        myRecyclerView = (RecyclerView) findViewById(R.id.rvListItems);
        myAdapter = new RecyclerAdapter(this, listItems);
        myRecyclerView.setAdapter(myAdapter);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        // prepare List Data
        prepareListData();

        setSupportActionBar(toolbar);

        // Floating application button operations
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startAddActivity = new Intent(ListActivity.this, AddItemActivity.class);
                startActivity(startAddActivity);
            }
        });
    }

    // Define and pre-populate the bucket list
    private void prepareListData() {
        ListItems movies = new ListItems(false, "23.3.2018", "Go watch Avengers Infinity War");
        ListItems laundry = new ListItems(false, "27.3.2018", "Finish Laundry");
        ListItems supermarket = new ListItems(false, "12.6.2018", "Get orange juice from supermarket");
        ListItems skill = new ListItems(false, "22.8.2018", "Learn a New Skill");
        ListItems gift = new ListItems(false, "12.9.2018", "Pick up gift for Zak's birthday");
        ListItems homework = new ListItems(false, "15.9.2018", "Finish homework for university");
        ListItems exercise = new ListItems(false, "18.9.2018", "Join a gym and get a trainer");
        ListItems meditate = new ListItems(false, "6.10.2018", "Start Meditating Daily");
        ListItems repair = new ListItems(false, "21.10.2018", "Remember to give laptop for repair");
        ListItems shipment = new ListItems(false, "12.12.2018", "Recieve Shipment of new footballs");


        listItems.add(movies);
        listItems.add(laundry);
        listItems.add(supermarket);
        listItems.add(skill);
        listItems.add(gift);
        listItems.add(homework);
        listItems.add(exercise);
        listItems.add(meditate);
        listItems.add(repair);
        listItems.add(shipment);

        // If date is changed ( functionality to be added )
        myAdapter.notifyDataSetChanged();
    }
}
