package com.javafundamentals.logical_statements;

import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int marks = sc.nextInt();
		if (marks >= 0 && marks <= 100) {
			if (marks >= 38) {
				System.out.println("You are pass..!");
			} else {
				System.out.println("Supply fee ready chesuko..! HeHeHe:-");
			}
		} else {
			System.out.println("Enter Valid Marks!");
		}
		sc.close();
	}
}
