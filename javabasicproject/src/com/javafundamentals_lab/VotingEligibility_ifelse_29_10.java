/*
Write a Java program to check voting eligibility based on age, citizenship, and voter ID. 
Use an int variable for age and boolean variables indianCitizen and hasVoterId. 
If age is below 0, print "Invalid age"; if below 18, print "Not eligible to vote"; 
		if not an Indian citizen, print "Not eligible to vote"; 
		if there is no voter ID, print "Voter ID required"; 
		otherwise, print "Eligible to vote"
*/

package com.javafundamentals_lab;

import java.util.Scanner;

public class VotingEligibility_ifelse_29_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("Eligible We Will Check Other Criteria");

			System.out.println("Are You an Indian Citizen : ");
			boolean indianCitizen = sc.nextBoolean();
			if (indianCitizen) {
				System.out.println("You are an Indian...");

				System.out.println("Do You Have Voter Id : ");
				boolean hasVoterId = sc.nextBoolean();
				if (hasVoterId) {
					System.out.println("You are good to goo...Lets Cast Your vote");
				} else {
					System.out.println("You are not eligible");
				}

			} else {
				System.out.println("Not an Indian");
			}

		} else {
			if (age < 0) {
				System.out.println("Invalid Age");
			} else {
				System.out.println("Not Eligible to Vote");
			}
		}
		sc.close();
	}

}

//public class TestDemo {
//
//	public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter Your Age:");
//        int age = sc.nextInt();
//
//        if (age < 0) {
//            System.out.println("Invalid age");
//
//        } else if (age < 18) {
//            System.out.println("Not eligible to vote");
//
//        } else {
//            System.out.println("Are You an Indian Citizen (true/false):");
//            boolean indianCitizen = sc.nextBoolean();
//
//            if (!indianCitizen) {
//                System.out.println("Not eligible to vote");
//
//            } else {
//                System.out.println("Do You Have Voter ID (true/false):");
//                boolean hasVoterId = sc.nextBoolean();
//
//                if (!hasVoterId) {
//                    System.out.println("Voter ID required");
//
//                } else {
//                    System.out.println("Eligible to vote");
//                }
//            }
//        }
//
//        sc.close();
//    }
//}