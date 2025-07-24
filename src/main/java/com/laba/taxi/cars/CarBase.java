package com.laba.taxi.cars;

import com.laba.taxi.enums.CarType;
import com.laba.taxi.interfaces.Car;

public abstract class CarBase implements Car {
    private final String model;
    private final String color;
    private final int carNumber;
    private boolean available;
    private CarType carType;

    public CarBase(String model, String color, int carNumber) {
        this.model = model;
        this.color = color;
        this.carNumber = carNumber;
        this.available = true;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getCarNumber() {
        return carNumber;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void setAvailable(boolean available) {
        this.available = available;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " +
                "model= '" + model + '\'' +
                ", color= '" + color + '\'' +
                ", carNumber= " + carNumber +
                ", available= " + available +
                ", carType= " + carType +
                ' ';
    }
}
