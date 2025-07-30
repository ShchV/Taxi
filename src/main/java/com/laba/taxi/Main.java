package com.laba.taxi;

import com.laba.taxi.cars.*;
import com.laba.taxi.enums.CarType;
import com.laba.taxi.enums.PaymentMethod;
import com.laba.taxi.enums.RideStatus;
import com.laba.taxi.exceptions.*;
import com.laba.taxi.interfaces.Car;
import com.laba.taxi.interfaces.Schedulable;
import com.laba.taxi.ride.*;
import com.laba.taxi.user.driver.*;
import com.laba.taxi.user.passenger.Passenger;
import com.laba.taxi.user.passenger.PassengerRideHistory;
import com.laba.taxi.utils.AnnotationReader;
import com.laba.taxi.user.driver.Pair;
import com.laba.taxi.user.driver.Response;
import java.util.logging.Logger;
import com.laba.taxi.utils.LoggerTask;
import com.laba.taxi.user.passenger.Passenger;
import com.laba.taxi.utils.AnnotationService;

import java.util.*;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.info("Welcome to Laba Taxi Service!");

        RideCompany company = new RideCompany("Quick Taxi");

        Location kyiv = new Location(	50.450001, 	30.523333);
        Location lviv = new Location(49.842957, 24.031111);
        Location odessa = new Location(46.482952, 	30.712481);

        Passenger alice = new Passenger("Alice", "099-111-22-33", kyiv, lviv, 500);
        Passenger bob = new Passenger("Bob", "066-222-33-44", odessa, kyiv, 400);

        Driver Max = new Driver("Max", "088-888-88-88", kyiv, lviv, 5);

        SUVCar suvCar = new SUVCar("Toyota Camry", "White", 1234);
        suvCar.setCarType(CarType.SUV);

        LuxuryCar luxuryCar = new LuxuryCar("Tesla Model 3", "Black", 5456);
        luxuryCar.setCarType(CarType.BUSINESS);

        HybridCar hybridCar = new HybridCar("Toyota Prius", "Green", 1002);
        hybridCar.setCarType(CarType.ECONOMY);

        company.addCar(suvCar);
        company.addCar(luxuryCar);
        company.addCar(hybridCar);

        CarService carService = new CarService();
        RideScheduler rideScheduler = new RideScheduler();
        RidePrinter ridePrinter = new RidePrinter();

        List<Schedulable> scheduledRides = new ArrayList<>();

        PassengerRideHistory passengerHistory = new PassengerRideHistory();
        DriverRideHistory driverHistory = new DriverRideHistory();

        AnnotationService annotationService = new AnnotationService();
        annotationService.printEntityMetadata(Passenger.class);

        // Ride 1
        Car car1 = company.dispatchAvailableCar();
        Ride<Car, Passenger> ride1 = null;
        if (car1 != null) {
            try {
                ride1 = new Ride<>(car1, alice, kyiv, lviv, 540);
                ride1.setRideStatus(RideStatus.IN_PROGRESS);
                ride1.setPaymentMethod(PaymentMethod.CARD);

                rideScheduler.planRide(ride1, scheduledRides);
                scheduledRides.add(ride1);
                company.organizeRide(ride1);
                ridePrinter.printRideInfo(ride1);

                logger.info("Car Type: " + ((CarBase) car1).getCarType());
                logger.info("Ride Status: " + ride1.getRideStatus());
                logger.info("Payment: " + ride1.getPaymentMethod());

                car1.setAvailable(true);

            } catch (ScheduleConflictException e) {
                logger.severe("Ride 1 failed: " + e.getMessage());
                car1.setAvailable(true);
            }
        } else {
            logger.severe("No available car for Ride 1.");
        }

        // Ride 2
        Car car2 = company.dispatchAvailableCar();
        Ride<Car, Passenger> ride2 = null;
        if (car2 != null) {
            try {
                ride2 = new Ride<>(car2, bob, odessa, kyiv, 600);
                ride2.setRideStatus(RideStatus.SCHEDULED);
                ride2.setPaymentMethod(PaymentMethod.CASH);

                rideScheduler.planRide(ride2, scheduledRides);
                scheduledRides.add(ride2);
                company.organizeRide(ride2);
                ridePrinter.printRideInfo(ride2);

                logger.info("Car Type: " + ((CarBase) car2).getCarType());
                logger.info("Ride Status: " + ride2.getRideStatus());
                logger.info("Payment: " + ride2.getPaymentMethod());

                car2.setAvailable(true);

            } catch (CarNotAvailableException | ScheduleConflictException e) {
                logger.severe("Ride 2 failed: " + e.getMessage());
                car2.setAvailable(true);
            }
        } else {
            logger.severe("No available car for Ride 2.");
        }

        if (ride1 != null) {
            passengerHistory.addRide(ride1);
            driverHistory.addRide(ride1);
        }

        if (ride2 != null) {
            passengerHistory.addRide(ride2);
            driverHistory.addRide(ride2);
        }

        logger.info("\n   = Passenger Ride History =   ");
        passengerHistory.printHistory();

        logger.info("\n   = Driver Ride History =   ");
        driverHistory.printHistory();

        logger.info("   = EntityInfo Annotation =   ");
        AnnotationReader.printEntityInfo(Pair.class);
        AnnotationReader.printEntityInfo(Response.class);

        for (int i = 1; i <= 3; i++) {
            Thread thread = new Thread(new LoggerTask("Worker-" + i));
            thread.start();
        }

        logger.info("Car Type: " + ((CarBase) car1).getCarType());
        logger.info("Ride Status: " + ride1.getRideStatus());

        CarType type = CarType.BUSINESS;
        PaymentMethod payment = PaymentMethod.CARD;
        RideStatus status = RideStatus.SCHEDULED;

        logger.info("Selected car type: " + type);
        logger.info("Chosen payment method: " + payment);
        logger.info("Ride status: " + status);

        logger.info("Available Car Types:");
        for (CarType ct : CarType.values()) {
            logger.info("- " + ct.name());
        }
    }
}