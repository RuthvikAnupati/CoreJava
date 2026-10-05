/*
You are going to a shop to buy chocolates and cookies.
Each chocolate costs ₹15  and Each cookie costs ₹10
You have ₹450 in total
If you decide to buy 10 chocolates and 5 cookies, 
write a Java program to calculate how much money will remain after your purchase.
*/

package com.javafundamentals_lab;

public class shopkeeperLab_23_9 {
	
	static int chocolate = 15;
	static int cookie = 10;
	public static void main(String[] args) {
		float balance = 450F;
		
		int totalChocolates = chocolate * 10;
		int totalCookies = cookie * 5;
		int totalPurchase = totalChocolates + totalCookies ; 
		float leftOverBal = balance - totalPurchase;
		System.out.println("Total Choclates Cost - "+ totalChocolates +" & Total Cookies Cost - "+totalCookies);
		System.out.println("Total Spend - $"+totalPurchase);
		System.out.println("Total LeftOver Balance - $"+leftOverBal);
		
	}

}
