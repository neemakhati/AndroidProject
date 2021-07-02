package com.example.androiddev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class Linear_layout extends AppCompatActivity {

    private TextView linear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            String statePassedFromMainActivity = extras.getString("destination");
            System.out.println("debug " + statePassedFromMainActivity);
            linear = findViewById(R.id.lineartext);
            linear.setText(statePassedFromMainActivity);
        }

    }
}
