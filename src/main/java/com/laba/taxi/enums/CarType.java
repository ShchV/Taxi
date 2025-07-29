package com.laba.taxi.enums;

public enum CarType {
<<<<<<< HEAD
    ECONOMY, COMFORT, BUSINESS, SUV, VAN
=======
    ECONOMY(1.0),
    COMFORT(1.5),
    BUSINESS(2.0),
    SUV(1.5),
    VAN(1.5);

    private final double priceCoefficient;

    CarType(double priceCoefficient) {
        this.priceCoefficient = priceCoefficient;
    }

    public double getPriceCoefficient() {
        return priceCoefficient;
    }
>>>>>>> 7e46d72 (Final project)
}

