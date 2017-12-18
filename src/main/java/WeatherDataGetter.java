import data.*;
import data.Weather;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WeatherDataGetter {
    public Coordinates getCoordinates(JSONObject jsonWeather) {
        return new Coordinates(
                (Double) ((JSONObject) jsonWeather.get("coord")).get("lon"),
                (Double) ((JSONObject) jsonWeather.get("coord")).get("lat")
        );
    }

    public Visibility getVisibility(JSONObject jsonWeather) {
        return new Visibility(
                (Long) jsonWeather.get("visibility")
        );
    }

    public Weather getWeather(JSONObject jsonWeather) {
        return new Weather(
                (String) ((JSONObject) ((JSONArray) jsonWeather.get("weather")).get(0)).get("description")
        );
    }

    public MainWeather getMainWeather(JSONObject jsonWeather) {
        return new MainWeather(
                (Double) ((JSONObject) jsonWeather.get("main")).get("temp"),
                (Long) ((JSONObject) jsonWeather.get("main")).get("humidity"),
                (Long) ((JSONObject) jsonWeather.get("main")).get("pressure")
        );
    }

    public Clouds getClouds(JSONObject jsonWeather) {
        return new Clouds(
                (Long) ((JSONObject) jsonWeather.get("clouds")).get("all")
        );
    }
}
