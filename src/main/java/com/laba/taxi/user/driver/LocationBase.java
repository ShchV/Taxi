package com.laba.taxi.user.driver;

public abstract class LocationBase {
    protected String name;

    public LocationBase(String name) {
        this.name = name;
    }

    public abstract double distanceTo(LocationBase other);

    public String getName() {
        return name;
    }
}