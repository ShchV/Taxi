package com.laba.taxi.user.driver;

import com.laba.taxi.ride.RideHistoryBase;
<<<<<<< HEAD

public class DriverRideHistory extends RideHistoryBase {
    @Override
    public void printHistory() {
        System.out.println("Driver History");
=======
import java.util.logging.Logger;

public class DriverRideHistory extends RideHistoryBase {
    private static final Logger logger = Logger.getLogger(Driver.class.getName());

    @Override
    public void printHistory() {
        logger.info("Driver History");
>>>>>>> 7e46d72 (Final project)
        super.printHistory();
    }
}
