package jsongetter;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.io.Reader;

public class JsonGetter {
    private final JsonReader jsonReader;

    public JsonGetter(JsonReader jsonReader) {
        this.jsonReader = jsonReader;
    }

    public JSONObject getJson(String source) throws IOException, ParseException {
        Reader reader = jsonReader.getReader(source);
        JSONParser parser = new JSONParser();
        return (JSONObject) parser.parse(reader);
    }
}
