package com.example.weatherapplication2.service;

import com.example.weatherapplication2.mapper.WeatherMapper;
import com.example.weatherapplication2.model.CityWeather;
import com.example.weatherapplication2.model.WeatherDto;
import com.example.weatherapplication2.weather.WeatherClient;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
@AllArgsConstructor
public class WeatherService {

    private final WeatherClient weatherClient;
    private final WeatherMapper mapper;


    public CityWeather getWeather(String city){
        WeatherDto weatherDto = weatherClient.getWeatherForCity(city);
        /*CityWeather cityWeather = new CityWeather();
        cityWeather.setTemp(weatherDto.getCurrent().getTemp_c());
        cityWeather.setRequestedDate(LocalDateTime.now());
        return cityWeather;
        */
        CityWeather cityWeather = mapper.toCityWeather(weatherDto);
        cityWeather.setRequestedDate(LocalDateTime.now());
        return  cityWeather;
    }


}
