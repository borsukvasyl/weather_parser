package data;

public class Coordinates extends Data {
    private final double lon;
    private final double lat;

    public Coordinates(double lon, double lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public double getLat() {
        return lat;
    }

    public String toString() {
        return String.format("Lon: %f; Lat: %f", lon, lat);
    }
}
