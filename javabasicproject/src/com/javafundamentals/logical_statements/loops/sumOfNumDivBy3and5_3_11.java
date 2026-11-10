// Write a Java program to find the sum of all numbers from 1 to N 
// that are divisible by both 3 and 5 using a for loop.
package com.javafundamentals.logical_statements.loops;

import java.util.Scanner;

public class sumOfNumDivBy3and5_3_11 {

	static void result(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		result(n);
		sc.close();
	}
}
