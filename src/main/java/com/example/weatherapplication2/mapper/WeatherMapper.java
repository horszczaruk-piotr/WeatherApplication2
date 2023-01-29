package com.example.weatherapplication2.mapper;

import com.example.weatherapplication2.model.CityWeather;
import com.example.weatherapplication2.model.WeatherDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.TimeZone;


@Mapper(componentModel = "spring")
public interface WeatherMapper {
    @Mapping(source = "current.temp_c", target = "temp")
    @Mapping(source = "current.wind_kph", target = "windSpeedInKph")
    @Mapping(source = "current.wind_dir", target = "windDirection")
    CityWeather toCityWeather (WeatherDto weatherDto);


}
