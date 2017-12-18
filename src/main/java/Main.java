import java.io.IOException;

import jsongetter.WeatherParser;
import jsongetter.URLJsonReader;

import org.json.simple.parser.ParseException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Weather weather = new Weather(new WeatherParser(new URLJsonReader()),
                "Lviv", "5496614f4ca95e6dcc0445c1e7f3916d"
        );

        System.out.println(weather.getCity());
        System.out.println(weather.getCoordinates());
        System.out.println(weather.getVisibility());
        System.out.println(weather.getWeather());
        System.out.println(weather.getMainWeather());
        System.out.println(weather.getClouds());
    }
}
