package com.eman.locationandgps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Wather_Activity extends AppCompatActivity {
String country;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wather_);
        country=getIntent().getStringExtra("Palestine");

    }
}