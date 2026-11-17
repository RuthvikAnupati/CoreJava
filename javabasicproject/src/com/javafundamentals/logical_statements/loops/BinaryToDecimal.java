package com.javafundamentals.logical_statements.loops;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int binary = sc.nextInt();

		int decimal = 0;
		int power = 1;

		while (binary > 0) {
			int rem = binary % 10;

			decimal = decimal + (rem * power);
			power = power * 2;
			binary = binary / 10;
		}
		System.out.println(decimal);
		sc.close();
	}
}
