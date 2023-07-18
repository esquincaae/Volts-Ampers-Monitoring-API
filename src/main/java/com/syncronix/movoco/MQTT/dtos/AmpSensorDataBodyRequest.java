package com.syncronix.movoco.MQTT.dtos;

import lombok.Getter;

@Getter
public class AmpSensorDataBodyRequest {

    private Float media;
    private Float mediana;
    private Float moda;
    private Float variance;
    private Float standardDeviation;
    private Float meanDeviation;
    private Float amp;
}