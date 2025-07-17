package com.laba.taxi.cars;

import com.laba.taxi.exceptions.CarNotAvailableException;
import com.laba.taxi.interfaces.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public void checkAvailability(Car car) {
        if (car == null || !car.isAvailable()) {
            throw new CarNotAvailableException("Car is not available for the ride.");
        }
    }

    // Метод створення автопарку (як раніше)
    public List<Car> createCarFleet() {
        List<Car> fleet = new ArrayList<>();
        fleet.add(new SUVCar("Toyota RAV4", "Black", 1001));
        fleet.add(new HybridCar("Toyota Prius", "Green", 1002));
        fleet.add(new LuxuryCar("Mercedes S-Class", "Silver", 1003));
        return fleet;
    }
}