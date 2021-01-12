package com.eman.locationandgps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home1 extends AppCompatActivity {
    public Button location;
    public Button wather;
    public Button exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home1);
        location=findViewById(R.id.button);
        wather=findViewById(R.id.button2);
        exit=findViewById(R.id.button3);
    }

    public void location(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void wather(View view) {

    }

    public void Exit(View view) {
        finish();
    }
}