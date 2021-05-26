package openWeatherApi.view.domain;

import java.util.Scanner;

public class GetWeatherByCity {
    private final Scanner scanner;

    public GetWeatherByCity(Scanner scanner) {
        this.scanner = scanner;
    }
    public String AsForNameCity() {
        System.out.println("Wpisz nazwę miejscowości: ");
        return scanner.nextLine();
    }
}
