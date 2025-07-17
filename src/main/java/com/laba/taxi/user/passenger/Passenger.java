package com.laba.taxi.user.passenger;

import com.laba.taxi.interfaces.PaymentMethod;
import com.laba.taxi.interfaces.Printable;
import com.laba.taxi.user.Person;
import com.laba.taxi.user.driver.Location;

public class Passenger extends Person implements PaymentMethod, Printable {
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
            System.out.println("The trip cost: $" + amount);
        } else {
            System.out.println("You have not enough money to pay the trip");
        }
    }

    @Override
    public void introduce() {
        System.out.println("laba.PassengerInfo.Passenger " + name);
    }

    @Override
    public void printDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "laba.PassengerInfo.Passenger name = " + name + " , phone = " + phoneNumber + " , balance = $" + balance + " ";
    }
}
