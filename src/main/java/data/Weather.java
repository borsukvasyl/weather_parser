package data;

public class Weather extends Data {
    private final String description;

    public Weather(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return String.format("Weather description: %s", description);
    }
}
