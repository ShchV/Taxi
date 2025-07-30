package com.laba.taxi.user.driver;

import com.laba.taxi.cars.CarBase;
import com.laba.taxi.interfaces.Car;
import com.laba.taxi.interfaces.Printable;
import java.util.logging.Logger;

import java.util.Objects;

public class Driver extends Employee implements Printable {
    private static final Logger logger = Logger.getLogger(Driver.class.getName());


    public Driver(String name, String phoneNumber, Location from, Location to, int id) {
        super(name, phoneNumber, from, to, id);
    }

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public void introduce() {
        logger.info("DriverInfo: " + name);
    }


    @Override
    public String toString() {
        return "DriverInfo: " + name + ", phone = " + phoneNumber + ", id = " + id + "=)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver d = (Driver) o;
        return id == d.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void assignCar(CarBase car) {
    }

    @Override
    public void printDetails() {

    }
}
