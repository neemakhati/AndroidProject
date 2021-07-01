package com.example.androiddev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //hello
        Button linearLayout = findViewById(R.id.linearLayout);
        Button relativeLayout = findViewById(R.id.relativeLayout);
        Button frameLayout = findViewById(R.id.frameLayout);
        Button tableLayout = findViewById(R.id.tableLayout);
        Button constraintLayout = findViewById(R.id.constraintLayout);
        Button formValid = findViewById(R.id.formValid);
        Button listExample = findViewById(R.id.list);



        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linearIntent = new Intent(MainActivity.this,Linear_layout.class);
                startActivity(linearIntent);
            }
        });

        relativeLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent relativeIntent = new Intent(MainActivity.this,Relative_layout.class);
                startActivity(relativeIntent);
            }
        });

        formValid.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent formIntent = new Intent(MainActivity.this,formValid.class);
                startActivity(formIntent);
            }
        });

        constraintLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent constraintIntent = new Intent(MainActivity.this,ConstraintLayout.class);
                startActivity(constraintIntent);
            }
        });

        tableLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent tableIntent = new Intent(MainActivity.this, Table_layout.class);
                startActivity(tableIntent);
            }
        });

        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent frameIntent = new Intent(MainActivity.this, Frame_layout.class);
                startActivity(frameIntent);
            }
        });

        listExample.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListExample.class);
                startActivity(intent);
            }
        });
    }
}
