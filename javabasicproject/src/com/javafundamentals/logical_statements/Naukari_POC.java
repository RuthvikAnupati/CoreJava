
package com.javafundamentals.logical_statements;

import java.util.Scanner;

public class Naukari_POC {

	public static void main(String[] args) {

		System.out.println("NAUKARI POC");

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Your Name : ");
		String name = sc.nextLine();

		if (!name.trim().isEmpty()) {
			System.out.println("Hey Hi, Welcome " + name);

			System.out.print("Enter Your Age : ");
			int age = sc.nextInt();

			if (age > 18) {
				System.out.println("Great...Lets proceed with other information");

				System.out.print("Enter Your Mobile Number : ");
				String phnum = sc.next();

				if (phnum.matches("[0-9]{10}")) {
					System.out.println("Good...");

					sc.nextLine(); // Consume leftover newline

					System.out.print("Enter Your University Name : ");
					String uniName = sc.nextLine();

					if (uniName.equalsIgnoreCase("VIT") || uniName.equalsIgnoreCase("SRM")) {

						System.out.println("That's Great...");

						System.out.print("Enter Your Graduation Year : ");
						int gradYear = sc.nextInt();

						if (gradYear > 2025) {
							System.out.println("Perfect Match...");

							System.out.print("Enter Your CGPA : ");
							double cgpa = sc.nextDouble();

							if (cgpa > 8.0) {
								System.out.println("Ok..You are eligible");

								System.out.print("Enter TechStack : ");
								String techStack = sc.next();

								if (techStack.equalsIgnoreCase("Java") || techStack.equalsIgnoreCase("Python")) {

									System.out.println("Good Match...");

									System.out.print("Are You a Fresher : ");
									boolean fresher = sc.nextBoolean();

									if (fresher) {
										System.out.println(
												"Nice, We Are Good To Go With Your Profile For The First Round...");
									} else {
										System.out.println("Sorry This Opportunity Is Only For Freshers");
									}

								} else {
									System.out.println("Sorry Not Your Cup Of Tea...");
								}

							} else {
								System.out.println("Sorry Only Above 8.0 CGPA");
							}

						} else {
							System.out.println("Sorry Not eligible");
						}

					} else {
						System.out.println("Sorry...Only VIT and SRM students are eligible");
					}

				} else {
					System.out.println("Enter Correct 10-Digit Phone Number");
				}

			} else {
				System.out.println("Sorry...Meet you after crossing 18 years");
			}

		} else {
			System.out.println("Enter Your Name");
		}
		sc.close();
	}
}
