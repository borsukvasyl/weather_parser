package data;

public class MainWeather extends Data {
    private static final double K = 273.15;

    private final double temperature;
    private final long humidity;
    private final long pressure;

    public MainWeather(double temperature, long humidity, long pressure) {
        this.temperature = temperature - K;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public long getHumidity() {
        return humidity;
    }

    public long getPressure() {
        return pressure;
    }

    public String toString() {
        return String.format(
                "Temperature: %f; Humidity: %d; Pressure: %d", temperature, humidity, pressure
        );
    }
}
