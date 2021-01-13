package com.eman.locationandgps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.gms.location.LocationRequest;

public class Home1 extends AppCompatActivity {
    public Button location;
    public Button wather;
    public Button exit;
    Bundle savedInstanceState;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home1);
        location=findViewById(R.id.button);
        wather=findViewById(R.id.button2);
        exit=findViewById(R.id.button3);
        this.savedInstanceState=savedInstanceState;

        spinner=findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter =ArrayAdapter.createFromResource(this,R.array.country,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
    }
    public void location(View view) {

        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void wather(View view) {
        String cit =spinner.getSelectedItem().toString();
        Intent intent=new Intent(this,Wather_Activity.class);
         intent.putExtra("cit",cit);
        startActivity(intent);
    }
    public void Exit(View view) {
        finish();
    }
}