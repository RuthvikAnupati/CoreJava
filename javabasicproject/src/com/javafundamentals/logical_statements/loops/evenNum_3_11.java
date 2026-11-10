// Write a Java program to print all even numbers from 1 to 50 using a for loop.
package com.javafundamentals.logical_statements.loops;

import java.util.Scanner;

public class evenNum_3_11 {

	static void evenNum(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		evenNum(n);
		sc.close();
	}

}
