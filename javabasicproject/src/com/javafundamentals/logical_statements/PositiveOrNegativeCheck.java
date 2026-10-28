package com.javafundamentals.logical_statements;

import java.util.Scanner;

public class PositiveOrNegativeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("Poitive Number..!");
		} else {
			System.out.println("Negative Number..!");
		}
		sc.close();
	}
}
