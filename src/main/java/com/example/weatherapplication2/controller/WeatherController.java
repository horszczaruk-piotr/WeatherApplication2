package com.example.weatherapplication2.controller;

import com.example.weatherapplication2.model.CityWeather;
import com.example.weatherapplication2.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather/{city}")
    public CityWeather getWeather(@PathVariable String city){
        return weatherService.getWeather(city);
    }
}
