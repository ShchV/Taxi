package com.laba.taxi.ride;
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
    }
}
