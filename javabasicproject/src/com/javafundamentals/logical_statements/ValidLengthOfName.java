package com.javafundamentals.logical_statements;

import java.util.Scanner;

public class ValidLengthOfName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine();

		if (name.length() > 15) {
			System.out.println("Name is tooo Long !");
		} else {
			System.out.println("Accepted !");
		}
		sc.close();
	}
}
