package com.javafundamentals.logical_statements;

import java.util.Scanner;

public class VotingEligibilty {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("You Are Eligible For Voting!");
		} else {
			System.out.println("Eh ley pilla bacha nayala! :-xd");
		}
		sc.close();
	}
}
