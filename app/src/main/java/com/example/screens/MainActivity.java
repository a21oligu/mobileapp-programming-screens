package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Intent sendIntent;
    private String currentTimeAndDate;
    private SimpleDateFormat dateFormatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dateFormatter = new SimpleDateFormat("dd/MM yyyy - HH:mm.ss", Locale.getDefault());

        sendIntent = new Intent(MainActivity.this, SecondActivity.class);

        sendIntent.setAction(Intent.ACTION_SEND);
    }

    public void runSecondActivity(View view) {
        currentTimeAndDate = dateFormatter.format(new Date());
        sendIntent.putExtra("time", currentTimeAndDate);
        startActivity(sendIntent);
    }
}
