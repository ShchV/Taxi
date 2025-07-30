package com.laba.taxi.user.driver;

public record Location(double latitude, double longitude) {
    @Override
    public String toString() {
        return "Location " +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ' ';
    }
}
