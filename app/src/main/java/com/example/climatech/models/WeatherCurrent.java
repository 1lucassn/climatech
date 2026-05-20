package com.example.climatech.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class WeatherCurrent {
    @SerializedName("temperature")
    @Expose
    private double temperature;
    @SerializedName("relativeHumidity")
    @Expose
    private int relativeHumidity;
    @SerializedName("windSpeed")
    @Expose
    private double windSpeed;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(int relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }
}
