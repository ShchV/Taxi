package com.laba.taxi.user.driver;

import com.laba.taxi.user.Person;

public abstract class Employee extends Person {
    protected int id;

    public Employee(String name, String phoneNumber, Location from, Location to, int id) {
        super(name, phoneNumber, from, to);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

