package com.laba.taxi.user.driver;

import com.laba.taxi.cars.CarBase;
import com.laba.taxi.interfaces.Car;
import com.laba.taxi.interfaces.Printable;
<<<<<<< HEAD
=======
import java.util.logging.Logger;
>>>>>>> 7e46d72 (Final project)

import java.util.Objects;

public class Driver extends Employee implements Printable {
<<<<<<< HEAD
=======
    private static final Logger logger = Logger.getLogger(Driver.class.getName());


>>>>>>> 7e46d72 (Final project)
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
<<<<<<< HEAD
        System.out.println("laba.DriverInfo.Driver " + name);
    }

    @Override
    public void printDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "laba.DriverInfo.Driver " + name + ", phone = " + phoneNumber + ", id = " + id + "";
=======
        logger.info("DriverInfo: " + name);
    }


    @Override
    public String toString() {
        return "DriverInfo: " + name + ", phone = " + phoneNumber + ", id = " + id + "";
>>>>>>> 7e46d72 (Final project)
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
<<<<<<< HEAD
=======

    @Override
    public void printDetails() {

    }
>>>>>>> 7e46d72 (Final project)
}
