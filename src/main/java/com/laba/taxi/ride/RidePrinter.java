package com.laba.taxi.ride;

<<<<<<< HEAD
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
=======
import java.util.logging.Logger;

public class RidePrinter {
    private static final Logger logger = Logger.getLogger(RidePrinter.class.getName());

    public void printRideInfo(Ride<?, ?> ride) {
        logger.info("--- Ride Info ---");
        logger.info("Passenger: " + ride.getPassenger());
        logger.info("Vehicle: " + ride.getVehicle());
        logger.info("From: " + ride.getFrom());
        logger.info("To: " + ride.getTo());
        logger.info("Distance: " + ride.getDistance() + " km");
        logger.info("");
    }

    public void printHistory() {
        logger.info("--- History ---");
>>>>>>> 7e46d72 (Final project)
    }
}
