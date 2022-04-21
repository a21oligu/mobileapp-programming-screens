package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewDate = findViewById(R.id.textview_date);

        Bundle extras = getIntent().getExtras();

        if (extras == null) return;

        textViewDate.setText("Date and time when button was clicked: " + extras.getString("time"));
    }
}