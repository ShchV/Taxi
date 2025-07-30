package com.laba.taxi.ride;
import com.laba.taxi.interfaces.RideHistory;
import com.laba.taxi.interfaces.RideHistory;

import java.util.logging.Logger;

public abstract class RideHistoryBase extends HistoryBase<Ride> implements RideHistory {
    private static final Logger logger = Logger.getLogger(RideHistoryBase.class.getName());

    @Override
    public void addRide(Ride ride) {
        addItem(ride);
    }

    @Override
    public Ride getRide(int index) {
        return getItem(index);
    }

    @Override
    public void printHistory() {
        for (Ride ride : historyList) {
            logger.info(ride.toString());
        }
    }

    @Override
    public void addRide(String rideDetails) {
        logger.warning("Adding ride from String not implemented: " + rideDetails);
    }

    @Override
    public String getRide(String i) {
        try {
            int index = Integer.parseInt(i);
            Ride ride = getRide(index);
            return ride != null ? ride.toString() : "No ride at index " + index;
        } catch (NumberFormatException e) {
            return "Invalid index format: " + i;
        }
    }
}
