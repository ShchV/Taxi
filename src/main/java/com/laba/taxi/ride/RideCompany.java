package com.laba.taxi.ride;

import com.laba.taxi.interfaces.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RideCompany {

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
        System.out.println("Ride organized: " + ride);
    }

    public void printAvailableCars() {
        fleet.stream()
                .filter(Car::isAvailable)
                .forEach(car -> System.out.println("Available: " + car));
    }
}
