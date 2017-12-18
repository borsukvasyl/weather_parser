package data;

public class Visibility extends Data {
    private final long visibility;

    public Visibility(long visibility) {
        this.visibility = visibility;
    }

    public String toString() {
        return String.format("Visibility: %d", visibility);
    }
}
