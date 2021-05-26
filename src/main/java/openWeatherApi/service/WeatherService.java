package openWeatherApi.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import openWeatherApi.model.WeatherDto;
import openWeatherApi.webClient.weather.WeatherApiClient;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class WeatherService {

    private final WeatherApiClient weatherApiClient;

    public WeatherApiClient getWeatherByCity(String city) {
        return weatherApiClient;
    }


    //    private final WeatherApiClient weatherClient;
//
//    public WeatherDto getWeather() {
//        String response = weatherClient.getWeatherForCity("Warszawa");
//        log.info(response);
//        return null;
//    }


}
