package openWeatherApi.controller;

import openWeatherApi.service.WeatherService;
import openWeatherApi.view.core.ConsoleLooper;
import openWeatherApi.view.core.ConsoleView;

import java.awt.*;
import java.util.Scanner;


public class WeatherController {
    private final ConsoleLooper looper;
    private final ConsoleView view;
    private final Scanner input = new Scanner(System.in);

    public WeatherController(WeatherService weatherService) {
        Menu menu = new Menu();
        view = new ConsoleView(menu, System.in);
        looper = new ConsoleLooper(view);

        menu.addMenuItem(new MenuItem(
                "Wpisz nazwę miejscowości",
                () ->
        ));
        menu.addMenuItem(new MenuItem(
                "Koniec",
                Menu.DEFAULT_QUIT
        ));
    }

    public void start() {
        looper.runLoop();
    }
}
