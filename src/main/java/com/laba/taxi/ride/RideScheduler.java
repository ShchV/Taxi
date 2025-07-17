package com.laba.taxi.ride;

import com.laba.taxi.interfaces.Schedulable;
import com.laba.taxi.exceptions.ScheduleConflictException;

import java.util.List;

public class RideScheduler {

    public void planRide(Ride<?, ?> newRide, List<Schedulable> existingRides)
            throws ScheduleConflictException {

        for (Schedulable ride : existingRides) {
            if (ride.conflictsWith(newRide)) {
                throw new ScheduleConflictException("Ride conflicts with existing schedule.");
            }
        }
    }
}
