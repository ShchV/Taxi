package com.laba.taxi.user.passenger;

import com.laba.taxi.interfaces.PaymentMethod;
import com.laba.taxi.interfaces.Printable;
import com.laba.taxi.user.Person;
import com.laba.taxi.user.driver.Driver;
import com.laba.taxi.user.driver.Location;
import com.laba.taxi.annotations.EntityInfo;
import java.util.logging.Logger;

@EntityInfo(passenger= "The best passenger", date = "2025-07-29")

public class Passenger extends Person implements PaymentMethod, Printable {
    private static final Logger logger = Logger.getLogger(Driver.class.getName());
    private double balance;

    public Passenger(String name, String phoneNumber, Location from, Location to, double balance) {
        super(name, phoneNumber, from, to);
        this.balance = balance;
        this.from = from;
        this.to = to;
    }

    @Override
    public void pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
            logger.info("The trip cost: $" + amount);
        } else {
            logger.info("You have not enough money to pay the trip");
        }
    }

    @Override
    public void introduce() {
        logger.info("Passenger name = " + name);
    }

    @Override
    public void printDetails() {

    }

    @Override
    public String toString() {
        return "Passenger name = " + name + " , phone = " + phoneNumber + " , balance = $" + balance + " ";
    }
}
