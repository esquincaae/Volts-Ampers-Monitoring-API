package com.example.intellifishbackend.MQTT.dtos;

import lombok.Getter;

@Getter
public class WaterTemperatureSensorDataBodyRequest {

    private String measure;

    private String average;

    private String variance;

    private String standardDeviation;

    private String meanDeviation;



}
