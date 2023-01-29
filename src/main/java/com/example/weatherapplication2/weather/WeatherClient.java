package com.example.weatherapplication2.weather;

import com.example.weatherapplication2.model.WeatherDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class WeatherClient {

    public static final String WEATHER_URL = "http://api.weatherapi.com/v1/";
    public static final String API_KEY = "617b3c7320344949a86180026230201";
    private RestTemplate restTemplate= new RestTemplate();

    public WeatherDto getWeatherForCity(String city) {
        WeatherDto response = restTemplate.getForObject(
                WEATHER_URL + "current.json?key=" + API_KEY + "&q="+city+"&lang=pl",
                WeatherDto.class);
        WeatherDto weatherDto = new WeatherDto();
        log.info(response.toString());
        return response;
    }


}
