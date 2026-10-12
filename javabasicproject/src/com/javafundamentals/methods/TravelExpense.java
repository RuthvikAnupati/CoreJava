// 8 + 1 MAIN
package com.javafundamentals.methods;

import java.util.Scanner;

public class TravelExpense {

    Scanner sc = new Scanner(System.in);

    String getDestination() {
        System.out.println("Enter Destination:");
        return sc.nextLine();
    }

    double getTravelCost() {
        System.out.println("Enter Travel Cost:");
        return sc.nextDouble();
    }

    double getFoodCost() {
        System.out.println("Enter Food Cost:");
        return sc.nextDouble();
    }

    double getHotelCost() {
        System.out.println("Enter Hotel Cost:");
        return sc.nextDouble();
    }

    double calculateTotalExpense(double travel, double food, double hotel) {
        return travel + food + hotel;
    }

    void displayDestination(String destination) {
        System.out.println("Destination: " + destination);
    }

    void displayExpenseDetails(double travel, double food, double hotel) {
        System.out.println("Travel Cost: Rs. " + travel);
        System.out.println("Food Cost: Rs. " + food);
        System.out.println("Hotel Cost: Rs. " + hotel);
    }

    void displayTotalExpense(double total) {
        System.out.println("Total Travel Expense: Rs. " + total);
    }

    public static void main(String[] args) {
        TravelExpense te = new TravelExpense();

        String destination = te.getDestination();
        double travel = te.getTravelCost();
        double food = te.getFoodCost();
        double hotel = te.getHotelCost();

        double total = te.calculateTotalExpense(travel, food, hotel);

        te.displayDestination(destination);
        te.displayExpenseDetails(travel, food, hotel);
        te.displayTotalExpense(total);
    }
}