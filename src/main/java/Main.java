import java.io.IOException;

import jsongetter.JsonGetter;
import jsongetter.URLJsonReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        JSONObject jsonObject = new JsonGetter(new URLJsonReader()).getJson(
                "http://api.openweathermap.org/data/2.5/weather?q=Lviv&APPID=5496614f4ca95e6dcc0445c1e7f3916d"
        );

        Object name = jsonObject.get("weather");
        System.out.println(jsonObject);
        System.out.println(name);
    }
}
