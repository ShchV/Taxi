package com.laba.taxi.interfaces;

import com.laba.taxi.ride.Ride;

public interface RideHistory {
    String getRide(String i);

    void addRide(Ride ride);
    Ride getRide(int index);

    void addRide(String rideDetails);

    void printHistory();
}

