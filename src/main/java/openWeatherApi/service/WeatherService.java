package openWeatherApi.service;

import openWeatherApi.domain.CityName;

public interface WeatherService {
    void FindWeatherByCityName(CityName cityName);

}
