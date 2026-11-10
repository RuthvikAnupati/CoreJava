// Write a Java program to print numbers from 1 to 20 using a for loop.
package com.javafundamentals.logical_statements.loops;

import java.util.Scanner;

public class printNum_3_11 {

	static void printNum(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printNum(n);

		sc.close();
	}

}
