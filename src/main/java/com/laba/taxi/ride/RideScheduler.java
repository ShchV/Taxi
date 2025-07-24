package com.laba.taxi.ride;

import com.laba.taxi.interfaces.Schedulable;
import com.laba.taxi.exceptions.ScheduleConflictException;

import java.util.List;

public class RideScheduler {

    public void planRide(Ride<?, ?> newRide, List<Schedulable> existingRides)
            throws ScheduleConflictException {

        boolean hasConflict = existingRides.stream()
                .anyMatch(ride -> ride.conflictsWith(newRide));

        if (hasConflict) {
            throw new ScheduleConflictException("Ride conflicts with existing schedule.");
        }
    }
}