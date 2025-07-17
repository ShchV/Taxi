package com.laba.taxi.user.driver;

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
        return "Location { name = %s }".formatted(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }
}

