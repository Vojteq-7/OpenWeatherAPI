package openWeatherApi.webClient.weather;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class WeatherClient {
    private static final String WEATHER_URL = "http://api.openweathermap.org/data/2.5/";
    private static final String API_KEY = "fd071cbcdf68906fb0cfc616df57cfd1";
    private RestTemplate restTemplate = new RestTemplate();

    public String getWeatherForCity(String city) {
        return restTemplate.getForObject(WEATHER_URL + "weather?q={city}&appid={apiKey}&units=metric&lang=pl",
                String.class, city, API_KEY);
    }

    public String getForecast(double lat, double lon) {
        return restTemplate.getForObject(WEATHER_URL + "onecall?lat={lat}&lon={lon}&exclude=minutely, hourly&appid={API_KEY}&units=metric&lang=pl",
                String.class, lat, lon, API_KEY);
    }
}
