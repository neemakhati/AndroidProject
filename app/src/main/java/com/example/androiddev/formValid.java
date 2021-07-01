package com.example.androiddev;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class formValid extends AppCompatActivity {

    private Button button;
    private EditText phone_number;
    private EditText person_name;
    private EditText email_id;
    private EditText website_name;
    private EditText password_;
    private EditText con;
    private TextView heading;
    private View layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_valid);

        person_name = findViewById(R.id.name);
        phone_number=findViewById(R.id.number);
        email_id=findViewById(R.id.email);
        website_name=findViewById(R.id.website);
        password_=findViewById(R.id.password);
        con=findViewById(R.id.confirm_password);
        button=findViewById(R.id.submit);
        layout=findViewById(R.id.parent);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Editable inputText = person_name.getText();
                website_name.setText(inputText);
                //Toast.makeText(MainActivity.this, inputText + " has been displayed", Toast.LENGTH_LONG).show();
                Snackbar.make(layout, inputText + " has been displayed", Snackbar.LENGTH_LONG)
                        .setAction("Again", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(formValid.this, inputText + " has been displayed", Toast.LENGTH_LONG).show();
                            }
                        })
                        .setActionTextColor(Color.RED).show();
            }
        });

    }
}
