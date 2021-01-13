package com.eman.locationandgps;

import android.net.Uri;

import java.net.URI;
import java.net.URL;

public class WeatherDay {
    private String weather_state_name;
    private String date;
    private String applicable_date;
    private String min_temp;
    private String max_temp;
    private URI urlImg;

    public WeatherDay(String weather_state_name,String date, String applicable_date, String min_temp, String max_temp, URL urlImg) {
        this.weather_state_name = weather_state_name;
        this.date=date;
        this.applicable_date = applicable_date;
        this.min_temp = min_temp;
        this.max_temp = max_temp;
        this.urlImg= urlImg;
    }

    public String getWeather_state_name() {
        return weather_state_name;
    }
    public void setWeather_state_name(String weather_state_name) {
        this.weather_state_name = weather_state_name;
    }

    public String getApplicable_date() {
        return applicable_date;
    }

    public void setApplicable_date(String applicable_date) {
        this.applicable_date = applicable_date;
    }

    public String getMin_temp() {
        return min_temp;
    }

    public void setMin_temp(String min_temp) {
        this.min_temp = min_temp;
    }

    public String getMax_temp() {
        return max_temp;
    }

    public void setMax_temp(String max_temp) {
        this.max_temp = max_temp;
    }

    public URL UrlImg() {
        return urlImg;
    }

    public void setUrlImg(URL urlImg) {
        this.urlImg = urlImg;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}