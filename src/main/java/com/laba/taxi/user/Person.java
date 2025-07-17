package com.laba.taxi.user;

import com.laba.taxi.user.driver.Location;

public abstract class Person {
    protected String name;
    protected String phoneNumber;
    protected Location from;
    protected Location to;

    public Person(String name, String phoneNumber,Location from, Location to) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.from = from;
        this.to = to;
    }

    public abstract void introduce();

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getFrom() {
        return from;
    }

    public void setFrom(Location from) {
        this.from = from;
    }

    public Location getTo() {
        return to;
    }

    public void setTo(Location to) {
        this.to = to;
    }
}
