/*
1.Write a Java program to calculate the electricity bill based on the connection type and the number of units consumed.

Requirements:
 > Ask the user to enter   connection type
a) → Domestic
b) → Commercial
› Using switch case to determine the selected connection type.
› Ask the user to enter the number of units consumed.

a) Domestic Connection:
› If units are 100 or less, charge 2 per unit.
If units are greater than 300 charge 3 change a per unit 

b) Commercial Connection:
› If units are 100 or less, charge 4 per unit.
› If units are greater than 100 and up to 300, charge 6 per unit.
› If units are greater than 300, charge 8 per unit. 
  Atlast, display the following details:
Connection Type
Units Consumed
Rate Per Unit
Total Electricity Bill
*/
package com.javafundamentals_lab;

import java.util.Scanner;

public class electricityBill_switch_2_11 {
	Scanner sc = new Scanner(System.in);

	static String connectionType;

	static int unitsConsumed;
	static double totalBill = 0;

	public static void main(String[] args) {

//		System.out.print("Enter Connection Type : ");
//		String connectionType = sc.next().toLowerCase();
//		System.out.print("Enter Units Consumed : ");
//		int unitsConsumed = sc.nextInt();
//		double totalBill = 0;

		Scanner sc = new Scanner(System.in);
		electricityBill_switch_2_11 e1 = new electricityBill_switch_2_11();
		System.out.print("Enter Connection Type : ");
		connectionType = sc.next().toLowerCase();
		System.out.print("Enter Units Consumed : ");
		unitsConsumed = sc.nextInt();

		switch (connectionType) {
		case "domestic": {
			if (unitsConsumed <= 100) {
				totalBill = unitsConsumed * 2;
			} else if (unitsConsumed <= 300) {
				totalBill += unitsConsumed * 2 + (unitsConsumed - 100) * 2.5;
			} else {
				totalBill += 100 * 2 + 200 * 2.5 + (unitsConsumed - 300) * 3;
			}
		}
			break;
		case "commercial": {
			if (unitsConsumed <= 100) {
				totalBill = unitsConsumed * 4;
			} else if (unitsConsumed <= 300) {
				totalBill = unitsConsumed * 4 + (unitsConsumed - 100) * 6;
			} else {
				totalBill += 100 * 4 + 200 * 6 + (unitsConsumed - 300) * 8;
			}
		}
			break;
		default:
			System.out.println("Enter Correctly");
		}
		System.out.println(
				"Total Bill Amount For " + unitsConsumed + " units in " + connectionType + " type : " + totalBill);
		e1.displayDetails();
		sc.close();
	}

	void displayDetails() {
		System.out.println("----BILLING DETAILS----");
		System.out.println("Connection Type  : " + connectionType);
		System.out.println("Units Consumed   : " + unitsConsumed);
		System.out.println("Total Bill       : " + totalBill);
	}
}