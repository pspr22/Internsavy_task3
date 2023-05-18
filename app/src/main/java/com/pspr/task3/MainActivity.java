package com.pspr.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView date;
    public Calendar calendar;
    public SimpleDateFormat sdf;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        date = findViewById(R.id.date);

        calendar = Calendar.getInstance();
        sdf = new SimpleDateFormat("MM-dd-yyyy" );
        String dat = sdf.format(calendar.getTime());
        date.setText(dat);

    }
}