package com.example.weatherapplication2.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CityWeather {
    public LocalDateTime requestedDate;
    public double temp;
    public double windSpeedInKph;
    public String windDirection;

}
