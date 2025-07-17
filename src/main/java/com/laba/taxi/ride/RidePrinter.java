package com.laba.taxi.ride;

public class RidePrinter {

    public void printRideInfo(Ride<?, ?> ride) {
        System.out.println("--- Ride Info ---");
        System.out.println("Passenger: " + ride.getPassenger());
        System.out.println("Vehicle: " + ride.getVehicle());
        System.out.println("From: " + ride.getFrom().getClass());
        System.out.println("To: " + ride.getTo().getClass());
        System.out.println("Distance: " + ride.getDistance() + " km");
        System.out.println();
    }

    public void printHistory() {
        System.out.println("--- History ---");
    }
}
