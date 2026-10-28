package com.javafundamentals.logical_statements;

import java.util.Scanner;

public class GreaterOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if (num1 != num2) {
			if (num1 > num2) {
				System.out.println("Num " + num1 + " is greater than " + num2);
			} else {
				System.out.println("Num " + num2 + " is greater than " + num1);
			}
		} else {
			System.out.println("Both numbers are equal!");
		}
		sc.close();
	}
}
