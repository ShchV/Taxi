package com.laba.taxi.user.passenger;

import com.laba.taxi.interfaces.PaymentMethod;
import com.laba.taxi.interfaces.Printable;
import com.laba.taxi.user.Person;
<<<<<<< HEAD
import com.laba.taxi.user.driver.Location;

public class Passenger extends Person implements PaymentMethod, Printable {
=======
import com.laba.taxi.user.driver.Driver;
import com.laba.taxi.user.driver.Location;
import com.laba.taxi.annotations.EntityInfo;
import java.util.logging.Logger;

@EntityInfo(passenger= "The best passenger", date = "2025-07-29")

public class Passenger extends Person implements PaymentMethod, Printable {
    private static final Logger logger = Logger.getLogger(Driver.class.getName());
>>>>>>> 7e46d72 (Final project)
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
<<<<<<< HEAD
            System.out.println("The trip cost: $" + amount);
        } else {
            System.out.println("You have not enough money to pay the trip");
=======
            logger.info("The trip cost: $" + amount);
        } else {
            logger.info("You have not enough money to pay the trip");
>>>>>>> 7e46d72 (Final project)
        }
    }

    @Override
    public void introduce() {
<<<<<<< HEAD
        System.out.println("Passenger name = " + name);
=======
        logger.info("Name = " + name);
>>>>>>> 7e46d72 (Final project)
    }

    @Override
    public void printDetails() {
<<<<<<< HEAD
        System.out.println(this);
=======

>>>>>>> 7e46d72 (Final project)
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Passenger name = " + name + " , phone = " + phoneNumber + " , balance = $" + balance + " ";
=======
        return "Name = " + name + " , phone = " + phoneNumber + " , balance = $" + balance + " ";
>>>>>>> 7e46d72 (Final project)
    }
}
