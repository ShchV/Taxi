package com.laba.taxi.user.driver;

import com.laba.taxi.ride.RideHistoryBase;
import java.util.logging.Logger;

public class DriverRideHistory extends RideHistoryBase {
    private static final Logger logger = Logger.getLogger(Driver.class.getName());

    @Override
    public void printHistory() {
        logger.info("Driver History");
        super.printHistory();
    }
}