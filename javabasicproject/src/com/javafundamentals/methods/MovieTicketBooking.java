//8 + 1 main
package com.javafundamentals.methods;

import java.util.Scanner;

public class MovieTicketBooking {

    Scanner sc = new Scanner(System.in);

    String getCustomerName() {
        System.out.println("Enter Customer Name:");
        return sc.nextLine();
    }

    double getTicketPrice() {
        System.out.println("Enter Ticket Price:");
        return sc.nextDouble();
    }

    int getTicketQuantity() {
        System.out.println("Enter Number of Tickets:");
        return sc.nextInt();
    }

    void displayCustomerDetails(String name) {
        System.out.println("Customer Name: " + name);
    }

    void displayTicketDetails(double price, int quantity) {
        System.out.println("Ticket Price: Rs. " + price);
        System.out.println("Number of Tickets: " + quantity);
    }

    double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

    double calculateBookingFee(double total) {
        return 30;
    }

    void displayFinalBill(double total, double fee) {
        System.out.println("Ticket Amount: Rs. " + total);
        System.out.println("Booking Fee: Rs. " + fee);
        System.out.println("Final Amount: Rs. " + (total + fee));
    }

    public static void main(String[] args) {
        MovieTicketBooking mb = new MovieTicketBooking();

        String name = mb.getCustomerName();
        double price = mb.getTicketPrice();
        int quantity = mb.getTicketQuantity();

        mb.displayCustomerDetails(name);
        mb.displayTicketDetails(price, quantity);

        double total = mb.calculateTotal(price, quantity);
        double fee = mb.calculateBookingFee(total);

        mb.displayFinalBill(total, fee);
    }
}