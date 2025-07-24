package com.laba.taxi.user.passenger;

import com.laba.taxi.ride.Ride;
import com.laba.taxi.interfaces.RideHistory;

import java.util.ArrayList;
import java.util.List;

public class PassengerRideHistory implements RideHistory {
    private List<Ride> rides = new ArrayList<>();

    @Override
    public String getRide(String i) {
        return "Ride started";
    }

    @Override
    public void addRide(Ride ride) {
        rides.add(ride);
    }

    @Override
    public Ride getRide(int index) {
        return null;
    }

    @Override
    public void addRide(String rideDetails) {

    }

    @Override
    public void printHistory() {

    }

    public void printAllRides() {
        rides.stream().forEach(System.out::println);
    }

    public long countRidesAboveDistance(int minDistance) {
        return rides.stream()
                .filter(ride -> ride.getDistance() > minDistance)
                .count();
    }
}

