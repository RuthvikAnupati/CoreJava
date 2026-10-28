package com.javafundamentals_lab;

import java.util.Scanner;

public class StudentGrades_ifelse_27_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Your Marks : ");
		int marks = sc.nextInt();

		if (marks >= 100 && marks <= 0) {
			System.out.println("Invalid Marks..!");
		} else if (marks > 35 && marks <= 50) {
			System.out.println("Grade - E");
		} else if (marks > 50 && marks <= 60) {
			System.out.println("Grade - D");
		} else if (marks > 60 && marks <= 70) {
			System.out.println("Grade - C");
		} else if (marks > 70 && marks <= 80) {
			System.out.println("Grade - B");
		} else if (marks > 80 && marks <= 90) {
			System.out.println("Grade - A");
		} else if (marks > 90 && marks <= 100) {
			System.out.println("Grade - S");
		} else {
			System.out.println("FAILED");
		}
		sc.close();
	}
}
