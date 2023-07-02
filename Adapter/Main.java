package Adapter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");
        TemperatureAPI temperatureAPI = new TemperatureAPI();

        Scanner sc = new Scanner(System.in);
        var cityName = sc.next();
        sc.close();

        String cityTemp = temperatureAPI.getTempByCityName(cityName);
        System.out.println(cityName + " have " + cityTemp + " temp today");
    }
}
