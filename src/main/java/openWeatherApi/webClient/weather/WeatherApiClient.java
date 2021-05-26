package openWeatherApi.webClient.weather;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

@Component
public class WeatherApiClient {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz nazwę miejscowości: ");
        String city = scanner.nextLine();
        URI uri = new URI("http://api.openweathermap.org/data/2.5/weather?q=" +
                city +
                "&appid=fd071cbcdf68906fb0cfc616df57cfd1&units=metric&lang=pl");
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(uri)
                .build();
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}