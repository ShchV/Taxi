package com.laba.taxi.user.driver;

<<<<<<< HEAD
import java.util.Objects;

public class Location {

    private String name;

    public Location(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return Objects.equals(name, location.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return " = %s ".formatted(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }
}

=======
public record Location(double latitude, double longitude) {
    @Override
    public String toString() {
        return "Location " +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ' ';
    }
}
>>>>>>> 7e46d72 (Final project)
