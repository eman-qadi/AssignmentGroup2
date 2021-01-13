package com.eman.locationandgps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Wather_Activity extends AppCompatActivity {
String country;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wather_activity);
        country=getIntent().getStringExtra("cit");
        RecyclerView recycler = findViewById(R.id.waether);

    }

    public void btn_weather_cityID_click(View view) {
        String url = "http://api.worldweatheronline.com/premium/v1/weather.ashx?key=60de2a43aa6b4d48a8a90120211101&q="+country+"&format=json&num_of_days=5";

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, (String) null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        String[] days;

                        try {
                            JSONArray array = response.getJSONArray("consolidated_weather");

                            days = new String[array.length()];
                            for(int i = 0; i<array.length(); i++){
                                JSONObject obj = array.getJSONObject(i);
                                URL url = new URL(obj.getString("weatherIconUrl"));
                                List<WeatherDay> wather=new ArrayList();
                                wather.add(new WeatherDay(obj.getString("weatherDesc"),obj.getString("date"),
                                        obj.getString("date"),obj.getString("mintempC")
                                        ,obj.getString("maxtempC"),url));

                            }

//                            ArrayAdapter<String> itemsAdapter =
//                                    new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,
//                                            days);
//                            lst.setAdapter(itemsAdapter);
                        } catch (JSONException | MalformedURLException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //  

                    }
                });
        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest);
    }
}