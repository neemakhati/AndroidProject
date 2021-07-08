package com.example.androiddev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Recylerlist extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<Item_class> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recylerlist);

        initData();
        initRecyclerView();

    }
    private void initData() {
        userList= new ArrayList<>();
        userList.add(new Item_class(R.drawable.samip,"Samip ","5:54","intern at IT","------------------------------------------------------------------------------------"));
        userList.add(new Item_class(R.drawable.me,"Neema ","6:04","student at DWIT","------------------------------------------------------------------------------------"));
        userList.add(new Item_class(R.drawable.samip,"Bikram ","5:54","intern at IT","------------------------------------------------------------------------------------"));
        userList.add(new Item_class(R.drawable.me,"Khati","6:04","student at DWIT","------------------------------------------------------------------------------------"));
        userList.add(new Item_class(R.drawable.samip,"Thapa","5:54","intern at IT","------------------------------------------------------------------------------------"));
        userList.add(new Item_class(R.drawable.me,"Simu","6:04","student at DWIT","------------------------------------------------------------------------------------"));
        userList.add(new Item_class(R.drawable.samip,"Sam","5:54","intern at IT","------------------------------------------------------------------------------------"));
        userList.add(new Item_class(R.drawable.me,"Neema Khati","6:04","student at DWIT","------------------------------------------------------------------------------------"));
        userList.add(new Item_class(R.drawable.samip,"Samip Bikram Thapa","5:54","intern at IT","------------------------------------------------------------------------------------"));
    }

    private void initRecyclerView() {
        recyclerView=findViewById(R.id.recyclerView);
        layoutManager= new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter= new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}
