package com.javafundamentals_lab;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double totalFruitsPrice = 0;
		double totalVegetablePrice = 0;

		String yn;

		do {

			System.out.println("\nEnter the category (fruits/vegetables):");
			String category = sc.next().toLowerCase();

			switch (category) {

			// FRUITS CATEGORY
			case "fruits":

				String fruitItem;

				do {

					System.out.println("\nAvailable Fruits:");
					System.out.println("ORN - Orange");
					System.out.println("MNG - Mango");
					System.out.println("APP - Apple");
					System.out.println("BNN - Banana");
					System.out.println("GRS - Grapes");
					System.out.println("BNB - Pineapple");
					System.out.println("WM  - Watermelon");
					System.out.println("PAP - Papaya");
					System.out.println("POM - Pomegranate");
					System.out.println("GVA - Guava");
					System.out.println("KWI - Kiwi");

					System.out.println("\nEnter the fruit item code:");
					fruitItem = sc.next().toUpperCase();

					switch (fruitItem) {

					case "ORN":
						System.out.println("Orange: Rs.100 per kg");
						totalFruitsPrice += 100;
						break;

					case "MNG":
						System.out.println("Mango: Rs.200 per kg");
						totalFruitsPrice += 200;
						break;

					case "APP":
						System.out.println("Apple: Rs.150 per kg");
						totalFruitsPrice += 150;
						break;

					case "BNN":
						System.out.println("Banana: Rs.60 per kg");
						totalFruitsPrice += 60;
						break;

					case "GRS":
						System.out.println("Grapes: Rs.120 per kg");
						totalFruitsPrice += 120;
						break;

					case "BNB":
						System.out.println("Pineapple: Rs.80 per kg");
						totalFruitsPrice += 80;
						break;

					case "WM":
						System.out.println("Watermelon: Rs.40 per kg");
						totalFruitsPrice += 40;
						break;

					case "PAP":
						System.out.println("Papaya: Rs.50 per kg");
						totalFruitsPrice += 50;
						break;

					case "POM":
						System.out.println("Pomegranate: Rs.180 per kg");
						totalFruitsPrice += 180;
						break;

					case "GVA":
						System.out.println("Guava: Rs.70 per kg");
						totalFruitsPrice += 70;
						break;

					case "KWI":
						System.out.println("Kiwi: Rs.250 per kg");
						totalFruitsPrice += 250;
						break;

					default:
						System.out.println("Fruit item not available");
					}

					System.out.println("\nDo you want to continue with fruits? (Y/N)");
					yn = sc.next();

				} while (yn.equalsIgnoreCase("Y"));

				System.out.println("\nTotal fruits price: Rs." + totalFruitsPrice);

				break;

			// VEGETABLES CATEGORY
			case "vegetables":

				String vegetableItem;

				do {

					System.out.println("\nAvailable Vegetables:");
					System.out.println("TMT - Tomato");
					System.out.println("PTT - Potato");
					System.out.println("ONG - Onion");
					System.out.println("LFD - Ladyfinger");
					System.out.println("CAR - Carrot");

					System.out.println("\nEnter the vegetable item code:");
					vegetableItem = sc.next().toUpperCase();

					switch (vegetableItem) {

					case "TMT":
						System.out.println("Tomato: Rs.50 per kg");
						totalVegetablePrice += 50;
						break;

					case "PTT":
						System.out.println("Potato: Rs.40 per kg");
						totalVegetablePrice += 40;
						break;

					case "ONG":
						System.out.println("Onion: Rs.60 per kg");
						totalVegetablePrice += 60;
						break;

					case "LFD":
						System.out.println("Ladyfinger: Rs.45 per kg");
						totalVegetablePrice += 45;
						break;

					case "CAR":
						System.out.println("Carrot: Rs.55 per kg");
						totalVegetablePrice += 55;
						break;

					default:
						System.out.println("Vegetable item not available");
					}

					System.out.println("\nDo you want to continue with vegetables? (Y/N)");
					yn = sc.next();

				} while (yn.equalsIgnoreCase("Y"));

				System.out.println("\nTotal vegetable price: Rs." + totalVegetablePrice);

				break;

			// INVALID CATEGORY
			default:

				System.out.println("Invalid category");
			}

			System.out.println("\nDo you want to continue with another category? (Y/N)");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("Y"));

		// DISPLAY FINAL BILL

		double totalPrice = totalFruitsPrice + totalVegetablePrice;

		System.out.println("\n========== FINAL INVOICE ==========");

		System.out.println("Total fruits price: Rs." + totalFruitsPrice);

		System.out.println("Total vegetable price: Rs." + totalVegetablePrice);

		System.out.println("-----------------------------------");

		System.out.println("Overall bill: Rs." + totalPrice);

		System.out.println("===================================");

		sc.close();
	}
}