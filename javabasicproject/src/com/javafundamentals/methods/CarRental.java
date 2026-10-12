// 8 + 1 MAIN
package com.javafundamentals.methods;

import java.util.Scanner;

public class CarRental {

    Scanner sc = new Scanner(System.in);

    String getCustomerName() {
        System.out.println("Enter Customer Name:");
        return sc.nextLine();
    }

    String getCarName() {
        System.out.println("Enter Car Name:");
        return sc.nextLine();
    }

    double getDailyRent() {
        System.out.println("Enter Daily Rent:");
        return sc.nextDouble();
    }

    int getRentalDays() {
        System.out.println("Enter Rental Days:");
        return sc.nextInt();
    }

    double calculateRent(double rent, int days) {
        return rent * days;
    }

    void displayCustomerDetails(String name, String car) {
        System.out.println("Customer Name: " + name);
        System.out.println("Car Name: " + car);
    }

    void displayRentalDetails(double rent, int days) {
        System.out.println("Daily Rent: Rs. " + rent);
        System.out.println("Rental Days: " + days);
    }

    void displayTotalRent(double total) {
        System.out.println("Total Rental Amount: Rs. " + total);
    }

    public static void main(String[] args) {
        CarRental cr = new CarRental();

        String name = cr.getCustomerName();
        String car = cr.getCarName();
        double rent = cr.getDailyRent();
        int days = cr.getRentalDays();

        double total = cr.calculateRent(rent, days);

        cr.displayCustomerDetails(name, car);
        cr.displayRentalDetails(rent, days);
        cr.displayTotalRent(total);
    }
}