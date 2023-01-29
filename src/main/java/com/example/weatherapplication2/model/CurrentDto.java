package com.example.weatherapplication2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrentDto {
    private double temp_c;
    private double wind_kph;
    private String wind_dir;

    @Override
    public String toString() {
        return "CurrentDto{" +
                "temp_c=" + temp_c +
                ", wind_kph=" + wind_kph +
                ", wind_dir='" + wind_dir + '\'' +
                '}';
    }
}
