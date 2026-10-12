//5 + 1 main
package com.javafundamentals.methods;

import java.util.Scanner;

public class RestaurantBilling {

    Scanner sc = new Scanner(System.in);

    String getCustomerName() {
        System.out.println("Enter Customer Name:");
        return sc.nextLine();
    }

    void displayCustomerDetails(String name, int tableNum) {
        System.out.println("Customer Name: " + name);
        System.out.println("Table Number: " + tableNum);
    }

    int getTableNumber() {
        System.out.println("Enter Table Number:");
        return sc.nextInt();
    }

    double calculateTotal(int quantity, double price) {
        return quantity * price;
    }

    void displayBill(double total, double discount) {
        System.out.println("Total Amount: Rs. " + total);
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Final Bill: Rs. " + (total - discount));
    }

    public static void main(String[] args) {
        RestaurantBilling rb = new RestaurantBilling();

        String name = rb.getCustomerName();
        int tableNum = rb.getTableNumber();

        rb.displayCustomerDetails(name, tableNum);

        System.out.println("Menu");
        System.out.println("1. Burger - Rs. 100");
        System.out.println("2. Pizza - Rs. 200");
        System.out.println("3. Sandwich - Rs. 80");

        System.out.println("Enter Item Number:");
        int item = rb.sc.nextInt();

        System.out.println("Enter Quantity:");
        int quantity = rb.sc.nextInt();

        double price = 0;

        if (item == 1) {
            price = 100;
        } else if (item == 2) {
            price = 200;
        } else if (item == 3) {
            price = 80;
        } else {
            System.out.println("Invalid Item");
            return;
        }

        if (quantity <= 0) {
            System.out.println("Invalid Quantity");
            return;
        }

        double total = rb.calculateTotal(quantity, price);
        double discount = 0;

        if (total >= 500) {
            discount = total * 0.10;
        }

        rb.displayBill(total, discount);
    }
}