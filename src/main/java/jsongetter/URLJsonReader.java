package jsongetter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class URLJsonReader implements JsonReader {
    public Reader getReader(String source) throws IOException{
        URL url = new URL(source);
        return new BufferedReader(
                new InputStreamReader(url.openStream())
        );
    }
}
