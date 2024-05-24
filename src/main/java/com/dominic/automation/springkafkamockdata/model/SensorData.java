package com.dominic.automation.springkafkamockdata.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SensorData {
    private double rpm;
    private double temperature;
    private double humidity;

    public SensorData(double rpm, double temperature, double humidity) {
        this.rpm = rpm;
        this.temperature = temperature;
        this.humidity = humidity;
    }

}
