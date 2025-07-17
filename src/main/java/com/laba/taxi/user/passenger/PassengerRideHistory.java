package com.laba.taxi.user.passenger;

import com.laba.taxi.ride.RideHistoryBase;

public class PassengerRideHistory extends RideHistoryBase {
    @Override
    public void printHistory() {
        System.out.println("Passenger Ride History");
        super.printHistory();
    }
}
