package jsongetter;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileJsonReader implements JsonReader {
    public Reader getReader(String source) throws IOException{
        return new FileReader(source);
    }
}
