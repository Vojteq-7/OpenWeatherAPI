package openWeatherApi.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import openWeatherApi.model.WeatherDto;
import openWeatherApi.view.domain.GetWeatherByCity;
import openWeatherApi.webClient.weather.WeatherApiClient;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


@Service
@RequiredArgsConstructor
public class WeatherService {



}
