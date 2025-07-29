package com.laba.taxi.ride;

import com.laba.taxi.interfaces.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
<<<<<<< HEAD

public class RideCompany {
=======
import java.util.logging.Logger;

public class RideCompany {
    private static final Logger logger = Logger.getLogger(RideCompany.class.getName());
>>>>>>> 7e46d72 (Final project)

    private String name;
    private final List<Car> fleet;

    public RideCompany(String name) {
        this.name = name;
        this.fleet = new ArrayList<>();
    }

    public void addCar(Car car) {
        fleet.add(car);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getFleet() {
        return fleet;
    }

    public Car dispatchAvailableCar() {
        Optional<Car> availableCar = fleet.stream()
                .filter(Car::isAvailable)
                .findFirst();

        availableCar.ifPresent(car -> car.setAvailable(false));
        return availableCar.orElse(null);
    }

    public void organizeRide(Ride<?, ?> ride) {
<<<<<<< HEAD
        System.out.println("Ride organized: " + ride);
=======
        logger.info("Ride organized: " + ride);
>>>>>>> 7e46d72 (Final project)
    }

    public void printAvailableCars() {
        fleet.stream()
                .filter(Car::isAvailable)
<<<<<<< HEAD
                .forEach(car -> System.out.println("Available: " + car));
=======
                .forEach(car -> logger.info("Available: " + car));
>>>>>>> 7e46d72 (Final project)
    }
}
