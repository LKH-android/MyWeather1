package com.example.john.myweather.gson;

/**
 * Created by john on 2018/8/23.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
