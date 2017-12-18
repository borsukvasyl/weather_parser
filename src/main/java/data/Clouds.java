package data;

import org.json.simple.JSONObject;

public class Clouds extends Data {
    private final long all;

    public Clouds(long all) {
        this.all = all;
    }

    public long getAll() {
        return all;
    }

    public String toString() {
        return String.format("All: %d", all);
    }
}
