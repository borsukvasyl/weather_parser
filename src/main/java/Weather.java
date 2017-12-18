import data.Clouds;
import data.Coordinates;
import data.MainWeather;
import data.Visibility;

import jsongetter.WeatherParser;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Weather {
    private static final String API_URL = "http://api.openweathermap.org/data/2.5/weather";
    private static final WeatherDataGetter weatherDataGetter = new WeatherDataGetter();

    private JSONObject weatherJson;
    private String city;

    public Weather(WeatherParser weatherParser, String city, String appId) {
        this.city = city;
        try {
            this.weatherJson = weatherParser.getJson(
                    String.format("%s?q=%s&APPID=%s", API_URL, city, appId)
            );
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public JSONObject getWeatherJson() {
        return weatherJson;
    }

    public String getCity() {
        return city;
    }

    public Coordinates getCoordinates() {
        return weatherDataGetter.getCoordinates(weatherJson);
    }

    public Visibility getVisibility() {
        return weatherDataGetter.getVisibility(weatherJson);
    }

    public data.Weather getWeather() {
        return weatherDataGetter.getWeather(weatherJson);
    }

    public MainWeather getMainWeather() {
        return weatherDataGetter.getMainWeather(weatherJson);
    }

    public Clouds getClouds() {
        return weatherDataGetter.getClouds(weatherJson);
    }
}
