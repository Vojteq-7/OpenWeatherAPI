package openWeatherApi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

import javax.swing.*;
@Controller
@SpringBootApplication
public class WeatherRestApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(WeatherRestApiApplication.class, args);
    }
}

