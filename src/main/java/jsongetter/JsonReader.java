package jsongetter;

import java.io.IOException;
import java.io.Reader;

public interface JsonReader {
    Reader getReader(String source) throws IOException;
}
