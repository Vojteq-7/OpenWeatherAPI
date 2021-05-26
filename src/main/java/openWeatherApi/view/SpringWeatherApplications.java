package openWeatherApi.view;

import openWeatherApi.controller.WeatherController;
import openWeatherApi.service.WeatherService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWeatherApplications implements CommandLineRunner {

    private final WeatherController controller;

    public SpringWeatherApplications(WeatherService weatherService) {
        controller = new WeatherController(weatherService);
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringWeatherApplications.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        controller.start();
    }
}
