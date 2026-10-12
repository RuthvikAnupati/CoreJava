// 8 + 1 main
package com.javafundamentals.methods;

import java.util.Scanner;

public class ElectricityBilling {

	Scanner sc = new Scanner(System.in);

	void displayCustomerDetails() {
		System.out.println("Enter Customer Name:");
		String name = sc.nextLine();

		System.out.println("Enter House Number:");
		String houseNum = sc.nextLine();

		System.out.println("Customer Name: " + name);
		System.out.println("House Number: " + houseNum);
	}

	String displayConnectionDetails() {
		System.out.println("Enter Unique Service Number:");
		long serviceNum = sc.nextLong();

		System.out.println("Enter Connection Type:");
		System.out.println("1. Domestic");
		System.out.println("2. Commercial");
		System.out.println("3. Industrial");

		int choice = sc.nextInt();

		String conType = "";

		if (choice == 1) {
			conType = "Domestic";
		} else if (choice == 2) {
			conType = "Commercial";
		} else if (choice == 3) {
			conType = "Industrial";
		}

		System.out.println("Unique Service Number: " + serviceNum);
		System.out.println("Connection Type: " + conType);

		return conType;
	}

	int displayMeterReadings() {
		System.out.println("Enter Previous Meter Reading:");
		int previousReading = sc.nextInt();

		System.out.println("Enter Current Meter Reading:");
		int currentReading = sc.nextInt();

		if (previousReading < 0 || currentReading < previousReading) {
			System.out.println("Invalid Meter Readings");
			return -1;
		}

		int units = currentReading - previousReading;

		System.out.println("Previous Reading: " + previousReading);
		System.out.println("Current Reading: " + currentReading);
		System.out.println("Units Consumed: " + units);

		return units;
	}

	void displayTariffRates(String conType) {
		System.out.println("Tariff Rates for " + conType);

		if (conType.equals("Domestic")) {
			System.out.println("0-100 units: Rs. 2 per unit");
			System.out.println("101-200 units: Rs. 3 per unit");
			System.out.println("201-300 units: Rs. 5 per unit");
			System.out.println("Above 300 units: Rs. 7 per unit");
		} else if (conType.equals("Commercial")) {
			System.out.println("0-100 units: Rs. 5 per unit");
			System.out.println("101-200 units: Rs. 7 per unit");
			System.out.println("201-300 units: Rs. 9 per unit");
			System.out.println("Above 300 units: Rs. 12 per unit");
		} else if (conType.equals("Industrial")) {
			System.out.println("0-100 units: Rs. 4 per unit");
			System.out.println("101-200 units: Rs. 6 per unit");
			System.out.println("201-300 units: Rs. 8 per unit");
			System.out.println("Above 300 units: Rs. 10 per unit");
		}
	}

	double calculateEnergyCharge(int units, String conType) {
		double charge = 0;

		if (conType.equals("Domestic")) {
			if (units > 300) {
				charge = 100 * 2 + 100 * 3 + 100 * 5 + (units - 300) * 7;
			} else if (units > 200) {
				charge = 100 * 2 + 100 * 3 + (units - 200) * 5;
			} else if (units > 100) {
				charge = 100 * 2 + (units - 100) * 3;
			} else {
				charge = units * 2;
			}
		} else if (conType.equals("Commercial")) {
			if (units > 300) {
				charge = 100 * 5 + 100 * 7 + 100 * 9 + (units - 300) * 12;
			} else if (units > 200) {
				charge = 100 * 5 + 100 * 7 + (units - 200) * 9;
			} else if (units > 100) {
				charge = 100 * 5 + (units - 100) * 7;
			} else {
				charge = units * 5;
			}
		} else if (conType.equals("Industrial")) {
			if (units > 300) {
				charge = 100 * 4 + 100 * 6 + 100 * 8 + (units - 300) * 10;
			} else if (units > 200) {
				charge = 100 * 4 + 100 * 6 + (units - 200) * 8;
			} else if (units > 100) {
				charge = 100 * 4 + (units - 100) * 6;
			} else {
				charge = units * 4;
			}
		}

		return charge;
	}

	double getFixedCharge() {
		return 100;
	}

	double calculateFinalBill(double energyCharge, double fixedCharge) {
		return energyCharge + fixedCharge;
	}

	void displayBill(int units, String conType) {
		double energyCharge = calculateEnergyCharge(units, conType);
		double fixedCharge = getFixedCharge();
		double totalBill = calculateFinalBill(energyCharge, fixedCharge);

		System.out.println("\n----- Electricity Bill -----");
		System.out.println("Connection Type: " + conType);
		System.out.println("Units Consumed: " + units);
		System.out.println("Energy Charge: Rs. " + energyCharge);
		System.out.println("Fixed Charge: Rs. " + fixedCharge);
		System.out.println("Total Bill: Rs. " + totalBill);
	}

	public static void main(String[] args) {
		ElectricityBilling eb = new ElectricityBilling();

		eb.displayCustomerDetails();

		String conType = eb.displayConnectionDetails();

		if (conType.isEmpty()) {
			System.out.println("Invalid Connection Type");
			return;
		}

		int units = eb.displayMeterReadings();

		if (units < 0) {
			return;
		}

		eb.displayTariffRates(conType);
		eb.displayBill(units, conType);
	}
}