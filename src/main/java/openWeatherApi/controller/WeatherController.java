package openWeatherApi.controller;

import lombok.RequiredArgsConstructor;
import openWeatherApi.model.WeatherDto;
import openWeatherApi.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WeatherController {
    private final WeatherService weatherService;

    @GetMapping("/weather")
    public WeatherDto getWeather() {
        return weatherService.getWeather();
    }

}
