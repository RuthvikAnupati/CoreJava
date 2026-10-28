/*
1.Create a Java program to calculate a customer’s Mobile Bill using constructor chaining.
->Create multiple constructors and use "this()" to perform constructor chaining.
->The program should calculate:
- Mobile cost = Price × Quantity
- Final bill = Mobile cost + Delivery charge
->Ask the user for:
Mobile model, Quantity, Price, and Delivery charge.
Output
Display mobile model, price, quantity, mobile cost, delivery charge, and final bill.
Note: Use constructor chaining only.
*/
package com.javafundamentals_lab;

import java.util.Scanner;

public class MobileBilling_Constructor_15_10 {

	String model;
	int quantity;
	double price, cost, deliveryCharges, finalBill;

	public MobileBilling_Constructor_15_10() {
		this("unknown", 0);
	}

	public MobileBilling_Constructor_15_10(String model, int quantity) {
		this(model, quantity, 0.0);
	}

	public MobileBilling_Constructor_15_10(String model, int quantity, double price) {
		this(model, quantity, price, 0.0);
	}

	public MobileBilling_Constructor_15_10(String model, int quantity, double price, double deliveryCharges) {
		this(model, quantity, price, deliveryCharges, 0.0, 0.00);
	}

	public MobileBilling_Constructor_15_10(String model, int quantity, double price, double deliveryCharges,
			double cost, double finalBill) {
		this.model = model;
		this.quantity = quantity;
		this.price = price;
		this.cost = this.price * this.quantity;
		this.deliveryCharges = deliveryCharges;
		this.finalBill = this.cost + this.deliveryCharges;
	}

	void display() {
		System.out.println("--------MOBILE BILLING------------");
		System.out.println("Model : " + model);
		System.out.println("Quantity : " + quantity);
		System.out.println("Price : " + price);
		System.out.println("Delivery Charges : " + deliveryCharges);
		System.out.println("Cost : " + cost);
		System.out.println("Final Billing : " + finalBill);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Model : ");
		String model = sc.nextLine();
		System.out.println("Enter Quantity : ");
		int quantity = sc.nextInt();
		System.out.println("Enter Price : ");
		double price = sc.nextDouble();
		System.out.println("Enter DeliveryCharges : ");
		double deliveryCharges = sc.nextDouble();

		MobileBilling_Constructor_15_10 m1 = new MobileBilling_Constructor_15_10(model, quantity, price,
				deliveryCharges, 0.00, 0.00);

		m1.display();
		sc.close();
	}

}
