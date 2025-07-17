package com.laba.taxi.ride;

import com.laba.taxi.enums.PaymentMethod;
import com.laba.taxi.enums.RideStatus;
import com.laba.taxi.interfaces.Schedulable;
import com.laba.taxi.user.driver.Location;

public class Ride<V, P> implements Schedulable {

    private V vehicle;
    private P passenger;
    private Location from;
    private final Location to;
    private final int distanceKm;
    private RideStatus rideStatus;
    private PaymentMethod paymentMethod;

    public Ride(V vehicle, P passenger, Location from, Location to, int distanceKm) {
        this.vehicle = vehicle;
        this.passenger = passenger;
        this.from = from;
        this.to = to;
        this.distanceKm = distanceKm;
        this.rideStatus = RideStatus.SCHEDULED;
        this.paymentMethod = PaymentMethod.CARD;
    }

    public V getVehicle() {
        return vehicle;
    }

    public P getPassenger() {
        return passenger;
    }

    public Location getFrom() {
        return from;
    }

    public Location getTo() {
        return to;
    }

    public int getDistance() {
        return distanceKm;
    }

    public void setVehicle(V vehicle) {
        this.vehicle = vehicle;
    }

    public void setPassenger(P passenger) {
        this.passenger = passenger;
    }

    public void setFrom(Location from) {
        this.from = from;
    }

    public RideStatus getRideStatus() {
        return rideStatus;
    }

    public void setRideStatus(RideStatus rideStatus) {
        this.rideStatus = rideStatus;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public boolean conflictsWith(Schedulable other) {
        if (other instanceof Ride<?, ?> o) {
            return this.vehicle.equals(o.getVehicle()) && this.from.equals(o.getFrom());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Ride from " + from.toString() + " to " + to.toString() +
                " (" + distanceKm + " km), status=" + rideStatus +
                ", payment=" + paymentMethod;
    }
}
