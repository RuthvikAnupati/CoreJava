package com.javafundamentals_lab;

import java.util.Scanner;

public class FoodOrderingSystem_Switch_30_10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String yn;
		int totalBill = 0;

		do {
			System.out.println("WELCOME");

			String item1 = "1. PIZZA";
			int item1Price = 200;

			String item2 = "2. BURGER";
			int item2Price = 120;

			String item3 = "3. BIRYANI";
			int item3Price = 180;

			String item4 = "4. NOODLES";
			int item4Price = 100;

			System.out.println("---MENU DETAILS---");
			System.out.println(item1 + "    " + item1Price);
			System.out.println(item2 + "   " + item2Price);
			System.out.println(item3 + "  " + item3Price);
			System.out.println(item4 + "   " + item4Price);

			System.out.println("Enter The Item You Want(Item Num) : ");
			int itemNum = sc.nextInt();

			switch (itemNum) {
			case 1 -> {
				System.out.println("Pizza Selected");
				System.out.print("Enter Quantity : ");
				int quantity = sc.nextInt();
				int totalPizza = quantity * item1Price;
				totalBill += totalPizza;
				System.out.println("Total Price For Pizzas : " + totalPizza);
			}
			case 2 -> {
				System.out.println("Burger Selected");
				System.out.print("Enter Quantity : ");
				int quantity = sc.nextInt();
				int totalBurger = quantity * item2Price;
				totalBill += totalBurger;
				System.out.println("Total Price For Burger : " + totalBurger);
			}
			case 3 -> {
				System.out.println("Biryani Selected");
				System.out.print("Enter Quantity : ");
				int quantity = sc.nextInt();
				int totalBiryani = quantity * item3Price;
				totalBill += totalBiryani;
				System.out.println("Total Price For Biryani : " + totalBiryani);
			}
			case 4 -> {
				System.out.println("Noodles Selected");
				System.out.print("Enter Quantity : ");
				int quantity = sc.nextInt();
				int totalNoodles = quantity * item4Price;
				totalBill += totalNoodles;
				System.out.println("Total Price For Noodles : " + totalNoodles);
			}
			default -> {
				System.out.println("NOT AVAILABLE");
			}
			}

			System.out.println("Do You Want Any Other Items..???");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
		System.out.println("Total Billed Amount : " + totalBill);

	}

}
