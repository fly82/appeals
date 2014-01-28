package models;

public class Location {
    double latitude;
    double longitude;

    public Location() {
    }

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
