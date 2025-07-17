package com.laba.taxi.ride;

import java.util.LinkedList;

public class RideHistory {
    private final LinkedList<Ride<?, ?>> rides = new LinkedList<>();

    public void addRide(Ride<?, ?> ride) {
        rides.add(ride);
    }

    public Ride<?, ?> getRide(int index) {
        if (index >= 0 && index < rides.size()) return rides.get(index);
        return null;
    }

    public Ride<?, ?> removeRide(int index) {
        if (index >= 0 && index < rides.size()) return rides.remove(index);
        return null;
    }

    public int size() {
        return rides.size();
    }
}
