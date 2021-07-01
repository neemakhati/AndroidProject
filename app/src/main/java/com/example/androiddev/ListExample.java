package com.example.androiddev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class ListExample extends AppCompatActivity {

    private View parent;
    private ListView location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_example);

            parent = findViewById(R.id.parent);
            location = findViewById(R.id.country);

            ArrayList<String> locationList = new ArrayList<>();
            locationList.add("Nepal");
            locationList.add("India");
            locationList.add("China");

            final ArrayAdapter<String> locationAdapter = new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    locationList
            );
            location.setAdapter(locationAdapter);


        FloatingActionButton addButton = findViewById(R.id.floatingAdd);
            addButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ArrayList<String> locationList = new ArrayList<>();
                    locationList.add("Japan");
                    locationList.add("Korea");
                    locationList.add("Russia");

                    ArrayAdapter<String> locationAdapter = new ArrayAdapter<>(
                            ListExample.this,
                            android.R.layout.simple_list_item_1,
                            locationList
                    );
                    location.setAdapter(locationAdapter);
                    Snackbar.make(parent, "Array Clicked",Snackbar.LENGTH_SHORT).show();
                }
            });
    }
}
