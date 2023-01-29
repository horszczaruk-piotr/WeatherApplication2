package com.example.weatherapplication2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherDto {
    private CurrentDto current;

    @Override
    public String toString() {
        return "WeatherDto{" +
                "currentDto=" + current +
                '}';
    }
}
