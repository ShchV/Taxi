package com.laba.taxi.user.driver;

import com.laba.taxi.ride.RideHistoryBase;

public class DriverRideHistory extends RideHistoryBase {
    @Override
    public void printHistory() {
        System.out.println("Driver History");
        super.printHistory();
    }
}
